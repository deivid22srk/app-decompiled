package com.google.android.gms.wearable.internal;

/* loaded from: classes.dex */
public final class b implements com.google.android.gms.wearable.m {

    /* renamed from: a, reason: collision with root package name */
    private final String f6588a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6589b;

    public b(com.google.android.gms.wearable.m mVar) {
        this.f6588a = mVar.b();
        this.f6589b = mVar.c();
    }

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.m a() {
        return this;
    }

    @Override // com.google.android.gms.wearable.m
    public final String b() {
        return this.f6588a;
    }

    @Override // com.google.android.gms.wearable.m
    public final String c() {
        return this.f6589b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f6588a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f6588a);
        }
        sb.append(", key=");
        sb.append(this.f6589b);
        sb.append("]");
        return sb.toString();
    }
}
