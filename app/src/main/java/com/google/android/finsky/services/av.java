package com.google.android.finsky.services;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class av implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f4598a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f4599b;

    av(at atVar, Runnable runnable) {
        this.f4599b = atVar;
        this.f4598a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RestoreService restoreService = this.f4599b.h;
        Map<String, Map<String, String>> a2 = this.f4599b.f4595b.a();
        if (a2.size() > 0) {
            for (Map.Entry<String, Map<String, String>> entry : a2.entrySet()) {
                String key = entry.getKey();
                String decode = Uri.decode(key);
                ar b2 = at.b(restoreService, decode, entry.getValue());
                if (b2 == null) {
                    this.f4599b.f4595b.a(key);
                } else {
                    this.f4599b.d.put(decode, b2);
                }
            }
        }
        this.f4598a.run();
    }
}
