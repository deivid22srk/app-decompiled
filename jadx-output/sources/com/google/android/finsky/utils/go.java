package com.google.android.finsky.utils;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
final class go implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gp f4911a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f4912b;

    go(gp gpVar, Context context) {
        this.f4911a = gpVar;
        this.f4912b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4912b.getPackageManager().setApplicationEnabledSetting(this.f4911a.h.f1963a.f3890a, 1, 0);
    }
}
