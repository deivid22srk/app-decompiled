package com.google.android.gms.ads.internal.apkg;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5288a;

    g(Context context) {
        this.f5288a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        j j = com.google.android.gms.ads.internal.d.j();
        Context context = this.f5288a;
        synchronized (j.f5291a) {
            if (j.f5292b) {
                return null;
            }
            Context e = com.google.android.gms.common.c.e(context);
            if (e == null) {
                return null;
            }
            com.google.android.gms.ads.internal.d.h();
            j.c = e.getSharedPreferences("google_ads_flags", 1);
            j.f5292b = true;
            return null;
        }
    }
}
