package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.kb;

/* loaded from: classes.dex */
final class dq implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3234a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kb f3235b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ Document d;
    final /* synthetic */ RewardRowView2 e;

    dq(RewardRowView2 rewardRowView2, com.google.android.finsky.navigationmanager.b bVar, kb kbVar, DfeToc dfeToc, Document document) {
        this.e = rewardRowView2;
        this.f3234a = bVar;
        this.f3235b = kbVar;
        this.c = dfeToc;
        this.d = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a((com.google.android.finsky.layout.play.cy) this.e);
        this.f3234a.a(this.f3235b.g, (String) null, this.c, view.getContext().getPackageManager(), this.d.f1963a.f3890a);
    }
}
