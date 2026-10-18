package okio2;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    static final w f34a = new w();

    /* renamed from: b, reason: collision with root package name */
    long f35b;
    private v c;

    private w() {
    }

    final v a() {
        synchronized (this) {
            if (this.c != null) {
                v vVar = this.c;
                this.c = vVar.d;
                vVar.d = null;
                this.f35b -= 2048;
                return vVar;
            }
            return new v();
        }
    }

    final void a(v vVar) {
        if (vVar.d != null || vVar.e != null) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.f35b + 2048 <= 65536) {
                this.f35b += 2048;
                vVar.d = this.c;
                vVar.c = 0;
                vVar.f33b = 0;
                this.c = vVar;
            }
        }
    }
}
