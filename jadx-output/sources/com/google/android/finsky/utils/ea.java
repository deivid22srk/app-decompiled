package com.google.android.finsky.utils;

import android.content.Context;
import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageInstallObserver;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.finsky.FinskyApp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ea {
    public static void a(Uri uri, long j, String str, ee eeVar, boolean z, String str2) {
        jm.a(new ef(uri, j, str, eeVar, z, str2, false, (byte) 0), new Void[0]);
    }

    public static void a(String str, boolean z) {
        try {
            PackageManager.class.getMethod("deletePackage", String.class, IPackageDeleteObserver.class, Integer.TYPE).invoke(FinskyApp.a().getPackageManager(), str, null, Integer.valueOf(z ? 4 : 0));
        } catch (IllegalAccessException e) {
            FinskyLog.b(e, "Cannot delete packages due to reflection access exception", new Object[0]);
        } catch (NoSuchMethodException e2) {
            FinskyLog.c("Cannot delete packages on this platform", new Object[0]);
        } catch (SecurityException e3) {
            FinskyLog.b(e3, "Cannot delete packages due to security exception", new Object[0]);
        } catch (InvocationTargetException e4) {
            FinskyLog.b(e4, "Cannot delete packages due to reflection invocation exception", new Object[0]);
        }
    }

    public static void a(Context context, Uri uri, ek ekVar, int i) {
        try {
            PackageManager.class.getMethod("installPackage", Uri.class, IPackageInstallObserver.class, Integer.TYPE, String.class).invoke(context.getPackageManager(), uri, new eb(ekVar), Integer.valueOf(i), "com.deivid22srk.store");
        } catch (IllegalAccessException e) {
            FinskyLog.b(e, "Cannot install packages due to reflection access exception", new Object[0]);
        } catch (NoSuchMethodException e2) {
            FinskyLog.c("Cannot install packages on this platform", new Object[0]);
        } catch (SecurityException e3) {
            FinskyLog.b(e3, "Cannot install packages due to security exception", new Object[0]);
        } catch (InvocationTargetException e4) {
            FinskyLog.b(e4, "Cannot install packages due to reflection invocation exception", new Object[0]);
        }
    }

    public static int a(Context context, String str) {
        try {
            return ((Integer) PackageManager.class.getMethod("installExistingPackage", String.class).invoke(context.getPackageManager(), str)).intValue();
        } catch (IllegalAccessException e) {
            FinskyLog.b(e, "Cannot install existing packages due to reflection access exception", new Object[0]);
            return 979;
        } catch (NoSuchMethodException e2) {
            FinskyLog.c("Cannot install existing packages on this platform", new Object[0]);
            return 979;
        } catch (SecurityException e3) {
            FinskyLog.b(e3, "Cannot install existing packages due to security exception", new Object[0]);
            return 979;
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (e4.getCause() instanceof PackageManager.NameNotFoundException) {
                throw ((PackageManager.NameNotFoundException) cause);
            }
            FinskyLog.b(e4, "Cannot install existing packages due to reflection invocation exception", new Object[0]);
            return 979;
        }
    }
}
