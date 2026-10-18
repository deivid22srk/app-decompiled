package com.google.android.finsky.services;

import android.content.Intent;

/* loaded from: classes.dex */
final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f4579a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RestoreService f4580b;
    private int c;

    al(RestoreService restoreService, Intent intent) {
        this.f4580b = restoreService;
        this.f4579a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a2;
        this.c++;
        if (this.c == 4) {
            at atVar = this.f4580b.f4555a;
            atVar.f--;
            a2 = this.f4580b.a(this.f4579a);
            RestoreService.b(this.f4580b);
            if (!a2) {
                this.f4580b.f4555a.a();
            }
        }
    }
}
