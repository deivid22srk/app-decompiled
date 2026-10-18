package android.support.v4.widget;

import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f450a;

    private c(a aVar) {
        this.f450a = aVar;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        b bVar;
        boolean a2;
        boolean z3;
        View view;
        b bVar2;
        boolean z4 = false;
        z = this.f450a.o;
        if (z) {
            z2 = this.f450a.m;
            if (z2) {
                a.c(this.f450a);
                bVar2 = this.f450a.f415a;
                bVar2.e = AnimationUtils.currentAnimationTimeMillis();
                bVar2.i = -1L;
                bVar2.f = bVar2.e;
                bVar2.j = 0.5f;
                bVar2.g = 0;
                bVar2.h = 0;
            }
            bVar = this.f450a.f415a;
            if (bVar.i > 0 && AnimationUtils.currentAnimationTimeMillis() > bVar.i + bVar.k) {
                z4 = true;
            }
            if (!z4) {
                a2 = this.f450a.a();
                if (a2) {
                    z3 = this.f450a.n;
                    if (z3) {
                        a.h(this.f450a);
                        a.i(this.f450a);
                    }
                    if (bVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    float a3 = bVar.a(currentAnimationTimeMillis);
                    float f = (a3 * 4.0f) + ((-4.0f) * a3 * a3);
                    long j = currentAnimationTimeMillis - bVar.f;
                    bVar.f = currentAnimationTimeMillis;
                    bVar.g = (int) (j * f * bVar.c);
                    bVar.h = (int) (f * j * bVar.d);
                    this.f450a.a(bVar.h);
                    view = this.f450a.c;
                    android.support.v4.view.by.a(view, this);
                    return;
                }
            }
            a.f(this.f450a);
        }
    }
}
