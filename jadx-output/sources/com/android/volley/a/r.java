package com.android.volley.a;

import android.graphics.Bitmap;
import com.android.volley.VolleyError;
import java.util.LinkedList;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    Bitmap f1222a;

    /* renamed from: b, reason: collision with root package name */
    VolleyError f1223b;
    final LinkedList<t> c = new LinkedList<>();
    final /* synthetic */ n d;
    private final com.android.volley.l<?> e;

    public r(n nVar, com.android.volley.l<?> lVar, t tVar) {
        this.d = nVar;
        this.e = lVar;
        this.c.add(tVar);
    }

    public final boolean a(t tVar) {
        this.c.remove(tVar);
        if (this.c.size() != 0) {
            return false;
        }
        this.e.d();
        return true;
    }
}
