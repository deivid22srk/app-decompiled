package com.google.android.finsky.activities;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class fs extends com.android.ex.photo.cpkg.a implements com.google.android.play.image.k {
    private int f;
    private String g;
    private float h;

    public fs(Context context, String str) {
        super(context, str);
        this.h = 1.0f;
        this.g = str;
        float a2 = com.google.android.play.image.u.a(context);
        if (Build.VERSION.SDK_INT <= 10) {
            this.h = 0.5f;
        }
        this.h = Math.min(this.h, a2);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f = Math.round((max / displayMetrics.densityDpi) * Math.min(displayMetrics.densityDpi, 250) * this.h);
    }

    @Override // com.android.ex.photo.cpkg.a, android.support.v4.b.a
    /* renamed from: f */
    public final com.android.ex.photo.cpkg.c d() {
        com.google.android.play.image.j a2;
        com.android.ex.photo.cpkg.c cVar = new com.android.ex.photo.cpkg.c();
        com.google.android.play.image.e eVar = FinskyApp.a().d;
        if (this.n == 2) {
            a2 = eVar.a(this.g, this.f, this.f, true, (com.google.android.play.image.k) this, true);
        } else {
            a2 = eVar.a(this.g, this.f, this.f, false, (com.google.android.play.image.k) this, true);
        }
        cVar.f1146b = a2.f6944a;
        if (cVar.f1146b != null && cVar.f1146b.isRecycled()) {
            cVar.f1146b = null;
            FinskyLog.e("Using recycled bitmap for Id:%d", Integer.valueOf(this.n));
        }
        cVar.c = 0;
        return cVar;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        com.android.ex.photo.cpkg.c cVar = new com.android.ex.photo.cpkg.c();
        if (jVar != null) {
            cVar.f1146b = jVar.f6944a;
            cVar.c = 0;
            if (cVar.f1146b != null && cVar.f1146b.isRecycled()) {
                cVar.f1146b = null;
                FinskyLog.d("Using recycled bitmap for Id:%d", Integer.valueOf(this.n));
                return;
            }
        } else {
            cVar.c = 1;
        }
        b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.ex.photo.cpkg.a
    public final void a(Bitmap bitmap) {
        if (bitmap != null && this.n != 2 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
