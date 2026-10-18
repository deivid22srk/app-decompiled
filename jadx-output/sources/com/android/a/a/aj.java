package com.android.a.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final String f1070a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f1071b;

    aj(ah ahVar) {
        be.a(ax.a(), "null country name map not allowed");
        be.a(ahVar);
        this.f1071b = ahVar;
        this.f1070a = a("ZZ", d.FMT);
        be.a(this.f1070a, "null default format not allowed");
    }

    public final List<e> a(at atVar, String str) {
        be.a(atVar);
        be.a((Object) str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : b(atVar, str)) {
            if (str2.matches("%.") && !str2.equals("%n")) {
                arrayList.add(e.a(str2.charAt(1)));
            }
        }
        a(str, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (e eVar : arrayList) {
            if (eVar == e.STREET_ADDRESS) {
                arrayList2.add(e.ADDRESS_LINE_1);
                arrayList2.add(e.ADDRESS_LINE_2);
            } else {
                arrayList2.add(eVar);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(String str, List<e> list) {
        if (this.f1071b.a(str) != null) {
            HashMap hashMap = new HashMap();
            int i = 0;
            for (e eVar : this.f1071b.a(str)) {
                hashMap.put(eVar, Integer.valueOf(i));
                i++;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (e eVar2 : list) {
                if (hashMap.containsKey(eVar2)) {
                    arrayList.add(eVar2);
                    arrayList2.add(Integer.valueOf(i2));
                }
                i2++;
            }
            Collections.sort(arrayList, new ak(this, hashMap));
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                list.set(((Integer) arrayList2.get(i3)).intValue(), arrayList.get(i3));
            }
        }
    }

    static String a(String str) {
        return str.trim().replaceAll(" +", " ");
    }

    private String a(String str, d dVar) {
        be.a((Object) str);
        String str2 = ax.a().get(str);
        if (str2 == null) {
            return this.f1070a;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONTokener(str2));
            if (!jSONObject.has(dVar.name().toLowerCase())) {
                str2 = this.f1070a;
            } else {
                str2 = jSONObject.getString(dVar.name().toLowerCase());
            }
            return str2;
        } catch (JSONException e) {
            throw new RuntimeException("Invalid json for region code " + str + ": " + str2);
        }
    }

    final List<String> b(at atVar, String str) {
        String a2 = atVar == at.LOCAL ? a(str, d.FMT) : a(str, d.LFMT);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (char c : a2.toCharArray()) {
            if (z) {
                if ("%n".equals("%" + c)) {
                    arrayList.add("%n");
                    z = false;
                } else {
                    be.a(e.a(c), "Unrecognized character '" + c + "' in format pattern: " + a2);
                    arrayList.add("%" + c);
                    z = false;
                }
            } else if (c == '%') {
                z = true;
            } else {
                arrayList.add(String.valueOf(c));
            }
        }
        return arrayList;
    }
}
