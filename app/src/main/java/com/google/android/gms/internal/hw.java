package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes.dex */
final class hw implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hv f6040b;

    hw(hv hvVar, String str) {
        this.f6040b = hvVar;
        this.f6039a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.d.c();
        hk.a(this.f6040b.f6037a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f6039a), "Share via"));
    }
}
