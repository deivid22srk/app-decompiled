package com.google.android.gms.internal;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class fu implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fs f5989a;

    fu(fs fsVar) {
        this.f5989a = fsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5989a.a("User canceled the download.");
    }
}
