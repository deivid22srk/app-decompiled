package com.google.android.gms.ads.bpkg;

import android.os.Bundle;
import com.google.android.gms.internal.bp;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class f extends bp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5265a;

    public f(e eVar) {
        this.f5265a = eVar;
    }

    /* synthetic */ f(e eVar, byte b2) {
        this(eVar);
    }

    @Override // com.google.android.gms.internal.bo
    public final void a(Bundle bundle) {
        Object obj;
        boolean z;
        ExecutorService executorService;
        obj = this.f5265a.d;
        synchronized (obj) {
            z = this.f5265a.e;
            if (z) {
                return;
            }
            e.c(this.f5265a);
            executorService = this.f5265a.f5264b;
            executorService.execute(new g(this, bundle));
        }
    }
}
