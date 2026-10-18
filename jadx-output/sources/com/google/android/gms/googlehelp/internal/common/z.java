package com.google.android.gms.googlehelp.internal.common;

import android.util.Log;

/* loaded from: classes.dex */
final class z implements com.google.android.gms.googlehelp.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f5850a;

    z(y yVar) {
        this.f5850a = yVar;
    }

    @Override // com.google.android.gms.googlehelp.d
    public final void a() {
        Log.w("gH_OnPipClickListener", "Help toggling failed. Reset mIsToggling flag back to false.");
        y.a(this.f5850a);
    }
}
