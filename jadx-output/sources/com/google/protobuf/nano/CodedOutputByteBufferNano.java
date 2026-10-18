package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
public final class CodedOutputByteBufferNano {

    /* renamed from: a, reason: collision with root package name */
    final ByteBuffer f7874a;

    CodedOutputByteBufferNano(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.f7874a = byteBuffer;
        this.f7874a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a(int i, double d) {
        e(i, 1);
        d(Double.doubleToLongBits(d));
    }

    public final void a(int i, float f) {
        e(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f7874a.remaining() < 4) {
            throw new OutOfSpaceException(this.f7874a.position(), this.f7874a.limit());
        }
        this.f7874a.putInt(floatToIntBits);
    }

    public final void a(int i, long j) {
        e(i, 0);
        a(j);
    }

    public final void b(int i, long j) {
        e(i, 0);
        a(j);
    }

    public final void a(int i, int i2) {
        e(i, 0);
        a(i2);
    }

    public final void c(int i, long j) {
        e(i, 1);
        d(j);
    }

    public final void a(int i, boolean z) {
        e(i, 0);
        f(z ? 1 : 0);
    }

    public final void a(int i, String str) {
        e(i, 2);
        try {
            int e = e(str.length());
            if (e == e(str.length() * 3)) {
                int position = this.f7874a.position();
                if (this.f7874a.remaining() < e) {
                    throw new OutOfSpaceException(e + position, this.f7874a.limit());
                }
                this.f7874a.position(position + e);
                a(str, this.f7874a);
                int position2 = this.f7874a.position();
                this.f7874a.position(position);
                d((position2 - position) - e);
                this.f7874a.position(position2);
                return;
            }
            d(a((CharSequence) str));
            a(str, this.f7874a);
        } catch (BufferOverflowException e2) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.f7874a.position(), this.f7874a.limit());
            outOfSpaceException.initCause(e2);
            throw outOfSpaceException;
        }
    }

    public final void a(int i, c cVar) {
        e(i, 3);
        cVar.a(this);
        e(i, 4);
    }

    public final void b(int i, c cVar) {
        e(i, 2);
        d(cVar.d());
        cVar.a(this);
    }

    public final void a(int i, byte[] bArr) {
        e(i, 2);
        d(bArr.length);
        int length = bArr.length;
        if (this.f7874a.remaining() >= length) {
            this.f7874a.put(bArr, 0, length);
            return;
        }
        throw new OutOfSpaceException(this.f7874a.position(), this.f7874a.limit());
    }

    public final void b(int i, int i2) {
        e(i, 0);
        d(i2);
    }

    public final void a(int i) {
        if (i >= 0) {
            d(i);
        } else {
            a(i);
        }
    }

    private static int a(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                i = i4;
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + i3);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i = i4 + i2;
            }
        }
        if (i < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i + 4294967296L));
        }
        return i;
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        b(charSequence, byteBuffer);
    }

    private static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    private static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = i + i2;
        while (i4 < length && i4 + i < i5) {
            char charAt = charSequence.charAt(i4);
            if (charAt >= 128) {
                break;
            }
            bArr[i + i4] = (byte) charAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        int i6 = i + i4;
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < 128 && i6 < i5) {
                i3 = i6 + 1;
                bArr[i6] = (byte) charAt2;
            } else if (charAt2 < 2048 && i6 <= i5 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 6) | 960);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i6 <= i5 - 3) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> '\f') | 480);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
            } else {
                if (i6 <= i5 - 4) {
                    if (i4 + 1 != charSequence.length()) {
                        i4++;
                        char charAt3 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i10 = i6 + 1;
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            int i11 = i10 + 1;
                            bArr[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i3 = i12 + 1;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (i4 - 1));
                }
                if (55296 <= charAt2 && charAt2 <= 57343 && (i4 + 1 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4 + 1)))) {
                    throw new IllegalArgumentException("Unpaired surrogate at index " + i4);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i6);
            }
            i4++;
            i6 = i3;
        }
        return i6;
    }

    public static int d(int i, long j) {
        return c(i) + b(j);
    }

    public static int e(int i, long j) {
        return c(i) + b(j);
    }

    public static int c(int i, int i2) {
        return c(i) + b(i2);
    }

    public static int b(int i, String str) {
        return c(i) + a(str);
    }

    public static int c(int i, c cVar) {
        return (c(i) * 2) + cVar.e();
    }

    public static int d(int i, c cVar) {
        int c = c(i);
        int e = cVar.e();
        return c + e + e(e);
    }

    public static int b(int i, byte[] bArr) {
        return c(i) + a(bArr);
    }

    public static int d(int i, int i2) {
        return c(i) + e(i2);
    }

    public static int b(int i) {
        if (i >= 0) {
            return e(i);
        }
        return 10;
    }

    public static int a(String str) {
        int a2 = a((CharSequence) str);
        return a2 + e(a2);
    }

    public static int a(byte[] bArr) {
        return e(bArr.length) + bArr.length;
    }

    /* loaded from: classes2.dex */
    public class OutOfSpaceException extends IOException {
        OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private void f(int i) {
        byte b2 = (byte) i;
        if (!this.f7874a.hasRemaining()) {
            throw new OutOfSpaceException(this.f7874a.position(), this.f7874a.limit());
        }
        this.f7874a.put(b2);
    }

    public final void e(int i, int i2) {
        d(e.a(i, i2));
    }

    public static int c(int i) {
        return e(e.a(i, 0));
    }

    public final void d(int i) {
        while ((i & (-128)) != 0) {
            f((i & 127) | 128);
            i >>>= 7;
        }
        f(i);
    }

    public static int e(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return ((-268435456) & i) == 0 ? 4 : 5;
    }

    public final void a(long j) {
        while (((-128) & j) != 0) {
            f((((int) j) & 127) | 128);
            j >>>= 7;
        }
        f((int) j);
    }

    public static int b(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private void d(long j) {
        if (this.f7874a.remaining() < 8) {
            throw new OutOfSpaceException(this.f7874a.position(), this.f7874a.limit());
        }
        this.f7874a.putLong(j);
    }

    public static long c(long j) {
        return (j << 1) ^ (j >> 63);
    }
}
