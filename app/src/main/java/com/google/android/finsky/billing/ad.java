package com.google.android.finsky.billing;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class ad implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f2157a;

    ad(ab abVar) {
        this.f2157a = abVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aq v;
        v = this.f2157a.v();
        v.V_();
    }
}
