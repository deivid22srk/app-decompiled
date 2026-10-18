package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.zzgj;

/* loaded from: classes.dex */
public class InAppPurchaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private gm f5354a;

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (this.f5354a != null) {
                this.f5354a.a(i, i2, intent);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onActivityResult to in-app purchase manager:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5354a = zzgj.a((Activity) this);
        if (this.f5354a == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try {
            this.f5354a.a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onCreate to in-app purchase manager:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            if (this.f5354a != null) {
                this.f5354a.b();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onDestroy to in-app purchase manager:", e);
        }
        super.onDestroy();
    }
}
