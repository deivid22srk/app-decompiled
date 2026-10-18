package com.google.android.finsky.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f1851a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f1852b;

    o(d dVar, Intent intent) {
        this.f1852b = dVar;
        this.f1851a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1852b.startActivity(this.f1851a);
        } catch (ActivityNotFoundException e) {
            FinskyLog.b(e, "Intent: %s", this.f1851a.toString());
            throw e;
        }
    }
}
