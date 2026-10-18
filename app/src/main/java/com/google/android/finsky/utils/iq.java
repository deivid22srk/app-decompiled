package com.google.android.finsky.utils;

import android.content.Context;
import com.google.android.finsky.receivers.PackageMonitorReceiver;

/* loaded from: classes.dex */
public final class iq implements com.google.android.finsky.receivers.aq {

    /* renamed from: a, reason: collision with root package name */
    final Context f5001a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.finsky.bpkg.a f5002b;

    public iq(Context context, com.google.android.finsky.bpkg.a aVar, PackageMonitorReceiver packageMonitorReceiver) {
        this.f5001a = context;
        this.f5002b = aVar;
        packageMonitorReceiver.a(this);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
        if (!z) {
            this.f5002b.a(new ir(this, str));
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
