package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
final class dj extends a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewPager f375b;

    dj(ViewPager viewPager) {
        this.f375b = viewPager;
    }

    @Override // android.support.v4.view.a
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        bn bnVar;
        bn bnVar2;
        int i;
        int i2;
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        android.support.v4.view.apkg.aj a2 = android.support.v4.view.apkg.aj.a();
        a2.a(a());
        if (accessibilityEvent.getEventType() == 4096) {
            bnVar = this.f375b.i;
            if (bnVar != null) {
                bnVar2 = this.f375b.i;
                a2.a(bnVar2.a());
                i = this.f375b.j;
                a2.b(i);
                i2 = this.f375b.j;
                a2.c(i2);
            }
        }
    }

    @Override // android.support.v4.view.a
    public final void a(View view, android.support.v4.view.apkg.j jVar) {
        super.a(view, jVar);
        jVar.a((CharSequence) ViewPager.class.getName());
        jVar.c(a());
        if (this.f375b.canScrollHorizontally(1)) {
            jVar.a(4096);
        }
        if (this.f375b.canScrollHorizontally(-1)) {
            jVar.a(8192);
        }
    }

    @Override // android.support.v4.view.a
    public final boolean a(View view, int i, Bundle bundle) {
        int i2;
        int i3;
        if (super.a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.f375b.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = this.f375b;
                i3 = this.f375b.j;
                viewPager.setCurrentItem(i3 + 1);
                return true;
            case 8192:
                if (!this.f375b.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager2 = this.f375b;
                i2 = this.f375b.j;
                viewPager2.setCurrentItem(i2 - 1);
                return true;
            default:
                return false;
        }
    }

    private boolean a() {
        bn bnVar;
        bn bnVar2;
        bnVar = this.f375b.i;
        if (bnVar != null) {
            bnVar2 = this.f375b.i;
            if (bnVar2.a() > 1) {
                return true;
            }
        }
        return false;
    }
}
