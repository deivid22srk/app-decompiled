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
import org.keyczar.util.Util;

/* loaded from: classes2.dex */
public class Signer extends Verifier {
    private static final a LOG = a.a((Class<?>) Signer.class);
    static final int TIMESTAMP_SIZE = 8;
    private final StreamQueue<SigningStream> SIGN_QUEUE;

    public Signer(KeyczarReader keyczarReader) {
        super(keyczarReader);
        this.SIGN_QUEUE = new StreamQueue<>();
    }

    public Signer(String str) {
        super(str);
        this.SIGN_QUEUE = new StreamQueue<>();
    }

    public int digestSize() {
        KeyczarKey primaryKey = getPrimaryKey();
        if (primaryKey == null) {
            throw new NoPrimaryKeyException();
        }
        return ((SigningStream) primaryKey.getStream()).digestSize() + 5;
    }

    public byte[] sign(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(digestSize());
        sign(ByteBuffer.wrap(bArr), allocate);
        allocate.reset();
        byte[] bArr2 = new byte[allocate.remaining()];
        allocate.get(bArr2);
        return bArr2;
    }

    public void sign(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        sign(byteBuffer, null, 0L, byteBuffer2);
    }

    void sign(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j, ByteBuffer byteBuffer3) {
        if (a.a()) {
            LOG.a(Messages.getString("Signer.Signing", Integer.valueOf(byteBuffer.remaining())));
        }
        KeyczarKey primaryKey = getPrimaryKey();
        if (primaryKey == null) {
            throw new NoPrimaryKeyException();
        }
        SigningStream signingStream = (SigningStream) this.SIGN_QUEUE.poll();
        if (signingStream == null) {
            signingStream = (SigningStream) primaryKey.getStream();
        }
        int digestSize = digestSize();
        if (j > 0) {
            digestSize += 8;
        }
        if (byteBuffer3.capacity() < digestSize) {
            throw new ShortBufferException(byteBuffer3.capacity(), digestSize);
        }
        ByteBuffer allocate = ByteBuffer.allocate(5);
        primaryKey.copyHeader(allocate);
        allocate.rewind();
        signingStream.initSign();
        byteBuffer3.mark();
        byteBuffer3.put(allocate);
        if (j > 0) {
            ByteBuffer wrap = ByteBuffer.wrap(Util.fromLong(j));
            byteBuffer3.put(wrap);
            wrap.rewind();
            signingStream.updateSign(wrap);
        }
        if (byteBuffer2 != null && byteBuffer2.remaining() > 0) {
            signingStream.updateSign(byteBuffer2);
        }
        signingStream.updateSign(byteBuffer);
        signingStream.updateSign(ByteBuffer.wrap(FORMAT_BYTES));
        signingStream.sign(byteBuffer3);
        byteBuffer3.limit(byteBuffer3.position());
        this.SIGN_QUEUE.add(signingStream);
    }

    public String sign(String str) {
        try {
            return Base64Coder.encodeWebSafe(sign(str.getBytes(Keyczar.DEFAULT_ENCODING)));
        } catch (UnsupportedEncodingException e) {
            throw new KeyczarException(e);
        }
    }

    public byte[] attachedSign(byte[] bArr, byte[] bArr2) {
        KeyczarKey primaryKey = getPrimaryKey();
        if (primaryKey == null) {
            throw new NoPrimaryKeyException();
        }
        SigningStream signingStream = (SigningStream) this.SIGN_QUEUE.poll();
        if (signingStream == null) {
            signingStream = (SigningStream) primaryKey.getStream();
        }
        signingStream.initSign();
        byte[] fromInt = Util.fromInt(0);
        if (bArr2.length > 0) {
            fromInt = Util.lenPrefix(bArr2);
        }
        signingStream.updateSign(ByteBuffer.wrap(bArr));
        signingStream.updateSign(ByteBuffer.wrap(fromInt));
        signingStream.updateSign(ByteBuffer.wrap(FORMAT_BYTES));
        ByteBuffer allocate = ByteBuffer.allocate(digestSize());
        allocate.mark();
        signingStream.sign(allocate);
        allocate.limit(allocate.position());
        byte[] cat = Util.cat(FORMAT_BYTES, primaryKey.hash(), Util.lenPrefix(bArr), allocate.array());
        this.SIGN_QUEUE.add(signingStream);
        return cat;
    }

    @Override // org.keyczar.Verifier, org.keyczar.Keyczar
    boolean isAcceptablePurpose(KeyPurpose keyPurpose) {
        return keyPurpose == KeyPurpose.SIGN_AND_VERIFY;
    }
}
