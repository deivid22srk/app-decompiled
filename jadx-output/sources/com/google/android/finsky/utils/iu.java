package com.google.android.finsky.utils;

import android.content.Context;
import com.google.android.finsky.receivers.PackageMonitorReceiver;

/* loaded from: classes.dex */
public final class iu implements com.google.android.finsky.receivers.aq {

    /* renamed from: a, reason: collision with root package name */
    final Context f5007a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.android.finsky.g.h f5008b;
    com.google.android.finsky.api.model.h c;

    public iu(Context context, com.google.android.finsky.g.h hVar, PackageMonitorReceiver packageMonitorReceiver) {
        this.f5008b = hVar;
        this.f5007a = context;
        packageMonitorReceiver.a(this);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
        if (!z) {
            this.f5008b.a(new iv(this, str));
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }
}
