package com.android.a.a;

import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f1135a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1136b;
    private final JSONObject c;
    private final ab d;

    /* synthetic */ y(u uVar, String str, JSONObject jSONObject, ab abVar, byte b2) {
        this(uVar, str, jSONObject, abVar);
    }

    private y(u uVar, String str, JSONObject jSONObject, ab abVar) {
        this.f1135a = uVar;
        be.a((Object) str);
        this.f1136b = str;
        this.c = jSONObject;
        this.d = abVar;
    }

    static /* synthetic */ void a(y yVar, am amVar) {
        if (amVar == null) {
            Log.w("CacheData", "server returns null for key:" + yVar.f1136b);
            yVar.f1135a.e.add(yVar.f1136b);
            u.a(yVar.f1135a, yVar.f1136b);
            u.a(yVar.d);
            return;
        }
        if (!amVar.has(d.ID.name().toLowerCase())) {
            Log.w("CacheData", "invalid or empty data returned for key: " + yVar.f1136b);
            yVar.f1135a.e.add(yVar.f1136b);
            u.a(yVar.f1135a, yVar.f1136b);
            u.a(yVar.d);
            return;
        }
        if (yVar.c != null) {
            amVar.a((am) yVar.c);
        }
        yVar.f1135a.f1130b.a(yVar.f1136b, amVar);
        u.a(yVar.f1135a, yVar.f1136b);
        u.a(yVar.d);
    }
}
