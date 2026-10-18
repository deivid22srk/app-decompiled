package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class gb implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.a.ai f4891a;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.finsky.layout.play.cy f4892b;

    public gb(int i, com.google.android.finsky.layout.play.cy cyVar) {
        a(i, cyVar);
    }

    public final void a(int i, com.google.android.finsky.layout.play.cy cyVar) {
        this.f4891a = com.google.android.finsky.a.i.a(fe.a(i));
        this.f4892b = cyVar;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f4891a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.layout.play.cy getParentNode() {
        return this.f4892b;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
