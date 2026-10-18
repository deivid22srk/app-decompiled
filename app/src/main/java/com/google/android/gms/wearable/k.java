package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.dm;

/* loaded from: classes.dex */
public final class k extends com.google.android.gms.common.data.j<j> implements com.google.android.gms.common.api.x {

    /* renamed from: b, reason: collision with root package name */
    private final Status f6631b;

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6631b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.j
    public final String d() {
        return "path";
    }

    public k(DataHolder dataHolder) {
        super(dataHolder);
        this.f6631b = new Status(dataHolder.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.j
    public final /* synthetic */ j a(int i, int i2) {
        return new dm(this.f5619a, i, i2);
    }
}
