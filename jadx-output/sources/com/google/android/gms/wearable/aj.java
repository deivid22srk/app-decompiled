package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.LargeAssetQueueStateChangeParcelable;

/* loaded from: classes.dex */
final class aj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LargeAssetQueueStateChangeParcelable f6474a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f6475b;

    aj(af afVar, LargeAssetQueueStateChangeParcelable largeAssetQueueStateChangeParcelable) {
        this.f6475b = afVar;
        this.f6474a = largeAssetQueueStateChangeParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6474a.f6553b.a();
    }
}
