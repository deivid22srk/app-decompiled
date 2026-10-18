package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.activities.AccessRestrictedActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.layout.play.da;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.receivers.FlushLogsReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.hi;
import com.google.android.finsky.utils.ic;

/* loaded from: classes.dex */
public class PurchaseActivity extends android.support.v7.a.ae implements ae, da {
    private static final boolean m;
    protected Account k;
    protected PurchaseParams l;
    private final Rect n = new Rect();
    private com.google.android.finsky.a.i o;
    private byte[] p;
    private Bundle q;

    static {
        m = Build.VERSION.SDK_INT < 11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
            return;
        }
        setContentView(getLayoutInflater().inflate(R.layout.light_purchase_activity, (ViewGroup) null));
        Intent intent = getIntent();
        this.l = (PurchaseParams) intent.getParcelableExtra("PurchaseActivity.params");
        this.k = (Account) intent.getParcelableExtra("PurchaseActivity.account");
        this.o = FinskyApp.a().c(this.k);
        this.p = intent.getByteArrayExtra("PurchaseActivity.serverLogsCookie");
        this.q = intent.getBundleExtra("PurchaseActivity.appDownloadSizeWarningArgs");
        if (!ic.a(this)) {
            AccessRestrictedActivity.c(this);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        hi.a(new ab(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
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

    protected void g() {
        setResult(0);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        this.o.a(600, (byte[]) null, this);
        a(1, "back press");
    }

    private void a(int i, String str) {
        boolean z;
        PurchaseFragment k = k();
        if (k != null) {
            if (k.ai instanceof com.google.android.finsky.billing.lightpurchase.c.ad) {
                z = false;
            } else {
                if (k.f2277a != null) {
                    if (k.f2277a.as == 7 || k.f2277a.as == 12) {
                        if (i != 1) {
                            z = false;
                        }
                    } else if (k.f2277a.as == 1 && k.f2277a.at == 2) {
                        z = false;
                    } else if (k.f2277a.as == 5 && i == 1 && k.f2277a.ar != null) {
                        k.f2277a.a((GiftEmailParams) null);
                        z = false;
                    }
                }
                z = true;
            }
            if (!z) {
                FinskyLog.a("PurchaseFragment not dismissable by %s, ignore.", str);
                return;
            }
        }
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PurchaseFragment k() {
        return (PurchaseFragment) d().a(R.id.content_frame);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (m) {
            return super.dispatchTouchEvent(motionEvent);
        }
        getWindow().getDecorView().getHitRect(this.n);
        if (motionEvent.getAction() == 0 && !this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.o.a(601, (byte[]) null, this);
            a(2, "click outside");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        PurchaseFragment k = k();
        if (k != null) {
            a(k);
            this.o.b(603, null, this);
        } else {
            FinskyLog.a("Purchase fragment null.", new Object[0]);
        }
        super.finish();
    }

    public static boolean a(Intent intent) {
        return intent.getBooleanExtra("PurchaseActivity.postSuccessItemOpened", false);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.ae
    public final void j() {
        finish();
    }

    public static Intent a(Account account, PurchaseParams purchaseParams, byte[] bArr, Bundle bundle) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) PurchaseActivity.class);
        intent.putExtra("PurchaseActivity.account", account);
        intent.putExtra("PurchaseActivity.params", purchaseParams);
        intent.putExtra("PurchaseActivity.appDownloadSizeWarningArgs", bundle);
        intent.putExtra("PurchaseActivity.serverLogsCookie", bArr);
        return intent;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        byte[] bArr;
        com.google.android.finsky.a.ai a2 = com.google.android.finsky.a.i.a(700);
        aj ajVar = new aj();
        ajVar.f1456b = this.l.f2282b;
        ajVar.c = true;
        ajVar.d = this.l.d;
        ajVar.e = true;
        a2.e = ajVar;
        PurchaseFragment k = k();
        if (k == null) {
            bArr = this.p;
        } else if (k.f2277a == null || k.f2277a.f2382b == null) {
            bArr = k.c;
        } else {
            bArr = k.f2277a.f2382b;
        }
        com.google.android.finsky.a.i.a(a2, bArr);
        return a2;
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
        FinskyLog.e("Not using impression id's.", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void i() {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    protected void a(PurchaseFragment purchaseFragment) {
        if (purchaseFragment.f) {
            Intent intent = new Intent();
            intent.putExtra("PurchaseActivity.postSuccessItemOpened", purchaseFragment.h);
            setResult(-1, intent);
            dp dpVar = this.l.f2281a;
            if (dpVar.c == 11) {
                com.google.android.finsky.billing.iab.m.a((Activity) this, as.c(dpVar.f3740a));
                return;
            }
            return;
        }
        if (!(purchaseFragment.e != null)) {
            return;
        }
        PurchaseFragment.PurchaseError purchaseError = purchaseFragment.e;
        FinskyLog.d("Purchase failed: %d / %d", Integer.valueOf(purchaseError != null ? purchaseError.f2279a : -1), Integer.valueOf(purchaseError != null ? purchaseError.f2280b : -1));
        setResult(0);
    }
}
