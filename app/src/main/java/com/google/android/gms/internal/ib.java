package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class ib extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f6048a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hy f6049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ib(hy hyVar, String str, jw jwVar, jv jvVar, Map map) {
        super(str, jwVar, jvVar, (byte) 0);
        this.f6049b = hyVar;
        this.f6048a = map;
    }

    @Override // com.google.android.gms.internal.jn
    public final Map<String, String> a() {
        return this.f6048a == null ? super.a() : this.f6048a;
    }
}
