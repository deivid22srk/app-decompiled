package com.google.android.gms.internal;

import android.app.DownloadManager;

/* loaded from: classes.dex */
public class hn extends hm {
    public hn() {
        super((byte) 0);
    }

    @Override // com.google.android.gms.internal.hm
    public final int a() {
        return 6;
    }

    @Override // com.google.android.gms.internal.hm
    public boolean a(DownloadManager.Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    @Override // com.google.android.gms.internal.hm
    public final int b() {
        return 7;
    }
}
