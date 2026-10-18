package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

@gw
/* loaded from: classes.dex */
public final class fm extends fy {

    /* renamed from: a, reason: collision with root package name */
    final Context f5976a;

    /* renamed from: b, reason: collision with root package name */
    String f5977b;
    long c;
    long d;
    String e;
    String f;
    private final Map<String, String> g;

    private String c(String str) {
        return TextUtils.isEmpty(this.g.get(str)) ? "" : this.g.get(str);
    }

    private long d(String str) {
        String str2 = this.g.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    public fm(im imVar, Map<String, String> map) {
        super(imVar, "createCalendarEvent");
        this.g = map;
        this.f5976a = imVar.c();
        this.f5977b = c("description");
        this.e = c("summary");
        this.c = d("start_ticks");
        this.d = d("end_ticks");
        this.f = c("location");
    }
}
