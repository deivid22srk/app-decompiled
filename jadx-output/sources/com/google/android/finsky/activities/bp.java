package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.receivers.ExpireLaunchUrlReceiver;

/* loaded from: classes.dex */
final class bp implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f1625a;

    bp(bi biVar) {
        this.f1625a = biVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1625a.r.a(219, (byte[]) null, this.f1625a.s);
        this.f1625a.c.a(this.f1625a.f, this.f1625a.g, true);
        ExpireLaunchUrlReceiver.a(this.f1625a.e, this.f1625a.g.f1963a.f3890a);
        FinskyApp.a().r.b(this.f1625a.g.f1963a.f3890a, (String) null);
    }
}
