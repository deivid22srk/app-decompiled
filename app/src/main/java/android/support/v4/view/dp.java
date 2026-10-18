package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
final class dp implements Comparator<View> {
    dp() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(View view, View view2) {
        di diVar = (di) view.getLayoutParams();
        di diVar2 = (di) view2.getLayoutParams();
        if (diVar.f373a != diVar2.f373a) {
            return diVar.f373a ? 1 : -1;
        }
        return diVar.e - diVar2.e;
    }
}
