package com.android.a.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f1090a = new HashMap();

    static {
        for (ay ayVar : ay.values()) {
            f1090a.put(ayVar.toString(), ayVar.dJ);
        }
    }

    static String a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < strArr.length; i += 2) {
            try {
                jSONObject.put(strArr[i], strArr[i + 1]);
            } catch (JSONException e) {
            }
        }
        return jSONObject.toString();
    }

    static Map<String, String> a() {
        return f1090a;
    }
}
