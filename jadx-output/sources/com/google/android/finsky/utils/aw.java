package com.google.android.finsky.utils;

import android.content.Context;
import com.android.vending.R;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.volley.DisplayMessageError;

/* loaded from: classes.dex */
public final class aw {
    public static String a(Context context, VolleyError volleyError) {
        if (!(volleyError instanceof DisplayMessageError)) {
            if (volleyError instanceof AuthFailureError) {
                return context.getString(R.string.auth_required_error);
            }
            if (volleyError instanceof ServerError) {
                return context.getString(R.string.server_error);
            }
            if (volleyError instanceof TimeoutError) {
                return context.getString(R.string.timeout_error);
            }
            if (volleyError instanceof NetworkError) {
                return context.getString(R.string.network_error);
            }
            FinskyLog.a("No specific error message for: %s", volleyError);
            return context.getString(R.string.network_error);
        }
        return ((DisplayMessageError) volleyError).f7176a;
    }

    public static String b(Context context, VolleyError volleyError) {
        return volleyError instanceof NetworkError ? context.getString(R.string.network_error_title) : context.getString(R.string.error);
    }
}
