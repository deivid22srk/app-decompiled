package com.google.android.finsky.layout;

import android.content.Intent;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.lightpurchase.AgeVerificationActivity;

/* loaded from: classes.dex */
final class bl implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f3163a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f3164b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ HeroGraphicView g;

    bl(HeroGraphicView heroGraphicView, com.google.android.finsky.layout.play.cy cyVar, boolean z, String str, int i, String str2, boolean z2) {
        this.g = heroGraphicView;
        this.f3163a = cyVar;
        this.f3164b = z;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent a2;
        FinskyApp.a().h().a(120, (byte[]) null, this.f3163a);
        if (this.f3164b && FinskyApp.a().a(this.c).a()) {
            a2 = AgeVerificationActivity.a(this.c, this.d, (String) null);
        } else {
            a2 = HeroGraphicView.a(this.g, this.e, this.f);
        }
        this.g.getContext().startActivity(a2);
    }
}
