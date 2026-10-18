package com.google.android.finsky.services;

import android.content.Context;
import com.google.android.finsky.widget.consumption.ConsumptionAppDocList;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConsumptionAppDocList f4618b;
    final /* synthetic */ boolean c;
    final /* synthetic */ a d;

    c(a aVar, Context context, ConsumptionAppDocList consumptionAppDocList, boolean z) {
        this.d = aVar;
        this.f4617a = context;
        this.f4618b = consumptionAppDocList;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.f4617a, this.f4618b, this.c);
    }
}
