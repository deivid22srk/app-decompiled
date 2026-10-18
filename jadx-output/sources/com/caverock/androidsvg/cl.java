package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Path;

/* loaded from: classes.dex */
final class cl extends cm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg f1339a;
    private Path f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(cg cgVar, Path path, float f) {
        super(cgVar, f, 0.0f);
        this.f1339a = cgVar;
        this.f = path;
    }

    @Override // com.caverock.androidsvg.cm, com.caverock.androidsvg.cq
    public final void a(String str) {
        boolean k;
        co coVar;
        co coVar2;
        co coVar3;
        Canvas canvas;
        co coVar4;
        Canvas canvas2;
        co coVar5;
        k = this.f1339a.k();
        if (k) {
            coVar2 = this.f1339a.d;
            if (coVar2.f1344b) {
                canvas2 = this.f1339a.e;
                Path path = this.f;
                float f = this.f1340b;
                float f2 = this.c;
                coVar5 = this.f1339a.d;
                canvas2.drawTextOnPath(str, path, f, f2, coVar5.d);
            }
            coVar3 = this.f1339a.d;
            if (coVar3.c) {
                canvas = this.f1339a.e;
                Path path2 = this.f;
                float f3 = this.f1340b;
                float f4 = this.c;
                coVar4 = this.f1339a.d;
                canvas.drawTextOnPath(str, path2, f3, f4, coVar4.e);
            }
        }
        float f5 = this.f1340b;
        coVar = this.f1339a.d;
        this.f1340b = f5 + coVar.d.measureText(str);
    }
}
