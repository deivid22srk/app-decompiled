package com.google.android.finsky.services;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class h implements com.google.android.finsky.gpkg.ai {
    h() {
    }

    @Override // com.google.android.finsky.gpkg.ai
    public final void a(String str) {
        if (com.google.android.finsky.gpkg.a.f2782a.equals(str)) {
            FinskyLog.a("App library has changed, requesting content sync.", new Object[0]);
            ContentSyncService.a().a();
        }
    }
}
