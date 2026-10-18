package com.google.android.finsky.wear;

import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
final class aa implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.n> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f5068a;

    aa(z zVar) {
        this.f5068a = zVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.n nVar) {
        List<Runnable> list;
        List list2;
        Handler handler;
        com.google.android.gms.wearable.n nVar2 = nVar;
        synchronized (this.f5068a) {
            this.f5068a.a(nVar2);
            nVar2.a();
            list = this.f5068a.i;
            for (Runnable runnable : list) {
                if (runnable != null) {
                    handler = this.f5068a.h;
                    handler.post(runnable);
                }
            }
            list2 = this.f5068a.i;
            list2.clear();
            z.c(this.f5068a);
            z.d(this.f5068a);
        }
    }
}
