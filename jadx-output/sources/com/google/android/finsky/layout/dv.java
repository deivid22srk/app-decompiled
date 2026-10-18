package com.google.android.finsky.layout;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.android.vending.R;
import java.util.List;

/* loaded from: classes.dex */
final class dv implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3242a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f3243b;
    final /* synthetic */ ScreenshotGallery c;

    dv(ScreenshotGallery screenshotGallery, int i, int i2) {
        this.c = screenshotGallery;
        this.f3242a = i;
        this.f3243b = i2;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        com.google.android.finsky.adapters.ag agVar;
        List list;
        bv bvVar;
        Resources resources;
        com.google.android.finsky.adapters.ag agVar2;
        bv bvVar2;
        bv bvVar3;
        agVar = this.c.h;
        if (agVar != null) {
            list = this.c.m;
            list.set(this.f3242a, null);
            Bitmap bitmap = jVar.f6944a;
            if (bitmap != null) {
                bvVar = this.c.g;
                if (!(bvVar.d == 2)) {
                    bvVar2 = this.c.g;
                    bvVar2.b();
                }
                resources = this.c.f;
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), new BitmapDrawable(resources, bitmap)});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(250);
                agVar2 = this.c.h;
                agVar2.a(this.f3242a, transitionDrawable);
                return;
            }
            if (ScreenshotGallery.d(this.c) == this.f3243b) {
                bvVar3 = this.c.g;
                bvVar3.a(this.c.getContext().getString(R.string.screenshots_not_loaded));
            }
        }
    }
}
