package com.google.android.wallet.ui.card;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class c implements com.google.android.wallet.analytics.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.wallet.analytics.f f7419a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f7420b;
    private final List<com.google.android.wallet.analytics.e> c = new ArrayList();

    c(a aVar, com.google.android.wallet.analytics.f fVar) {
        this.f7420b = aVar;
        this.f7419a = fVar;
    }

    @Override // com.google.android.wallet.analytics.e
    public final com.google.android.wallet.analytics.e getParentUiNode() {
        return this.f7420b;
    }

    @Override // com.google.android.wallet.analytics.e
    public final void setParentUiNode(com.google.android.wallet.analytics.e eVar) {
        throw new UnsupportedOperationException("Custom parents not supported for CardForm subforms.");
    }

    @Override // com.google.android.wallet.analytics.e
    public final com.google.android.wallet.analytics.f getUiElement() {
        return this.f7419a;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<com.google.android.wallet.analytics.e> getChildren() {
        return this.c;
    }
}
