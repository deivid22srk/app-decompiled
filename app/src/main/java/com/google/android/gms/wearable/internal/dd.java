package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

/* loaded from: classes.dex */
public final class dd implements com.google.android.gms.wearable.f {
    @Override // com.google.android.gms.wearable.f
    public final com.google.android.gms.common.api.u<com.google.android.gms.wearable.n> a(com.google.android.gms.common.api.m mVar) {
        return mVar.a(new dg(this, mVar));
    }

    @Override // com.google.android.gms.wearable.f
    public final com.google.android.gms.common.api.u<com.google.android.gms.wearable.g> a(com.google.android.gms.common.api.m mVar, Uri uri) {
        return mVar.a(new df(this, mVar, uri));
    }

    @Override // com.google.android.gms.wearable.f
    public final com.google.android.gms.common.api.u<com.google.android.gms.wearable.n> a(com.google.android.gms.common.api.m mVar, Uri uri, int i) {
        com.google.android.gms.common.internal.av.b(uri != null, "uri must not be null");
        com.google.android.gms.common.internal.av.b(i == 0 || i == 1, "invalid filter type");
        return mVar.a(new dh(this, mVar, uri, i));
    }

    @Override // com.google.android.gms.wearable.f
    public final com.google.android.gms.common.api.u<com.google.android.gms.wearable.g> a(com.google.android.gms.common.api.m mVar, PutDataRequest putDataRequest) {
        return mVar.a(new de(this, mVar, putDataRequest));
    }

    @Override // com.google.android.gms.wearable.f
    public final com.google.android.gms.common.api.u<com.google.android.gms.wearable.n> b(com.google.android.gms.common.api.m mVar, Uri uri) {
        return a(mVar, uri, 0);
    }

    @Override // com.google.android.gms.wearable.f
    public final com.google.android.gms.common.api.u<com.google.android.gms.wearable.i> c(com.google.android.gms.common.api.m mVar, Uri uri) {
        com.google.android.gms.common.internal.av.b(uri != null, "uri must not be null");
        com.google.android.gms.common.internal.av.b(true, "invalid filter type");
        return mVar.a(new di(this, mVar, uri));
    }
}
