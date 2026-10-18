package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f393a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f394b;

    f(e eVar, a aVar) {
        this.f394b = eVar;
        this.f393a = aVar;
    }

    @Override // android.support.v4.view.m
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f393a.b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f393a.d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final void a(View view, Object obj) {
        this.f393a.a(view, new android.support.v4.view.a.j(obj));
    }

    @Override // android.support.v4.view.m
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a.c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f393a.a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final void a(View view, int i) {
        a.a(view, i);
    }

    @Override // android.support.v4.view.m
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        a.a(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final Object a(View view) {
        android.support.v4.view.a.w a2 = a.a(view);
        if (a2 != null) {
            return a2.f331a;
        }
        return null;
    }

    @Override // android.support.v4.view.m
    public final boolean a(View view, int i, Bundle bundle) {
        return this.f393a.a(view, i, bundle);
    }
}
