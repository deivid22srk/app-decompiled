package com.google.android.finsky.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.finsky.utils.ik;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cu implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final LayoutInflater f3207a;

    /* renamed from: b, reason: collision with root package name */
    final ViewGroup f3208b;
    ArrayList<View> c = new ArrayList<>();
    ArrayList<View> d = new ArrayList<>();
    boolean e;
    private final Context f;
    private final float g;

    public cu(FrameLayout frameLayout, float f) {
        this.f = frameLayout.getContext();
        this.f3208b = frameLayout;
        this.g = f;
        this.f3207a = LayoutInflater.from(this.f);
    }

    public static int a(Context context) {
        if (InsetsFrameLayout.f3009a) {
            return 0;
        }
        return ik.d(context);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.e = false;
        this.f3208b.getViewTreeObserver().removeOnPreDrawListener(this);
        for (int i = 0; i < this.c.size(); i++) {
            View view = this.c.get(i);
            this.f3208b.addView(view);
            android.support.v4.view.by.g(view, this.g);
        }
        this.c.clear();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            this.f3208b.removeView(this.d.get(i2));
        }
        this.d.clear();
        return true;
    }
}
