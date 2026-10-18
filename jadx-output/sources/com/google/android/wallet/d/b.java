package com.google.android.wallet.d;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final String f7311a;

    /* renamed from: b, reason: collision with root package name */
    final JSONArray f7312b;
    private String c;

    public b(String str, String str2) {
        this.f7311a = str;
        try {
            this.f7312b = TextUtils.isEmpty(str2) ? null : new JSONArray(str2);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Could not parse json.", e);
        }
    }

    public final String a() {
        if (this.c == null) {
            this.c = d();
        }
        return this.c;
    }

    public final boolean b() {
        return "POST".equalsIgnoreCase(this.f7311a);
    }

    private String d() {
        if (this.f7312b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f7312b.length());
        int length = this.f7312b.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject optJSONObject = this.f7312b.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new BasicNameValuePair(optJSONObject.getString("name"), optJSONObject.getString("value")));
                }
            } catch (JSONException e) {
                Log.e("HtmlFormContent", "Failed to parse JSON object", e);
            }
        }
        return URLEncodedUtils.format(arrayList, Keyczar.DEFAULT_ENCODING);
    }

    public final boolean c() {
        return ("GET".equalsIgnoreCase(this.f7311a) || TextUtils.isEmpty(this.f7311a)) || (b() && this.f7312b != null);
    }
}
