package com.google.android.wallet.ui.common;

/* loaded from: classes.dex */
final class aa extends com.google.android.wallet.ui.common.b.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7473a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(FormEditText formEditText, int i) {
        super(i);
        this.f7473a = formEditText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.b.d
    public final boolean b() {
        return this.f7473a.m;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final /* synthetic */ CharSequence a() {
        return this.f7473a.getIncompleteErrorMessage();
    }
}
