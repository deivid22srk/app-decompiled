package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;

@gw
/* loaded from: classes.dex */
final class f extends hb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzd f5324a;

    private f(zzd zzdVar) {
        this.f5324a = zzdVar;
    }

    /* synthetic */ f(zzd zzdVar, byte b2) {
        this(zzdVar);
    }

    @Override // com.google.android.gms.internal.hb
    public final void a() {
        Activity activity;
        Activity activity2;
        com.google.android.gms.ads.internal.d.c();
        activity = this.f5324a.f5334b;
        Bitmap b2 = hk.b(activity, this.f5324a.c.q.d);
        if (b2 != null) {
            hm e = com.google.android.gms.ads.internal.d.e();
            activity2 = this.f5324a.f5334b;
            hk.f6031a.post(new g(this, e.a(activity2, b2, this.f5324a.c.q.e, this.f5324a.c.q.f)));
        }
    }
}
