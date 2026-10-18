package android.support.v4.view;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
class ah extends ag {
    ah() {
    }

    @Override // android.support.v4.view.ag, android.support.v4.view.af
    public void a(LayoutInflater layoutInflater, an anVar) {
        am amVar = anVar != null ? new am(anVar) : null;
        layoutInflater.setFactory2(amVar);
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater.Factory2) {
            al.a(layoutInflater, (LayoutInflater.Factory2) factory);
        } else {
            al.a(layoutInflater, amVar);
        }
    }
}
