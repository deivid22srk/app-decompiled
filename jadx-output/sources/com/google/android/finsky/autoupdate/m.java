package com.google.android.finsky.autoupdate;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class m implements u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f2044a;

    m(l lVar) {
        this.f2044a = lVar;
    }

    @Override // com.google.android.finsky.autoupdate.u
    public final void a(boolean z) {
        if (z) {
            FinskyLog.a("auto-updates finished successfully.", new Object[0]);
        } else {
            FinskyLog.a("finished w/error. waiting for next daily hygiene.", new Object[0]);
        }
    }
}
