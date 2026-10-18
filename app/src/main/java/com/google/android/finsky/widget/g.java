package com.google.android.finsky.widget;

import com.google.android.finsky.activities.AccessRestrictedActivity;
import com.google.android.finsky.utils.hj;

/* loaded from: classes.dex */
final class g implements hj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f5209a;

    g(f fVar) {
        this.f5209a = fVar;
    }

    @Override // com.google.android.finsky.utils.hj
    public final void a(boolean z) {
        if (z) {
            this.f5209a.setResult(0);
            AccessRestrictedActivity.a(this.f5209a);
            this.f5209a.finish();
            return;
        }
        f.a(this.f5209a);
    }
}
