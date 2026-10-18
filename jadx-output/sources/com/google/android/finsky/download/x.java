package com.google.android.finsky.download;

import android.content.Context;
import android.content.pm.IPackageDataObserver;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ec;
import com.google.android.finsky.utils.jm;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements aj, w {

    /* renamed from: a, reason: collision with root package name */
    LinkedHashMap<String, b> f2739a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<String, b> f2740b;
    final int c;
    final g d;
    s e;
    LinkedList<aj> f;
    Context g;
    private Uri h;
    private int i;

    private x(Context context, g gVar) {
        this.h = null;
        this.i = -1;
        this.f2739a = new LinkedHashMap<>();
        this.f2740b = new HashMap<>();
        this.c = 1;
        this.d = gVar;
        this.g = context;
        this.f = new LinkedList<>();
        this.f.add(this);
    }

    public x(Context context, g gVar, byte b2) {
        this(context, gVar);
    }

    @Override // com.google.android.finsky.download.w
    public final g b() {
        return this.d;
    }

    @Override // com.google.android.finsky.download.w
    public final void e(b bVar) {
        b bVar2;
        jm.a();
        if (bVar.n() != 0) {
            FinskyLog.e("Added download %s (url=%s) while in state %d", bVar, bVar.c(), Integer.valueOf(bVar.n()));
        }
        String c = bVar.c();
        if (this.f2740b.containsKey(c)) {
            bVar2 = this.f2740b.get(c);
        } else if (this.f2739a.containsKey(c)) {
            bVar2 = this.f2739a.get(c);
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            FinskyLog.e("Added download %s (url=%s) while existing found %s (url=%s)", bVar, bVar.c(), bVar2, bVar2.c());
        }
        FinskyLog.a("Download %s added to DownloadQueue", bVar);
        this.f2739a.put(bVar.c(), bVar);
        if (this.e == null) {
            this.e = new s(this);
        }
        b(bVar, 1);
        c();
    }

    @Override // com.google.android.finsky.download.w
    public final void f(b bVar) {
        jm.a();
        String c = bVar.c();
        FinskyLog.a("Download queue recovering download %s.", bVar);
        b(bVar, 2);
        this.f2740b.put(c, bVar);
        if (this.e == null) {
            this.e = new s(this);
        }
    }

    @Override // com.google.android.finsky.download.w
    public final b a(String str, String str2) {
        jm.a();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("empty packageName");
        }
        for (b bVar : this.f2739a.values()) {
            if (str.equals(bVar.a())) {
                String b2 = bVar.b();
                if (str2 == null && b2 == null) {
                    return bVar;
                }
                if (str2 != null && str2.equals(b2)) {
                    return bVar;
                }
            }
        }
        for (b bVar2 : this.f2740b.values()) {
            if (str.equals(bVar2.a())) {
                String b3 = bVar2.b();
                if (str2 == null && b3 == null) {
                    return bVar2;
                }
                if (str2 != null && str2.equals(b3)) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    private void a(int i, b bVar) {
        Runnable adVar;
        r l = bVar == null ? null : bVar.l();
        int o = bVar == null ? -1 : bVar.o();
        switch (i) {
            case 0:
                adVar = new y(this, i, bVar);
                break;
            case 1:
                adVar = new z(this, i, bVar);
                break;
            case 2:
                adVar = new aa(this, i, bVar, l);
                break;
            case 3:
                adVar = new ab(this, i, bVar);
                break;
            case 4:
                adVar = new ad(this, i, bVar);
                break;
            case 5:
                adVar = new ac(this, i, bVar, o);
                break;
            default:
                throw new IllegalStateException("Bad listener type.");
        }
        new Handler(Looper.getMainLooper()).post(adVar);
    }

    @Override // com.google.android.finsky.download.w
    public final void a(aj ajVar) {
        jm.a();
        this.f.add(ajVar);
    }

    @Override // com.google.android.finsky.download.w
    public final void b(aj ajVar) {
        jm.a();
        this.f.remove(ajVar);
    }

    @Override // com.google.android.finsky.download.w
    public final b a(Uri uri) {
        jm.a();
        if (TextUtils.isEmpty(uri != null ? uri.toString() : null)) {
            return null;
        }
        for (b bVar : this.f2740b.values()) {
            if (uri.equals(bVar.k())) {
                return bVar;
            }
        }
        return null;
    }

    private void i(b bVar) {
        FinskyLog.a("Download %s removed from DownloadQueue", bVar);
        String c = bVar.c();
        if (this.f2739a.containsKey(c)) {
            this.f2739a.remove(c);
        } else {
            this.f2740b.remove(bVar.c());
            c();
        }
    }

    @Override // com.google.android.finsky.download.w
    public final void g(b bVar) {
        jm.a();
        if (bVar != null && !bVar.m()) {
            if (bVar.n() == 2) {
                this.d.a(bVar.k());
            }
            b(bVar, 4);
        }
    }

    @Override // com.google.android.finsky.download.w
    public final void h(b bVar) {
        FinskyLog.a("%s: onNotificationClicked", bVar);
        a(0, bVar);
    }

    @Override // com.google.android.finsky.download.w
    public final void b(b bVar, r rVar) {
        if (!rVar.equals(bVar.l())) {
            bVar.a(rVar);
            if ((rVar.d == this.i && this.h != null && this.h.equals(bVar.k())) ? false : true) {
                FinskyLog.a("%s: onProgress %s.", bVar, rVar.toString());
                this.h = bVar.k();
                this.i = rVar.d;
            }
            a(2, bVar);
        }
    }

    @Override // com.google.android.finsky.download.w
    public final void b(b bVar, int i) {
        bVar.a(i);
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                a(4, bVar);
                break;
            case 3:
                a(1, bVar);
                break;
            case 4:
                a(3, bVar);
                break;
            case 5:
                a(5, bVar);
                break;
            default:
                FinskyLog.e("enum %d", Integer.valueOf(i));
                break;
        }
    }

    private void c() {
        byte b2 = 0;
        if (this.f2740b.size() < this.c) {
            long j = 0;
            Iterator<String> it = this.f2739a.keySet().iterator();
            while (true) {
                long j2 = j;
                if (it.hasNext()) {
                    j = Math.max(this.f2739a.get(it.next()).e(), j2);
                } else {
                    try {
                        PackageManager.class.getMethod("freeStorageAndNotify", Long.TYPE, IPackageDataObserver.class).invoke(this.g.getPackageManager(), Long.valueOf(j2), new ec(new ah(this, b2)));
                        return;
                    } catch (IllegalAccessException e) {
                        FinskyLog.b(e, "Cannot freeStorageAndNotify due to reflection access exception", new Object[0]);
                        return;
                    } catch (NoSuchMethodException e2) {
                        FinskyLog.c("Cannot freeStorageAndNotify on this platform", new Object[0]);
                        return;
                    } catch (SecurityException e3) {
                        FinskyLog.b(e3, "Cannot freeStorageAndNotify due to security exception", new Object[0]);
                        return;
                    } catch (InvocationTargetException e4) {
                        FinskyLog.b(e4, "Cannot freeStorageAndNotify due to reflection invocation exception", new Object[0]);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void b(b bVar) {
        FinskyLog.a("%s: onComplete", bVar);
        i(bVar);
    }

    @Override // com.google.android.finsky.download.aj
    public final void d(b bVar) {
        FinskyLog.a("%s: onCancel", bVar);
        i(bVar);
        j(bVar);
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(b bVar, int i) {
        FinskyLog.d("%s: onError %d.", bVar, Integer.valueOf(i));
        i(bVar);
        j(bVar);
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(b bVar) {
        FinskyLog.a("%s: onStart", bVar);
    }

    private void j(b bVar) {
        Uri k = bVar.k();
        if (k != null) {
            this.d.a(k);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void c(b bVar) {
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(b bVar, r rVar) {
    }

    @Override // com.google.android.finsky.download.w
    public final List<r> a() {
        return this.d.a((Uri) null, (h) null);
    }

    @Override // com.google.android.finsky.download.w
    public final void b(Uri uri) {
        this.d.a(uri);
    }
}
