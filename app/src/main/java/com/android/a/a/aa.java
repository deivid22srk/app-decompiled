package com.android.a.a;

import android.util.Log;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class aa implements ac {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, am> f1057a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    u f1058b;

    public aa(u uVar) {
        this.f1058b = uVar;
        a();
    }

    @Override // com.android.a.a.ac
    public final k a(String str) {
        String str2;
        String aqVar;
        int lastIndexOf;
        am a2 = this.f1058b.a(str);
        if (a2 == null) {
            if (this.f1058b.a(str) == null) {
                am amVar = this.f1057a.get(str);
                au auVar = new au(this);
                if (aq.a(str)) {
                    aq a3 = new ar(str).a();
                    this.f1058b.a(a3, amVar, auVar);
                    try {
                        auVar.b();
                        if (this.f1058b.a(str) == null && c(str)) {
                            Log.i("ClientData", "Server failure: looking up key in region data constants.");
                            u uVar = this.f1058b;
                            be.a(a3, "null key not allowed.");
                            Map<String, String> a4 = ax.a();
                            aq a5 = a3.a(e.COUNTRY);
                            if (a5 != null && (lastIndexOf = (aqVar = a5.toString()).lastIndexOf("/")) > 0 && lastIndexOf != aqVar.length()) {
                                str2 = aqVar.substring(lastIndexOf + 1);
                            } else {
                                str2 = "";
                            }
                            String str3 = a4.get(str2);
                            if (str3 != null) {
                                try {
                                    uVar.f1130b.a(a3.toString(), am.a(str3));
                                } catch (JSONException e) {
                                    Log.w("CacheData", "Failed to parse data for key " + a3 + " from RegionDataConstants");
                                }
                            }
                        }
                    } catch (InterruptedException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            a2 = this.f1058b.a(str);
        }
        if (a2 != null && str.startsWith("data")) {
            return a(a2);
        }
        return null;
    }

    @Override // com.android.a.a.ac
    public final k b(String str) {
        if (str.split("/").length == 1) {
            am amVar = this.f1057a.get(str);
            if (amVar == null || !str.startsWith("data")) {
                throw new RuntimeException("key " + str + " does not have bootstrap data");
            }
            return a(amVar);
        }
        if (str.split("/").length <= 1) {
            throw new RuntimeException("Cannot get country key with key '" + str + "'");
        }
        if (!c(str)) {
            String[] split = str.split("/");
            str = split[0] + "/" + split[1];
        }
        am amVar2 = this.f1057a.get(str);
        if (amVar2 == null || !str.startsWith("data")) {
            throw new RuntimeException("key " + str + " does not have bootstrap data");
        }
        return a(amVar2);
    }

    private static boolean c(String str) {
        be.a(str, "Cannot use null as a key");
        return str.split("/").length == 2;
    }

    private static k a(am amVar) {
        EnumMap enumMap = new EnumMap(d.class);
        JSONArray b2 = amVar.b();
        for (int i = 0; i < b2.length(); i++) {
            try {
                d a2 = d.a(b2.getString(i));
                if (a2 != null) {
                    enumMap.put((EnumMap) a2, (d) amVar.get(a2.toString().toLowerCase()));
                }
            } catch (JSONException e) {
            }
        }
        return new k(enumMap);
    }

    private void a() {
        am amVar;
        am amVar2 = null;
        StringBuilder sb = new StringBuilder();
        for (String str : ax.a().keySet()) {
            sb.append(str + "~");
            try {
                amVar = am.a(ax.a().get(str));
            } catch (JSONException e) {
                amVar = null;
            }
            this.f1057a.put(new ar(as.DATA).a(new c().a(str).a()).a().toString(), amVar);
        }
        sb.setLength(sb.length() - 1);
        try {
            amVar2 = am.a("{\"id\":\"data\",\"" + d.COUNTRIES.toString().toLowerCase() + "\": \"" + sb.toString() + "\"}");
        } catch (JSONException e2) {
        }
        this.f1057a.put("data", amVar2);
    }
}
