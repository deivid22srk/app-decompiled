package android.support.v7.view;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f extends b implements android.support.v7.view.menu.j {

    /* renamed from: a, reason: collision with root package name */
    private Context f560a;
    private ActionBarContextView d;
    private c e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private android.support.v7.view.menu.i i;

    public f(Context context, ActionBarContextView actionBarContextView, c cVar, boolean z) {
        this.f560a = context;
        this.d = actionBarContextView;
        this.e = cVar;
        android.support.v7.view.menu.i iVar = new android.support.v7.view.menu.i(actionBarContextView.getContext());
        iVar.e = 1;
        this.i = iVar;
        this.i.a(this);
        this.h = z;
    }

    @Override // android.support.v7.view.b
    public final void b(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void a(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void a(int i) {
        b(this.f560a.getString(i));
    }

    @Override // android.support.v7.view.b
    public final void b(int i) {
        a(this.f560a.getString(i));
    }

    @Override // android.support.v7.view.b
    public final void a(boolean z) {
        super.a(z);
        this.d.setTitleOptional(z);
    }

    @Override // android.support.v7.view.b
    public final boolean h() {
        return this.d.h;
    }

    @Override // android.support.v7.view.b
    public final void a(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // android.support.v7.view.b
    public final void d() {
        this.e.b(this, this.i);
    }

    @Override // android.support.v7.view.b
    public final void c() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    @Override // android.support.v7.view.b
    public final Menu b() {
        return this.i;
    }

    @Override // android.support.v7.view.b
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // android.support.v7.view.b
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // android.support.v7.view.b
    public final View i() {
        if (this.f != null) {
            return this.f.get();
        }
        return null;
    }

    @Override // android.support.v7.view.b
    public final MenuInflater a() {
        return new MenuInflater(this.d.getContext());
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(android.support.v7.view.menu.i iVar, MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    @Override // android.support.v7.view.menu.j
    public final void a(android.support.v7.view.menu.i iVar) {
        d();
        this.d.a();
    }
}
