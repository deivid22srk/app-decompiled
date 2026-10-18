package a;

import java.nio.charset.Charset;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3a = Charset.forName(Keyczar.DEFAULT_ENCODING);

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static short a(short s) {
        int i = 65535 & s;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static int a(int i) {
        return (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8) | ((i & 255) << 24);
    }

    public static void a(Throwable th) {
        throw th;
    }
}
