package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class cc implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MyAccountFamilyManagementCard f3182a;

    cc(MyAccountFamilyManagementCard myAccountFamilyManagementCard) {
        this.f3182a = myAccountFamilyManagementCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.a.i iVar;
        ce ceVar;
        iVar = this.f3182a.j;
        iVar.a(2674, (byte[]) null, this.f3182a);
        ceVar = this.f3182a.i;
        ceVar.J();
    }
}
