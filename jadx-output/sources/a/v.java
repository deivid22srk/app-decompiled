package a;

/* loaded from: classes.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f32a = new byte[2048];

    /* renamed from: b, reason: collision with root package name */
    int f33b;
    int c;
    v d;
    v e;

    v() {
    }

    public final v a() {
        v vVar = this.d != this ? this.d : null;
        this.e.d = this.d;
        this.d.e = this.e;
        this.d = null;
        this.e = null;
        return vVar;
    }

    public final v a(v vVar) {
        vVar.e = this;
        vVar.d = this.d;
        this.d.e = vVar;
        this.d = vVar;
        return vVar;
    }

    public final void a(v vVar, int i) {
        if ((vVar.c - vVar.f33b) + i > 2048) {
            throw new IllegalArgumentException();
        }
        if (vVar.c + i > 2048) {
            System.arraycopy(vVar.f32a, vVar.f33b, vVar.f32a, 0, vVar.c - vVar.f33b);
            vVar.c -= vVar.f33b;
            vVar.f33b = 0;
        }
        System.arraycopy(this.f32a, this.f33b, vVar.f32a, vVar.c, i);
        vVar.c += i;
        this.f33b += i;
    }
}
