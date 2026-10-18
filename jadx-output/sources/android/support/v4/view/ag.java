package android.support.v4.view;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
class ag implements af {
    ag() {
    }

    @Override // android.support.v4.view.af
    public void a(LayoutInflater layoutInflater, an anVar) {
        layoutInflater.setFactory(anVar != null ? new ak(anVar) : null);
    }

    @Override // android.support.v4.view.af
    public final an a(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof ak) {
            return ((ak) factory).f335a;
        }
        return null;
    }
}
