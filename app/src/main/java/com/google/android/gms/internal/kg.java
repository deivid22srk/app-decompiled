package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class kg extends kf<Status> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ka f6108a;

    /* renamed from: b, reason: collision with root package name */
    private final LogEventParcelable f6109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kg(ka kaVar, LogEventParcelable logEventParcelable, com.google.android.gms.common.api.m mVar) {
        super(mVar);
        this.f6108a = kaVar;
        this.f6109b = logEventParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final Status a(Status status) {
        return status;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kg) {
            return this.f6109b.equals(((kg) obj).f6109b);
        }
        return false;
    }

    public final String toString() {
        return "MethodImpl(" + this.f6109b + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(kj kjVar) {
        kj kjVar2 = kjVar;
        kh khVar = new kh(this);
        try {
            ka.b(this.f6109b);
            kjVar2.o().a(khVar, this.f6109b);
        } catch (Throwable th) {
            Log.e("ClearcutLoggerApiImpl", "MessageNanoProducer " + this.f6109b.f.toString() + " threw: " + th.toString());
        }
    }
}
