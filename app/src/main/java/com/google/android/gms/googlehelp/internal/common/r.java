package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class r implements Callable<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f5845a;

    r(Activity activity) {
        this.f5845a = activity;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bitmap call() {
        return q.b(this.f5845a);
    }
}
