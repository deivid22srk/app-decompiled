package org.keyczar;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.a.a.a;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.NoPrimaryKeyException;
import org.keyczar.exceptions.ShortBufferException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.util.Base64Coder;

/* loaded from: classes2.dex */
public class UnversionedSigner extends UnversionedVerifier {
    private static final a LOG = a.a((Class<?>) UnversionedSigner.class);
    static final int TIMESTAMP_SIZE = 8;
    private final StreamQueue<SigningStream> SIGN_QUEUE;

    public UnversionedSigner(KeyczarReader keyczarReader) {
        super(keyczarReader);
        this.SIGN_QUEUE = new StreamQueue<>();
    }

    public UnversionedSigner(String str) {
        super(str);
        this.SIGN_QUEUE = new StreamQueue<>();
    }

    public int digestSize() {
        KeyczarKey primaryKey = getPrimaryKey();
        if (primaryKey == null) {
            throw new NoPrimaryKeyException();
        }
        return ((SigningStream) primaryKey.getStream()).digestSize();
    }

    public byte[] sign(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(digestSize());
        sign(ByteBuffer.wrap(bArr), allocate);
        allocate.reset();
        byte[] bArr2 = new byte[allocate.remaining()];
        allocate.get(bArr2);
        return bArr2;
    }

    void sign(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        LOG.a(Messages.getString("Signer.Signing", Integer.valueOf(byteBuffer.remaining())));
        KeyczarKey primaryKey = getPrimaryKey();
        if (primaryKey == null) {
            throw new NoPrimaryKeyException();
        }
        SigningStream signingStream = (SigningStream) this.SIGN_QUEUE.poll();
        if (signingStream == null) {
            signingStream = (SigningStream) primaryKey.getStream();
        }
        int digestSize = digestSize();
        if (byteBuffer2.capacity() < digestSize) {
            throw new ShortBufferException(byteBuffer2.capacity(), digestSize);
        }
        signingStream.initSign();
        byteBuffer2.mark();
        signingStream.updateSign(byteBuffer);
        signingStream.sign(byteBuffer2);
        byteBuffer2.limit(byteBuffer2.position());
        this.SIGN_QUEUE.add(signingStream);
    }

    public String sign(String str) {
        try {
            return Base64Coder.encodeWebSafe(sign(str.getBytes(Keyczar.DEFAULT_ENCODING)));
        } catch (UnsupportedEncodingException e) {
            throw new KeyczarException(e);
        }
    }

    @Override // org.keyczar.UnversionedVerifier, org.keyczar.Keyczar
    boolean isAcceptablePurpose(KeyPurpose keyPurpose) {
        return keyPurpose == KeyPurpose.SIGN_AND_VERIFY;
    }
}
