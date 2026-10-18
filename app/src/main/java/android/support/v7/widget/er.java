package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class er extends android.support.v4.view.a {

    /* renamed from: b, reason: collision with root package name */
    final RecyclerView f797b;
    final android.support.v4.view.a c = new es(this);

    public er(RecyclerView recyclerView) {
        this.f797b = recyclerView;
    }

    final boolean a() {
        RecyclerView recyclerView = this.f797b;
        return !recyclerView.f || recyclerView.h || recyclerView.f628b.d();
    }

    @Override // android.support.v4.view.a
    public final boolean a(View view, int i, Bundle bundle) {
        int size;
        int i2;
        int size2;
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (a() || this.f797b.getLayoutManager() == null) {
            return false;
        }
        ec layoutManager = this.f797b.getLayoutManager();
        eh ehVar = layoutManager.q.f627a;
        en enVar = layoutManager.q.n;
        if (layoutManager.q == null) {
            return false;
        }
        switch (i) {
            case 4096:
                size = android.support.v4.view.by.b((View) layoutManager.q, 1) ? (View.MeasureSpec.getSize(layoutManager.w) - layoutManager.s()) - layoutManager.u() : 0;
                if (android.support.v4.view.by.a((View) layoutManager.q, 1)) {
                    i2 = size;
                    size2 = (View.MeasureSpec.getSize(layoutManager.v) - layoutManager.r()) - layoutManager.t();
                    break;
                }
                i2 = size;
                size2 = 0;
                break;
            case 8192:
                size = android.support.v4.view.by.b((View) layoutManager.q, -1) ? -((View.MeasureSpec.getSize(layoutManager.w) - layoutManager.s()) - layoutManager.u()) : 0;
                if (android.support.v4.view.by.a((View) layoutManager.q, -1)) {
                    i2 = size;
                    size2 = -((View.MeasureSpec.getSize(layoutManager.v) - layoutManager.r()) - layoutManager.t());
                    break;
                }
                i2 = size;
                size2 = 0;
                break;
            default:
                size2 = 0;
                i2 = 0;
                break;
        }
        if (i2 == 0 && size2 == 0) {
            return false;
        }
        layoutManager.q.scrollBy(size2, i2);
        return true;
    }

    @Override // android.support.v4.view.a
    public final void a(View view, android.support.v4.view.apkg.j jVar) {
        android.support.v4.view.apkg.o oVar;
        super.a(view, jVar);
        jVar.a((CharSequence) RecyclerView.class.getName());
        if (!a() && this.f797b.getLayoutManager() != null) {
            ec layoutManager = this.f797b.getLayoutManager();
            eh ehVar = layoutManager.q.f627a;
            en enVar = layoutManager.q.n;
            if (android.support.v4.view.by.b((View) layoutManager.q, -1) || android.support.v4.view.by.a((View) layoutManager.q, -1)) {
                jVar.a(8192);
                jVar.c(true);
            }
            if (android.support.v4.view.by.b((View) layoutManager.q, 1) || android.support.v4.view.by.a((View) layoutManager.q, 1)) {
                jVar.a(4096);
                jVar.c(true);
            }
            int a2 = layoutManager.a(ehVar, enVar);
            int b2 = layoutManager.b(ehVar, enVar);
            oVar = android.support.v4.view.apkg.j.f324a;
            android.support.v4.view.apkg.j.f324a.b(jVar.f325b, new android.support.v4.view.apkg.u(oVar.a(a2, b2)).f328a);
        }
    }

    @Override // android.support.v4.view.a
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }
}
