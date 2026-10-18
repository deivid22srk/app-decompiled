package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
abstract class m extends l<T>.o<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final int f5718a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f5719b;
    final /* synthetic */ l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected m(l lVar, int i, Bundle bundle) {
        super(lVar, true);
        this.c = lVar;
        this.f5718a = i;
        this.f5719b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean a();

}
