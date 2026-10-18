package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class jn<T> implements Comparable<jn<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final ny f6090a;

    /* renamed from: b, reason: collision with root package name */
    private long f6091b;
    final int c;
    final String d;
    final int e;
    final jv f;
    Integer g;
    jt h;
    boolean i;
    boolean j;
    boolean k;
    mv l;
    bg m;

    protected static zzr a(zzr zzrVar) {
        return zzrVar;
    }

    public static String b() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    protected abstract ju<T> a(gy gyVar);

    public Map<String, String> a() {
        return Collections.emptyMap();
    }

    protected abstract void a(T t);

    public final void a(String str) {
        if (ny.f6192a) {
            this.f6090a.a(str, Thread.currentThread().getId());
        } else if (this.f6091b == 0) {
            this.f6091b = SystemClock.elapsedRealtime();
        }
    }

    public final int c() {
        return this.l.a();
    }

    public jn(String str, jv jvVar) {
        Uri parse;
        String host;
        this.f6090a = ny.f6192a ? new ny() : null;
        this.i = true;
        this.j = false;
        this.k = false;
        this.f6091b = 0L;
        this.m = null;
        this.c = 0;
        this.d = str;
        this.f = jvVar;
        this.l = new dk();
        this.e = (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) ? 0 : host.hashCode();
    }

    final void b(String str) {
        if (this.h != null) {
            jt jtVar = this.h;
            synchronized (jtVar.f6098b) {
                jtVar.f6098b.remove(this);
            }
            synchronized (jtVar.d) {
                Iterator<Object> it = jtVar.d.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (this.i) {
                synchronized (jtVar.f6097a) {
                    String str2 = this.d;
                    Queue<jn<?>> remove = jtVar.f6097a.remove(str2);
                    if (remove != null) {
                        if (nx.f6191b) {
                            nx.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), str2);
                        }
                        jtVar.c.addAll(remove);
                    }
                }
            }
        }
        if (!ny.f6192a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6091b;
            if (elapsedRealtime >= 3000) {
                nx.b("%d ms: %s", Long.valueOf(elapsedRealtime), toString());
                return;
            }
            return;
        }
        long id = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new jo(this, str, id));
        } else {
            this.f6090a.a(str, id);
            this.f6090a.a(toString());
        }
    }

    public String toString() {
        return (this.j ? "[X] " : "[ ] ") + this.d + " " + ("0x" + Integer.toHexString(this.e)) + " " + jp.NORMAL + " " + this.g;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        jn jnVar = (jn) obj;
        jp jpVar = jp.NORMAL;
        jp jpVar2 = jp.NORMAL;
        return jpVar == jpVar2 ? this.g.intValue() - jnVar.g.intValue() : jpVar2.ordinal() - jpVar.ordinal();
    }
}
