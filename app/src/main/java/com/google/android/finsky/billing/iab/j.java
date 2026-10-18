package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.protos.mj;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class j implements com.android.volley.t<mj> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f2251a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f2252b;
    final /* synthetic */ b c;

    j(b bVar, Bundle bundle, Semaphore semaphore) {
        this.c = bVar;
        this.f2251a = bundle;
        this.f2252b = semaphore;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(mj mjVar) {
        mj mjVar2 = mjVar;
        this.f2251a.putInt("RESPONSE_CODE", n.RESULT_OK.l);
        this.f2251a.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", new ArrayList<>(com.google.android.finsky.utils.p.a(mjVar2.f4128a)));
        this.f2251a.putStringArrayList("INAPP_PURCHASE_DATA_LIST", new ArrayList<>(com.google.android.finsky.utils.p.a(mjVar2.f4129b)));
        this.f2251a.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", new ArrayList<>(com.google.android.finsky.utils.p.a(mjVar2.c)));
        if (!TextUtils.isEmpty(mjVar2.d)) {
            this.f2251a.putString("INAPP_CONTINUATION_TOKEN", mjVar2.d);
        }
        this.f2252b.release();
    }
}
