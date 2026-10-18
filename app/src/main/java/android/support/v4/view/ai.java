package android.support.v4.view;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
final class ai extends ah {
    ai() {
    }

    @Override // android.support.v4.view.ah, android.support.v4.view.ag, android.support.v4.view.af
    public final void a(LayoutInflater layoutInflater, an anVar) {
        layoutInflater.setFactory2(anVar != null ? new am(anVar) : null);
    }
}
