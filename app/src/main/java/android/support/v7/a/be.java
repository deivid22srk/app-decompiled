package android.support.v7.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes.dex */
final class be {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f497a = {Context.class, AttributeSet.class};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f498b = {android.R.attr.onClick};
    private static final String[] c = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> d = new android.support.v4.h.a();
    private final Object[] e = new Object[2];

    be() {
    }

    final View a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.e[0] = context;
            this.e[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return a(context, str, (String) null);
            }
            for (int i = 0; i < c.length; i++) {
                View a2 = a(context, str, c[i]);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            this.e[0] = null;
            this.e[1] = null;
        }
    }

    static void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || by.K(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f498b);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new bf(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View a(Context context, String str, String str2) {
        Constructor<? extends View> constructor = d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f497a);
                d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.e);
    }

    static Context a(Context context, AttributeSet attributeSet, boolean z) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.b.l.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(android.support.v7.b.l.View_android_theme, 0) : 0;
        if (resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(android.support.v7.b.l.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (!(context instanceof android.support.v7.view.e) || ((android.support.v7.view.e) context).f558a != i) {
                return new android.support.v7.view.e(context, i);
            }
            return context;
        }
        return context;
    }
}
