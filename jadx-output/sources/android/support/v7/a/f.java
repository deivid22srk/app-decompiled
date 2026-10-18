package android.support.v7.a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public final class f implements android.support.v4.widget.v {

    /* renamed from: a, reason: collision with root package name */
    public final DrawerLayout f522a;

    /* renamed from: b, reason: collision with root package name */
    public j f523b;
    public Drawable c;
    public boolean d;
    public boolean e;
    public final int f;
    public final int g;
    private final g h;
    private boolean i;

    public f(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        this(activity, drawerLayout, i, i2, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends Drawable & j> f(Activity activity, DrawerLayout drawerLayout, int i, int i2, byte b2) {
        this.d = true;
        this.i = false;
        if (activity instanceof h) {
            this.h = ((h) activity).e();
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.h = new m(activity, (byte) 0);
        } else if (Build.VERSION.SDK_INT >= 11) {
            this.h = new l(activity, (byte) 0);
        } else {
            this.h = new k(activity);
        }
        this.f522a = drawerLayout;
        this.f = i;
        this.g = i2;
        this.f523b = new i(activity, this.h.b());
        this.c = b();
    }

    public final void a() {
        if (this.f522a.b()) {
            this.f523b.a(1.0f);
        } else {
            this.f523b.a(0.0f);
        }
        if (this.d) {
            a((Drawable) this.f523b, this.f522a.b() ? this.g : this.f);
        }
    }

    @Override // android.support.v4.widget.v
    public final void a(View view, float f) {
        this.f523b.a(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // android.support.v4.widget.v
    public final void c_(View view) {
        this.f523b.a(1.0f);
        if (this.d) {
            b(this.g);
        }
    }

    @Override // android.support.v4.widget.v
    public final void b_(View view) {
        this.f523b.a(0.0f);
        if (this.d) {
            b(this.f);
        }
    }

    @Override // android.support.v4.widget.v
    public final void d_(int i) {
    }

    public final void a(Drawable drawable, int i) {
        if (!this.i && !this.h.c()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.i = true;
        }
        this.h.a(drawable, i);
    }

    private void b(int i) {
        this.h.a(i);
    }

    public final Drawable b() {
        return this.h.a();
    }
}
