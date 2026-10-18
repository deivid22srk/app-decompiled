package com.google.android.gms.internal;

import android.app.Activity;
import android.view.ViewTreeObserver;

@gw
/* loaded from: classes.dex */
public final class ih {

    /* renamed from: a, reason: collision with root package name */
    Activity f6055a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6056b;
    boolean c;
    private boolean d;
    private ViewTreeObserver.OnGlobalLayoutListener e;
    private ViewTreeObserver.OnScrollChangedListener f = null;

    public ih(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f6055a = activity;
        this.e = onGlobalLayoutListener;
    }

    final void a() {
        if (this.f6055a == null || this.d) {
            return;
        }
        if (this.e != null) {
            com.google.android.gms.ads.internal.d.c();
            hk.a(this.f6055a, this.e);
        }
        if (this.f != null) {
            com.google.android.gms.ads.internal.d.c();
            hk.a(this.f6055a, this.f);
        }
        this.d = true;
    }

    final void b() {
        if (this.f6055a != null && this.d) {
            if (this.e != null) {
                com.google.android.gms.ads.internal.d.e().a(this.f6055a, this.e);
            }
            if (this.f != null) {
                com.google.android.gms.ads.internal.d.c();
                hk.b(this.f6055a, this.f);
            }
            this.d = false;
        }
    }
}
