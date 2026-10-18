package com.google.android.wallet.common.apkg;

import android.content.Context;
import android.support.v4.h.r;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m implements c {

    /* renamed from: a, reason: collision with root package name */
    ArrayList<com.google.c.a.b> f7261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7262b;
    public final Context c;
    public final r<String, ArrayList<com.google.c.a.b>> d = new r<>();

    public abstract int b();

    public abstract List<com.google.c.a.b> c();

    public m(String str, Context context) {
        this.f7262b = str;
        this.c = context;
    }

    public synchronized void d() {
        List<com.google.c.a.b> list = null;
        synchronized (this) {
            if (this.f7261a == null) {
                try {
                    list = c();
                } catch (Throwable th) {
                    Log.e(this.f7262b, "Could not retrieve addresses", th);
                }
                if (list != null) {
                    this.f7261a = f.a(list, (char[]) null);
                } else {
                    this.f7261a = new ArrayList<>();
                }
            }
        }
    }

    public ArrayList<com.google.c.a.b> a(char[] cArr) {
        ArrayList<com.google.c.a.b> arrayList;
        String str = cArr != null ? new String(cArr) : "*";
        synchronized (this.d) {
            arrayList = this.d.get(str);
            if (arrayList == null) {
                ArrayList<com.google.c.a.b> a2 = f.a(this.f7261a, cArr);
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    com.google.c.a.b bVar = a2.get(i);
                    if (bVar.q.length == 1) {
                        bVar.q = (String[]) com.google.android.wallet.common.util.b.a(bVar.q, "");
                    }
                }
                this.d.put(str, a2);
                arrayList = a2;
            }
        }
        return arrayList;
    }

    @Override // com.google.android.wallet.common.apkg.c
    public final String a() {
        return this.f7262b;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    @Override // com.google.android.wallet.common.apkg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.wallet.common.apkg.d> a(java.lang.CharSequence r19, char r20, char[] r21, int r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.common.apkg.m.a(java.lang.CharSequence, char, char[], int, java.lang.String):java.util.List");
    }

    @Override // com.google.android.wallet.common.apkg.c
    public final com.google.c.a.b a(String str, String str2) {
        throw new UnsupportedOperationException(String.valueOf(this.f7262b).concat(" does not use reference identifiers"));
    }
}
