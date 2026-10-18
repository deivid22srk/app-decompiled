package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class cb implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MyAccountFamilyManagementCard f3181a;

    cb(MyAccountFamilyManagementCard myAccountFamilyManagementCard) {
        this.f3181a = myAccountFamilyManagementCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        com.google.android.finsky.a.i iVar;
        ce ceVar;
        com.google.android.finsky.a.i iVar2;
        ce ceVar2;
        com.google.android.finsky.a.i iVar3;
        ce ceVar3;
        i = this.f3181a.h;
        switch (i) {
            case 0:
                iVar3 = this.f3181a.j;
                iVar3.a(2671, (byte[]) null, this.f3181a);
                ceVar3 = this.f3181a.i;
                ceVar3.H();
                break;
            case 1:
                iVar2 = this.f3181a.j;
                iVar2.a(2672, (byte[]) null, this.f3181a);
                ceVar2 = this.f3181a.i;
                ceVar2.I();
                break;
            case 2:
                iVar = this.f3181a.j;
                iVar.a(2673, (byte[]) null, this.f3181a);
                ceVar = this.f3181a.i;
                ceVar.I();
                break;
        }
    }
}
