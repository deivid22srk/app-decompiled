package com.google.android.play.headerlist;

/* loaded from: classes.dex */
final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PlayHeaderListLayout playHeaderListLayout, float f, float f2) {
        super(playHeaderListLayout, f, f2);
        this.f6902a = playHeaderListLayout;
    }

    @Override // com.google.android.play.headerlist.h
    protected final void a(float f) {
        this.f6902a.setActionBarTitleAlpha(f);
    }
}
