package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Drawable f5325a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f5326b;

    g(f fVar, Drawable drawable) {
        this.f5326b = fVar;
        this.f5325a = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        activity = this.f5326b.f5324a.f5334b;
        activity.getWindow().setBackgroundDrawable(this.f5325a);
    }
}
