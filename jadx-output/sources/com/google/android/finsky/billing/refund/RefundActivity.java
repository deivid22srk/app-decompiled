package com.google.android.finsky.billing.refund;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v7.a.ae;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.layout.play.da;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class RefundActivity extends ae implements f, da {
    private final ai k = com.google.android.finsky.a.i.a(1150);
    private com.google.android.finsky.a.i l;
    private e m;

    public static Intent a(String str, byte[] bArr, String str2, int i) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) RefundActivity.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("RefundActivity.clientRefundContext", bArr);
        intent.putExtra("RefundActivity.documentId", str2);
        intent.putExtra("RefundActivity.backendId", i);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(R.layout.refund_activity, (ViewGroup) null));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("authAccount");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Missing required extra: authAccount");
        }
        this.l = FinskyApp.a().f(stringExtra);
        aa d = d();
        this.m = (e) d.a(R.id.content_frame);
        if (this.m == null) {
            this.l.a(0L, (cy) this);
            this.m = e.a(stringExtra, intent.getByteArrayExtra("RefundActivity.clientRefundContext"), intent.getStringExtra("RefundActivity.documentId"), intent.getIntExtra("RefundActivity.backendId", 0));
            d.a().a(R.id.content_frame, this.m).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        this.m.c = this;
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        this.m.c = null;
        super.onStop();
    }

    @Override // android.app.Activity
    public void finish() {
        this.l.b(603, null, this);
        e eVar = this.m;
        if (eVar.f2428a == 8 && eVar.f2429b != null) {
            setResult(-1);
        }
        super.finish();
    }

    @Override // com.google.android.finsky.billing.refund.f
    public final void g() {
        finish();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return this.k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void p_() {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void i() {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }
}
