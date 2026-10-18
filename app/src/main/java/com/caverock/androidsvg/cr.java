package com.caverock.androidsvg;

/* loaded from: classes.dex */
final class cr extends cq {

    /* renamed from: a, reason: collision with root package name */
    public float f1347a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg f1348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private cr(cg cgVar) {
        super(cgVar, (byte) 0);
        this.f1348b = cgVar;
        this.f1347a = 0.0f;
    }

    /* synthetic */ cr(cg cgVar, byte b2) {
        this(cgVar);
    }

    @Override // com.caverock.androidsvg.cq
    public final void a(String str) {
        co coVar;
        float f = this.f1347a;
        coVar = this.f1348b.d;
        this.f1347a = f + coVar.d.measureText(str);
    }
}
