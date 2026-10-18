package com.google.android.play.headerlist;

/* loaded from: classes.dex */
final class i extends h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PlayHeaderListLayout playHeaderListLayout, float f, float f2) {
        super(playHeaderListLayout, f, f2);
        this.f6905a = playHeaderListLayout;
    }

    @Override // com.google.android.play.headerlist.h
    protected final void a(float f) {
        this.f6905a.setFloatingFraction(f);
    }
}
