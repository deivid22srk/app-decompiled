package com.google.android.finsky.installer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2876a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2877b;
    final /* synthetic */ t c;
    final /* synthetic */ v d;

    x(v vVar, String str, int i, t tVar) {
        this.d = vVar;
        this.f2876a = str;
        this.f2877b = i;
        this.c = tVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        this.d.f2872a.unregisterReceiver(this);
        v vVar = this.d;
        String str = this.f2876a;
        int i2 = this.f2877b;
        t tVar = this.c;
        String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", Integer.MIN_VALUE);
        if (intExtra == 0) {
            FinskyApp.a().v.e(str);
            vVar.a(i2, str);
            tVar.a();
        } else {
            if (intExtra == -1) {
                vVar.a(i2, str);
                tVar.a(976, null);
                return;
            }
            vVar.a(i2, str);
            if (intExtra == Integer.MIN_VALUE) {
                i = 977;
            } else {
                i = (-500) - intExtra;
            }
            FinskyLog.d("Error %d while installing %s: %s", Integer.valueOf(i), str, stringExtra);
            tVar.a(i, null);
        }
    }
}
