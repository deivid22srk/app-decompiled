package com.google.android.wallet.instrumentmanager.d;

import com.android.volley.VolleyError;
import com.google.android.wallet.common.util.p;

/* loaded from: classes.dex */
public final class e extends com.google.android.wallet.common.d.c {
    final /* synthetic */ a c;
    private final p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, byte[] bArr, p pVar) {
        super(aVar, bArr);
        this.c = aVar;
        this.d = pVar;
    }

    @Override // com.google.android.wallet.common.d.c, com.android.volley.s
    public final void a(VolleyError volleyError) {
        super.a(volleyError);
        if (this.c.f != 3) {
            return;
        }
        this.d.f7305b = null;
    }
}
