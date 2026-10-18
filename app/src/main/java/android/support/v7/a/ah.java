package android.support.v7.a;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;

/* loaded from: classes.dex */
abstract class ah extends ag {

    /* renamed from: b, reason: collision with root package name */
    final Context f476b;
    final Window c;
    final Window.Callback d;
    final Window.Callback e;
    final af f;
    a g;
    MenuInflater h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    CharSequence n;
    boolean o;

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    abstract void b(CharSequence charSequence);

    abstract void c(int i);

    abstract boolean d(int i);

    abstract void k();

    ah(Context context, Window window, af afVar) {
        this.f476b = context;
        this.c = window;
        this.f = afVar;
        this.d = this.c.getCallback();
        if (this.d instanceof aj) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.e = a(this.d);
        this.c.setCallback(this.e);
    }

    Window.Callback a(Window.Callback callback) {
        return new aj(this, callback);
    }

    @Override // android.support.v7.a.ag
    public final a a() {
        k();
        return this.g;
    }

    @Override // android.support.v7.a.ag
    public final MenuInflater b() {
        if (this.h == null) {
            k();
            this.h = new android.support.v7.view.i(this.g != null ? this.g.f() : this.f476b);
        }
        return this.h;
    }

    @Override // android.support.v7.a.ag
    public final g h() {
        return new ai(this, (byte) 0);
    }

    final Context l() {
        Context context = null;
        a a2 = a();
        if (a2 != null) {
            context = a2.f();
        }
        if (context == null) {
            return this.f476b;
        }
        return context;
    }

    @Override // android.support.v7.a.ag
    public void g() {
        this.o = true;
    }

    @Override // android.support.v7.a.ag
    public boolean j() {
        return false;
    }

    @Override // android.support.v7.a.ag
    public final void a(CharSequence charSequence) {
        this.n = charSequence;
        b(charSequence);
    }

    @Override // android.support.v7.a.ag
    public void b(Bundle bundle) {
    }
}
