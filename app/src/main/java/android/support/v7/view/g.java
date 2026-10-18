package android.support.v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v7.view.menu.ab;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

@TargetApi(11)
/* loaded from: classes.dex */
public final class g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f561a;

    /* renamed from: b, reason: collision with root package name */
    final b f562b;

    public g(Context context, b bVar) {
        this.f561a = context;
        this.f562b = bVar;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f562b.f557b;
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f562b.f557b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f562b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f562b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f562b.d();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f562b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return ab.a(this.f561a, (android.support.v4.e.a.a) this.f562b.b());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f562b.f();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f562b.a(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f562b.g();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f562b.b(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f562b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f562b.a(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f562b.a();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f562b.c;
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f562b.a(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f562b.h();
    }
}
