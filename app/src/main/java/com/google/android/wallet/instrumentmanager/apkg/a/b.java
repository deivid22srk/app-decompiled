package com.google.android.wallet.instrumentmanager.apkg.a;

import com.android.volley.s;
import com.google.android.wallet.common.c.apkg.e;
import com.google.android.wallet.common.util.m;
import com.google.b.a.a.a.b.b.h;
import com.google.b.a.a.a.b.b.i;
import com.google.protobuf.nano.c;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends e<b, i> {
    public final h l;

    public b(com.google.android.wallet.common.c.apkg.a aVar, h hVar, Map<String, String> map, byte[] bArr, com.google.android.wallet.common.d.a<b, i> aVar2, s sVar) {
        super(aVar, map, bArr, i.class, aVar2, sVar);
        this.l = hVar;
    }

    @Override // com.google.android.wallet.common.c.apkg.c
    public final int o() {
        return 720;
    }

    @Override // com.google.android.wallet.common.c.apkg.c
    public final int p() {
        return 721;
    }

    @Override // com.google.android.wallet.common.c.apkg.e
    public final c q() {
        h hVar = (h) m.a(this.l);
        hVar.f7720a = com.google.android.wallet.common.util.i.a(this.k.f7270a, this.j);
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.c.apkg.e
    public final String r() {
        return "instrumentmanager/submit";
    }
}
