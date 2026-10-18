package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f567a = {MenuItem.class};

    /* renamed from: b, reason: collision with root package name */
    private Object f568b;
    private Method c;

    public j(Object obj, String str) {
        this.f568b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.c = cls.getMethod(str, f567a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.c.invoke(this.f568b, menuItem)).booleanValue();
            }
            this.c.invoke(this.f568b, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
