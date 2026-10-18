package com.google.android.finsky.auth;

import com.android.volley.ServerError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {
    public static int a(ServerError serverError, boolean z) {
        int i;
        com.android.volley.k kVar = serverError.f1195b;
        try {
            JSONObject jSONObject = new JSONObject(new String(kVar.f1244b, com.android.volley.apkg.l.a(kVar.c))).getJSONObject("error");
            switch (jSONObject.optString("message")) {
                case "PIN_NOTSET":
                    i = 1001;
                    break;
                case "PIN_LOCKED":
                    i = 1002;
                    break;
                case "INVALID_GRANT":
                    if (!z) {
                        i = 1100;
                        break;
                    } else {
                        i = 1003;
                        break;
                    }
                case "FORBIDDEN":
                    i = 906;
                    break;
                case "UNAUTHORIZED_CLIENT":
                    i = 905;
                    break;
                default:
                    i = 900;
                    break;
            }
            if (i == 900) {
                return jSONObject.optInt("code", 900);
            }
            return i;
        } catch (UnsupportedEncodingException e) {
            return 908;
        } catch (JSONException e2) {
            return 907;
        }
    }
}
