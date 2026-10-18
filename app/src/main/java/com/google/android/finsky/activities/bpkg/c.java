package com.google.android.finsky.activities.bpkg;

/* loaded from: classes.dex */
public final class c implements com.google.android.finsky.epkg.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f1576a;

    c(a aVar) {
        this.f1576a = aVar;
    }

    @Override // com.google.android.finsky.epkg.v
    public final void a(com.google.android.finsky.epkg.u uVar) {
        if (uVar.au != this.f1576a.c) {
            this.f1576a.c = uVar.au;
            switch (uVar.as) {
                case 0:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    ((com.google.android.finsky.billing.lightpurchase.billingprofile.a) uVar).u();
                    break;
            }
            this.f1576a.c(2);
        }
    }
}
