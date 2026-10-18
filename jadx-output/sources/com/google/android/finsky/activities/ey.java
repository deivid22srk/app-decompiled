package com.google.android.finsky.activities;

import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ey implements com.google.android.finsky.layout.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PublicReviewsActivity f1731a;

    ey(PublicReviewsActivity publicReviewsActivity) {
        this.f1731a = publicReviewsActivity;
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        boolean z;
        z = this.f1731a.k;
        if (!z) {
            PublicReviewsActivity.b(this.f1731a);
            Toast.makeText(this.f1731a.getBaseContext(), R.string.gplus_public_reviews_confirmed, 0).show();
            com.google.android.finsky.utils.bg.ad.b(FinskyApp.a().j()).a((com.google.android.finsky.c.o<Boolean>) true);
            this.f1731a.setResult(-1);
            this.f1731a.finish();
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        boolean z;
        z = this.f1731a.k;
        if (!z) {
            PublicReviewsActivity.b(this.f1731a);
            this.f1731a.setResult(0);
            this.f1731a.finish();
        }
    }
}
