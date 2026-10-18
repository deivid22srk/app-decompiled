package com.caverock.androidsvg;

import android.graphics.Path;

/* loaded from: classes.dex */
final class cn extends cq {

    /* renamed from: a, reason: collision with root package name */
    public float f1341a;

    /* renamed from: b, reason: collision with root package name */
    public float f1342b;
    public Path c;
    final /* synthetic */ cg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(cg cgVar, float f, float f2, Path path) {
        super(cgVar, (byte) 0);
        this.d = cgVar;
        this.f1341a = f;
        this.f1342b = f2;
        this.c = path;
    }

    @Override // com.caverock.androidsvg.cq
    public final boolean a(by byVar) {
        if (!(byVar instanceof bz)) {
            return true;
        }
        cg.c("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        return false;
    }

    @Override // com.caverock.androidsvg.cq
    public final void a(String str) {
        boolean k;
        co coVar;
        co coVar2;
        k = this.d.k();
        if (k) {
            Path path = new Path();
            coVar2 = this.d.d;
            coVar2.d.getTextPath(str, 0, str.length(), this.f1341a, this.f1342b, path);
            this.c.addPath(path);
        }
        float f = this.f1341a;
        coVar = this.d.d;
        this.f1341a = f + coVar.d.measureText(str);
    }
}
