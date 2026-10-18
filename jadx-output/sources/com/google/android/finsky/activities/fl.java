package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class fl implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1746a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ff f1747b;
    final /* synthetic */ fk c;

    fl(fk fkVar, boolean z, ff ffVar) {
        this.c = fkVar;
        this.f1746a = z;
        this.f1747b = ffVar;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        boolean z;
        if (!this.f1746a && this.f1747b == ff.SPAM) {
            z = this.c.g;
            if (!z) {
                fk.b(this.c);
            }
        }
    }
}
