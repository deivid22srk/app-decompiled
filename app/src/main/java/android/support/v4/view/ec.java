package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
final class ec implements eo {

    /* renamed from: a, reason: collision with root package name */
    dy f384a;

    /* renamed from: b, reason: collision with root package name */
    boolean f385b;

    ec(dy dyVar) {
        this.f384a = dyVar;
    }

    @Override // android.support.v4.view.eo
    public final void a(View view) {
        int i;
        Runnable runnable;
        Runnable runnable2;
        this.f385b = false;
        i = this.f384a.e;
        if (i >= 0) {
            by.a(view, 2, (Paint) null);
        }
        runnable = this.f384a.c;
        if (runnable != null) {
            runnable2 = this.f384a.c;
            runnable2.run();
        }
        Object tag = view.getTag(2113929216);
        eo eoVar = tag instanceof eo ? (eo) tag : null;
        if (eoVar != null) {
            eoVar.a(view);
        }
    }

    @Override // android.support.v4.view.eo
    public final void b(View view) {
        int i;
        Runnable runnable;
        Runnable runnable2;
        int i2;
        i = this.f384a.e;
        if (i >= 0) {
            i2 = this.f384a.e;
            by.a(view, i2, (Paint) null);
            dy.c(this.f384a);
        }
        if (Build.VERSION.SDK_INT >= 16 || !this.f385b) {
            runnable = this.f384a.d;
            if (runnable != null) {
                runnable2 = this.f384a.d;
                runnable2.run();
            }
            Object tag = view.getTag(2113929216);
            eo eoVar = tag instanceof eo ? (eo) tag : null;
            if (eoVar != null) {
                eoVar.b(view);
            }
            this.f385b = true;
        }
    }

    @Override // android.support.v4.view.eo
    public final void c(View view) {
        eo eoVar;
        Object tag = view.getTag(2113929216);
        if (!(tag instanceof eo)) {
            eoVar = null;
        } else {
            eoVar = (eo) tag;
        }
        if (eoVar != null) {
            eoVar.c(view);
        }
    }
}
