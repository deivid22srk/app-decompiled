package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.view.ViewPager;

/* renamed from: android.support.v4.view.do, reason: invalid class name */
/* loaded from: classes.dex */
final class Cdo implements android.support.v4.os.d<ViewPager.SavedState> {
    Cdo() {
    }

    @Override // android.support.v4.os.d
    public final /* bridge */ /* synthetic */ ViewPager.SavedState[] a(int i) {
        return new ViewPager.SavedState[i];
    }

    @Override // android.support.v4.os.d
    public final /* synthetic */ ViewPager.SavedState a(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }
}
