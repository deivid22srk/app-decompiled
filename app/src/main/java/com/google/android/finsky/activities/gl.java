package com.google.android.finsky.activities;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class gl implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gj f1774a;

    gl(gj gjVar) {
        this.f1774a = gjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1774a.x();
    }
}
