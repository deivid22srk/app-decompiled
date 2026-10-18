package com.google.android.gms.wearable;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final o f6636a = new o();

    /* renamed from: b, reason: collision with root package name */
    private final PutDataRequest f6637b;

    public y(PutDataRequest putDataRequest, o oVar) {
        this.f6637b = putDataRequest;
        if (oVar != null) {
            this.f6636a.a(oVar);
        }
    }

    public static y a(String str) {
        return new y(PutDataRequest.a(str), null);
    }

    public final PutDataRequest a() {
        o oVar = this.f6636a;
        com.google.android.gms.internal.g gVar = new com.google.android.gms.internal.g();
        ArrayList arrayList = new ArrayList();
        gVar.f5997a = com.google.android.gms.internal.e.a(oVar, arrayList);
        com.google.android.gms.internal.f fVar = new com.google.android.gms.internal.f(gVar, arrayList);
        this.f6637b.d = com.google.android.gms.internal.af.a(fVar.f5970a);
        int size = fVar.f5971b.size();
        for (int i = 0; i < size; i++) {
            String num = Integer.toString(i);
            Asset asset = fVar.f5971b.get(i);
            if (num == null) {
                throw new IllegalStateException("asset key cannot be null: " + asset);
            }
            if (asset == null) {
                throw new IllegalStateException("asset cannot be null: key=" + num);
            }
            if (Log.isLoggable("DataMap", 3)) {
                Log.d("DataMap", "asPutDataRequest: adding asset: " + num + " " + asset);
            }
            this.f6637b.a(num, asset);
        }
        return this.f6637b;
    }
}
