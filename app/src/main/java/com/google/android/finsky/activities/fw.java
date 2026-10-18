package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class fw implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fu f1754a;

    fw(fu fuVar) {
        this.f1754a = fuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.utils.ac acVar;
        com.google.android.finsky.navigationmanager.b bVar;
        String str;
        int i;
        FinskyApp.a().h().a(298, (byte[]) null, this.f1754a);
        acVar = this.f1754a.d;
        acVar.e = false;
        bVar = this.f1754a.as;
        str = this.f1754a.e;
        i = this.f1754a.g;
        bVar.a(str, i);
    }
}
