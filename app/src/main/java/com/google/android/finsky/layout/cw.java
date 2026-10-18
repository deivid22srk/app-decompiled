package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gx;

/* loaded from: classes.dex */
public final class cw implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gx f3209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.ad f3210b;
    final /* synthetic */ PlayCreditGiftingRow c;

    public cw(PlayCreditGiftingRow playCreditGiftingRow, gx gxVar, com.google.android.finsky.layout.play.ad adVar) {
        this.c = playCreditGiftingRow;
        this.f3209a = gxVar;
        this.f3210b = adVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cx cxVar;
        cxVar = this.c.f3043a;
        cxVar.a(new Document(this.f3209a), this.f3209a.u[0].S);
        FinskyApp.a().h().a(this.f3210b);
    }
}
