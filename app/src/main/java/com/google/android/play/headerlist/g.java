package com.google.android.play.headerlist;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class g {
    public final Context c;

    public abstract void b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract int c();

    public abstract boolean l();

    public abstract int t();

    public g(Context context) {
        this.c = context;
    }

    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    public float d() {
        return 0.7f;
    }

    public boolean e() {
        boolean z;
        z = PlayHeaderListLayout.f6888a;
        return !z;
    }

    public int n() {
        return e() ? 1 : 0;
    }

    public void a(ViewGroup viewGroup) {
    }

    public int a(Context context) {
        int dimensionPixelSize;
        dimensionPixelSize = context.getResources().getDimensionPixelSize(com.google.android.play.i.abc_action_bar_default_height_material);
        return dimensionPixelSize;
    }

    public int m() {
        return com.google.android.play.k.play_header_viewpager;
    }

    public int b() {
        return com.google.android.play.k.play_header_listview;
    }

    public int k() {
        return 0;
    }

    public int r() {
        return 0;
    }

    public int f() {
        return 0;
    }

    public int o() {
        return 0;
    }

    public int j() {
        return 0;
    }

    public PlayHeaderListTabStrip a(Context context, LayoutInflater layoutInflater) {
        return null;
    }

    public boolean g() {
        return false;
    }

    @TargetApi(21)
    public int h() {
        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(new int[]{android.R.attr.statusBarColor});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public int i() {
        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(new int[]{com.google.android.play.f.colorPrimary});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public boolean s() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
