package com.google.android.wallet.instrumentmanager.d;

import android.accounts.Account;
import android.os.Bundle;
import com.android.volley.l;
import com.android.volley.o;
import com.android.volley.p;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.b.a.a.a.b.b.g;
import com.google.b.a.a.a.b.b.h;
import com.google.b.a.a.a.b.b.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends com.google.android.wallet.common.d.b {
    public static final Object i = new Object();
    public i ai;
    public g aj;
    public boolean ak;

    public static a b(Account account, com.google.d.b.a.a.b bVar) {
        a aVar = new a();
        aVar.f(a(account, bVar));
        return aVar;
    }

    public final void a(h hVar, com.google.b.a.a.a.b.a.f fVar, Map<String, String> map, d dVar, com.google.android.wallet.common.d.c cVar, Object obj) {
        if (hVar.f7720a != null) {
            throw new IllegalArgumentException("SavePageRequest's RequestContext should not be set by the caller");
        }
        com.google.android.wallet.instrumentmanager.a.a.b bVar = new com.google.android.wallet.instrumentmanager.a.a.b(this.d, hVar, map, fVar.f7701b, dVar, cVar);
        bVar.i = obj;
        cVar.f7275a = bVar;
        super.a((l<?>) bVar, true);
        com.google.android.wallet.common.b.a.a.a(720, 1, fVar.c);
        this.ak = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.d.b
    public final boolean b(int i2) {
        return this.ak && i2 + (-1) < com.google.android.wallet.a.b.f7224a.b().intValue();
    }

    @Override // com.google.android.wallet.common.d.b, com.google.android.wallet.common.d.e, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.ai != null) {
            bundle.putParcelable("savePageResponse", ParcelableProto.a(this.ai));
        }
        if (this.aj != null) {
            bundle.putParcelable("refreshPageResponse", ParcelableProto.a(this.aj));
        }
        bundle.putBoolean("sendingRequestAfterSms", this.ak);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.d.b, com.google.android.wallet.common.d.e
    public final void c(Bundle bundle) {
        this.ai = (i) ParcelableProto.a(bundle, "savePageResponse");
        this.aj = (g) ParcelableProto.a(bundle, "refreshPageResponse");
        this.ak = bundle.getBoolean("sendingRequestAfterSms");
        super.c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.d.b
    public final void u() {
        this.ai = null;
        this.aj = null;
    }

    static /* synthetic */ void a(a aVar, Object obj) {
        o oVar = aVar.c;
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        oVar.a(new p(oVar, obj));
        if (((com.google.android.wallet.common.d.b) aVar).f7274b == null) {
            return;
        }
        for (int size = ((com.google.android.wallet.common.d.b) aVar).f7274b.size() - 1; size >= 0; size--) {
            l<?> lVar = ((com.google.android.wallet.common.d.b) aVar).f7274b.get(size);
            if (lVar != null && obj.equals(lVar.i)) {
                ((com.google.android.wallet.common.d.b) aVar).f7274b.remove(size);
            }
        }
    }
}
