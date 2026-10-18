package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;

@gw
/* loaded from: classes.dex */
public final class il {

    /* renamed from: a, reason: collision with root package name */
    final im f6061a;

    /* renamed from: b, reason: collision with root package name */
    final Context f6062b;
    final ViewGroup c;
    com.google.android.gms.ads.internal.overlay.m d;

    public il(Context context, ViewGroup viewGroup, im imVar) {
        this(context, viewGroup, imVar, (byte) 0);
    }

    private il(Context context, ViewGroup viewGroup, im imVar, byte b2) {
        this.f6062b = context;
        this.c = viewGroup;
        this.f6061a = imVar;
        this.d = null;
    }

    public final com.google.android.gms.ads.internal.overlay.m a() {
        com.google.android.gms.common.internal.av.b("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }
}
