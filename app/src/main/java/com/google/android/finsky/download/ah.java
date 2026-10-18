package com.google.android.finsky.download;

import android.os.Handler;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ed;

/* loaded from: classes.dex */
final class ah implements ed {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f2693a;

    private ah(x xVar) {
        this.f2693a = xVar;
    }

    /* synthetic */ ah(x xVar, byte b2) {
        this(xVar);
    }

    @Override // com.google.android.finsky.utils.ed
    public final void a(boolean z) {
        if (!z) {
            FinskyLog.c("Could not free required amount of space for download", new Object[0]);
        }
        new Handler(this.f2693a.g.getMainLooper()).post(new ai(this.f2693a, (byte) 0));
    }
}
