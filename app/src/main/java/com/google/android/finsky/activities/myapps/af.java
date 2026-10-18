package com.google.android.finsky.activities.myapps;

/* loaded from: classes.dex */
final class af implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f1812a;

    af(ae aeVar) {
        this.f1812a = aeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa aaVar;
        aa aaVar2;
        if (this.f1812a.f1811b.L()) {
            this.f1812a.f1811b.I();
        }
        aaVar = this.f1812a.f1811b.f1808b;
        if (aaVar != null) {
            aaVar2 = this.f1812a.f1811b.f1808b;
            aaVar2.a(this.f1812a.f1810a);
        }
    }
}
