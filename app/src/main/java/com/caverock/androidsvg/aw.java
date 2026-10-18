package com.caverock.androidsvg;

import java.util.List;

/* loaded from: classes.dex */
public final class aw implements Cloneable {
    public Boolean A;
    public Boolean B;
    public bo C;
    public Float D;
    public String E;
    public ax F;
    public String G;
    public bo H;
    public Float I;
    public bo J;
    public Float K;
    public be L;

    /* renamed from: a, reason: collision with root package name */
    public long f1294a = 0;

    /* renamed from: b, reason: collision with root package name */
    public bo f1295b;
    public ax c;
    public Float d;
    public bo e;
    public Float f;
    public ag g;
    public az h;
    public ba i;
    public Float j;
    public ag[] k;
    public ag l;
    public Float m;
    public w n;
    public List<String> o;
    public ag p;
    public Integer q;
    public ay r;
    public bc s;
    public bd t;
    public bb u;
    public Boolean v;
    public t w;
    public String x;
    public String y;
    public String z;

    protected aw() {
    }

    public static aw a() {
        aw awVar = new aw();
        awVar.f1294a = -1L;
        awVar.f1295b = w.f1401b;
        awVar.c = ax.NonZero;
        awVar.d = Float.valueOf(1.0f);
        awVar.e = null;
        awVar.f = Float.valueOf(1.0f);
        awVar.g = new ag(1.0f);
        awVar.h = az.Butt;
        awVar.i = ba.Miter;
        awVar.j = Float.valueOf(4.0f);
        awVar.k = null;
        awVar.l = new ag(0.0f);
        awVar.m = Float.valueOf(1.0f);
        awVar.n = w.f1401b;
        awVar.o = null;
        awVar.p = new ag(12.0f, cd.pt);
        awVar.q = 400;
        awVar.r = ay.Normal;
        awVar.s = bc.None;
        awVar.t = bd.LTR;
        awVar.u = bb.Start;
        awVar.v = true;
        awVar.w = null;
        awVar.x = null;
        awVar.y = null;
        awVar.z = null;
        awVar.A = Boolean.TRUE;
        awVar.B = Boolean.TRUE;
        awVar.C = w.f1401b;
        awVar.D = Float.valueOf(1.0f);
        awVar.E = null;
        awVar.F = ax.NonZero;
        awVar.G = null;
        awVar.H = null;
        awVar.I = Float.valueOf(1.0f);
        awVar.J = null;
        awVar.K = Float.valueOf(1.0f);
        awVar.L = be.None;
        return awVar;
    }

    protected final Object clone() {
        try {
            aw awVar = (aw) super.clone();
            if (this.k != null) {
                awVar.k = (ag[]) this.k.clone();
            }
            return awVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
