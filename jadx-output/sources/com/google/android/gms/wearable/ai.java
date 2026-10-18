package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

/* loaded from: classes.dex */
final class ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ChannelEventParcelable f6472a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f6473b;

    ai(af afVar, ChannelEventParcelable channelEventParcelable) {
        this.f6473b = afVar;
        this.f6472a = channelEventParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6472a.a();
    }
}
