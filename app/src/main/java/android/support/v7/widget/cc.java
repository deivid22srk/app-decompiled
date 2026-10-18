package android.support.v7.widget;

/* loaded from: classes.dex */
final class cc {

    /* renamed from: a, reason: collision with root package name */
    public eq f729a;

    /* renamed from: b, reason: collision with root package name */
    public eq f730b;
    public int c;
    public int d;
    public int e;
    public int f;

    /* synthetic */ cc(eq eqVar, eq eqVar2, int i, int i2, int i3, int i4, byte b2) {
        this(eqVar, eqVar2, i, i2, i3, i4);
    }

    private cc(eq eqVar, eq eqVar2) {
        this.f729a = eqVar;
        this.f730b = eqVar2;
    }

    private cc(eq eqVar, eq eqVar2, int i, int i2, int i3, int i4) {
        this(eqVar, eqVar2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.f729a + ", newHolder=" + this.f730b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
