package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;

/* loaded from: classes.dex */
final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f5832a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap f5833b;
    final /* synthetic */ Activity c;
    final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, com.google.android.gms.common.api.m mVar, Intent intent, Bitmap bitmap, Activity activity) {
        super(mVar);
        this.d = cVar;
        this.f5832a = intent;
        this.f5833b = bitmap;
        this.c = activity;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.n
    protected final void a(v vVar) {
        Status status;
        try {
            vVar.a((GoogleHelp) this.f5832a.getParcelableExtra("EXTRA_GOOGLE_HELP"), this.f5833b, new e(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            status = com.google.android.gms.googlehelp.internal.common.c.f5831a;
            b(status);
        }
    }
}
