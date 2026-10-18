package android.support.v4.view;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
class cr implements cv {
    cr() {
    }

    @Override // android.support.v4.view.cv
    public int a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledTouchSlop();
    }

    @Override // android.support.v4.view.cv
    public boolean b(ViewConfiguration viewConfiguration) {
        return true;
    }
}
