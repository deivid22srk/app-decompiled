package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public abstract class l<T> implements Comparable<l<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final int f1245a;

    /* renamed from: b, reason: collision with root package name */
    final int f1246b;
    Integer c;
    o d;
    public boolean e;
    boolean f;
    public v g;
    public b h;
    public Object i;
    private final x j;
    private final String k;
    private final s l;
    private boolean m;

    public abstract r<T> a(k kVar);

    public abstract void a(T t);

    public l(int i, String str, s sVar) {
        Uri parse;
        String host;
        this.j = x.f1259a ? new x() : null;
        this.e = true;
        this.m = false;
        this.f = false;
        this.h = null;
        this.f1245a = i;
        this.k = str;
        this.l = sVar;
        this.g = new e();
        this.f1246b = (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) ? 0 : host.hashCode();
    }

    public final void a(String str) {
        if (x.f1259a) {
            this.j.a(str, Thread.currentThread().getId());
        }
    }

    final void b(String str) {
        if (this.d != null) {
            o oVar = this.d;
            synchronized (oVar.c) {
                oVar.c.remove(this);
            }
            synchronized (oVar.e) {
                Iterator<Object> it = oVar.e.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (this.e) {
                synchronized (oVar.f1252b) {
                    String c = c();
                    Queue<l<?>> remove = oVar.f1252b.remove(c);
                    if (remove != null) {
                        if (w.f1258b) {
                            w.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), c);
                        }
                        oVar.d.addAll(remove);
                    }
                }
            }
        }
        if (x.f1259a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new m(this, str, id));
            } else {
                this.j.a(str, id);
                this.j.a(toString());
            }
        }
    }

    public final int a() {
        if (this.c == null) {
            throw new IllegalStateException("getSequence called before setSequence");
        }
        return this.c.intValue();
    }

    public String b() {
        return this.k;
    }

    public String c() {
        return b();
    }

    public void d() {
        this.m = true;
    }

    public boolean e() {
        return this.m;
    }

    public Map<String, String> f() {
        return Collections.emptyMap();
    }

    @Deprecated
    public String g() {
        return j();
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public byte[] k() {
        Map<String, String> i = i();
        if (i == null || i.size() <= 0) {
            return null;
        }
        return a(i, Keyczar.DEFAULT_ENCODING);
    }

    private static byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    public n l() {
        return n.NORMAL;
    }

    public final int m() {
        return this.g.a();
    }

    public VolleyError a(VolleyError volleyError) {
        return volleyError;
    }

    public void b(VolleyError volleyError) {
        if (this.l != null) {
            this.l.a(volleyError);
        }
    }

    public String toString() {
        return (this.m ? "[X] " : "[ ] ") + b() + " " + ("0x" + Integer.toHexString(this.f1246b)) + " " + l() + " " + this.c;
    }

    @Deprecated
    public byte[] h() {
        Map<String, String> i = i();
        if (i == null || i.size() <= 0) {
            return null;
        }
        return a(i, Keyczar.DEFAULT_ENCODING);
    }


    public /* synthetic */ int compareTo(l<T> another) {
        l lVar = (l) obj;
        n l = l();
        n l2 = lVar.l();
        return l == l2 ? this.c.intValue() - lVar.c.intValue() : l2.ordinal() - l.ordinal();
    }
}
