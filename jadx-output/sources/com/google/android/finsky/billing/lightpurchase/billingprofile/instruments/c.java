package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.receivers.FlushLogsReceiver;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public abstract class c extends com.google.android.finsky.billing.lightpurchase.a implements cy {
    private ai k = i.a(f());
    public String p;
    public i q;

    public abstract int f();

    public static void a(Intent intent, String str) {
        intent.putExtra("authAccount", str);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
            return;
        }
        this.p = getIntent().getStringExtra("authAccount");
        if (this.p == null) {
            FinskyLog.e("authAccount argument not set.", new Object[0]);
        }
        this.q = FinskyApp.a().f(this.p);
        if (bundle == null) {
            this.q.a(0L, (cy) this);
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        this.q.a(600, (byte[]) null, this);
        super.onBackPressed();
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        FlushLogsReceiver.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onPause() {
        super.onPause();
        FlushLogsReceiver.a();
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        if (isFinishing() && this.q != null) {
            this.q.b(603, null, this);
        }
        super.onDestroy();
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
        throw new UnsupportedOperationException("Unwanted children.");
    }
}
