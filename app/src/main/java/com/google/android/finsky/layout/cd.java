package com.google.android.finsky.layout;

import android.app.Activity;
import android.view.View;

/* loaded from: classes.dex */
final class cd implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MyAccountFamilyManagementCard f3183a;

    cd(MyAccountFamilyManagementCard myAccountFamilyManagementCard) {
        this.f3183a = myAccountFamilyManagementCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.utils.cp.a((Activity) this.f3183a.getContext(), "familycreation_setup_android_ota");
    }
}
