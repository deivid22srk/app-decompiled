package com.google.android.finsky.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.layout.ScreenshotView;
import java.util.List;

/* loaded from: classes.dex */
final class fq extends android.support.v4.view.bn {

    /* renamed from: b, reason: collision with root package name */
    private final List<com.google.android.finsky.protos.ds> f1750b;
    private final com.google.android.play.image.e c;
    private final LayoutInflater d;

    public fq(List<com.google.android.finsky.protos.ds> list, Context context, com.google.android.play.image.e eVar) {
        this.f1750b = list;
        this.d = LayoutInflater.from(context);
        this.c = eVar;
    }

    @Override // android.support.v4.view.bn
    public final int a() {
        return this.f1750b.size();
    }

    @Override // android.support.v4.view.bn
    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    @Override // android.support.v4.view.bn
    public final Object a(ViewGroup viewGroup, int i) {
        ScreenshotView screenshotView = (ScreenshotView) this.d.inflate(R.layout.screenshot, viewGroup, false);
        screenshotView.a(this.f1750b.get(i), this.c);
        viewGroup.addView(screenshotView);
        return screenshotView;
    }

    @Override // android.support.v4.view.bn
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((ScreenshotView) obj);
    }
}
