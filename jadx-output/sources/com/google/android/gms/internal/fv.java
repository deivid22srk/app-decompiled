package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class fv {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5990a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5991b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    /* synthetic */ fv(fw fwVar, byte b2) {
        this(fwVar);
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.f5990a).put("tel", this.f5991b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }

    private fv(fw fwVar) {
        this.f5990a = fwVar.f5992a;
        this.f5991b = fwVar.f5993b;
        this.c = fwVar.c;
        this.d = fwVar.d;
        this.e = fwVar.e;
    }
}
