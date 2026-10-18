package com.google.android.wallet.common.apkg;

import android.text.TextUtils;
import com.android.volley.apkg.x;
import com.android.volley.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends x {
    public static final HashMap<String, String> j;
    public final String k;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        j = hashMap;
        hashMap.put("upper", "C");
        j.put("zip_name_type", "postal");
        j.put("fmt", "%N%n%O%n%A%n%C");
        j.put("require", "AC");
        j.put("state_name_type", "province");
        j.put("id", "data/ZZ");
        j.put("dir", "ltr");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(int r7, java.lang.String r8, com.android.volley.t<org.json.JSONObject> r9, com.android.volley.s r10) {
        /*
            r6 = this;
            r1 = 0
            android.net.Uri r0 = com.google.android.wallet.common.apkg.h.a(r7, r8)
            java.lang.String r2 = r0.toString()
            r3 = 0
            r0 = r6
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r0 = com.google.android.wallet.common.apkg.h.b(r7, r8)
            r6.k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.common.apkg.j.<init>(int, java.lang.String, com.android.volley.t, com.android.volley.s):void");
    }

    @Override // com.android.volley.l
    public final com.android.volley.n l() {
        return com.android.volley.n.HIGH;
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        return Collections.singletonMap("User-Agent", com.google.android.wallet.common.c.a.f7268a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.apkg.x, com.android.volley.apkg.y, com.android.volley.l
    public final r<JSONObject> a(com.android.volley.k kVar) {
        r<JSONObject> a2 = super.a(kVar);
        if (!a2.a()) {
            return a2;
        }
        JSONObject jSONObject = a2.f1255a;
        String a3 = f.a(jSONObject, "id");
        if (TextUtils.isEmpty(a3)) {
            a3 = this.k;
            try {
                jSONObject.put("id", a3);
            } catch (JSONException e) {
                throw new RuntimeException(new StringBuilder(String.valueOf(a3).length() + 28).append("Error adding id=").append(a3).append(" to response").toString(), e);
            }
        }
        if (TextUtils.isEmpty(f.a(jSONObject, "key")) && !TextUtils.isEmpty(a3)) {
            String substring = a3.substring(a3.lastIndexOf("/") + 1);
            try {
                jSONObject.put("key", substring);
            } catch (JSONException e2) {
                throw new RuntimeException(new StringBuilder(String.valueOf(substring).length() + 29).append("Error adding key=").append(substring).append(" to response").toString(), e2);
            }
        }
        for (String str : j.keySet()) {
            if (!jSONObject.has(str)) {
                try {
                    jSONObject.put(str, j.get(str));
                } catch (JSONException e3) {
                    throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 54).append("Error adding country default data for key=").append(str).append(" to response").toString(), e3);
                }
            }
        }
        return r.a(jSONObject, a2.f1256b);
    }
}
