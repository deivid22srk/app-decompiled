package com.google.android.finsky.adapters;

import android.graphics.Bitmap;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
final class ae implements com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1887a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f1888b;

    ae(ad adVar, int i) {
        this.f1888b = adVar;
        this.f1887a = i;
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
        ad adVar = this.f1888b;
        int i = this.f1887a;
        if (adVar.f1885a == null) {
            return;
        }
        adVar.f1885a.c(i);
    }
}
