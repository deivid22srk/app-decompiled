package android.support.v4.view.apkg;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class n extends t {
    n() {
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final Object a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final int b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final CharSequence c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final CharSequence d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final CharSequence e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final CharSequence f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean g(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void q(Object obj) {
        ((AccessibilityNodeInfo) obj).setCheckable(true);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setChecked(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void h(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final void r(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
