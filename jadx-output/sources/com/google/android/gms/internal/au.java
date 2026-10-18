package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class au {
    static final String[] d = {"/aclk", "/pcs/click"};
    ap e;

    /* renamed from: a, reason: collision with root package name */
    String f5884a = "googleads.g.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    String f5885b = "/pagead/ads";
    private String f = "ad.doubleclick.net";
    String[] c = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    public au(ap apVar) {
        this.e = apVar;
    }

    private boolean c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final Uri a(Uri uri, Context context) {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new zzap("Provided Uri is not in a valid state");
        }
    }

    public final void a(MotionEvent motionEvent) {
        this.e.a(motionEvent);
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            if (uri.getHost().equals(this.f5884a)) {
                return uri.getPath().equals(this.f5885b);
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final boolean b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String str : this.c) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    final Uri a(Uri uri, Context context, String str, boolean z) {
        try {
            boolean c = c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzap("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzap("Query parameter already exists: ms");
            }
            String a2 = z ? this.e.a(context, str) : this.e.a(context);
            if (!c) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf("&adurl");
                if (indexOf == -1) {
                    indexOf = uri2.indexOf("?adurl");
                }
                return indexOf != -1 ? Uri.parse(uri2.substring(0, indexOf + 1) + "ms=" + a2 + "&" + uri2.substring(indexOf + 1)) : uri.buildUpon().appendQueryParameter("ms", a2).build();
            }
            String uri3 = uri.toString();
            int indexOf2 = uri3.indexOf(";adurl");
            if (indexOf2 != -1) {
                return Uri.parse(uri3.substring(0, indexOf2 + 1) + "dc_ms=" + a2 + ";" + uri3.substring(indexOf2 + 1));
            }
            String encodedPath = uri.getEncodedPath();
            int indexOf3 = uri3.indexOf(encodedPath);
            return Uri.parse(uri3.substring(0, encodedPath.length() + indexOf3) + ";dc_ms=" + a2 + ";" + uri3.substring(encodedPath.length() + indexOf3));
        } catch (UnsupportedOperationException e) {
            throw new zzap("Provided Uri is not in a valid state");
        }
    }
}
