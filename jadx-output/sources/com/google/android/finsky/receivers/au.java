package com.google.android.finsky.receivers;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class au implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TosAckedReceiver f4470a;

    au(TosAckedReceiver tosAckedReceiver) {
        this.f4470a = tosAckedReceiver;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error sending TOS acceptance: %s", volleyError);
    }
}
