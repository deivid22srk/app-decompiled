package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final d f314b;
    private static final Object c;

    /* renamed from: a, reason: collision with root package name */
    final Object f315a = f314b.a(this);

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f314b = new e();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f314b = new b();
        } else {
            f314b = new g();
        }
        c = f314b.a();
    }

    public static void a(View view, int i) {
        f314b.a(c, view, i);
    }

    public static void a(View view, AccessibilityEvent accessibilityEvent) {
        f314b.d(c, view, accessibilityEvent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return f314b.a(c, view, accessibilityEvent);
    }

    public static void c(View view, AccessibilityEvent accessibilityEvent) {
        f314b.c(c, view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        f314b.b(c, view, accessibilityEvent);
    }

    public void a(View view, android.support.v4.view.a.j jVar) {
        f314b.a(c, view, jVar);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f314b.a(c, viewGroup, view, accessibilityEvent);
    }

    public static android.support.v4.view.a.w a(View view) {
        return f314b.a(c, view);
    }

    public boolean a(View view, int i, Bundle bundle) {
        return f314b.a(c, view, i, bundle);
    }
}
