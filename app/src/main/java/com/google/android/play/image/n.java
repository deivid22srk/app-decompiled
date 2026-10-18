package com.google.android.play.image;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public com.android.volley.l<?> f6946a;

    /* renamed from: b, reason: collision with root package name */
    Bitmap f6947b;
    List<j> c = new ArrayList();
    final /* synthetic */ e d;

    public n(e eVar, com.android.volley.l<?> lVar, j jVar) {
        this.d = eVar;
        this.f6946a = lVar;
        this.c.add(jVar);
    }

    public final boolean a(j jVar) {
        this.c.remove(jVar);
        if (this.c.size() != 0) {
            return false;
        }
        this.f6946a.d();
        return true;
    }
}
