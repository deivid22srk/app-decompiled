package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class ef extends ed {
    ef() {
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void a(View view, eq eqVar) {
        en enVar = null;
        if (eqVar != null) {
            enVar = new en(eqVar, view);
        }
        view.animate().setUpdateListener(enVar);
    }
}
