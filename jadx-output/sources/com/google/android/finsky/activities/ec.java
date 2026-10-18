package com.google.android.finsky.activities;

import android.content.Intent;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ec implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f1708a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.b.a f1709b;
    final /* synthetic */ LaunchUrlHandlerActivity c;

    ec(LaunchUrlHandlerActivity launchUrlHandlerActivity, Intent intent, com.google.android.finsky.b.a aVar) {
        this.c = launchUrlHandlerActivity;
        this.f1708a = intent;
        this.f1709b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = this.f1708a;
        try {
            try {
                Intent a2 = LaunchUrlHandlerActivity.a(this.c, this.c.getIntent(), this.f1709b, FinskyApp.a().h());
                LaunchUrlHandlerActivity launchUrlHandlerActivity = this.c;
                launchUrlHandlerActivity.startActivity(a2);
                this.c.finish();
                intent = launchUrlHandlerActivity;
            } catch (Exception e) {
                FinskyLog.b(e, "Error while processing launch URL", new Object[0]);
                this.c.startActivity(intent);
                this.c.finish();
                intent = intent;
            }
        } catch (Throwable th) {
            this.c.startActivity(intent);
            this.c.finish();
            throw th;
        }
    }
}
