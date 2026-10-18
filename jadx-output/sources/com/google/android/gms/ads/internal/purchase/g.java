package com.google.android.gms.ads.internal.purchase;

import com.google.android.gms.internal.gw;
import org.json.JSONException;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class g {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str).getString("developerPayload");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.e("Fail to parse purchase data");
            return null;
        }
    }
}
