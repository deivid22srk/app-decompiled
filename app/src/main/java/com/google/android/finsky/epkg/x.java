package com.google.android.finsky.epkg;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class x<T> {
    public Context d;
    public com.google.android.finsky.navigationmanager.b e;
    public com.google.android.play.image.e f;
    public T g;

    public final void a(Context context, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar) {
        if (this.d != context) {
            this.d = context;
            this.e = bVar;
            this.f = eVar;
            this.g = null;
        }
    }

    public void a(T t) {
        this.g = t;
    }
}
