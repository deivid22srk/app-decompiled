package android.support.v4.h;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class e extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f283a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f284b = new StringBuilder(128);

    public e(String str) {
        this.f283a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.f284b.append(c);
            }
        }
    }

    private void a() {
        if (this.f284b.length() > 0) {
            Log.d(this.f283a, this.f284b.toString());
            this.f284b.delete(0, this.f284b.length());
        }
    }
}
