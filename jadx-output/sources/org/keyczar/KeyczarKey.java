package org.keyczar;

import com.google.gson.a.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.keyczar.enums.RsaPadding;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.Stream;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

/* loaded from: classes.dex */
public abstract class KeyczarKey {
    private static final int IV_SIZE = 16;
    private static final String PBE_CIPHER = "PBEWithSHA1AndDESede";
    private static final int PBE_ITERATION_COUNT = 1000;
    private static final int PBE_SALT_SIZE = 8;
    private static final String PEM_FOOTER_BEGIN = "-----END ";
    private static final String PEM_HEADER_BEGIN = "-----BEGIN ";
    private static final String PEM_LINE_ENDING = "-----\n";

    @a
    final int size;

    protected abstract Key getJceKey();

    protected abstract Stream getStream();

    public abstract KeyType getType();

    protected abstract byte[] hash();

    protected KeyczarKey(int i) {
        this.size = i;
    }

    void copyHeader(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 0);
        byteBuffer.put(hash());
    }

    public boolean equals(Object obj) {
        try {
            return Arrays.equals(((KeyczarKey) obj).hash(), hash());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return Util.toInt(hash());
    }

    int size() {
        return this.size;
    }

    static KeyczarKey genKey(KeyType keyType) {
        return genKey(keyType, keyType.defaultSize());
    }

    public static void registerType(KeyType keyType) {
        KeyType.KeyTypeDeserializer.registerType(keyType);
    }

    public String toString() {
        return Util.gson().a(this);
    }

    static KeyczarKey genKey(KeyType keyType, int i) {
        RsaPadding rsaPadding = null;
        if (keyType == DefaultKeyType.RSA_PRIV) {
            rsaPadding = RsaPadding.OAEP;
        }
        return genKey(keyType, rsaPadding, i);
    }

    static KeyczarKey genKey(KeyType keyType, RsaPadding rsaPadding, int i) {
        if (!keyType.isAcceptableSize(i)) {
            i = keyType.defaultSize();
        }
        if (rsaPadding != null && keyType != DefaultKeyType.RSA_PRIV) {
            throw new KeyczarException(Messages.getString("InvalidPadding", rsaPadding.name()));
        }
        return (keyType == DefaultKeyType.RSA_PRIV ? DefaultKeyType.RSA_PRIV.getRsaBuilder(rsaPadding) : keyType.getBuilder()).generate(i);
    }

    static KeyczarKey readKey(KeyType keyType, String str) {
        return keyType.getBuilder().read(str);
    }

    public String getPemString(String str) {
        if (isSecret()) {
            if (str == null || str.length() < 8) {
                throw new KeyczarException(Messages.getString("KeyczarTool.PassphraseRequired", new Object[0]));
            }
            return convertDerToPem(encryptPrivateKey(getJceKey(), str));
        }
        if (str != null && !"".equals(str)) {
            throw new KeyczarException(Messages.getString("KeyczarTool.PassphraseNotAllowed", new Object[0]));
        }
        return convertDerToPem(getJceKey().getEncoded());
    }

    private static byte[] encryptPrivateKey(Key key, String str) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance(PBE_CIPHER).generateSecret(new PBEKeySpec(str.toCharArray()));
            byte[] bArr = new byte[8];
            Util.rand(bArr);
            Util.rand(new byte[16]);
            Cipher cipher = Cipher.getInstance(PBE_CIPHER);
            cipher.init(1, generateSecret, new PBEParameterSpec(bArr, PBE_ITERATION_COUNT));
            return new EncryptedPrivateKeyInfo(cipher.getParameters(), cipher.doFinal(key.getEncoded())).getEncoded();
        } catch (IOException e) {
            throw new KeyczarException(Messages.getString("KeyczarTool.FailedToEncryptPrivateKey", new Object[0]), e);
        } catch (GeneralSecurityException e2) {
            throw new KeyczarException(Messages.getString("KeyczarTool.FailedToEncryptPrivateKey", new Object[0]), e2);
        }
    }

    private String convertDerToPem(byte[] bArr) {
        String encodeMime = Base64Coder.encodeMime(bArr, true);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(PEM_HEADER_BEGIN);
        stringBuffer.append(getPemType());
        stringBuffer.append(PEM_LINE_ENDING);
        Iterator<String> it = Util.split(encodeMime, 64).iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append('\n');
        }
        stringBuffer.append(PEM_FOOTER_BEGIN);
        stringBuffer.append(getPemType());
        stringBuffer.append(PEM_LINE_ENDING);
        return stringBuffer.toString();
    }

    protected boolean isSecret() {
        return true;
    }

    private String getPemType() {
        return isSecret() ? "ENCRYPTED PRIVATE KEY" : getJceKey().getAlgorithm() + " PUBLIC KEY";
    }
}
