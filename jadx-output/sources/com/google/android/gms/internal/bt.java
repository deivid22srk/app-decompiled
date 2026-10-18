package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

@gw
/* loaded from: classes.dex */
public final class bt {
    private final int f;
    private final int g;
    private final int h;
    private final cc i;
    private int k;

    /* renamed from: a, reason: collision with root package name */
    final Object f5899a = new Object();
    private ArrayList<String> j = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    int f5900b = 0;
    int c = 0;
    int d = 0;
    String e = "";

    public bt(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = new cc(i4);
    }

    private static String a(ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > 200) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= 200 ? stringBuffer2.substring(0, 200) : stringBuffer2;
    }

    public final void a(String str) {
        b(str);
        synchronized (this.f5899a) {
            if (this.d < 0) {
                com.google.android.gms.ads.internal.util.client.b.a("ActivityContent: negative number of WebViews.");
            }
            c();
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f5899a) {
            z = this.d == 0;
        }
        return z;
    }

    public final void b() {
        synchronized (this.f5899a) {
            this.d++;
        }
    }

    final void b(String str) {
        if (str == null || str.length() < this.h) {
            return;
        }
        synchronized (this.f5899a) {
            this.j.add(str);
            this.f5900b += str.length();
        }
    }

    public final String toString() {
        return "ActivityContent fetchId: " + this.c + " score:" + this.k + " total_length:" + this.f5900b + "\n text: " + a(this.j) + "\n signture: " + this.e;
    }

    public final void c() {
        String a2;
        synchronized (this.f5899a) {
            int i = (this.f5900b * this.f) + (this.c * this.g);
            if (i > this.k) {
                this.k = i;
                cc ccVar = this.i;
                ArrayList<String> arrayList = this.j;
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(it.next().toLowerCase(Locale.US));
                    stringBuffer.append('\n');
                }
                switch (ccVar.f5916a) {
                    case 0:
                        a2 = ccVar.b(stringBuffer.toString());
                        break;
                    case 1:
                        a2 = ccVar.a(stringBuffer.toString());
                        break;
                    default:
                        a2 = "";
                        break;
                }
                this.e = a2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bt btVar = (bt) obj;
        return btVar.e != null && btVar.e.equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
