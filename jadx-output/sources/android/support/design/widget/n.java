package android.support.design.widget;

import android.os.Parcel;
import android.support.design.widget.CoordinatorLayout;

/* loaded from: classes.dex */
final class n implements android.support.v4.os.d<CoordinatorLayout.SavedState> {
    n() {
    }

    @Override // android.support.v4.os.d
    public final /* bridge */ /* synthetic */ CoordinatorLayout.SavedState[] a(int i) {
        return new CoordinatorLayout.SavedState[i];
    }

    @Override // android.support.v4.os.d
    public final /* synthetic */ CoordinatorLayout.SavedState a(Parcel parcel, ClassLoader classLoader) {
        return new CoordinatorLayout.SavedState(parcel, classLoader);
    }
}
