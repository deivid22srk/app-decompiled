package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public class fy {

    /* renamed from: a, reason: collision with root package name */
    private final String f5996a;
    final im s;

    public fy(im imVar) {
        this(imVar, "");
    }

    public fy(im imVar, String str) {
        this.s = imVar;
        this.f5996a = str;
    }

    public final void a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.s.a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while obtaining screen information.", e);
        }
    }

    public final void a(String str) {
        try {
            this.s.a("onError", new JSONObject().put("message", str).put("action", this.f5996a));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.b("Error occurred while dispatching error event.", e);
        }
    }

    public final void b(String str) {
        try {
            this.s.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching state change.", e);
        }
    }
}
