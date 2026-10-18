package com.google.android.finsky.billing.instrumentmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ap;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.wallet.common.pub.d;

/* loaded from: classes.dex */
public abstract class a extends com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c implements d {
    protected abstract int g();

    protected static void a(String str, byte[] bArr, byte[] bArr2, Bundle bundle, Intent intent) {
        com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c.a(intent, str);
        intent.putExtra("common_token", bArr);
        intent.putExtra("action_token", bArr2);
        intent.putExtra("instrument_manager_args", bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.instrument_manager_activity);
        com.google.android.wallet.common.pub.a.a.f7286a = new b(this, this.q);
        com.google.android.wallet.common.c.a.a(FinskyApp.a().f1434a);
        com.google.android.wallet.common.c.a.b(FinskyApp.a().e);
        if (i() == null) {
            com.google.android.wallet.instrumentmanager.c.a a2 = com.google.android.wallet.instrumentmanager.c.a.a(com.google.android.finsky.api.a.a(this.p, this), getIntent().getByteArrayExtra("common_token"), getIntent().getByteArrayExtra("action_token"), g(), (Bundle) getIntent().getParcelableExtra("instrument_manager_args"));
            ap a3 = d().a();
            a3.a(R.id.content_frame, a2);
            a3.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        com.google.android.wallet.common.pub.a.a.f7286a = null;
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.support.v4.app.t, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNewIntent(android.content.Intent r4) {
        /*
            r3 = this;
            super.onNewIntent(r4)
            android.support.v4.app.Fragment r0 = r3.i()
            boolean r1 = r0 instanceof com.google.android.wallet.nfc.b
            if (r1 == 0) goto L33
            com.google.android.wallet.nfc.b r0 = (com.google.android.wallet.nfc.b) r0
            if (r0 == 0) goto L33
            if (r4 == 0) goto L34
            java.lang.String r1 = r4.getAction()
            java.lang.String r2 = "android.nfc.action.TAG_DISCOVERED"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L2d
            java.lang.String r2 = "android.nfc.action.TECH_DISCOVERED"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L2d
            java.lang.String r2 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L34
        L2d:
            r1 = 1
        L2e:
            if (r1 == 0) goto L33
            r0.b(r4)
        L33:
            return
        L34:
            r1 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.instrumentmanager.a.onNewIntent(android.content.Intent):void");
    }

    @Override // com.google.android.wallet.common.pub.d
    public final void a(int i, Bundle bundle) {
        c(i, bundle);
        finish();
    }

    @Override // com.google.android.wallet.common.pub.d
    public final void b(int i, Bundle bundle) {
        c(i, bundle);
    }

    private Fragment i() {
        return d().a(R.id.content_frame);
    }

    private void c(int i, Bundle bundle) {
        switch (i) {
            case 50:
                String string = bundle.getString("com.google.android.wallet.instrumentmanager.INSTRUMENT_ID");
                Intent intent = new Intent();
                intent.putExtra("instrument_id", string);
                setResult(-1, intent);
                return;
            case 51:
            case 52:
                setResult(0);
                return;
            default:
                throw new IllegalStateException("Unexpected InstrumentManager resultCode: " + i);
        }
    }
}
