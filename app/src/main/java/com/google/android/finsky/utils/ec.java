package com.google.android.finsky.utils;

import android.content.pm.IPackageDataObserver;

/* loaded from: classes.dex */
public final class ec extends IPackageDataObserver.Stub {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ed f4844a;

    public ec(ed edVar) {
        this.f4844a = edVar;
    }

    @Override // android.content.pm.IPackageDataObserver
    public final void onRemoveCompleted(String str, boolean z) {
        this.f4844a.a(z);
    }
}
