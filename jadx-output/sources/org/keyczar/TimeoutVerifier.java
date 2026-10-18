package org.keyczar;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.ShortSignatureException;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Clock;
import org.keyczar.util.SystemClock;
import org.keyczar.util.Util;

/* loaded from: classes2.dex */
public class TimeoutVerifier {
    private Clock clock = new SystemClock();
    private Verifier verifier;

    TimeoutVerifier() {
    }

    public TimeoutVerifier(KeyczarReader keyczarReader) {
        setVerifier(new Verifier(keyczarReader));
    }

    public TimeoutVerifier(String str) {
        setVerifier(new Verifier(str));
    }

    public TimeoutVerifier(Verifier verifier) {
        setVerifier(verifier);
    }

    void setVerifier(Verifier verifier) {
        this.verifier = verifier;
    }

    void setClock(Clock clock) {
        this.clock = clock;
    }

    public boolean verify(String str, String str2) {
        try {
            return verify(str.getBytes(Keyczar.DEFAULT_ENCODING), Base64Coder.decodeWebSafe(str2));
        } catch (UnsupportedEncodingException e) {
            throw new KeyczarException(e);
        }
    }

    public boolean verify(byte[] bArr, byte[] bArr2) {
        return verify(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2));
    }

    public boolean verify(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer2.remaining() < 13) {
            throw new ShortSignatureException(byteBuffer2.remaining());
        }
        byte[] bArr = new byte[5];
        byteBuffer2.get(bArr);
        byte[] bArr2 = new byte[8];
        byteBuffer2.get(bArr2);
        if (this.clock.now() > Util.toLong(bArr2)) {
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer2.remaining() + 5);
        allocate.put(bArr);
        allocate.put(byteBuffer2);
        allocate.rewind();
        ByteBuffer allocate2 = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        allocate2.put(bArr2);
        allocate2.put(byteBuffer);
        allocate2.rewind();
        return this.verifier.verify(allocate2, allocate);
    }
}
