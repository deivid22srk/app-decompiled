package com.google.android.finsky.layout.play;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.play.search.PlaySearchToolbar;

/* loaded from: classes.dex */
public abstract class x extends com.google.android.play.headerlist.g {

    /* renamed from: b, reason: collision with root package name */
    protected View f3518b;

    public abstract int a();

    public x(Context context) {
        super(context);
    }

    @Override // com.google.android.play.headerlist.g
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.g
    public final void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f3518b = layoutInflater.inflate(a(), viewGroup, false);
        viewGroup.addView(this.f3518b);
    }

    @Override // com.google.android.play.headerlist.g
    public void a(ViewGroup viewGroup) {
    }

    @Override // com.google.android.play.headerlist.g
    public int c() {
        return FinskySearchToolbar.a(this.c);
    }

    @Override // com.google.android.play.headerlist.g
    public boolean l() {
        return false;
    }

    @Override // com.google.android.play.headerlist.g
    public int t() {
        return 2;
    }

    @Override // com.google.android.play.headerlist.g
    public int o() {
        return 0;
    }

    @Override // com.google.android.play.headerlist.g
    public int r() {
        return 0;
    }

    @Override // com.google.android.play.headerlist.g
    public boolean e() {
        return true;
    }

    @Override // com.google.android.play.headerlist.g
    public int f() {
        return 1;
    }

    @Override // com.google.android.play.headerlist.g
    public int a(Context context) {
        return PlaySearchToolbar.a(context);
    }

    public int p() {
        return 0;
    }

    public com.google.android.finsky.layout.ad q() {
        return null;
    }
}
