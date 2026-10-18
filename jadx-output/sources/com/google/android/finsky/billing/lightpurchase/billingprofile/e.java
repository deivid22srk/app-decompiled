package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.view.View;
import com.google.android.finsky.a.i;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.at;

/* loaded from: classes.dex */
final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2330a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f2331b;
    final /* synthetic */ cy c;
    final /* synthetic */ byte[] d;
    final /* synthetic */ int e;
    final /* synthetic */ a f;

    e(a aVar, int i, at atVar, cy cyVar, byte[] bArr, int i2) {
        this.f = aVar;
        this.f2330a = i;
        this.f2331b = atVar;
        this.c = cyVar;
        this.d = bArr;
        this.e = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        iVar = this.f.ax;
        iVar.a(this.f2330a, this.f2331b.f, this.c);
        a.a(this.f, this.d, this.f2331b.o, this.e);
    }
}
