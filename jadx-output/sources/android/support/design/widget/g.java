package android.support.design.widget;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
final class g implements Comparator<View> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f135a;

    g(CoordinatorLayout coordinatorLayout) {
        this.f135a = coordinatorLayout;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(View view, View view2) {
        View view3 = view;
        View view4 = view2;
        if (view3 != view4) {
            if (((l) view3.getLayoutParams()).a(view4)) {
                return 1;
            }
            if (((l) view4.getLayoutParams()).a(view3)) {
                return -1;
            }
        }
        return 0;
    }
}
