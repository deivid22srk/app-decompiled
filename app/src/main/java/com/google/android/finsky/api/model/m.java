package com.google.android.finsky.api.model;

import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.of;
import com.google.android.finsky.protos.og;

/* loaded from: classes.dex */
public final class m extends d<og> {
    public String c;
    public String d;
    public boolean e;
    private final String f;
    private Boolean n;

    @Override // com.google.android.finsky.api.model.y
    protected final /* synthetic */ Document[] b(Object obj) {
        og ogVar = (og) obj;
        if (this.n == null) {
            this.n = Boolean.valueOf(ogVar.g);
        }
        if (ogVar.c.length() > 0) {
            this.d = ogVar.c;
            this.e = ogVar.e;
        }
        if (ogVar.j == null || ogVar.j.length == 0) {
            return new Document[0];
        }
        return a(ogVar.j[0]);
    }

    @Override // com.google.android.finsky.api.model.y
    protected final /* bridge */ /* synthetic */ String c(Object obj) {
        og ogVar = (og) obj;
        if (ogVar.j.length != 1) {
            return null;
        }
        gx gxVar = ogVar.j[0];
        if (gxVar.y == null) {
            return null;
        }
        return gxVar.y.c;
    }

    public m(com.google.android.finsky.api.b bVar, String str, String str2) {
        super(bVar, str2);
        this.e = false;
        this.n = null;
        this.f = str2;
        this.c = str;
    }

    @Override // com.google.android.finsky.api.model.y
    protected final com.android.volley.l<?> b(String str) {
        return this.f1971b.c(str, this, this);
    }

    public final boolean f() {
        return this.n != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final of[] g() {
        return ((og) this.i).k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m() {
        return ((og) this.i).l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] n() {
        if (this.i == 0 || ((og) this.i).n.length == 0) {
            return null;
        }
        return ((og) this.i).n;
    }

    @Override // com.google.android.finsky.api.model.y
    protected final void d() {
        throw new IllegalStateException("not supported");
    }

    @Override // com.google.android.finsky.api.model.d
    public final int c() {
        if (this.n.booleanValue()) {
            return 0;
        }
        return super.c();
    }
}
