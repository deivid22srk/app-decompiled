package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.kb;

/* loaded from: classes.dex */
final class dp implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kb f3233b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ Document d;
    final /* synthetic */ RewardRowView e;

    dp(RewardRowView rewardRowView, com.google.android.finsky.navigationmanager.b bVar, kb kbVar, DfeToc dfeToc, Document document) {
        this.e = rewardRowView;
        this.f3232a = bVar;
        this.f3233b = kbVar;
        this.c = dfeToc;
        this.d = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a((com.google.android.finsky.layout.play.cy) this.e);
        this.f3232a.a(this.f3233b.g, (String) null, this.c, view.getContext().getPackageManager(), this.d.f1963a.f3890a);
    }
}
