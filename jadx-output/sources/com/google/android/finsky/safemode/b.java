package com.google.android.finsky.safemode;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.on;
import com.google.android.finsky.utils.cf;
import com.google.android.finsky.utils.hn;

/* loaded from: classes.dex */
final class b implements cf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4513a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SafeModeService f4514b;

    b(SafeModeService safeModeService, String str) {
        this.f4514b = safeModeService;
        this.f4513a = str;
    }

    @Override // com.google.android.finsky.utils.cf
    public final void a(on onVar) {
        if (!FinskyApp.a().m.a(hn.a(onVar), this.f4513a)) {
            SafeModeService.a(this.f4514b);
        }
    }

    @Override // com.google.android.finsky.utils.cf
    public final void a(VolleyError volleyError) {
        SafeModeService.a(this.f4514b);
    }
}
