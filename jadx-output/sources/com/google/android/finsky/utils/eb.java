package com.google.android.finsky.utils;

import android.content.pm.IPackageInstallObserver;

/* loaded from: classes.dex */
final class eb extends IPackageInstallObserver.Stub {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ek f4843a;

    eb(ek ekVar) {
        this.f4843a = ekVar;
    }

    @Override // android.content.pm.IPackageInstallObserver
    public final void packageInstalled(String str, int i) {
        if (this.f4843a != null) {
            this.f4843a.a(str, i);
        }
    }
}
