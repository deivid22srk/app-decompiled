package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class g extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f5837a;

    g(f fVar) {
        this.f5837a = fVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.a, com.google.android.gms.googlehelp.internal.common.s
    public final void a(TogglingData togglingData) {
        if (!TextUtils.isEmpty(togglingData.c)) {
            togglingData.d = q.c(this.f5837a.f5836b);
        }
        this.f5837a.f5836b.startActivityForResult(new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_TOGGLING_DATA", togglingData).putExtra("EXTRA_START_TICK", System.nanoTime()), 123);
        this.f5837a.a((f) Status.f5572a);
    }
}
