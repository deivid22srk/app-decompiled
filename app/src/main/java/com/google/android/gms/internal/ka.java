package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ka implements com.google.android.gms.clearcut.f {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6104a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ki f6105b = new ki((byte) 0);
    private static final long c = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    public final com.google.android.gms.common.cpkg.a d;
    private final kd e;
    public final Object f;
    public long g;
    private final long h;
    private ScheduledFuture<?> i;
    public com.google.android.gms.common.api.m j;
    private final Runnable k;

    public ka() {
        this(new com.google.android.gms.common.cpkg.f(), c, new ke());
    }

    private ka(com.google.android.gms.common.cpkg.a aVar, long j, kd kdVar) {
        this.f = new Object();
        this.g = 0L;
        this.i = null;
        this.j = null;
        this.k = new kb(this);
        this.d = aVar;
        this.h = j;
        this.e = kdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.f != null && logEventParcelable.e.j.length == 0) {
            logEventParcelable.e.j = logEventParcelable.f.a();
        }
        if (logEventParcelable.g != null && logEventParcelable.e.s.length == 0) {
            logEventParcelable.e.s = logEventParcelable.g.a();
        }
        logEventParcelable.c = af.a(logEventParcelable.e);
    }

    static /* synthetic */ com.google.android.gms.common.api.m e(ka kaVar) {
        kaVar.j = null;
        return null;
    }

    @Override // com.google.android.gms.clearcut.f
    public final boolean a(TimeUnit timeUnit) {
        try {
            return f6105b.a(timeUnit);
        } catch (InterruptedException e) {
            Log.e("ClearcutLoggerApiImpl", "flush interrupted");
            Thread.currentThread().interrupt();
            return false;
        }
    }

    @Override // com.google.android.gms.clearcut.f
    public final com.google.android.gms.common.api.u<Status> a(com.google.android.gms.common.api.m mVar, LogEventParcelable logEventParcelable) {
        b(logEventParcelable);
        f6105b.a();
        kg kgVar = new kg(this, logEventParcelable, mVar);
        kgVar.a((com.google.android.gms.common.api.v) new kc(this));
        return mVar.a((com.google.android.gms.common.api.m) kgVar);
    }
}
