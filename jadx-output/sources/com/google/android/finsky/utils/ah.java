package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ny;
import java.util.Map;

/* loaded from: classes.dex */
public final class ah {

    /* renamed from: b, reason: collision with root package name */
    public final String f4733b;
    public final String c;

    /* renamed from: a, reason: collision with root package name */
    final ny f4732a = new ny();
    boolean d = false;

    public ah(String str, int i, String str2, String str3, Document document, String str4, long j) {
        com.google.android.finsky.protos.gx gxVar;
        this.f4732a.d = i;
        this.f4732a.e = true;
        this.f4732a.g = str2;
        this.f4732a.h = true;
        this.f4732a.i = str3;
        this.f4732a.j = true;
        ny nyVar = this.f4732a;
        if (document == null) {
            gxVar = null;
        } else {
            gxVar = document.f1963a;
        }
        nyVar.c = gxVar;
        this.f4732a.q = j;
        this.f4732a.r = true;
        this.f4733b = str;
        this.c = str4;
    }

    public static ah a(Map<String, String> map, Document document) {
        if (!map.containsKey("doc_id") || !map.containsKey("rating") || !map.containsKey("title") || !map.containsKey("content") || !map.containsKey("doc_details_url_key") || !map.containsKey("doc_timestamp")) {
            FinskyLog.d("Review badly persisted: %s", map.keySet().toString());
            return null;
        }
        try {
            return new ah(map.get("doc_id"), Integer.parseInt(map.get("rating")), map.get("title"), map.get("content"), document, map.get("doc_details_url_key"), Long.parseLong(map.get("doc_timestamp")));
        } catch (NumberFormatException e) {
            FinskyLog.d("Error parsing numbers from persisted cache: %s", e.toString());
            return null;
        }
    }
}
