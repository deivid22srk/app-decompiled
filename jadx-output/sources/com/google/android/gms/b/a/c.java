package com.google.android.gms.b.a;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.i;
import com.google.android.gms.common.internal.at;

/* loaded from: classes.dex */
public final class c extends i implements a {
    public c(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.b.a.a
    public final String a() {
        return c("feature_name");
    }

    @Override // com.google.android.gms.b.a.a
    public final long b() {
        return a("last_connection_timestamp");
    }

    public final String toString() {
        return at.a(this).a("FeatureName", c("feature_name")).a("Timestamp", Long.valueOf(a("last_connection_timestamp"))).toString();
    }
}
