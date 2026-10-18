package com.google.android.gms.wearable.internal;

import com.google.android.gms.internal.ks;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class bz extends bu<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    private final List<FutureTask<Boolean>> f6598a;

    bz(ks<com.google.android.gms.wearable.g> ksVar, List<FutureTask<Boolean>> list) {
        super(ksVar);
        this.f6598a = list;
    }

    @Override // com.google.android.gms.wearable.internal.a, com.google.android.gms.wearable.internal.ag
    public final void a(PutDataResponse putDataResponse) {
        a((bz) new dj(bo.a(putDataResponse.f6569b), putDataResponse.c));
        if (putDataResponse.f6569b != 0) {
            Iterator<FutureTask<Boolean>> it = this.f6598a.iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
        }
    }
}
