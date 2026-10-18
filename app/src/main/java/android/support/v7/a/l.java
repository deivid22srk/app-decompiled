package android.support.v7.a;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    final Activity f526a;

    /* renamed from: b, reason: collision with root package name */
    o f527b;

    /* synthetic */ l(Activity activity, byte b2) {
        this(activity);
    }

    private l(Activity activity) {
        this.f526a = activity;
    }

    @Override // android.support.v7.a.g
    public final Drawable a() {
        return n.a(this.f526a);
    }

    @Override // android.support.v7.a.g
    public final Context b() {
        ActionBar actionBar = this.f526a.getActionBar();
        if (actionBar != null) {
            return actionBar.getThemedContext();
        }
        return this.f526a;
    }

    @Override // android.support.v7.a.g
    public final boolean c() {
        ActionBar actionBar = this.f526a.getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    @Override // android.support.v7.a.g
    public final void a(Drawable drawable, int i) {
        this.f526a.getActionBar().setDisplayShowHomeEnabled(true);
        this.f527b = n.a(this.f526a, drawable, i);
        this.f526a.getActionBar().setDisplayShowHomeEnabled(false);
    }

    @Override // android.support.v7.a.g
    public final void a(int i) {
        this.f527b = n.a(this.f527b, this.f526a, i);
    }
}
