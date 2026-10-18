package com.google.android.finsky.adapters;

import android.content.res.Resources;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class v implements com.google.android.finsky.layout.t {

    /* renamed from: a, reason: collision with root package name */
    final int f1941a;

    /* renamed from: b, reason: collision with root package name */
    final int f1942b;
    final int c;
    final int d;
    final int e;
    final /* synthetic */ s f;

    public v(s sVar) {
        this.f = sVar;
        Resources resources = sVar.h.getResources();
        this.f1942b = resources.getDimensionPixelSize(R.dimen.large_quicklinks_image_size);
        this.c = resources.getDimensionPixelSize(R.dimen.large_quicklinks_circle_content_min_height);
        this.d = resources.getDimensionPixelSize(R.dimen.quicklinks_image_vmargin);
        this.e = resources.getDimensionPixelSize(R.dimen.quicklinks_banner_vpadding);
        this.f1941a = resources.getDimensionPixelSize(R.dimen.large_quicklinks_banner_item_min_width);
    }

    @Override // com.google.android.finsky.layout.t
    public final float a(com.google.android.finsky.layout.s sVar) {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i, float f) {
        return this.f1942b + this.c + (this.d * 2) + this.e;
    }

    @Override // com.google.android.finsky.layout.t
    public final float a() {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(float f, float f2, int i) {
        return this.f1942b + this.c + (this.d * 2);
    }

    @Override // com.google.android.finsky.layout.t
    public final int b() {
        return 2;
    }

    @Override // com.google.android.finsky.layout.t
    public final float c() {
        return 0.25f;
    }

    @Override // com.google.android.finsky.layout.t
    public final int a(int i) {
        return this.f1941a;
    }

    @Override // com.google.android.finsky.layout.t
    public final int b(float f, float f2, int i) {
        return 0;
    }
}
