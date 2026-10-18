package com.google.android.finsky.api;

import android.content.Context;
import android.net.NetworkInfo;
import com.google.android.finsky.receivers.ak;

/* loaded from: classes.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    private Context f2008a;

    public v(Context context) {
        this.f2008a = context;
    }

    @Override // com.google.android.finsky.api.w
    public final NetworkInfo a() {
        return ak.a(this.f2008a);
    }
}
