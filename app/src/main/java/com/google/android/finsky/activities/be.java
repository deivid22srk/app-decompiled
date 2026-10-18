package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
public final class be implements android.support.v4.view.dm {

    /* renamed from: a, reason: collision with root package name */
    private static float f1610a = 0.375f;

    /* renamed from: b, reason: collision with root package name */
    private final bf f1611b;

    public be(bf bfVar) {
        this.f1611b = bfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.dm
    public final void a(View view, float f) {
        float min;
        boolean z = false;
        if (view == this.f1611b.c(0)) {
            boolean d = this.f1611b.d(0);
            if (f == 0.0f) {
                android.support.v4.view.by.c(view, 1.0f);
                z = d;
            } else {
                if (d) {
                    min = Math.min((1.0f - Math.abs(f)) / f1610a, 1.0f);
                } else {
                    min = 1.0f - Math.min(Math.abs(f) / f1610a, 1.0f);
                }
                android.support.v4.view.by.c(view, Math.max(0.0f, min));
                z = d;
            }
        } else if (view == this.f1611b.c(1)) {
            z = this.f1611b.d(1);
        }
        if (f >= 1.0f || f <= -1.0f) {
            android.support.v4.view.by.a(view, 0.0f);
        } else {
            android.support.v4.view.by.a(view, -((int) (view.getWidth() * f)));
        }
        if (view instanceof bg) {
            ((bg) view).a(f, z);
        }
    }
}
