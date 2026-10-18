package android.support.v4.os;

import android.os.Build;
import android.os.Parcelable;

/* loaded from: classes.dex */
public static final class b {
    public static <T> Parcelable.Creator<T> a(d<T> dVar) {
        return Build.VERSION.SDK_INT >= 13 ? new e(dVar) : new c(dVar);
    }
}
