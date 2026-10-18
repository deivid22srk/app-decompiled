package com.google.android.finsky.wear;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class k extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    List<l> f5132a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    List<Uri> f5133b = new ArrayList();
    final /* synthetic */ Runnable c;
    final /* synthetic */ h d;

    k(h hVar, Runnable runnable) {
        this.d = hVar;
        this.c = runnable;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r16) {
        l lVar;
        List<l> list = this.f5132a;
        List<Uri> list2 = this.f5133b;
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (TextUtils.isEmpty(next.f5135b) || TextUtils.isEmpty(next.c) || TextUtils.isEmpty(next.d) || TextUtils.isEmpty(next.e) || next.g == null) {
                FinskyLog.c("Discarding malformed %s", next.f5134a);
                next.a(list2);
                it.remove();
            }
        }
        h hVar = this.d;
        List<l> list3 = this.f5132a;
        for (String str : d.f()) {
            com.google.android.finsky.bpkg.a a2 = hVar.f5127a.a(str);
            for (com.google.android.finsky.bpkg.t tVar : a2.f2060a.a()) {
                if (tVar.g == 90) {
                    com.google.android.finsky.bpkg.b a3 = a2.a(tVar.f2130a);
                    String str2 = tVar.f2130a;
                    String str3 = tVar.v;
                    int size = list3.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            lVar = list3.get(i);
                            if (str.equals(lVar.f5135b) && str2.equals(lVar.c) && str3.equals(lVar.d)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            lVar = null;
                            break;
                        }
                    }
                    if (lVar != null) {
                        lVar.k = a3;
                    } else {
                        h.a(str, a3, 990, null);
                        hVar.a(a3);
                    }
                }
            }
        }
        int size2 = this.f5132a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            l lVar2 = this.f5132a.get(i2);
            if (lVar2.k == null) {
                lVar2.a(this.f5133b);
            } else if (lVar2.h == null || lVar2.i == -601) {
                FinskyLog.a("Retain pending install for %s (%s)", lVar2.c, lVar2.f5135b);
            } else if (lVar2.i == 0) {
                h.a(lVar2.f5135b, lVar2.k, 0, null);
                this.d.a(lVar2.k);
                lVar2.a(this.f5133b);
            } else {
                h.a(lVar2.f5135b, lVar2.k, lVar2.i, lVar2.j);
                this.d.a(lVar2.k);
                lVar2.a(this.f5133b);
            }
        }
        int size3 = this.f5133b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Uri uri = this.f5133b.get(i3);
            FinskyLog.a("Deleting stale URI %s", uri);
            com.google.android.gms.wearable.aa.f6462a.c(this.d.e, uri);
        }
        this.c.run();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        boolean z;
        boolean z2;
        com.google.android.gms.common.api.m mVar = this.d.e;
        List<l> list = this.f5132a;
        com.google.android.gms.wearable.n a2 = com.google.android.gms.wearable.aa.f6462a.a(mVar, bi.d, 1).a();
        Status status = a2.f6632b;
        if (status.a()) {
            int c = a2.c();
            for (int i = 0; i < c; i++) {
                list.add(new l(a2.a(i)));
            }
        } else {
            FinskyLog.c("Error %d getting requests. (%s)", Integer.valueOf(status.g), status.h);
        }
        a2.a();
        com.google.android.gms.common.api.m mVar2 = this.d.e;
        List<l> list2 = this.f5132a;
        List<Uri> list3 = this.f5133b;
        com.google.android.gms.wearable.n a3 = com.google.android.gms.wearable.aa.f6462a.a(mVar2, bi.c, 1).a();
        Status status2 = a3.f6632b;
        if (status2.a()) {
            int c2 = a3.c();
            for (int i2 = 0; i2 < c2; i2++) {
                Uri b2 = a3.a(i2).b();
                List<String> pathSegments = b2.getPathSegments();
                if (pathSegments.size() >= 3) {
                    String str = pathSegments.get(2);
                    int size = list2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        l lVar = list2.get(i3);
                        if (str.equals(lVar.e)) {
                            lVar.g = b2;
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                    list3.add(b2);
                }
            }
        } else {
            FinskyLog.c("Error %d getting assets. (%s)", Integer.valueOf(status2.g), status2.h);
        }
        a3.a();
        com.google.android.gms.common.api.m mVar3 = this.d.e;
        List<l> list4 = this.f5132a;
        List<Uri> list5 = this.f5133b;
        com.google.android.gms.wearable.n a4 = com.google.android.gms.wearable.aa.f6462a.a(mVar3, bi.e, 1).a();
        Status status3 = a4.f6632b;
        if (status3.a()) {
            int c3 = a4.c();
            for (int i4 = 0; i4 < c3; i4++) {
                com.google.android.gms.wearable.l a5 = a4.a(i4);
                Uri b3 = a5.b();
                List<String> pathSegments2 = b3.getPathSegments();
                if (pathSegments2.size() >= 2) {
                    String host = b3.getHost();
                    String str2 = pathSegments2.get(1);
                    int size2 = list4.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        l lVar2 = list4.get(i5);
                        if (str2.equals(lVar2.d)) {
                            com.google.android.gms.wearable.o a6 = com.google.android.gms.wearable.o.a(a5.c());
                            int d = a6.d("status");
                            String f = a6.f("statusDesc");
                            if (d != -604 || host.equals(lVar2.f5135b)) {
                                lVar2.h = b3;
                                lVar2.i = d;
                                lVar2.j = f;
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    list5.add(b3);
                }
            }
        } else {
            FinskyLog.c("Error %d getting responses. (%s)", Integer.valueOf(status3.g), status3.h);
        }
        a4.a();
        return null;
    }
}
