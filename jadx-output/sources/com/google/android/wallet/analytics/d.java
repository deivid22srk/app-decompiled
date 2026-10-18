package com.google.android.wallet.analytics;

import java.util.List;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final f f7238a;

    /* renamed from: b, reason: collision with root package name */
    private e f7239b;

    public d(int i, e eVar) {
        this.f7238a = new f(i);
        this.f7239b = eVar;
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.f7238a;
    }

    @Override // com.google.android.wallet.analytics.e
    public final e getParentUiNode() {
        return this.f7239b;
    }

    @Override // com.google.android.wallet.analytics.e
    public final void setParentUiNode(e eVar) {
        this.f7239b = eVar;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<e> getChildren() {
        return null;
    }
}
