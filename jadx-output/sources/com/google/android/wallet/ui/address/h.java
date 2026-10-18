package com.google.android.wallet.ui.address;

import android.os.Bundle;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class h implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7385a;

    h(b bVar) {
        this.f7385a = bVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        com.google.protobuf.nano.c cVar;
        this.f7385a.a(false);
        Bundle bundle = new Bundle();
        cVar = this.f7385a.aw;
        bundle.putString("FormEventListener.EXTRA_FORM_ID", ((com.google.b.a.a.a.b.a.a.b) cVar).f7559a);
        this.f7385a.a(5, com.google.android.wallet.common.util.e.a(bundle, 1000, this.f7385a.f_(com.google.android.wallet.e.j.wallet_uic_network_error_title), this.f7385a.f_(com.google.android.wallet.e.j.wallet_uic_network_error_message), null, null, this.f7385a.f_(com.google.android.wallet.e.j.wallet_uic_retry)));
    }
}
