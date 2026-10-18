package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class gw implements com.google.android.finsky.layout.play.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Resources f1786a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1787b;
    final /* synthetic */ int c;
    final /* synthetic */ gv d;

    gw(gv gvVar, Resources resources, int i, int i2) {
        this.d = gvVar;
        this.f1786a = resources;
        this.f1787b = i;
        this.c = i2;
    }

    @Override // com.google.android.finsky.layout.play.z
    public final Pair<Integer, Integer> a(int i) {
        int size;
        FinskyHeaderListLayout finskyHeaderListLayout;
        int i2;
        Context context;
        int dimensionPixelSize = this.f1786a.getDimensionPixelSize(R.dimen.highlight_banner_swatch_solid_height);
        if (this.f1786a.getBoolean(R.bool.use_wide_layout_for_highlights_banner)) {
            size = this.f1786a.getDimensionPixelSize(R.dimen.highlights_banner_wide_layout_height);
        } else {
            size = dimensionPixelSize + ((View.MeasureSpec.getSize(i) * 9) / 16);
        }
        this.d.aB = this.f1787b + size;
        if (InsetsFrameLayout.f3009a) {
            gv gvVar = this.d;
            context = this.d.ap;
            gv.b(gvVar, ik.d(context));
        }
        finskyHeaderListLayout = this.d.aD;
        int i3 = this.c;
        i2 = this.d.aB;
        finskyHeaderListLayout.b(i3, i2);
        return Pair.create(Integer.valueOf(i), Integer.valueOf(View.MeasureSpec.makeMeasureSpec(size, 1073741824)));
    }
}
