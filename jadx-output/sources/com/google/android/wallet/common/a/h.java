package com.google.android.wallet.common.a;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.s;
import com.android.volley.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h implements t<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f7256a = Uri.parse("https://payments.google.com/payments/data/address");

    /* renamed from: b, reason: collision with root package name */
    private final com.android.volley.o f7257b;
    private final int c;
    private final String d;
    private final t<JSONObject> e;
    private final s f;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String e = f.e(jSONObject2, this.d);
        if (!TextUtils.isEmpty(e)) {
            a(e);
        } else {
            this.e.a_(jSONObject2);
        }
    }

    public h(com.android.volley.o oVar, int i, String str, t<JSONObject> tVar, s sVar) {
        this.f7257b = oVar;
        this.c = i;
        this.d = str;
        this.e = tVar;
        this.f = sVar;
    }

    public final void a(String str) {
        this.f7257b.a(new j(this.c, str, this, this.f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(int i, String str) {
        StringBuilder append = new StringBuilder("data/").append(o.a(i));
        if (!TextUtils.isEmpty(str)) {
            append.append("--").append(str);
        }
        return append.toString();
    }
}
