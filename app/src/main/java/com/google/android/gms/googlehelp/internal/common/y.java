package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.util.Log;

/* loaded from: classes.dex */
public class y extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f5848a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5849b;

    public y(Activity activity) {
        this.f5848a = activity;
    }

    static /* synthetic */ boolean a(y yVar) {
        yVar.f5849b = false;
        return false;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.a, com.google.android.gms.googlehelp.internal.common.s
    public final void b() {
        if (this.f5849b) {
            Log.d("gH_OnPipClickListener", "Double click gets discarded.");
            return;
        }
        this.f5849b = true;
        com.google.android.gms.googlehelp.a aVar = new com.google.android.gms.googlehelp.a(this.f5848a);
        com.google.android.gms.googlehelp.h.a(aVar.f5813b, new com.google.android.gms.googlehelp.c(aVar, new z(this)));
    }
}
