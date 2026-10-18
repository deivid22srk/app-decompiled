package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Build;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.hi;
import com.google.android.finsky.utils.hj;

/* loaded from: classes.dex */
final class eb implements hj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LaunchUrlHandlerActivity f1707a;

    eb(LaunchUrlHandlerActivity launchUrlHandlerActivity) {
        this.f1707a = launchUrlHandlerActivity;
    }

    @Override // com.google.android.finsky.utils.hj
    public final void a(boolean z) {
        if (z) {
            if (FinskyApp.a().e().a(12603770L) && Build.VERSION.SDK_INT >= 21) {
                Intent a2 = hi.a(this.f1707a);
                if (a2 != null) {
                    this.f1707a.startActivityForResult(a2, 20);
                    return;
                }
            } else {
                AccessRestrictedActivity.a(this.f1707a);
                this.f1707a.finish();
                return;
            }
        }
        this.f1707a.a();
    }
}
