package android.support.design.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
abstract class x extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f151a;

    /* renamed from: b, reason: collision with root package name */
    private float f152b;
    private float c;

    protected abstract float a();

    private x(u uVar) {
        this.f151a = uVar;
    }

    /* synthetic */ x(u uVar, byte b2) {
        this(uVar);
    }

    @Override // android.view.animation.Animation
    public void reset() {
        super.reset();
        this.f152b = this.f151a.f146a.j;
        this.c = a() - this.f152b;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        ah ahVar = this.f151a.f146a;
        ahVar.a(this.f152b + (this.c * f), ahVar.h);
    }
}
