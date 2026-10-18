package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ce extends cc {

    /* renamed from: b, reason: collision with root package name */
    static Field f363b;
    static boolean c = false;

    ce() {
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, a aVar) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) (aVar == null ? null : aVar.f315a));
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean b(View view) {
        if (c) {
            return false;
        }
        if (f363b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f363b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                c = true;
                return false;
            }
        }
        try {
            return f363b.get(view) != null;
        } catch (Throwable th2) {
            c = true;
            return false;
        }
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final dy v(View view) {
        if (this.f360a == null) {
            this.f360a = new WeakHashMap<>();
        }
        dy dyVar = this.f360a.get(view);
        if (dyVar == null) {
            dy dyVar2 = new dy(view);
            this.f360a.put(view, dyVar2);
            return dyVar2;
        }
        return dyVar;
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean b(View view, int i) {
        return view.canScrollVertically(i);
    }
}
