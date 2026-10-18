package com.google.android.finsky.adapters;

import android.database.DataSetObservable;
import android.graphics.drawable.Drawable;
import com.google.android.finsky.protos.du;

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public final int f1889a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable[] f1890b;
    public final du[] c;
    public final DataSetObservable d = new DataSetObservable();
    ai e;

    public ag(int i, ai aiVar) {
        this.f1889a = i;
        this.f1890b = new Drawable[this.f1889a];
        this.c = new du[this.f1889a];
        this.e = aiVar;
    }

    public final void a(int i, Drawable drawable) {
        this.f1890b[i] = drawable;
        this.d.notifyChanged();
    }

    public final void a(int i, du duVar, float f) {
        if (this.f1890b[i] != null) {
            duVar.f3750a = (int) (r0.getIntrinsicWidth() * f);
            duVar.c = (int) (r0.getIntrinsicHeight() * f);
        } else if (this.c[i] != null) {
            duVar.f3750a = this.c[i].f3750a;
            duVar.c = this.c[i].c;
        } else {
            duVar.f3750a = 0;
            duVar.c = 0;
        }
        duVar.f3751b = true;
        duVar.d = true;
    }
}
