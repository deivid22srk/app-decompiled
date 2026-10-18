package com.google.android.finsky.download.inlineappinstaller;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ap;
import android.support.v7.a.ae;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.s;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.layout.play.da;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.cr;

/* loaded from: classes.dex */
public class InlineConsumptionAppInstallerActivity extends ae implements b, da {
    private static final boolean k;
    private final Rect l = new Rect();
    private Account m;
    private i n;
    private gx o;
    private boolean p;

    static {
        k = Build.VERSION.SDK_INT >= 11;
    }

    public static Intent a(Account account, gx gxVar) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) InlineConsumptionAppInstallerActivity.class);
        intent.putExtra("account", account);
        intent.putExtra("mediaDoc", ParcelableProto.a(gxVar));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(R.layout.light_purchase_activity, (ViewGroup) null));
        Intent intent = getIntent();
        this.m = (Account) intent.getParcelableExtra("account");
        this.n = FinskyApp.a().c(this.m);
        this.o = (gx) ParcelableProto.a(intent, "mediaDoc");
        p pVar = (p) ParcelableProto.a(intent, "successInfo");
        if (bundle == null) {
            this.n.a(0L, (cy) this);
            ap a2 = d().a();
            a2.a(R.id.content_frame, a.a(this.m, this.o, pVar));
            a2.b();
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        this.n.a(600, (byte[]) null, this);
        g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (k) {
            getWindow().getDecorView().getHitRect(this.l);
            if (motionEvent.getAction() == 0 && !this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.n.a(601, (byte[]) null, this);
                g();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.google.android.finsky.download.inlineappinstaller.b
    public final void b(boolean z) {
        this.p = z;
        if (this.p) {
            com.google.android.finsky.navigationmanager.a.a(this, this.m, new Document(this.o), d(), null, 2, null);
        }
        finish();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return i.a(5100);
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

    private void g() {
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        a aVar = (a) d().a(R.id.content_frame);
        if (aVar != null) {
            if (this.p) {
                setResult(-1);
            } else {
                if (aVar.c) {
                    startActivity(cr.a(this, s.a(cr.a(this.o.g))));
                }
                setResult(0);
            }
            this.n.b(603, null, this);
        }
        super.finish();
    }
}
