package com.google.android.finsky.billing;

import com.google.android.finsky.protos.bq;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
public final class w implements com.android.volley.t<bq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2443a;

    public w(String str) {
        this.f2443a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(bq bqVar) {
        String str = this.f2443a;
        boolean z = bqVar.f3644a;
        bg.G.b(str).a((com.google.android.finsky.cpkg.o<Boolean>) Boolean.valueOf(z));
        bg.H.b(str).a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
        FinskyLog.a("has_fop cache updated to: %b (account=%s)", Boolean.valueOf(z), FinskyLog.a(str));
    }
}
