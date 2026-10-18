package com.google.android.finsky.billing.iab;

import com.google.android.finsky.protos.ep;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ep f2243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f2244b;

    f(e eVar, ep epVar) {
        this.f2244b = eVar;
        this.f2243a = epVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2243a.f3793b) {
            case 0:
                this.f2244b.f2241a[0] = n.RESULT_OK;
                break;
            case 1:
                this.f2244b.f2241a[0] = n.RESULT_DEVELOPER_ERROR;
                break;
            case 2:
                this.f2244b.f2241a[0] = n.RESULT_ITEM_NOT_OWNED;
                break;
            default:
                this.f2244b.f2241a[0] = n.RESULT_ERROR;
                break;
        }
        this.f2244b.f2242b.release();
    }
}
