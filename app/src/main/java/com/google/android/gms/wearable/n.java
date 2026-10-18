package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class n extends com.google.android.gms.common.data.j<l> implements com.google.android.gms.common.api.x {

    /* renamed from: b, reason: collision with root package name */
    public final Status f6632b;

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6632b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.j
    public final String d() {
        return "path";
    }

    public n(DataHolder dataHolder) {
        super(dataHolder);
        this.f6632b = new Status(dataHolder.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.j
    public final /* synthetic */ l a(int i, int i2) {
        return new com.google.android.gms.wearable.internal.g(this.f5619a, i, i2);
    }
}
