package com.google.android.finsky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ib;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ReviewsService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f4556a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final com.android.vending.d.b f4557b = new aw(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4557b;
    }

    static /* synthetic */ void a(String str, com.google.android.finsky.a.i iVar, String str2, ExecutionException executionException, String str3, String str4) {
        Throwable cause = executionException.getCause();
        String simpleName = cause == null ? null : cause.getClass().getSimpleName();
        FinskyLog.a(str3, simpleName);
        ib.a(iVar, 514, str, str4, str2, simpleName);
    }
}
