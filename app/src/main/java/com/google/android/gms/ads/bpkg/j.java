package com.google.android.gms.ads.bpkg;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class j extends AsyncTask<Void, Object, c> {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f5271a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5272b;
    public final /* synthetic */ h c;

    j(h hVar, String str) {
        this.c = hVar;
        this.f5272b = str;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ c doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(c cVar) {
        c cVar2 = cVar;
        h.b(this.c);
        if ((cVar2 == null && !this.f5271a) || cVar2 != null) {
            this.c.a(cVar2, this.f5272b);
        }
        h.c(this.c);
    }

    public c a() {
        Context context;
        try {
            b.a(true);
            context = this.c.d;
            return b.a(context);
        } catch (Exception e) {
            String simpleName = e.getClass().getSimpleName();
            if (!TextUtils.isEmpty(e.getMessage())) {
                simpleName = simpleName + ": " + e.getMessage();
            }
            FinskyLog.c("Wasn't able to fetch the adId: %s", simpleName);
            h.b(simpleName, this.f5272b);
            this.f5271a = true;
            return null;
        }
    }
}
