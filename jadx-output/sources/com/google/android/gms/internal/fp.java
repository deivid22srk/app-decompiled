package com.google.android.gms.internal;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

@gw
/* loaded from: classes.dex */
public final class fp extends fy {

    /* renamed from: a, reason: collision with root package name */
    static final Set<String> f5980a = Collections.unmodifiableSet(new com.google.android.gms.common.c.c(Arrays.asList("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center")));

    /* renamed from: b, reason: collision with root package name */
    String f5981b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    final Object j;
    final im k;
    final Activity l;
    AdSizeParcel m;
    ImageView n;
    LinearLayout o;
    PopupWindow p;
    RelativeLayout q;
    ViewGroup r;
    private fz t;

    public fp(im imVar) {
        super(imVar, "resize");
        this.f5981b = "top-right";
        this.c = true;
        this.d = 0;
        this.e = 0;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.j = new Object();
        this.k = imVar;
        this.l = imVar.c();
        this.t = null;
    }

    public final void a(boolean z) {
        synchronized (this.j) {
            if (this.p != null) {
                this.p.dismiss();
                this.q.removeView(this.k.getView());
                if (this.r != null) {
                    this.r.removeView(this.n);
                    this.r.addView(this.k.getView());
                    this.k.a(this.m);
                }
                if (z) {
                    b("default");
                }
                this.p = null;
                this.q = null;
                this.r = null;
                this.o = null;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.j) {
            z = this.p != null;
        }
        return z;
    }
}
