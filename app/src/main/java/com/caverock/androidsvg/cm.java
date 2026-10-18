package com.caverock.androidsvg;

import android.graphics.Canvas;

/* loaded from: classes.dex */
class cm extends cq {

    /* renamed from: b, reason: collision with root package name */
    public float f1340b;
    public float c;
    final /* synthetic */ cg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(cg cgVar, float f, float f2) {
        super(cgVar, (byte) 0);
        this.d = cgVar;
        this.f1340b = f;
        this.c = f2;
    }

    @Override // com.caverock.androidsvg.cq
    public void a(String str) {
        boolean k;
        co coVar;
        co coVar2;
        co coVar3;
        Canvas canvas;
        co coVar4;
        Canvas canvas2;
        co coVar5;
        k = this.d.k();
        if (k) {
            coVar2 = this.d.d;
            if (coVar2.f1344b) {
                canvas2 = this.d.e;
                float f = this.f1340b;
                float f2 = this.c;
                coVar5 = this.d.d;
                canvas2.drawText(str, f, f2, coVar5.d);
            }
            coVar3 = this.d.d;
            if (coVar3.c) {
                canvas = this.d.e;
                float f3 = this.f1340b;
                float f4 = this.c;
                coVar4 = this.d.d;
                canvas.drawText(str, f3, f4, coVar4.e);
            }
        }
        float f5 = this.f1340b;
        coVar = this.d.d;
        this.f1340b = f5 + coVar.d.measureText(str);
    }
}
