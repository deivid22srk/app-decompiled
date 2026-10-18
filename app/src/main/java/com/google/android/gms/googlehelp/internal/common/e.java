package com.google.android.gms.googlehelp.internal.common;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;

/* loaded from: classes.dex */
final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f5834a;

    e(d dVar) {
        this.f5834a = dVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.a, com.google.android.gms.googlehelp.internal.common.s
    public final void a(GoogleHelp googleHelp) {
        if (googleHelp.x != null) {
            googleHelp.x.d = q.c(this.f5834a.c);
        }
        this.f5834a.f5832a.putExtra("EXTRA_GOOGLE_HELP", googleHelp).putExtra("EXTRA_START_TICK", System.nanoTime());
        this.f5834a.c.startActivityForResult(this.f5834a.f5832a, 123);
        this.f5834a.a((d) Status.f5572a);
    }
}
