package com.google.android.finsky.services;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class au implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f4596a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f4597b;

    au(at atVar, Runnable runnable) {
        this.f4597b = atVar;
        this.f4596a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RestoreService restoreService = this.f4597b.h;
        Map<String, Map<String, String>> a2 = this.f4597b.f4594a.a();
        if (a2.size() > 0) {
            for (Map.Entry<String, Map<String, String>> entry : a2.entrySet()) {
                String key = entry.getKey();
                String decode = Uri.decode(key);
                ap a3 = at.a(restoreService, decode, entry.getValue());
                if (a3 == null) {
                    this.f4597b.f4594a.a(key);
                } else {
                    this.f4597b.c.put(decode, a3);
                }
            }
        }
        this.f4596a.run();
    }
}
