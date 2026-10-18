package org.keyczar;

import java.nio.ByteBuffer;
import org.a.a.a;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.BadVersionException;
import org.keyczar.exceptions.InvalidSignatureException;
import org.keyczar.exceptions.KeyNotFoundException;
import org.keyczar.exceptions.ShortCiphertextException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.DecryptingStream;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Base64Coder;

/* loaded from: classes2.dex */
public class Crypter extends Encrypter {
    private static final int DECRYPT_CHUNK_SIZE = 1024;
    private static final a LOG = a.a((Class<?>) Crypter.class);
    private final StreamCache<DecryptingStream> CRYPT_CACHE;

    public Crypter(KeyczarReader keyczarReader) {
        super(keyczarReader);
        this.CRYPT_CACHE = new StreamCache<>();
    }

    public Crypter(String str) {
        super(str);
        this.CRYPT_CACHE = new StreamCache<>();
    }

    public byte[] decrypt(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
        decrypt(ByteBuffer.wrap(bArr), allocate);
        allocate.reset();
        byte[] bArr2 = new byte[allocate.remaining()];
        allocate.get(bArr2);
        return bArr2;
    }

    public void decrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        LOG.a(Messages.getString("Crypter.Decrypting", Integer.valueOf(asReadOnlyBuffer.remaining())));
        if (asReadOnlyBuffer.remaining() < 5) {
            throw new ShortCiphertextException(asReadOnlyBuffer.remaining());
        }
        byte b2 = asReadOnlyBuffer.get();
        if (b2 != 0) {
            throw new BadVersionException(b2);
        }
        byte[] bArr = new byte[4];
        asReadOnlyBuffer.get(bArr);
        KeyczarKey key = getKey(bArr);
        if (key == null) {
            throw new KeyNotFoundException(bArr);
        }
        asReadOnlyBuffer.mark();
        DecryptingStream decryptingStream = this.CRYPT_CACHE.get(key);
        if (decryptingStream == null) {
            decryptingStream = (DecryptingStream) key.getStream();
        }
        VerifyingStream verifyingStream = decryptingStream.getVerifyingStream();
        if (asReadOnlyBuffer.remaining() < verifyingStream.digestSize()) {
            throw new ShortCiphertextException(asReadOnlyBuffer.remaining());
        }
        asReadOnlyBuffer.position(asReadOnlyBuffer.limit() - verifyingStream.digestSize());
        ByteBuffer slice = asReadOnlyBuffer.slice();
        asReadOnlyBuffer.reset();
        asReadOnlyBuffer.limit(asReadOnlyBuffer.limit() - verifyingStream.digestSize());
        decryptingStream.initDecrypt(asReadOnlyBuffer);
        ByteBuffer asReadOnlyBuffer2 = byteBuffer.asReadOnlyBuffer();
        asReadOnlyBuffer2.limit(asReadOnlyBuffer.position());
        verifyingStream.initVerify();
        verifyingStream.updateVerify(asReadOnlyBuffer2);
        byteBuffer2.mark();
        while (asReadOnlyBuffer.remaining() > DECRYPT_CHUNK_SIZE) {
            ByteBuffer slice2 = asReadOnlyBuffer.slice();
            slice2.limit(DECRYPT_CHUNK_SIZE);
            decryptingStream.updateDecrypt(slice2, byteBuffer2);
            slice2.rewind();
            verifyingStream.updateVerify(slice2);
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + DECRYPT_CHUNK_SIZE);
        }
        asReadOnlyBuffer.mark();
        verifyingStream.updateVerify(asReadOnlyBuffer);
        if (!verifyingStream.verify(slice)) {
            throw new InvalidSignatureException();
        }
        asReadOnlyBuffer.reset();
        decryptingStream.doFinalDecrypt(asReadOnlyBuffer, byteBuffer2);
        byteBuffer2.limit(byteBuffer2.position());
        this.CRYPT_CACHE.put(key, decryptingStream);
    }

    public String decrypt(String str) {
        return new String(decrypt(Base64Coder.decodeWebSafe(str)));
    }

    @Override // org.keyczar.Encrypter, org.keyczar.Keyczar
    boolean isAcceptablePurpose(KeyPurpose keyPurpose) {
        return keyPurpose == KeyPurpose.DECRYPT_AND_ENCRYPT;
    }
}
