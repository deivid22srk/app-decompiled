package com.android.ex.photo.epkg;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public InputStream f1157a;
    public int d = 0;
    public int e = 0;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1158b = new byte[e(16)];
    public boolean c = false;

    public g(InputStream inputStream) {
        this.f1157a = inputStream;
    }

    public final byte a(int i) {
        h.a("get");
        if (b(i)) {
            int i2 = i - this.d;
            h.a();
            return this.f1158b[i2];
        }
        h.a();
        throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", Integer.valueOf(i)));
    }

    public final boolean b(int i) {
        h.a("has");
        if (i < this.d) {
            h.a();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", Integer.valueOf(i), Integer.valueOf(this.d)));
        }
        int i2 = i - this.d;
        if (i2 >= this.e || i2 >= this.f1158b.length) {
            h.a();
            return d(i);
        }
        h.a();
        return true;
    }

    public final void c(int i) {
        int i2;
        boolean z;
        h.a("advance to");
        int i3 = i - this.d;
        if (i3 <= 0) {
            h.a();
            return;
        }
        if (i3 >= this.e) {
            if (this.f1157a != null) {
                int i4 = i3 - this.e;
                int i5 = 0;
                while (true) {
                    if (i4 <= 0) {
                        i2 = i4;
                        z = false;
                        break;
                    }
                    try {
                        long skip = this.f1157a.skip(i4);
                        if (skip <= 0) {
                            i5++;
                        } else {
                            i4 = (int) (i4 - skip);
                        }
                        if (i5 >= 5) {
                            i2 = i4;
                            z = true;
                            break;
                        }
                    } catch (IOException e) {
                        i2 = i4;
                        z = true;
                    }
                }
                if (z) {
                    this.f1157a = null;
                }
                this.d = i - i2;
                this.e = 0;
            } else {
                this.d = i;
                this.e = 0;
            }
        } else {
            if (i3 >= this.f1158b.length) {
                throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", Integer.valueOf(i3), Integer.valueOf(this.f1158b.length)));
            }
            for (int i6 = 0; i6 + i3 < this.e; i6++) {
                this.f1158b[i6] = this.f1158b[i6 + i3];
            }
            this.d = i;
            this.e -= i3;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            Log.d("InputStreamBuffer", String.format("advanceTo %d buffer: %s", Integer.valueOf(i3), this));
        }
        h.a();
    }

    public boolean d(int i) {
        int i2;
        h.a("fill");
        if (i < this.d) {
            h.a();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", Integer.valueOf(i), Integer.valueOf(this.d)));
        }
        int i3 = i - this.d;
        if (this.f1157a == null) {
            h.a();
            return false;
        }
        int i4 = i3 + 1;
        if (i4 > this.f1158b.length) {
            if (this.c) {
                c(i);
                i3 = i - this.d;
            } else {
                int e = e(i4);
                Log.w("InputStreamBuffer", String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", Integer.valueOf(this.f1158b.length), Integer.valueOf(e)));
                this.f1158b = Arrays.copyOf(this.f1158b, e);
            }
        }
        try {
            i2 = this.f1157a.read(this.f1158b, this.e, this.f1158b.length - this.e);
        } catch (IOException e2) {
            i2 = -1;
        }
        if (i2 != -1) {
            this.e = i2 + this.e;
        } else {
            this.f1157a = null;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            Log.d("InputStreamBuffer", String.format("fill %d      buffer: %s", Integer.valueOf(i3), this));
        }
        h.a();
        return i3 < this.e;
    }

    public final String toString() {
        return String.format("+%d+%d [%d]", Integer.valueOf(this.d), Integer.valueOf(this.f1158b.length), Integer.valueOf(this.e));
    }

    public static int e(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }
}
