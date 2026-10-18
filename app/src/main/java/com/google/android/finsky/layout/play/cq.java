package com.google.android.finsky.layout.play;

import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.kd;

/* loaded from: classes.dex */
public final class cq implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3476a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kd f3477b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ Document d;
    final /* synthetic */ cy e;
    final /* synthetic */ PlayNewsstandCardContentView f;

    public cq(PlayNewsstandCardContentView playNewsstandCardContentView, com.google.android.finsky.navigationmanager.b bVar, kd kdVar, DfeToc dfeToc, Document document, cy cyVar) {
        this.f = playNewsstandCardContentView;
        this.f3476a = bVar;
        this.f3477b = kdVar;
        this.c = dfeToc;
        this.d = document;
        this.e = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.navigationmanager.b bVar = this.f3476a;
        String str = this.f3477b.j;
        String str2 = this.f3477b.f4027a;
        DfeToc dfeToc = this.c;
        int i = this.d.f1963a.g;
        if (bVar.k()) {
            bVar.a(19, (String) null, (Fragment) com.google.android.finsky.epkg.n.a(dfeToc, str, str2, i), false, new View[0]);
        }
        FinskyApp.a().h().a(2909, (byte[]) null, this.e);
    }
}
