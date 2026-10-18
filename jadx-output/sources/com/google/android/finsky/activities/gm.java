package com.google.android.finsky.activities;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
final class gm implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f1775a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gj f1776b;

    gm(gj gjVar, Dialog dialog) {
        this.f1776b = gjVar;
        this.f1775a = dialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ((TextView) this.f1775a.findViewById(R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
