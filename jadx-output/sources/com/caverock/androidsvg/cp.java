package com.caverock.androidsvg;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
final class cp extends cq {

    /* renamed from: a, reason: collision with root package name */
    float f1345a;

    /* renamed from: b, reason: collision with root package name */
    float f1346b;
    RectF c;
    final /* synthetic */ cg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(cg cgVar, float f, float f2) {
        super(cgVar, (byte) 0);
        this.d = cgVar;
        this.c = new RectF();
        this.f1345a = f;
        this.f1346b = f2;
    }

    @Override // com.caverock.androidsvg.cq
    public final boolean a(by byVar) {
        if (!(byVar instanceof bz)) {
            return true;
        }
        bz bzVar = (bz) byVar;
        bn a2 = byVar.u.a(bzVar.f1319a);
        if (a2 == null) {
            cg.d("TextPath path reference '%s' not found", bzVar.f1319a);
            return false;
        }
        am amVar = (am) a2;
        Path path = new ck(this.d, amVar.f1282a).f1337a;
        if (amVar.e != null) {
            path.transform(amVar.e);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.c.union(rectF);
        return false;
    }

    @Override // com.caverock.androidsvg.cq
    public final void a(String str) {
        boolean k;
        co coVar;
        co coVar2;
        k = this.d.k();
        if (k) {
            Rect rect = new Rect();
            coVar2 = this.d.d;
            coVar2.d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f1345a, this.f1346b);
            this.c.union(rectF);
        }
        float f = this.f1345a;
        coVar = this.d.d;
        this.f1345a = f + coVar.d.measureText(str);
    }
}
