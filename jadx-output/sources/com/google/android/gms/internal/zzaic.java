package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
public final class zzaic {

    /* renamed from: a, reason: collision with root package name */
    final ByteBuffer f6261a;

    public class zza extends IOException {
        zza(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private zzaic(ByteBuffer byteBuffer) {
        this.f6261a = byteBuffer;
        this.f6261a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzaic(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
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
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i6 > i5 - 3) {
                    if (i6 > i5 - 4) {
                        if (55296 > charAt2 || charAt2 > 57343 || (i4 + 1 != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4 + 1)))) {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i6);
                        }
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i4);
                    }
                    if (i4 + 1 != charSequence.length()) {
                        i4++;
                        char charAt3 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i8 = i6 + 1;
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i3 = i10 + 1;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (i4 - 1));
                }
                int i11 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> '\f') | 480);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i12 + 1;
                bArr[i12] = (byte) ((charAt2 & '?') | 128);
            }
            i4++;
            i6 = i3;
        }
        return i6;
    }

    public static int a(String str) {
        int a2 = a((CharSequence) str);
        return a2 + d(a2);
    }

    public static int a(byte[] bArr) {
        return d(bArr.length) + bArr.length;
    }

    public static zzaic a(byte[] bArr, int i) {
        return new zzaic(bArr, i);
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            b(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static int b(int i) {
        return d(ai.a(i, 0));
    }

    public static int b(int i, int i2) {
        return b(i) + a(i2);
    }

    public static int b(int i, String str) {
        return b(i) + a(str);
    }

    public static int b(int i, byte[] bArr) {
        return b(i) + a(bArr);
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
            } else {
                if (charAt >= 55296 && 57343 >= charAt) {
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
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            }
            i++;
        }
    }

    public static long c(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int d(int i) {
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

    public static int e(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public final void a(int i, af afVar) {
        c(i, 2);
        a(afVar);
    }

    public final void a(long j) {
        while (((-128) & j) != 0) {
            f((((int) j) & 127) | 128);
            j >>>= 7;
        }
        f((int) j);
    }

    public final void c(int i) {
        while ((i & (-128)) != 0) {
            f((i & 127) | 128);
            i >>>= 7;
        }
        f(i);
    }

    public final void c(int i, int i2) {
        c(ai.a(i, i2));
    }

    public final void a(int i, float f) {
        c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f6261a.remaining() < 4) {
            throw new zza(this.f6261a.position(), this.f6261a.limit());
        }
        this.f6261a.putInt(floatToIntBits);
    }

    public final void a(int i, long j) {
        c(i, 0);
        a(j);
    }

    public final void a(int i, int i2) {
        c(i, 0);
        if (i2 >= 0) {
            c(i2);
        } else {
            a(i2);
        }
    }

    public final void a(int i, boolean z) {
        c(i, 0);
        f(z ? 1 : 0);
    }

    public final void a(int i, String str) {
        c(i, 2);
        try {
            int d = d(str.length());
            if (d != d(str.length() * 3)) {
                c(a((CharSequence) str));
                a(str, this.f6261a);
                return;
            }
            int position = this.f6261a.position();
            if (this.f6261a.remaining() < d) {
                throw new zza(d + position, this.f6261a.limit());
            }
            this.f6261a.position(position + d);
            a(str, this.f6261a);
            int position2 = this.f6261a.position();
            this.f6261a.position(position);
            c((position2 - position) - d);
            this.f6261a.position(position2);
        } catch (BufferOverflowException e) {
            zza zzaVar = new zza(this.f6261a.position(), this.f6261a.limit());
            zzaVar.initCause(e);
            throw zzaVar;
        }
    }

    public final void a(int i, byte[] bArr) {
        c(i, 2);
        c(bArr.length);
        b(bArr);
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

    public final void a(af afVar) {
        if (afVar.p < 0) {
            afVar.d();
        }
        c(afVar.p);
        afVar.a(this);
    }

    public static int b(int i, long j) {
        return b(i) + b(j);
    }

    public static int b(int i, af afVar) {
        int b2 = b(i);
        int d = afVar.d();
        return b2 + d + d(d);
    }

    public final void a() {
        if (this.f6261a.remaining() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    private void f(int i) {
        byte b2 = (byte) i;
        if (!this.f6261a.hasRemaining()) {
            throw new zza(this.f6261a.position(), this.f6261a.limit());
        }
        this.f6261a.put(b2);
    }

    public final void b(byte[] bArr) {
        int length = bArr.length;
        if (this.f6261a.remaining() < length) {
            throw new zza(this.f6261a.position(), this.f6261a.limit());
        }
        this.f6261a.put(bArr, 0, length);
    }
}
