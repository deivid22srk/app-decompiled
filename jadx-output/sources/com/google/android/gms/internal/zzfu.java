package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.dynamic.zzg;

@gw
/* loaded from: classes.dex */
public final class zzfu extends zzg<gd> {

    /* renamed from: a, reason: collision with root package name */
    private static final zzfu f6265a = new zzfu();

    final class zza extends Exception {
        public zza(String str) {
            super(str);
        }
    }

    private zzfu() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    private ga b(Activity activity) {
        try {
            return gb.a(a((Context) activity).a(com.google.android.gms.dynamic.d.a(activity)));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote AdOverlay.", e);
            return null;
        } catch (zzg.zza e2) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    public static ga a(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
                throw new zza("Ad overlay requires the useClientJar flag in intent extras.");
            }
            if (!intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false)) {
                return f6265a.b(activity);
            }
            com.google.android.gms.ads.internal.util.client.b.a("Using AdOverlay from the client jar.");
            return new zzd(activity);
        } catch (zza e) {
            com.google.android.gms.ads.internal.util.client.b.e(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.dynamic.zzg
    public final /* synthetic */ gd a(IBinder iBinder) {
        return ge.a(iBinder);
    }
}
