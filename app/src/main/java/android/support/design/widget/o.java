package android.support.design.widget;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
final class o implements Comparator<View> {
    o() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(View view, View view2) {
        float I = android.support.v4.view.by.I(view);
        float I2 = android.support.v4.view.by.I(view2);
        if (I > I2) {
            return -1;
        }
        if (I < I2) {
            return 1;
        }
        return 0;
    }
}
