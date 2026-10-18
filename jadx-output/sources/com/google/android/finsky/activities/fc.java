package com.google.android.finsky.activities;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class fc implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fb f1737a;

    fc(fb fbVar) {
        this.f1737a = fbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fb.a(this.f1737a, i);
        this.f1737a.u();
    }
}
