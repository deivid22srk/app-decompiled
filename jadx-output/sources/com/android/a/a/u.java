package com.android.a.a;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.client.HttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    String f1129a;

    /* renamed from: b, reason: collision with root package name */
    final am f1130b;
    final z c;
    final HashSet<String> d;
    final HashSet<String> e;
    private final HashMap<aq, HashSet<x>> f;

    public u() {
        this(new az());
    }

    public u(z zVar) {
        this.d = new HashSet<>();
        this.e = new HashSet<>();
        this.f = new HashMap<>();
        this.c = zVar;
        String a2 = this.c.a();
        be.a(a2, "Cannot set URL of address data server to null.");
        this.f1129a = a2;
        this.f1130b = am.a();
    }

    static void a(ab abVar) {
        if (abVar != null) {
            abVar.a();
        }
    }

    final void a(aq aqVar, JSONObject jSONObject, ab abVar) {
        HttpClient httpClient;
        byte b2 = 0;
        be.a(aqVar, "null key not allowed.");
        if (this.f1130b.d(aqVar.toString())) {
            a(abVar);
            return;
        }
        if (this.e.contains(aqVar.toString())) {
            a(abVar);
            return;
        }
        if (!this.d.add(aqVar.toString())) {
            Log.d("CacheData", "data for key " + aqVar + " requested but not cached yet");
            v vVar = new v(this, abVar);
            be.a(aqVar);
            be.a(vVar);
            HashSet<x> hashSet = this.f.get(aqVar);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f.put(aqVar, hashSet);
            }
            hashSet.add(vVar);
            return;
        }
        String a2 = this.c.a(aqVar.toString());
        if (a2.length() > 0) {
            try {
                y.a(new y(this, aqVar.toString(), jSONObject, abVar, b2), am.a(a2));
                return;
            } catch (JSONException e) {
                Log.w("CacheData", "Data from client's cache is in the wrong format: " + a2);
            }
        }
        new an();
        httpClient = ap.f1075a;
        HttpParams params = httpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, 5000);
        an.a(this.f1129a + "/" + aqVar.toString(), new w(this, aqVar, abVar, new y(this, aqVar.toString(), jSONObject, abVar, b2)));
    }

    public final am a(String str) {
        be.a(str, "null key not allowed");
        return this.f1130b.c(str);
    }

    static /* synthetic */ void a(u uVar, String str) {
        HashSet<x> hashSet = uVar.f.get(new ar(str).a());
        if (hashSet == null) {
            return;
        }
        Iterator<x> it = hashSet.iterator();
        while (it.hasNext()) {
            x next = it.next();
            str.toString();
            next.a();
        }
        hashSet.clear();
    }
}
