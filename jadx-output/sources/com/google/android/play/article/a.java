package com.google.android.play.article;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6798a = a.class.getSimpleName();
    private final android.support.v4.h.g<String, String> c;
    private final h f;
    private final Map<String, Set<i>> d = new HashMap();
    private final Set<String> e = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6799b = true;

    public a(f fVar) {
        this.f = fVar.a();
        this.c = !this.f6799b ? null : new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Set<i> set = this.d.get(str);
        if (set != null) {
            Iterator<i> it = set.iterator();
            while (it.hasNext()) {
                it.next().a(str2);
            }
            this.d.remove(str);
        }
    }

    private static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final void a(String str, i iVar) {
        if (b()) {
            if (iVar != null) {
                Set<i> set = this.d.get(str);
                if (set == null) {
                    set = new HashSet<>();
                    this.d.put(str, set);
                }
                set.add(iVar);
            }
            String a2 = this.f6799b ? this.c.a((android.support.v4.h.g<String, String>) str) : null;
            if (a2 != null) {
                Log.d(f6798a, "Returning post from cache. Post ID: " + str);
                a(str, a2);
                return;
            } else {
                if (!this.e.contains(str)) {
                    Log.d(f6798a, "Fetching post. Post ID: " + str);
                    this.e.add(str);
                    this.f.a(Uri.parse("https://play.google.com/newsstand/web/api/html/").buildUpon().appendEncodedPath(str).build(), new c(this, str));
                    return;
                }
                Log.d(f6798a, "Ignoring post load; request in flight. Post ID: " + str);
                return;
            }
        }
        throw new IllegalStateException("Must be called from the main thread");
    }

    static /* synthetic */ void a(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static /* synthetic */ void a(a aVar, String str) {
        Set<i> set = aVar.d.get(str);
        if (set == null) {
            return;
        }
        Iterator<i> it = set.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        aVar.d.remove(str);
    }
}
