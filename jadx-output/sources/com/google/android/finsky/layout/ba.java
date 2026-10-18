package com.google.android.finsky.layout;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ba implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ExtrasItemSnippet f3150a;

    ba(ExtrasItemSnippet extrasItemSnippet) {
        this.f3150a = extrasItemSnippet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        this.f3150a.getLocationInWindow(iArr);
        int i = iArr[1];
        ViewParent parent = this.f3150a.getParent();
        while (!(parent instanceof RecyclerView)) {
            parent = parent.getParent();
            if (parent == null) {
                FinskyLog.e("Found no suitable parent.", new Object[0]);
            }
        }
        RecyclerView recyclerView = (RecyclerView) parent;
        recyclerView.getLocationInWindow(iArr);
        recyclerView.a(0, i - iArr[1]);
    }
}
