package android.support.v7.widget;

/* loaded from: classes.dex */
final class et {

    /* renamed from: a, reason: collision with root package name */
    int f799a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f800b = 0;
    int c = Integer.MIN_VALUE;
    int d = Integer.MIN_VALUE;
    int e = 0;
    int f = 0;
    boolean g = false;
    boolean h = false;

    et() {
    }

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f799a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f800b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f799a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f800b = i2;
        }
    }
}
