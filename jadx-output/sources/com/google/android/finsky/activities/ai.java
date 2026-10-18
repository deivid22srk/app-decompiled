package com.google.android.finsky.activities;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class ai implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f1541a;

    ai(ab abVar) {
        this.f1541a = abVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
