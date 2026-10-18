package com.google.android.finsky.activities;

import android.content.Intent;

/* loaded from: classes.dex */
final class ad implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1535a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f1536b;

    ad(ab abVar, boolean z) {
        this.f1536b = abVar;
        this.f1535a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent addCategory = this.f1536b.getBaseContext().getPackageManager().getLaunchIntentForPackage(this.f1536b.getBaseContext().getPackageName()).addFlags(67108864).addFlags(32768).addFlags(268435456).addCategory("android.intent.category.HOME");
        if (this.f1535a) {
            this.f1536b.startActivityForResult(addCategory, 1);
        } else {
            this.f1536b.startActivityForResult(addCategory, 0);
        }
    }
}
