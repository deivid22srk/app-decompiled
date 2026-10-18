package com.google.android.finsky.placesapi;

import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.protos.v;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public v f3569a;

    private k(v vVar) {
        this.f3569a = vVar;
    }

    public static k a(JSONObject jSONObject, a aVar) {
        String string = jSONObject.getString("adr_address");
        try {
            v vVar = new v();
            LinkedList<b> a2 = a.a(string);
            while (a.a(a2, d.UNKNOWN) != null) {
            }
            String a3 = a.a(a2, d.ADR_STREET_ADDRESS);
            if (!TextUtils.isEmpty(a3)) {
                vVar.g = a3;
                vVar.h = true;
            }
            String a4 = a.a(a2, d.ADR_LOCALITY);
            if (!TextUtils.isEmpty(a4)) {
                vVar.k = a4;
                vVar.l = true;
            }
            String a5 = a.a(a2, d.ADR_POSTAL_CODE);
            if (!TextUtils.isEmpty(a5)) {
                vVar.o = a5;
                vVar.p = true;
            }
            String a6 = a.a(a2, d.ADR_REGION);
            if (!TextUtils.isEmpty(a6)) {
                vVar.m = a6;
                vVar.n = true;
            }
            while (!a2.isEmpty() && a2.getLast().f3560b == d.SEPARATOR) {
                a2.removeLast();
            }
            String replaceAll = TextUtils.join("", a2).replaceAll("\\n", aVar.f3558a.getString(R.string.adr_microformat_newline_replacement));
            if (!TextUtils.isEmpty(replaceAll)) {
                vVar.i = replaceAll;
                vVar.j = true;
            }
            return new k(vVar);
        } catch (AdrMicroformatParserException e) {
            JSONException jSONException = new JSONException(e.getMessage());
            jSONException.initCause(e);
            throw jSONException;
        }
    }
}
