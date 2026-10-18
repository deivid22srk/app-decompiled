package com.google.android.finsky;

import android.content.Context;
import android.net.NetworkInfo;
import com.google.android.finsky.receivers.ak;

/* loaded from: classes.dex */
final class m implements com.google.android.play.utils.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyApp f3534a;

    m(FinskyApp finskyApp) {
        this.f3534a = finskyApp;
    }

    @Override // com.google.android.play.utils.f
    public final NetworkInfo a(Context context) {
        return ak.a(context);
    }
}
