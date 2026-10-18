package com.google.android.gms.common.api;

import com.google.android.gms.common.api.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class u<R extends x> {
    public abstract R a();

    public abstract R a(long j, TimeUnit timeUnit);

    public void a(v vVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(y<? super R> yVar);

    public Integer b() {
        throw new UnsupportedOperationException();
    }
}
