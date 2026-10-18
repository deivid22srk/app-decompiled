package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class bl implements com.google.android.finsky.utils.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f1619a;

    bl(bi biVar) {
        this.f1619a = biVar;
    }

    @Override // com.google.android.finsky.utils.m
    public final void a() {
        this.f1619a.h = true;
        this.f1619a.e();
    }

    @Override // com.google.android.finsky.utils.m
    public final void a(boolean z) {
        this.f1619a.h = false;
        this.f1619a.e();
    }
}
