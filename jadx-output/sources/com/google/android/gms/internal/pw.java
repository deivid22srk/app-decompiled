package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class pw implements com.google.android.gms.safetynet.e {

    /* renamed from: a, reason: collision with root package name */
    private final Status f6237a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6238b;

    public pw(Status status, String str) {
        this.f6237a = status;
        this.f6238b = str;
    }

    @Override // com.google.android.gms.safetynet.e
    public final String a() {
        return this.f6238b;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6237a;
    }
}
