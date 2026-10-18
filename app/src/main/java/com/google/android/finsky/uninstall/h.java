package com.google.android.finsky.uninstall;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.bpkg.y;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h extends AsyncTask<Void, Void, Map<String, List<String>>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f4697a;

    /* renamed from: b, reason: collision with root package name */
    private PackageManager f4698b;
    private com.google.android.finsky.bpkg.a c = FinskyApp.a().s;
    private com.google.android.finsky.gpkg.h d = FinskyApp.a().p;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Map<String, List<String>> map) {
        Method method;
        e eVar;
        Map<String, List<String>> map2 = map;
        if (this.f4697a.k == null) {
            this.f4697a.k = new HashMap();
        }
        Iterator<List<String>> it = map2.values().iterator();
        while (it.hasNext()) {
            com.google.android.finsky.bpkg.l.b(it.next());
        }
        HashSet hashSet = new HashSet();
        Iterator<List<String>> it2 = map2.values().iterator();
        while (it2.hasNext()) {
            for (String str : it2.next()) {
                y a2 = this.c.f2061b.a(str);
                if (a2 != null && !a2.f && !a2.d && !hashSet.contains(str)) {
                    hashSet.add(str);
                    this.f4697a.k.put(str, new i(str));
                }
            }
        }
        c cVar = this.f4697a;
        PackageManager packageManager = this.f4698b;
        d dVar = new d(cVar);
        Iterator it3 = hashSet.iterator();
        try {
            method = packageManager.getClass().getMethod("getPackageSizeInfo", String.class, IPackageStatsObserver.class);
            eVar = new e(cVar, it3, method, packageManager, dVar);
        } catch (NoSuchMethodException e) {
            FinskyLog.d("Uninstall Wizard hidden API not found, can't request size info", new Object[0]);
            dVar.run();
        }
        if (it3.hasNext()) {
            try {
                method.invoke(packageManager, it3.next(), eVar);
            } catch (Exception e2) {
                FinskyLog.d("Uninstall Wizard: Exception on first size request", new Object[0]);
            }
            c.a(this.f4697a, hashSet, this.f4698b);
        }
        dVar.run();
        c.a(this.f4697a, hashSet, this.f4698b);
    }

    public h(c cVar, PackageManager packageManager) {
        this.f4697a = cVar;
        this.f4698b = packageManager;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Map<String, List<String>> doInBackground(Void[] voidArr) {
        return this.c.a(this.d, false);
    }
}
