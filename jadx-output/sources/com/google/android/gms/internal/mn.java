package com.google.android.gms.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class mn extends me {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Dialog f6169b;
    final /* synthetic */ mm c;

    mn(mm mmVar, Dialog dialog) {
        this.c = mmVar;
        this.f6169b = dialog;
    }

    @Override // com.google.android.gms.internal.me
    protected final void a() {
        this.c.f6167a.v();
        this.f6169b.dismiss();
    }
}
