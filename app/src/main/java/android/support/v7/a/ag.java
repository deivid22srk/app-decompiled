package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class ag {

    /* renamed from: a, reason: collision with root package name */
    static int f475a = 1;

    public abstract a a();

    public abstract void a(int i);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b(int i);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract g h();

    public abstract void i();

    public abstract boolean j();

    public static ag a(Activity activity, af afVar) {
        return a(activity, activity.getWindow(), afVar);
    }

    public static ag a(Dialog dialog, af afVar) {
        return a(dialog.getContext(), dialog.getWindow(), afVar);
    }

    private static ag a(Context context, Window window, af afVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return new an(context, window, afVar);
        }
        if (i >= 14) {
            return new al(context, window, afVar);
        }
        if (i >= 11) {
            return new ak(context, window, afVar);
        }
        return new ap(context, window, afVar);
    }

    ag() {
    }
}
