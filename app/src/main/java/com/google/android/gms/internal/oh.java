package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
abstract class oh<T> implements com.google.android.gms.common.api.x {

    /* renamed from: a, reason: collision with root package name */
    protected final T f6203a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f6204b;

    public oh(Status status, T t) {
        this.f6204b = status;
        this.f6203a = t;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6204b;
    }
}
