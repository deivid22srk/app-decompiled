package com.google.android.finsky.api;

import android.text.TextUtils;
import com.google.android.finsky.protos.fz;
import com.google.android.finsky.protos.ga;

/* loaded from: classes.dex */
final class h extends y<ga> {
    String j;
    final /* synthetic */ fz k;
    final /* synthetic */ g l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g gVar, String str, com.google.protobuf.nano.c cVar, e eVar, Class cls, com.android.volley.t tVar, com.android.volley.s sVar, fz fzVar) {
        super(str, cVar, eVar, cls, tVar, sVar);
        this.l = gVar;
        this.k = fzVar;
    }

    @Override // com.google.android.finsky.api.n, com.android.volley.l
    public final String c() {
        if (this.j == null) {
            StringBuilder append = new StringBuilder(super.c()).append("/docidhash=").append(n());
            if (!TextUtils.isEmpty(this.l.ao.h)) {
                append.append("/nodeId=").append(this.l.ao.h);
            }
            this.j = append.toString();
        }
        return this.j;
    }

    private String n() {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < this.k.f3853a.length; i++) {
            j2 = (j2 * 31) + r6[i].hashCode();
        }
        String l = Long.toString(j2);
        if (this.k.f3854b.length > 0) {
            for (int i2 = 0; i2 < this.k.f3854b.length; i2++) {
                j = (j * 31) + r4[i2];
            }
            return l + Long.toString(j);
        }
        return l;
    }
}
