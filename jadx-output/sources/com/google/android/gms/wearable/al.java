package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* loaded from: classes.dex */
final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MessageEventParcelable f6478a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f6479b;

    al(af afVar, MessageEventParcelable messageEventParcelable) {
        this.f6479b = afVar;
        this.f6478a = messageEventParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6479b.f6466a.a(this.f6478a);
    }
}
