package com.caverock.androidsvg;

import android.graphics.Path;

/* loaded from: classes.dex */
final class ck implements ao {

    /* renamed from: a, reason: collision with root package name */
    Path f1337a = new Path();

    /* renamed from: b, reason: collision with root package name */
    float f1338b;
    float c;
    final /* synthetic */ cg d;

    public ck(cg cgVar, an anVar) {
        this.d = cgVar;
        if (anVar != null) {
            anVar.a(this);
        }
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2) {
        this.f1337a.moveTo(f, f2);
        this.f1338b = f;
        this.c = f2;
    }

    @Override // com.caverock.androidsvg.ao
    public final void b(float f, float f2) {
        this.f1337a.lineTo(f, f2);
        this.f1338b = f;
        this.c = f2;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1337a.cubicTo(f, f2, f3, f4, f5, f6);
        this.f1338b = f5;
        this.c = f6;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, float f4) {
        this.f1337a.quadTo(f, f2, f3, f4);
        this.f1338b = f3;
        this.c = f4;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        cg.a(this.f1338b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.f1338b = f4;
        this.c = f5;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a() {
        this.f1337a.close();
    }
}
