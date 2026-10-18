package com.google.android.finsky.uninstall;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Method;
import java.util.Iterator;

/* loaded from: classes.dex */
final class e extends IPackageStatsObserver.Stub {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f4691a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Method f4692b;
    final /* synthetic */ PackageManager c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ c e;
    private Handler f = new Handler(Looper.getMainLooper());

    e(c cVar, Iterator it, Method method, PackageManager packageManager, Runnable runnable) {
        this.e = cVar;
        this.f4691a = it;
        this.f4692b = method;
        this.c = packageManager;
        this.d = runnable;
    }

    @Override // android.content.pm.IPackageStatsObserver
    public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        i iVar = this.e.k.get(packageStats.packageName);
        if (z) {
            i iVar2 = this.e.k.get(packageStats.packageName);
            iVar2.c = packageStats.codeSize + packageStats.dataSize;
            if (Build.VERSION.SDK_INT >= 11 && Environment.isExternalStorageEmulated()) {
                iVar2.c += packageStats.externalObbSize + packageStats.externalDataSize + packageStats.externalMediaSize;
                if (Build.VERSION.SDK_INT >= 14) {
                    iVar2.c += packageStats.externalCodeSize;
                }
            }
        } else {
            iVar.c = -1L;
        }
        if (this.f4691a.hasNext()) {
            try {
                this.f4692b.invoke(this.c, this.f4691a.next(), this);
                return;
            } catch (Exception e) {
                FinskyLog.d("Uninstall Wizard: Exception on subsequent size request", new Object[0]);
                this.f.post(this.d);
                return;
            }
        }
        this.f.post(this.d);
    }
}
