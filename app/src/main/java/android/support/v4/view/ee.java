package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class ee extends eb {
    ee() {
    }

    @Override // android.support.v4.view.eb, android.support.v4.view.dz, android.support.v4.view.eh
    public final void a(dy dyVar, View view, eo eoVar) {
        if (eoVar != null) {
            view.animate().setListener(new el(eoVar, view));
        } else {
            view.animate().setListener(null);
        }
    }
}
