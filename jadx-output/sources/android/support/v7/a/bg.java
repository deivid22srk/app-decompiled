package android.support.v7.a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.by;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.gd;
import android.support.v7.widget.gf;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class bg extends a {

    /* renamed from: a, reason: collision with root package name */
    android.support.v7.widget.bs f501a;

    /* renamed from: b, reason: collision with root package name */
    boolean f502b;
    Window.Callback c;
    android.support.v7.view.menu.g d;
    private boolean e;
    private boolean f;
    private ArrayList<c> g = new ArrayList<>();
    private final Runnable h = new bh(this);
    private final gd i = new bi(this);

    public bg(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f501a = new gf(toolbar, false);
        this.c = new bm(this, callback);
        this.f501a.a(this.c);
        toolbar.setOnMenuItemClickListener(this.i);
        this.f501a.a(charSequence);
    }

    @Override // android.support.v7.a.a
    public final void a(Drawable drawable) {
        this.f501a.b(drawable);
    }

    @Override // android.support.v7.a.a
    public final Context f() {
        return this.f501a.b();
    }

    @Override // android.support.v7.a.a
    public final void c(Drawable drawable) {
        this.f501a.c(drawable);
    }

    @Override // android.support.v7.a.a
    public final void a(int i) {
        this.f501a.d(i);
    }

    @Override // android.support.v7.a.a
    public final void b(boolean z) {
    }

    @Override // android.support.v7.a.a
    public final void b(int i) {
        this.f501a.e(i);
    }

    @Override // android.support.v7.a.a
    public final void c(boolean z) {
    }

    @Override // android.support.v7.a.a
    public final void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // android.support.v7.a.a
    public final void a(CharSequence charSequence) {
        this.f501a.b(charSequence);
    }

    @Override // android.support.v7.a.a
    public final void c(CharSequence charSequence) {
        this.f501a.a(charSequence);
    }

    @Override // android.support.v7.a.a
    public final boolean i() {
        ViewGroup a2 = this.f501a.a();
        if (a2 == null || a2.hasFocus()) {
            return false;
        }
        a2.requestFocus();
        return true;
    }

    @Override // android.support.v7.a.a
    public final void b(CharSequence charSequence) {
        this.f501a.c(charSequence);
    }

    @Override // android.support.v7.a.a
    public final void a(int i, int i2) {
        this.f501a.c((this.f501a.o() & (i2 ^ (-1))) | (i & i2));
    }

    @Override // android.support.v7.a.a
    public final void a(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.a.a
    public final void b(Drawable drawable) {
        this.f501a.d(drawable);
    }

    @Override // android.support.v7.a.a
    public final int a() {
        return this.f501a.o();
    }

    @Override // android.support.v7.a.a
    public final int b() {
        return this.f501a.q();
    }

    @Override // android.support.v7.a.a
    public final void c() {
        this.f501a.f(0);
    }

    @Override // android.support.v7.a.a
    public final void d() {
        this.f501a.f(8);
    }

    @Override // android.support.v7.a.a
    public final boolean e() {
        return this.f501a.r() == 0;
    }

    @Override // android.support.v7.a.a
    public final boolean g() {
        this.f501a.a().removeCallbacks(this.h);
        by.a(this.f501a.a(), this.h);
        return true;
    }

    @Override // android.support.v7.a.a
    public final boolean h() {
        if (!this.f501a.c()) {
            return false;
        }
        this.f501a.d();
        return true;
    }

    @Override // android.support.v7.a.a
    public final boolean a(int i, KeyEvent keyEvent) {
        Menu k = k();
        if (k != null) {
            k.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            k.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    @Override // android.support.v7.a.a
    final void j() {
        this.f501a.a().removeCallbacks(this.h);
    }

    @Override // android.support.v7.a.a
    public final void a(c cVar) {
        this.g.add(cVar);
    }

    @Override // android.support.v7.a.a
    public final void d(boolean z) {
        if (z != this.f) {
            this.f = z;
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                this.g.get(i).a(z);
            }
        }
    }

    final Menu k() {
        if (!this.e) {
            this.f501a.a(new bj(this, (byte) 0), new bk(this, (byte) 0));
            this.e = true;
        }
        return this.f501a.s();
    }
}
