package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public interface lz {
    <A extends com.google.android.gms.common.api.g, R extends com.google.android.gms.common.api.x, T extends kr<R, A>> T a(T t);

    void a();

    void a(int i);

    void a(Bundle bundle);

    void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i);

    <A extends com.google.android.gms.common.api.g, T extends kr<? extends com.google.android.gms.common.api.x, A>> T b(T t);

    void b();

    void c();
}
