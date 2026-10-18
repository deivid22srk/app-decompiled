package android.support.v7.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class bf implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f499a;

    /* renamed from: b, reason: collision with root package name */
    private final String f500b;
    private Method c;
    private Context d;

    public bf(View view, String str) {
        this.f499a = view;
        this.f500b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Method method;
        if (this.c == null) {
            Context context = this.f499a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f500b, View.class)) != null) {
                        this.c = method;
                        this.d = context;
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f499a.getId();
            throw new IllegalStateException("Could not find method " + this.f500b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f499a.getClass() + (id == -1 ? "" : " with id '" + this.f499a.getContext().getResources().getResourceEntryName(id) + "'"));
        }
        try {
            this.c.invoke(this.d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
