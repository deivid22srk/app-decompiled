package com.google.android.finsky.activities;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class t implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f1871a;

    t(d dVar) {
        this.f1871a = dVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f1871a.removeDialog(0);
    }
}
