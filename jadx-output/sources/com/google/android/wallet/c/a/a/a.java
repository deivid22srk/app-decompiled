package com.google.android.wallet.c.a.a;

import com.android.volley.s;
import com.google.android.wallet.common.c.a.e;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.common.util.m;
import com.google.d.b.a.b.f;
import com.google.d.b.a.b.g;
import com.google.protobuf.nano.c;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends e<a, g> {
    public final f l;

    public a(com.google.android.wallet.common.c.a.a aVar, f fVar, Map<String, String> map, byte[] bArr, com.google.android.wallet.common.d.a<a, g> aVar2, s sVar) {
        super(aVar, map, bArr, g.class, aVar2, sVar);
        this.l = fVar;
    }

    @Override // com.google.android.wallet.common.c.a.c
    public final int o() {
        return 724;
    }

    @Override // com.google.android.wallet.common.c.a.c
    public final int p() {
        return 725;
    }

    @Override // com.google.android.wallet.common.c.a.e
    public final c q() {
        f fVar = (f) m.a(this.l);
        fVar.f7750a = i.a(this.k.f7270a, this.j);
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.c.a.e
    public final String r() {
        return "purchasemanager/submit";
    }
}
