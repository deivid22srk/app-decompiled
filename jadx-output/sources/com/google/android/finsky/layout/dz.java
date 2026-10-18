package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.lightpurchase.AgeVerificationActivity;
import com.google.android.finsky.protos.pe;

/* loaded from: classes.dex */
final class dz implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f3247a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f3248b;
    final /* synthetic */ SongSnippet c;

    dz(SongSnippet songSnippet, boolean z, String str) {
        this.c = songSnippet;
        this.f3247a = z;
        this.f3248b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pe peVar;
        if (!this.f3247a || !FinskyApp.a().a(this.f3248b).a()) {
            peVar = this.c.g;
            com.google.android.finsky.j.b.a(peVar);
        } else {
            this.c.getContext().startActivity(AgeVerificationActivity.a(this.f3248b, 2, (String) null));
        }
    }
}
