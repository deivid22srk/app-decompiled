package com.google.android.wallet.instrumentmanager.ui.redirect;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class c implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7351a;

    c(b bVar) {
        this.f7351a = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        com.google.android.wallet.common.bpkg.a.a.a(this.f7351a, 1636, 1622);
        this.f7351a.E();
    }
}
