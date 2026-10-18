package com.google.android.finsky.uninstall;

import android.content.pm.PackageManager;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {
    long e;
    long f;
    long g;
    long h;
    Document i;
    x l;

    /* renamed from: a, reason: collision with root package name */
    boolean f4688a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f4689b = false;
    boolean c = false;
    boolean d = false;
    List<i> j = null;
    Map<String, i> k = null;

    public c(Document document) {
        this.i = document;
    }

    public final boolean a() {
        return this.d && this.c && this.f4689b && this.f4688a;
    }

    final void b() {
        if (a()) {
            this.j = cz.a(this.k.values());
            if (this.l == null) {
                return;
            }
            this.l.m_();
        }
    }

    static /* synthetic */ void a(c cVar, HashSet hashSet, PackageManager packageManager) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            i iVar = cVar.k.get(str);
            try {
                iVar.f4700b = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            } catch (PackageManager.NameNotFoundException e) {
                FinskyLog.e("%s not found in PackageManager", str);
                cVar.k.remove(iVar);
            }
        }
        cVar.c = true;
        cVar.b();
    }
}
