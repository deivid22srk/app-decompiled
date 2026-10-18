package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@gw
/* renamed from: com.google.android.gms.internal.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif extends hb {

    /* renamed from: a, reason: collision with root package name */
    private final String f6053a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6054b;
    private final String d;
    private String e;

    public Cif(Context context, String str, String str2) {
        this.e = null;
        this.f6054b = context;
        this.f6053a = str;
        this.d = str2;
    }

    public Cif(Context context, String str, String str2, String str3) {
        this.e = null;
        this.f6054b = context;
        this.f6053a = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.google.android.gms.internal.hb
    public final void a() {
        try {
            com.google.android.gms.ads.internal.util.client.b.d("Pinging URL: " + this.d);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.d).openConnection();
            try {
                if (TextUtils.isEmpty(this.e)) {
                    com.google.android.gms.ads.internal.d.c().a(this.f6054b, this.f6053a, true, httpURLConnection);
                } else {
                    com.google.android.gms.ads.internal.d.c();
                    hk.a(httpURLConnection, this.e);
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    com.google.android.gms.ads.internal.util.client.b.e("Received non-success response code " + responseCode + " from pinging URL: " + this.d);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.b.e("Error while pinging URL: " + this.d + ". " + e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            com.google.android.gms.ads.internal.util.client.b.e("Error while parsing ping URL: " + this.d + ". " + e2.getMessage());
        } catch (RuntimeException e3) {
            com.google.android.gms.ads.internal.util.client.b.e("Error while pinging URL: " + this.d + ". " + e3.getMessage());
        }
    }
}
