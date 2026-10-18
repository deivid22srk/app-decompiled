package com.google.android.gms.internal;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class fo implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fm f5979a;

    fo(fm fmVar) {
        this.f5979a = fmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5979a.a("Operation denied by user.");
    }
}
