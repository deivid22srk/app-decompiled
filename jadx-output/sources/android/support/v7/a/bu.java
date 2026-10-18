package android.support.v7.a;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class bu extends android.support.v7.view.b implements android.support.v7.view.menu.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bq f521a;
    private final Context d;
    private final android.support.v7.view.menu.i e;
    private android.support.v7.view.c f;
    private WeakReference<View> g;

    public bu(bq bqVar, Context context, android.support.v7.view.c cVar) {
        this.f521a = bqVar;
        this.d = context;
        this.f = cVar;
        android.support.v7.view.menu.i iVar = new android.support.v7.view.menu.i(context);
        iVar.e = 1;
        this.e = iVar;
        this.e.a(this);
    }

    @Override // android.support.v7.view.b
    public final MenuInflater a() {
        return new android.support.v7.view.i(this.d);
    }

    @Override // android.support.v7.view.b
    public final Menu b() {
        return this.e;
    }

    @Override // android.support.v7.view.b
    public final void c() {
        boolean z;
        boolean z2;
        boolean a2;
        ActionBarContextView actionBarContextView;
        android.support.v7.widget.bs bsVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (this.f521a.f516a == this) {
            z = this.f521a.D;
            z2 = this.f521a.E;
            a2 = bq.a(z, z2, false);
            if (!a2) {
                this.f521a.f517b = this;
                this.f521a.c = this.f;
            } else {
                this.f.a(this);
            }
            this.f = null;
            this.f521a.f(false);
            actionBarContextView = this.f521a.s;
            if (actionBarContextView.g == null) {
                actionBarContextView.b();
            }
            bsVar = this.f521a.r;
            bsVar.a().sendAccessibilityEvent(32);
            actionBarOverlayLayout = this.f521a.p;
            actionBarOverlayLayout.setHideOnContentScrollEnabled(this.f521a.d);
            this.f521a.f516a = null;
        }
    }

    @Override // android.support.v7.view.b
    public final void d() {
        if (this.f521a.f516a == this) {
            this.e.d();
            try {
                this.f.b(this, this.e);
            } finally {
                this.e.e();
            }
        }
    }

    public final boolean e() {
        this.e.d();
        try {
            return this.f.a(this, this.e);
        } finally {
            this.e.e();
        }
    }

    @Override // android.support.v7.view.b
    public final void a(View view) {
        ActionBarContextView actionBarContextView;
        actionBarContextView = this.f521a.s;
        actionBarContextView.setCustomView(view);
        this.g = new WeakReference<>(view);
    }

    @Override // android.support.v7.view.b
    public final void a(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        actionBarContextView = this.f521a.s;
        actionBarContextView.setSubtitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void b(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        actionBarContextView = this.f521a.s;
        actionBarContextView.setTitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void a(int i) {
        Context context;
        context = this.f521a.l;
        b(context.getResources().getString(i));
    }

    @Override // android.support.v7.view.b
    public final void b(int i) {
        Context context;
        context = this.f521a.l;
        a(context.getResources().getString(i));
    }

    @Override // android.support.v7.view.b
    public final CharSequence f() {
        ActionBarContextView actionBarContextView;
        actionBarContextView = this.f521a.s;
        return actionBarContextView.getTitle();
    }

    @Override // android.support.v7.view.b
    public final CharSequence g() {
        ActionBarContextView actionBarContextView;
        actionBarContextView = this.f521a.s;
        return actionBarContextView.getSubtitle();
    }

    @Override // android.support.v7.view.b
    public final void a(boolean z) {
        ActionBarContextView actionBarContextView;
        super.a(z);
        actionBarContextView = this.f521a.s;
        actionBarContextView.setTitleOptional(z);
    }

    @Override // android.support.v7.view.b
    public final boolean h() {
        ActionBarContextView actionBarContextView;
        actionBarContextView = this.f521a.s;
        return actionBarContextView.h;
    }

    @Override // android.support.v7.view.b
    public final View i() {
        if (this.g != null) {
            return this.g.get();
        }
        return null;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(android.support.v7.view.menu.i iVar, MenuItem menuItem) {
        if (this.f != null) {
            return this.f.a(this, menuItem);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(android.support.v7.view.menu.i iVar) {
        ActionBarContextView actionBarContextView;
        if (this.f != null) {
            d();
            actionBarContextView = this.f521a.s;
            actionBarContextView.a();
        }
    }
}
