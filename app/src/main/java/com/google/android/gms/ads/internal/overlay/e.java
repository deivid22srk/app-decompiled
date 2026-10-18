package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.im;

@gw
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f5322a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f5323b;
    public final ViewGroup c;
    public final Context d;

    public e(im imVar) {
        this.f5323b = imVar.getLayoutParams();
        ViewParent parent = imVar.getParent();
        this.d = imVar.d();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzd.zza("Could not get the parent of the WebView for an overlay.");
        }
        this.c = (ViewGroup) parent;
        this.f5322a = this.c.indexOfChild(imVar.getView());
        this.c.removeView(imVar.getView());
        imVar.a(true);
    }
}
