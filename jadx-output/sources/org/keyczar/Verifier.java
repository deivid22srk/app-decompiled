package org.keyczar;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.a.a.a;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.BadVersionException;
import org.keyczar.exceptions.KeyNotFoundException;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.ShortSignatureException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

/* loaded from: classes2.dex */
public class Verifier extends Keyczar {
    private static final a LOG = a.a((Class<?>) Verifier.class);
    private final StreamCache<VerifyingStream> VERIFY_CACHE;

    public Verifier(KeyczarReader keyczarReader) {
        super(keyczarReader);
        this.VERIFY_CACHE = new StreamCache<>();
    }

    public Verifier(String str) {
        super(str);
        this.VERIFY_CACHE = new StreamCache<>();
    }

    public boolean verify(byte[] bArr, byte[] bArr2) {
        return verify(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2));
    }

    public boolean verify(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return verify(byteBuffer, null, byteBuffer2);
    }

    boolean verify(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        LOG.a(Messages.getString("Verifier.Verifying", Integer.valueOf(byteBuffer.remaining())));
        if (byteBuffer3.remaining() < 5) {
            throw new ShortSignatureException(byteBuffer3.remaining());
        }
        byte[] checkFormatAndGetHash = checkFormatAndGetHash(byteBuffer3);
        KeyczarKey verifyingKey = getVerifyingKey(checkFormatAndGetHash);
        if (verifyingKey == null) {
            throw new KeyNotFoundException(checkFormatAndGetHash);
        }
        VerifyingStream verifyingStream = this.VERIFY_CACHE.get(verifyingKey);
        if (verifyingStream == null) {
            verifyingStream = (VerifyingStream) verifyingKey.getStream();
        }
        verifyingStream.initVerify();
        if (byteBuffer2 != null) {
            verifyingStream.updateVerify(byteBuffer2);
        }
        verifyingStream.updateVerify(byteBuffer);
        verifyingStream.updateVerify(ByteBuffer.wrap(FORMAT_BYTES));
        boolean verify = verifyingStream.verify(byteBuffer3);
        this.VERIFY_CACHE.put(verifyingKey, verifyingStream);
        return verify;
    }

    public boolean verify(String str, String str2) {
        try {
            return verify(str.getBytes(Keyczar.DEFAULT_ENCODING), Base64Coder.decodeWebSafe(str2));
        } catch (UnsupportedEncodingException e) {
            throw new KeyczarException(e);
        }
    }

    boolean rawVerify(KeyczarKey keyczarKey, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        VerifyingStream verifyingStream = this.VERIFY_CACHE.get(keyczarKey);
        if (verifyingStream == null) {
            verifyingStream = (VerifyingStream) keyczarKey.getStream();
        }
        verifyingStream.initVerify();
        verifyingStream.updateVerify(byteBuffer);
        if (byteBuffer2 != null) {
            verifyingStream.updateVerify(byteBuffer2);
        }
        verifyingStream.updateVerify(ByteBuffer.wrap(FORMAT_BYTES));
        boolean verify = verifyingStream.verify(byteBuffer3);
        this.VERIFY_CACHE.put(keyczarKey, verifyingStream);
        return verify;
    }

    public boolean attachedVerify(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        KeyczarKey verifyingKey = getVerifyingKey(checkFormatAndGetHash(wrap));
        byte[] bArr3 = new byte[wrap.getInt()];
        wrap.get(bArr3);
        byte[] bArr4 = new byte[wrap.remaining()];
        wrap.get(bArr4);
        byte[] fromInt = Util.fromInt(0);
        if (bArr2.length > 0) {
            fromInt = Util.lenPrefix(bArr2);
        }
        return rawVerify(verifyingKey, ByteBuffer.wrap(bArr3), ByteBuffer.wrap(fromInt), ByteBuffer.wrap(bArr4));
    }

    public byte[] getAttachedData(byte[] bArr, byte[] bArr2) {
        if (!attachedVerify(bArr, bArr2)) {
            throw new KeyczarException("Attached signature failed to verify. Unable to return signed data.");
        }
        return getAttachedDataWithoutVerifying(bArr);
    }

    public byte[] getAttachedDataWithoutVerifying(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        getVerifyingKey(checkFormatAndGetHash(wrap));
        byte[] bArr2 = new byte[wrap.getInt()];
        wrap.get(bArr2);
        return bArr2;
    }

    private byte[] checkFormatAndGetHash(ByteBuffer byteBuffer) {
        byte b2 = byteBuffer.get();
        if (b2 != 0) {
            throw new BadVersionException(b2);
        }
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return bArr;
    }

    private KeyczarKey getVerifyingKey(byte[] bArr) {
        KeyczarKey key = getKey(bArr);
        if (key == null) {
            throw new KeyNotFoundException(bArr);
        }
        return key;
    }

    @Override // org.keyczar.Keyczar
    boolean isAcceptablePurpose(KeyPurpose keyPurpose) {
        return keyPurpose == KeyPurpose.VERIFY || keyPurpose == KeyPurpose.SIGN_AND_VERIFY;
    }
}
