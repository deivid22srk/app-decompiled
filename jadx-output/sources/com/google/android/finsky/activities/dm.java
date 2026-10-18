package com.google.android.finsky.activities;

import android.content.res.Resources;
import com.android.vending.R;

/* loaded from: classes.dex */
final class dm implements com.google.android.finsky.layout.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dl f1687a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1688b;

    public dm(dl dlVar, Resources resources) {
        this.f1687a = dlVar;
        this.f1688b = resources.getDimensionPixelSize(R.dimen.highlight_banner_swatch_solid_height);
    }

    @Override // com.google.android.finsky.layout.t
    public final float a(com.google.android.finsky.layout.s sVar) {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i, float f) {
        return 0;
    }

    @Override // com.google.android.finsky.layout.t
    public final float a() {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return 0;
    }

    @Override // com.google.android.finsky.layout.t
    public final int b() {
        return 1;
    }

    @Override // com.google.android.finsky.layout.t
    public final float c() {
        return 0.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i) {
        return com.google.android.finsky.utils.cq.a(i - this.f1688b);
    }

    @Override // com.google.android.finsky.layout.t
    public final int b(float f, float f2, int i) {
        return 0;
    }
}
