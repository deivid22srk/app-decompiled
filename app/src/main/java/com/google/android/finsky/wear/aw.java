package com.google.android.finsky.wear;

import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
final class aw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5102a;

    aw(WearSupportService wearSupportService) {
        this.f5102a = wearSupportService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        Handler handler;
        List list3;
        WearSupportService.a(this.f5102a);
        list = this.f5102a.n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            handler = this.f5102a.i;
            list3 = this.f5102a.n;
            handler.post((Runnable) list3.get(i));
        }
        list2 = this.f5102a.n;
        list2.clear();
        WearSupportService.f(this.f5102a);
    }
}
