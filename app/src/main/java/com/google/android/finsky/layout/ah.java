package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.ha;
import com.google.android.finsky.detailspage.TextModule;

/* loaded from: classes.dex */
public final class ah implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ha f3129a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f3130b = -1;
    final /* synthetic */ com.google.android.finsky.navigationmanager.b c;
    final /* synthetic */ TextModule.DetailsExtraPrimary d;
    final /* synthetic */ int e;
    final /* synthetic */ com.google.android.finsky.layout.play.cy f;
    final /* synthetic */ DetailsExpandedContainer g;

    public ah(DetailsExpandedContainer detailsExpandedContainer, com.google.android.finsky.navigationmanager.b bVar, TextModule.DetailsExtraPrimary detailsExtraPrimary, int i, com.google.android.finsky.layout.play.cy cyVar) {
        this.g = detailsExpandedContainer;
        this.c = bVar;
        this.d = detailsExtraPrimary;
        this.e = i;
        this.f = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.a(this.d.c, this.d.f2518a, this.e, FinskyApp.a().g, this.f);
    }
}
