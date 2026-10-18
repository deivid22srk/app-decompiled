package com.google.android.finsky.e;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class x<T> {
    protected Context d;
    protected com.google.android.finsky.navigationmanager.b e;
    protected com.google.android.play.image.e f;
    protected T g;

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
