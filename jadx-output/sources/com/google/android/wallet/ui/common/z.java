package com.google.android.wallet.ui.common;

/* loaded from: classes2.dex */
final class z extends com.google.android.wallet.ui.common.b.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(FormEditText formEditText, int i) {
        super(i);
        this.f7533a = formEditText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.b.d
    public final boolean b() {
        return this.f7533a.m;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final /* synthetic */ CharSequence a() {
        return this.f7533a.getIncompleteErrorMessage();
    }
}
