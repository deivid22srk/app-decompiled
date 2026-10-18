package android.support.v7.widget;

/* loaded from: classes.dex */
final class bo {

    /* renamed from: a, reason: collision with root package name */
    long f708a = 0;

    /* renamed from: b, reason: collision with root package name */
    bo f709b;

    bo() {
    }

    final void a(int i) {
        while (i >= 64) {
            this.a();
            this = this.f709b;
            i -= 64;
        }
        this.f708a |= 1 << i;
    }

    private void a() {
        if (this.f709b == null) {
            this.f709b = new bo();
        }
    }

    final void b(int i) {
        while (i >= 64) {
            if (this.f709b != null) {
                this = this.f709b;
                i -= 64;
            } else {
                return;
            }
        }
        this.f708a &= (1 << i) ^ (-1);
    }

    final boolean c(int i) {
        while (i >= 64) {
            this.a();
            this = this.f709b;
            i -= 64;
        }
        return (this.f708a & (1 << i)) != 0;
    }

    final void a(int i, boolean z) {
        while (true) {
            if (i >= 64) {
                this.a();
                this = this.f709b;
                i -= 64;
            } else {
                boolean z2 = (this.f708a & Long.MIN_VALUE) != 0;
                long j = (1 << i) - 1;
                this.f708a = (((j ^ (-1)) & this.f708a) << 1) | (this.f708a & j);
                if (z) {
                    this.a(i);
                } else {
                    this.b(i);
                }
                if (z2 || this.f709b != null) {
                    this.a();
                    this = this.f709b;
                    i = 0;
                    z = z2;
                } else {
                    return;
                }
            }
        }
    }

    final boolean d(int i) {
        while (i >= 64) {
            this.a();
            this = this.f709b;
            i -= 64;
        }
        long j = 1 << i;
        boolean z = (this.f708a & j) != 0;
        this.f708a &= j ^ (-1);
        long j2 = j - 1;
        this.f708a = Long.rotateRight((j2 ^ (-1)) & this.f708a, 1) | (this.f708a & j2);
        if (this.f709b != null) {
            if (this.f709b.c(0)) {
                this.a(63);
            }
            this.f709b.d(0);
        }
        return z;
    }

    final int e(int i) {
        if (this.f709b == null) {
            if (i >= 64) {
                return Long.bitCount(this.f708a);
            }
            return Long.bitCount(this.f708a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f708a & ((1 << i) - 1));
        }
        return this.f709b.e(i - 64) + Long.bitCount(this.f708a);
    }

    public final String toString() {
        return this.f709b == null ? Long.toBinaryString(this.f708a) : this.f709b.toString() + "xx" + Long.toBinaryString(this.f708a);
    }
}
