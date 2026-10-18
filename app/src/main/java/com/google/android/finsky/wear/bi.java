package com.google.android.finsky.wear;

import android.net.Uri;

/* loaded from: classes.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f5118a = Uri.parse("wear:/device_configuration");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f5119b = Uri.parse("wear:/liveness");
    public static final Uri c = Uri.parse("wear:/wearable_info");
    public static final Uri d = Uri.parse("wear:/install_wearable");
    public static final Uri e = Uri.parse("wear:/request_status");
    public static final Uri f = Uri.parse("wear:/zapp_modules_request");

    public static String a(Uri uri) {
        return uri.getPathSegments().get(r0.size() - 1);
    }

    public static String b(Uri uri) {
        return uri.getHost();
    }
}
