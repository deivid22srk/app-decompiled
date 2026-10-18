package android.support.v4.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
final class q extends android.support.v4.view.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DrawerLayout f464b;
    private final Rect c = new Rect();

    q(DrawerLayout drawerLayout) {
        this.f464b = drawerLayout;
    }

    @Override // android.support.v4.view.a
    public final void a(View view, android.support.v4.view.a.j jVar) {
        boolean z;
        z = DrawerLayout.o;
        if (z) {
            super.a(view, jVar);
        } else {
            android.support.v4.view.a.j a2 = android.support.v4.view.a.j.a(jVar);
            super.a(view, a2);
            android.support.v4.view.a.j.f324a.c(jVar.f325b, view);
            Object i = android.support.v4.view.by.i(view);
            if (i instanceof View) {
                jVar.a((View) i);
            }
            Rect rect = this.c;
            a2.a(rect);
            android.support.v4.view.a.j.f324a.c(jVar.f325b, rect);
            a2.b(rect);
            android.support.v4.view.a.j.f324a.d(jVar.f325b, rect);
            android.support.v4.view.a.j.f324a.i(jVar.f325b, android.support.v4.view.a.j.f324a.s(a2.f325b));
            android.support.v4.view.a.j.f324a.c(jVar.f325b, a2.h());
            jVar.a(a2.i());
            android.support.v4.view.a.j.f324a.b(jVar.f325b, a2.j());
            android.support.v4.view.a.j.f324a.c(jVar.f325b, a2.g());
            android.support.v4.view.a.j.f324a.b(jVar.f325b, a2.e());
            jVar.a(a2.b());
            jVar.b(a2.c());
            android.support.v4.view.a.j.f324a.j(jVar.f325b, android.support.v4.view.a.j.f324a.t(a2.f325b));
            android.support.v4.view.a.j.f324a.h(jVar.f325b, a2.d());
            android.support.v4.view.a.j.f324a.f(jVar.f325b, a2.f());
            jVar.a(a2.a());
            android.support.v4.view.a.j.f324a.r(a2.f325b);
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (DrawerLayout.h(childAt)) {
                    android.support.v4.view.a.j.f324a.a(jVar.f325b, childAt);
                }
            }
        }
        jVar.a((CharSequence) DrawerLayout.class.getName());
        jVar.a(false);
        jVar.b(false);
        jVar.a(android.support.v4.view.a.k.f326a);
        jVar.a(android.support.v4.view.a.k.f327b);
    }

    @Override // android.support.v4.view.a
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }

    @Override // android.support.v4.view.a
    public final boolean b(View view, AccessibilityEvent accessibilityEvent) {
        View f;
        CharSequence charSequence;
        if (accessibilityEvent.getEventType() == 32) {
            List<CharSequence> text = accessibilityEvent.getText();
            f = this.f464b.f();
            if (f != null) {
                int c = this.f464b.c(f);
                DrawerLayout drawerLayout = this.f464b;
                int a2 = android.support.v4.view.v.a(c, android.support.v4.view.by.h(drawerLayout));
                if (a2 == 3) {
                    charSequence = drawerLayout.g;
                } else if (a2 == 5) {
                    charSequence = drawerLayout.h;
                } else {
                    charSequence = null;
                }
                if (charSequence != null) {
                    text.add(charSequence);
                }
            }
            return true;
        }
        return super.b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.a
    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        z = DrawerLayout.o;
        if (z || DrawerLayout.h(view)) {
            return super.a(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
