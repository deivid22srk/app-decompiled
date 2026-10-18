package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.gh;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class c extends gn implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    e f5339a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f5340b;
    private Context c;
    private gh d;
    private b e;
    private d f;
    private h g;
    private i h;
    private String i = null;

    public c(Activity activity) {
        this.f5340b = activity;
        this.f5339a = e.a(this.f5340b.getApplicationContext());
    }

    @Override // com.google.android.gms.internal.gm
    public final void a() {
        GInAppPurchaseManagerInfoParcel a2 = GInAppPurchaseManagerInfoParcel.a(this.f5340b.getIntent());
        this.g = a2.e;
        this.h = a2.f5336b;
        this.d = a2.c;
        this.e = new b(this.f5340b.getApplicationContext());
        this.c = a2.d;
        if (this.f5340b.getResources().getConfiguration().orientation == 2) {
            this.f5340b.setRequestedOrientation(com.google.android.gms.ads.internal.d.e().a());
        } else {
            this.f5340b.setRequestedOrientation(com.google.android.gms.ads.internal.d.e().b());
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.f5340b.bindService(intent, this, 1);
    }

    @Override // com.google.android.gms.internal.gm
    public final void b() {
        this.f5340b.unbindService(this);
        this.e.f5337a = null;
    }

    @Override // com.google.android.gms.internal.gm
    public final void a(int i, int i2, Intent intent) {
        int i3;
        boolean z;
        boolean z2;
        if (i == 1001) {
            try {
                com.google.android.gms.ads.internal.d.k();
                if (intent == null) {
                    i3 = 5;
                } else {
                    Object obj = intent.getExtras().get("RESPONSE_CODE");
                    if (obj == null) {
                        com.google.android.gms.ads.internal.util.client.b.e("Intent with no response code, assuming OK (known issue)");
                        i3 = 0;
                    } else if (obj instanceof Integer) {
                        i3 = ((Integer) obj).intValue();
                    } else if (obj instanceof Long) {
                        i3 = (int) ((Long) obj).longValue();
                    } else {
                        com.google.android.gms.ads.internal.util.client.b.e("Unexpected type for intent response code. " + obj.getClass().getName());
                        i3 = 5;
                    }
                }
                if (i2 == -1) {
                    com.google.android.gms.ads.internal.d.k();
                    if (i3 == 0) {
                        i iVar = this.h;
                        String str = this.i;
                        if (str == null || intent == null) {
                            z = false;
                        } else {
                            com.google.android.gms.ads.internal.d.k();
                            String stringExtra = intent == null ? null : intent.getStringExtra("INAPP_PURCHASE_DATA");
                            com.google.android.gms.ads.internal.d.k();
                            String stringExtra2 = intent == null ? null : intent.getStringExtra("INAPP_DATA_SIGNATURE");
                            if (stringExtra == null || stringExtra2 == null) {
                                z = false;
                            } else {
                                com.google.android.gms.ads.internal.d.k();
                                if (str.equals(g.a(stringExtra))) {
                                    if (iVar.f5346a != null) {
                                        String str2 = iVar.f5346a;
                                        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(stringExtra2)) {
                                            com.google.android.gms.ads.internal.util.client.b.b("Purchase verification failed: missing data.");
                                            z2 = false;
                                        } else {
                                            z2 = j.a(j.a(str2), stringExtra, stringExtra2);
                                        }
                                        if (!z2) {
                                            com.google.android.gms.ads.internal.util.client.b.e("Fail to verify signature.");
                                            z = false;
                                        }
                                    }
                                    z = true;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.b.e("Developer payload not match.");
                                    z = false;
                                }
                            }
                        }
                        if (z) {
                        }
                        this.d.b(i3);
                        this.f5340b.finish();
                        this.d.a();
                    }
                }
                this.f5339a.a(this.f);
                this.d.b(i3);
                this.f5340b.finish();
                this.d.a();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.b.e("Fail to process purchase result.");
                this.f5340b.finish();
            } finally {
                this.i = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.ads.internal.util.client.b.c("In-app billing service disconnected.");
        this.e.f5337a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd A[Catch: all -> 0x0194, TryCatch #1 {, blocks: (B:34:0x0161, B:36:0x0167, B:42:0x018f, B:43:0x0192, B:56:0x01c5, B:60:0x01cd, B:61:0x01d0), top: B:33:0x0161, outer: #4 }] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r17, android.os.IBinder r18) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.purchase.c.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
