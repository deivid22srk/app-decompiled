package com.google.android.wallet.instrumentmanager.apkg.a;

import com.android.volley.s;
import com.google.android.wallet.common.c.apkg.e;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.common.util.m;
import com.google.b.a.a.a.b.b.f;
import com.google.b.a.a.a.b.b.g;
import com.google.protobuf.nano.c;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends e<a, g> {
    public final f l;

    public a(com.google.android.wallet.common.c.apkg.a aVar, f fVar, Map<String, String> map, byte[] bArr, com.google.android.wallet.common.d.a<a, g> aVar2, s sVar) {
        super(aVar, map, bArr, g.class, aVar2, sVar);
        this.l = fVar;
    }

    @Override // com.google.android.wallet.common.c.apkg.c
    public final int o() {
        return 722;
    }

    @Override // com.google.android.wallet.common.c.apkg.c
    public final int p() {
        return 723;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.c.apkg.e
    public final c q() {
        f fVar = (f) m.a(this.l);
        fVar.f7716a = i.a(this.k.f7270a, this.j);
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.c.apkg.e
    public final String r() {
        return "instrumentmanager/refresh";
    }
}
