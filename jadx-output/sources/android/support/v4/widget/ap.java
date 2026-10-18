package android.support.v4.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* loaded from: classes.dex */
final class ap extends android.support.v4.view.a {
    ap() {
    }

    @Override // android.support.v4.view.a
    public final boolean a(View view, int i, Bundle bundle) {
        int scrollRange;
        if (super.a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        switch (i) {
            case 4096:
                int height = ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY();
                scrollRange = nestedScrollView.getScrollRange();
                int min = Math.min(height, scrollRange);
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(min);
                return true;
            case 8192:
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(max);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
    
        r0 = r3.getScrollRange();
     */
    @Override // android.support.v4.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r3, android.support.v4.view.a.j r4) {
        /*
            r2 = this;
            super.a(r3, r4)
            android.support.v4.widget.NestedScrollView r3 = (android.support.v4.widget.NestedScrollView) r3
            java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
            java.lang.String r0 = r0.getName()
            r4.a(r0)
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L34
            int r0 = android.support.v4.widget.NestedScrollView.a(r3)
            if (r0 <= 0) goto L34
            r1 = 1
            r4.c(r1)
            int r1 = r3.getScrollY()
            if (r1 <= 0) goto L29
            r1 = 8192(0x2000, float:1.148E-41)
            r4.a(r1)
        L29:
            int r1 = r3.getScrollY()
            if (r1 >= r0) goto L34
            r0 = 4096(0x1000, float:5.74E-42)
            r4.a(r0)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ap.a(android.view.View, android.support.v4.view.a.j):void");
    }

    @Override // android.support.v4.view.a
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        int scrollRange;
        int scrollRange2;
        super.d(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        android.support.v4.view.a.aj a2 = android.support.v4.view.a.a.a(accessibilityEvent);
        scrollRange = nestedScrollView.getScrollRange();
        a2.a(scrollRange > 0);
        android.support.v4.view.a.aj.f321a.c(a2.f322b, nestedScrollView.getScrollX());
        android.support.v4.view.a.aj.f321a.d(a2.f322b, nestedScrollView.getScrollY());
        android.support.v4.view.a.aj.f321a.f(a2.f322b, nestedScrollView.getScrollX());
        scrollRange2 = nestedScrollView.getScrollRange();
        android.support.v4.view.a.aj.f321a.g(a2.f322b, scrollRange2);
    }
}
