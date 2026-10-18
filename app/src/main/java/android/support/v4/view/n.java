package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public o f397a;

    /* renamed from: b, reason: collision with root package name */
    public p f398b;
    private final Context c;

    public abstract View a();

    public n(Context context) {
        this.c = context;
    }

    public View a(MenuItem menuItem) {
        return a();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void a(SubMenu subMenu) {
    }

    public final void a(boolean z) {
        if (this.f397a != null) {
            this.f397a.a(z);
        }
    }

    public void a(p pVar) {
        if (this.f398b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f398b = pVar;
    }
}
