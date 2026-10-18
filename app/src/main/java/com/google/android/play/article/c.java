package com.google.android.play.article;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6801a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6802b;

    c(a aVar, String str) {
        this.f6802b = aVar;
        this.f6801a = str;
    }

    @Override // com.google.android.play.article.g
    public final void a(String str) {
        String str2;
        String replace;
        try {
            replace = new JSONObject(str).getJSONObject("data").getString("html").replace("base href=\"https://www.google.com/newsstand/web/\"", "base href=\"https://play.google.com/newsstand/web/\"");
            a.a(new d(this, replace));
        } catch (JSONException e) {
            str2 = a.f6798a;
            Log.e(str2, "Could not parse JSON", e);
            a();
        }
    }

    @Override // com.google.android.play.article.g
    public final void a() {
        a.a(new e(this));
    }
}
