package com.android.a.a;

import android.util.Log;

/* loaded from: classes.dex */
final class n implements ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f1120a;

    n(l lVar) {
        this.f1120a = lVar;
    }

    @Override // com.android.a.a.ab
    public final void a() {
        Log.d(toString(), "Data loading completed.");
        this.f1120a.j.post(new o(this));
    }
}
