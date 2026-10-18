package com.google.android.wallet.ui.b;

import com.google.android.wallet.analytics.e;
import com.google.android.wallet.analytics.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f7404a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7405b;
    final /* synthetic */ a c;

    b(a aVar, f fVar, int i) {
        this.c = aVar;
        this.f7404a = fVar;
        this.f7405b = i;
    }

    @Override // com.google.android.wallet.analytics.e
    public final e getParentUiNode() {
        return this.c;
    }

    @Override // com.google.android.wallet.analytics.e
    public final void setParentUiNode(e eVar) {
        throw new UnsupportedOperationException("Custom parents not supported for SimpleForm subforms.");
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.f7404a;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<e> getChildren() {
        ArrayList arrayList;
        arrayList = this.c.am;
        return (List) arrayList.get(this.f7405b);
    }
}
