package android.support.v4.view.apkg;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public class ak extends ao {
    ak() {
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final Object a() {
        return AccessibilityRecord.obtain();
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void c(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollX(i);
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void d(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollY(i);
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void a(Object obj, View view) {
        ((AccessibilityRecord) obj).setSource(view);
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void e(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
