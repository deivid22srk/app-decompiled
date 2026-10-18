package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Build;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.hi;
import com.google.android.finsky.utils.hj;

/* loaded from: classes.dex */
final class x implements hj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1877a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f1878b;

    x(d dVar, boolean z) {
        this.f1878b = dVar;
        this.f1877a = z;
    }

    @Override // com.google.android.finsky.utils.hj
    public final void a(boolean z) {
        if (z) {
            if (FinskyApp.a().e().a(12603770L) && Build.VERSION.SDK_INT >= 21) {
                Intent a2 = hi.a(this.f1878b);
                if (a2 != null) {
                    this.f1878b.startActivityForResult(a2, 24);
                    return;
                }
            } else {
                AccessRestrictedActivity.a(this.f1878b);
                this.f1878b.finish();
                return;
            }
        }
        this.f1878b.f(this.f1877a);
    }
}
