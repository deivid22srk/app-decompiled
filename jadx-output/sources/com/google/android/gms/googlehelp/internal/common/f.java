package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class f extends o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f5835a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f5836b;
    final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(c cVar, com.google.android.gms.common.api.m mVar, Bitmap bitmap, Activity activity) {
        super(mVar);
        this.c = cVar;
        this.f5835a = bitmap;
        this.f5836b = activity;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.n
    protected final void a(v vVar) {
        Status status;
        try {
            vVar.a(this.f5835a, new g(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Toggling to help failed!", e);
            status = c.f5831a;
            b(status);
        }
    }
}
