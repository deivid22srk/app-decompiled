package com.google.android.finsky.activities;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class fh implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fg f1742a;

    fh(fg fgVar) {
        this.f1742a = fgVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        boolean[] zArr;
        zArr = this.f1742a.ai;
        zArr[i] = z;
    }
}
