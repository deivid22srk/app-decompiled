package com.google.android.finsky.receivers;

import android.net.Uri;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jn;

/* loaded from: classes.dex */
final class ag implements com.google.android.finsky.installer.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4446a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4447b;

    ag(u uVar, String str) {
        this.f4447b = uVar;
        this.f4446a = str;
    }

    @Override // com.google.android.finsky.installer.t
    public final void a() {
        boolean z;
        boolean z2;
        FinskyLog.a("Successful install of %s", this.f4447b.e);
        z = this.f4447b.y;
        if (z) {
            z2 = this.f4447b.z;
            if (!z2 && jn.l.a().booleanValue()) {
                this.f4447b.c();
            }
        }
        a(110, 0, null);
    }

    @Override // com.google.android.finsky.installer.t
    public final void a(int i, String str) {
        boolean z;
        FinskyLog.c("Install failure of %s: %d %s", this.f4447b.e, Integer.valueOf(i), str);
        z = this.f4447b.j;
        if (z) {
            u.b(this.f4447b, this.f4447b.e, i);
        }
        a(111, i, str);
    }

    private void a(int i, int i2, String str) {
        com.google.android.finsky.apkg.n nVar;
        com.google.android.finsky.download.w wVar;
        if (this.f4446a != null) {
            wVar = this.f4447b.t;
            wVar.b(Uri.parse(this.f4446a));
        }
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        String str2 = this.f4447b.e;
        nVar = this.f4447b.k;
        h.a(i, str2, (String) null, i2, str, nVar);
        this.f4447b.b(70, (String) null);
        this.f4447b.b();
    }
}
