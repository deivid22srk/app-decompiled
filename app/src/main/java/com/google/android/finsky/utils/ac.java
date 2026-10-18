package com.google.android.finsky.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ny;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ac {
    com.google.android.finsky.utils.bpkg.c c;
    public Boolean d;
    public boolean e;
    public boolean f;
    private final String h;
    private com.google.android.finsky.utils.hats.k k;
    private static final int g = com.google.android.finsky.cpkg.d.dR.b().intValue();

    /* renamed from: a, reason: collision with root package name */
    static final ah f4725a = null;

    /* renamed from: b, reason: collision with root package name */
    Map<String, ah> f4726b = new HashMap();
    private Set<String> i = new HashSet();
    private List<com.google.android.finsky.ipkg.a> j = new ArrayList();
    private Map<Pair<String, String>, EnumSet<com.google.android.finsky.activities.ff>> l = new HashMap();

    public ac(Context context, String str) {
        this.h = str;
        this.c = new com.google.android.finsky.utils.bpkg.c(new com.google.android.finsky.utils.bpkg.a(context.getCacheDir(), "unsubmitted_reviews_" + Uri.encode(this.h)));
        new Handler(Looper.getMainLooper()).post(new ad(this));
    }

    public final synchronized ny a(String str, ny nyVar) {
        if (this.f4726b.containsKey(str)) {
            ah ahVar = this.f4726b.get(str);
            if (ahVar == null) {
                nyVar = null;
            } else {
                nyVar = ahVar.f4732a;
            }
        }
        return nyVar;
    }

    public final synchronized void a(String str) {
        this.c.a(str);
        if (this.f4726b.containsKey(str)) {
            this.f4726b.remove(str);
        }
    }

    public final synchronized void a(String str, int i, String str2, String str3, Document document, String str4) {
        ah ahVar = new ah(str, i, str2, str3, document, str4, System.currentTimeMillis());
        this.f4726b.put(str, ahVar);
        com.google.android.finsky.utils.bpkg.c cVar = this.c;
        HashMap hashMap = new HashMap();
        hashMap.put("doc_id", ahVar.f4733b);
        hashMap.put("rating", new StringBuilder().append(ahVar.f4732a.d).toString());
        hashMap.put("title", ahVar.f4732a.g);
        hashMap.put("content", ahVar.f4732a.i);
        hashMap.put("doc_details_url_key", ahVar.c);
        hashMap.put("doc_timestamp", new StringBuilder().append(ahVar.f4732a.q).toString());
        cVar.a(str, hashMap);
    }

    public final synchronized void b(String str) {
        this.f4726b.put(str, f4725a);
        this.c.a(str);
    }

    public static void a(Context context) {
        try {
            File[] listFiles = context.getCacheDir().listFiles();
            if (listFiles != null) {
                long currentTimeMillis = System.currentTimeMillis() - com.google.android.finsky.cpkg.d.dX.b().longValue();
                for (File file : listFiles) {
                    if (file.getName().startsWith("unsubmitted_reviews_") && (file.length() == 0 || file.lastModified() < currentTimeMillis)) {
                        file.delete();
                    }
                }
            }
        } catch (Exception e) {
            FinskyLog.d("Error pruning unsubmitted reviews: %s", e.toString());
        }
    }

    public final void a(String str, String str2, com.google.android.finsky.activities.ff ffVar) {
        Pair<String, String> create = Pair.create(str, str2);
        EnumSet<com.google.android.finsky.activities.ff> enumSet = this.l.get(create);
        if (enumSet == null) {
            this.l.put(create, EnumSet.of(ffVar));
        } else {
            enumSet.add(ffVar);
        }
    }

    public final void b(String str, String str2, com.google.android.finsky.activities.ff ffVar) {
        EnumSet<com.google.android.finsky.activities.ff> enumSet = this.l.get(Pair.create(str, str2));
        if (enumSet != null) {
            enumSet.remove(ffVar);
        }
    }

    public final boolean a() {
        if (this.d == null) {
            this.d = Boolean.valueOf(FinskyApp.a().g.f1961a.B);
        }
        return this.d.booleanValue();
    }

    public final boolean c(String str) {
        return this.i.contains(str);
    }

    public final void d(String str) {
        this.i.add(str);
    }

    public final com.google.android.finsky.ipkg.a a(Document document, String str) {
        com.google.android.finsky.ipkg.a aVar;
        int i = 0;
        while (true) {
            if (i < this.j.size()) {
                aVar = this.j.get(i);
                if (!aVar.f2850a.f1963a.f3890a.equals(document.f1963a.f3890a) || !aVar.f2851b.equals(str)) {
                    i++;
                } else {
                    this.j.remove(i);
                    this.j.add(aVar);
                    break;
                }
            } else {
                aVar = new com.google.android.finsky.ipkg.a(document, str);
                if (this.j.size() >= g) {
                    this.j.remove(0);
                }
                this.j.add(aVar);
            }
        }
        return aVar;
    }

    public final com.google.android.finsky.utils.hats.k b() {
        if (this.k == null) {
            this.k = new com.google.android.finsky.utils.hats.k(this.h);
        }
        return this.k;
    }

    public final boolean c(String str, String str2, com.google.android.finsky.activities.ff ffVar) {
        EnumSet<com.google.android.finsky.activities.ff> enumSet = this.l.get(Pair.create(str, str2));
        return enumSet != null && enumSet.contains(ffVar);
    }
}
