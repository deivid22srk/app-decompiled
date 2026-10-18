package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.zzg;

@gw
/* loaded from: classes.dex */
public final class jj extends zzg<jq> {

    /* renamed from: a, reason: collision with root package name */
    private static final jj f6088a = new jj();

    private jj() {
        super("com.google.android.gms.ads.measurement.GmpMeasurementReporterCreatorImpl");
    }

    public static jk b(Context context) {
        com.google.android.gms.common.b.a();
        int a2 = com.google.android.gms.common.b.a(context);
        if (a2 == 2) {
            try {
                if (com.google.android.gms.common.cpkg.d.a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64).versionCode) < 8200000) {
                    throw new GooglePlayServicesNotAvailableException(2);
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new GooglePlayServicesNotAvailableException(1);
            }
        }
        if (a2 != 0 && a2 != 2) {
            throw new GooglePlayServicesNotAvailableException(1);
        }
        jk c = f6088a.c(context);
        if (c == null) {
            throw new GooglePlayServicesNotAvailableException(8);
        }
        return c;
    }

    private jk c(Context context) {
        try {
            return jl.a(a(context).a(com.google.android.gms.dynamic.d.a(context)));
        } catch (RemoteException | zzg.zza e) {
            com.google.android.gms.ads.internal.util.client.b.a("Could not create remote GmpMeasurementReporter.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.dynamic.zzg
    public final /* synthetic */ jq a(IBinder iBinder) {
        return jr.a(iBinder);
    }
}
