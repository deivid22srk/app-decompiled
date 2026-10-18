package com.caverock.androidsvg;

/* loaded from: classes.dex */
public final class n {
    public static final n c = new n(null, null);
    public static final n d = new n(o.None, null);
    public static final n e = new n(o.XMidYMid, p.Meet);
    public static final n f = new n(o.XMinYMin, p.Meet);
    public static final n g = new n(o.XMaxYMax, p.Meet);
    public static final n h = new n(o.XMidYMin, p.Meet);
    public static final n i = new n(o.XMidYMax, p.Meet);
    public static final n j = new n(o.XMidYMid, p.Slice);
    public static final n k = new n(o.XMinYMin, p.Slice);

    /* renamed from: a, reason: collision with root package name */
    o f1385a;

    /* renamed from: b, reason: collision with root package name */
    p f1386b;

    public n(o oVar, p pVar) {
        this.f1385a = oVar;
        this.f1386b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            n nVar = (n) obj;
            return this.f1385a == nVar.f1385a && this.f1386b == nVar.f1386b;
        }
        return false;
    }
}
