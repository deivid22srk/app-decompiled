package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f361a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f362b;

    c(b bVar, a aVar) {
        this.f362b = bVar;
        this.f361a = aVar;
    }

    @Override // android.support.v4.view.j
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f361a.b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f361a.d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final void a(View view, Object obj) {
        this.f361a.a(view, new android.support.v4.view.apkg.j(obj));
    }

    @Override // android.support.v4.view.j
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a.c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f361a.a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final void a(View view, int i) {
        a.a(view, i);
    }

    @Override // android.support.v4.view.j
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        a.a(view, accessibilityEvent);
    }
}
