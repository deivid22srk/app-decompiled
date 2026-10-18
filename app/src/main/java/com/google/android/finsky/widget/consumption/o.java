package com.google.android.finsky.widget.consumption;

/* loaded from: classes.dex */
final class o implements Comparable<o> {

    /* renamed from: a, reason: collision with root package name */
    int f5190a;

    /* renamed from: b, reason: collision with root package name */
    int f5191b;
    int c;
    long d;
    final /* synthetic */ n e;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(o oVar) {
        o oVar2 = oVar;
        if (this.d != oVar2.d) {
            return this.d < oVar2.d ? 1 : -1;
        }
        if (this.f5190a != oVar2.f5190a) {
            return this.f5190a <= oVar2.f5190a ? -1 : 1;
        }
        if (this.f5191b != oVar2.f5191b) {
            return this.f5191b <= oVar2.f5191b ? -1 : 1;
        }
        if (this.c != oVar2.c) {
            return this.c <= oVar2.c ? -1 : 1;
        }
        return 0;
    }

    public o(n nVar, int i, int i2, int i3) {
        this.e = nVar;
        this.f5190a = i;
        this.f5191b = i2;
        this.c = i3;
    }
}
