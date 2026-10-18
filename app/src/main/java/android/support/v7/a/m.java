package android.support.v7.a;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    final Activity f528a;

    /* synthetic */ m(Activity activity, byte b2) {
        this(activity);
    }

    private m(Activity activity) {
        this.f528a = activity;
    }

    @Override // android.support.v7.a.g
    public final Drawable a() {
        TypedArray obtainStyledAttributes = b().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    @Override // android.support.v7.a.g
    public final Context b() {
        ActionBar actionBar = this.f528a.getActionBar();
        if (actionBar != null) {
            return actionBar.getThemedContext();
        }
        return this.f528a;
    }

    @Override // android.support.v7.a.g
    public final boolean c() {
        ActionBar actionBar = this.f528a.getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    @Override // android.support.v7.a.g
    public final void a(Drawable drawable, int i) {
        ActionBar actionBar = this.f528a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    @Override // android.support.v7.a.g
    public final void a(int i) {
        ActionBar actionBar = this.f528a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }
}
