package com.google.android.finsky.api.model;

import com.google.android.finsky.protos.fp;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.protos.nz;
import com.google.android.finsky.protos.oc;

/* loaded from: classes.dex */
public final class l extends y<nz, ny> implements com.android.volley.t<nz> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1981a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1982b;
    public int c;
    public int d;
    public fp e;
    public oc f;
    private com.google.android.finsky.api.b n;
    private int o;

    @Override // com.google.android.finsky.api.model.y
    protected final /* synthetic */ ny[] b(nz nzVar) {
        nz nzVar2 = nzVar;
        if (nzVar2.f4194b != null) {
            this.e = nzVar2.f4194b;
            return this.e.k;
        }
        if (nzVar2.f4193a != null) {
            if (p() == 0) {
                this.f = nzVar2.f4193a.f3944b;
            }
            return nzVar2.f4193a.f3943a;
        }
        return new ny[0];
    }

    @Override // com.google.android.finsky.api.model.y
    protected final /* bridge */ /* synthetic */ String c(nz nzVar) {
        return nzVar.c;
    }

    public l(com.google.android.finsky.api.b bVar, String str, int i, boolean z) {
        super(str, z);
        this.n = bVar;
        this.f1981a = false;
        this.f1982b = false;
        this.c = 0;
        this.o = i;
        this.d = -1;
    }

    public final void b() {
        e();
        q();
    }

    public final int c() {
        if (this.f1981a) {
            return this.o;
        }
        return -1;
    }

    public final void a(boolean z, boolean z2) {
        this.f1981a = z;
        this.f1982b = z2;
    }

    @Override // com.google.android.finsky.api.model.y
    protected final com.android.volley.l<?> b(String str) {
        return this.n.a(str, this.f1982b, this.f1981a ? this.o : -1, this.c, this.d, this, this);
    }

    @Override // com.google.android.finsky.api.model.y
    public final void e() {
        super.e();
        this.f = null;
    }

    @Override // com.google.android.finsky.api.model.y
    protected final void d() {
        throw new IllegalStateException("not supported");
    }
}
