package com.android.a.a;

/* loaded from: classes.dex */
final class bb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ba f1096a;

    /* renamed from: b, reason: collision with root package name */
    private a f1097b;
    private g c;
    private ab d;

    bb(ba baVar, a aVar, g gVar, ab abVar) {
        this.f1096a = baVar;
        this.f1097b = aVar;
        this.c = gVar;
        this.d = abVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.f1096a.f1094a;
        at atVar = null;
        if (this.f1097b.k != null) {
            if (be.a(this.f1097b.k)) {
                atVar = at.LATIN;
            } else {
                atVar = at.LOCAL;
            }
        }
        this.f1096a.a(atVar, adVar, e.COUNTRY, this.f1097b.f1055a, this.c);
        if (this.c.a()) {
            adVar = adVar.a(this.f1097b.f1055a);
            this.f1096a.a(atVar, adVar, e.ADMIN_AREA, this.f1097b.d, this.c);
            if (this.c.a()) {
                adVar = adVar.a(this.f1097b.d);
                this.f1096a.a(atVar, adVar, e.LOCALITY, this.f1097b.e, this.c);
                if (this.c.a()) {
                    adVar = adVar.a(this.f1097b.e);
                    this.f1096a.a(atVar, adVar, e.DEPENDENT_LOCALITY, this.f1097b.f, this.c);
                    if (this.c.a()) {
                        adVar = adVar.a(this.f1097b.f);
                    }
                }
            }
        }
        String a2 = be.a("\n", this.f1097b.f1056b, this.f1097b.c);
        this.f1096a.a(atVar, adVar, e.POSTAL_CODE, this.f1097b.g, this.c);
        this.f1096a.a(atVar, adVar, e.STREET_ADDRESS, a2, this.c);
        this.f1096a.a(atVar, adVar, e.SORTING_CODE, this.f1097b.h, this.c);
        this.f1096a.a(atVar, adVar, e.ORGANIZATION, this.f1097b.i, this.c);
        this.f1096a.a(atVar, adVar, e.RECIPIENT, this.f1097b.j, this.c);
        ba.a();
        this.d.a();
    }
}
