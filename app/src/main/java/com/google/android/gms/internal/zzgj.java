package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzg;

@gw
/* loaded from: classes.dex */
public final class zzgj extends zzg<gp> {

    /* renamed from: a, reason: collision with root package name */
    private static final zzgj f6266a = new zzgj();

    final static class zza extends Exception {
        public zza(String str) {
            super(str);
        }
    }

    private zzgj() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    private gm b(Activity activity) {
        try {
            return gn.a(a((Context) activity).a(com.google.android.gms.dynamic.d.a(activity)));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (zzg.zza e2) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    public static gm a(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar")) {
                throw new zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
            }
            if (!intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false)) {
                return f6266a.b(activity);
            }
            com.google.android.gms.ads.internal.util.client.b.a("Using AdOverlay from the client jar.");
            return new com.google.android.gms.ads.internal.purchase.c(activity);
        } catch (zza e) {
            com.google.android.gms.ads.internal.util.client.b.e(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.dynamic.zzg
    public final /* synthetic */ gp a(IBinder iBinder) {
        return gq.a(iBinder);
    }
}
