package com.google.android.gms.apkg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.c;
import com.google.android.gms.common.f;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.jy;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a {
    public static f a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.deivid22srk.store", 0);
            try {
                c.b(context);
                f fVar = new f();
                Intent intent = new Intent("com.google.android.gms.checkin.BIND_TO_SERVICE");
                intent.setPackage("com.google.android.gms");
                if (b.a().a(context, intent, fVar, 1)) {
                    return fVar;
                }
                throw new IOException("Connection failure.");
            } catch (GooglePlayServicesNotAvailableException e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    public static String a(Context context, f fVar) {
        try {
            try {
                return jy.a(fVar.a()).a();
            } catch (RemoteException e) {
                Log.i("CheckinServiceClient", "GMS remote exception: ", e);
                throw new IOException("Remote exception.");
            } catch (InterruptedException e2) {
                throw new IOException("Interrupted exception.");
            }
        } finally {
            try {
                b.a().a(context, fVar);
            } catch (IllegalArgumentException e3) {
                Log.i("CheckinServiceClient", "unbind failed: ", e3);
            }
        }
    }
}
