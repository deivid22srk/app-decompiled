package com.google.android.finsky.gpkg;

import android.os.Handler;
import com.android.volley.VolleyError;
import com.google.android.finsky.protos.it;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ac implements com.android.volley.s, com.android.volley.t<it> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, byte[]> f2788a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f2789b;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(it itVar) {
        Handler handler;
        handler = this.f2789b.f2843a;
        handler.post(new ad(this, itVar));
    }

    public ac(x xVar) {
        a aVar;
        this.f2789b = xVar;
        for (String str : a.g) {
            Map<String, byte[]> map = this.f2788a;
            aVar = xVar.f2844b;
            map.put(str, aVar.i(str));
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        boolean z;
        Handler handler;
        FinskyLog.c("Library replication failed: %s", volleyError);
        z = this.f2789b.k;
        if (z) {
            this.f2789b.a(3, (jb) null, volleyError, (String) null);
        }
        handler = this.f2789b.f2843a;
        handler.post(new ae(this));
    }
}
