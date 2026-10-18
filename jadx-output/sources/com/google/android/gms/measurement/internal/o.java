package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    final String f6377a;

    /* renamed from: b, reason: collision with root package name */
    final String f6378b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    public final String toString() {
        return "Event{appId='" + this.f6377a + "', name='" + this.f6378b + "', params=" + this.f + '}';
    }

    o(ap apVar, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        com.google.android.gms.common.internal.av.a(str2);
        com.google.android.gms.common.internal.av.a(str3);
        com.google.android.gms.common.internal.av.a(eventParams);
        this.f6377a = str2;
        this.f6378b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (this.e != 0 && this.e > this.d) {
            apVar.e().f6389b.a("Event created with reverse previous/current timestamps");
        }
        this.f = eventParams;
    }

    o(ap apVar, String str, String str2, String str3, long j, Bundle bundle) {
        com.google.android.gms.common.internal.av.a(str2);
        com.google.android.gms.common.internal.av.a(str3);
        this.f6377a = str2;
        this.f6378b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = 0L;
        if (this.e != 0 && this.e > this.d) {
            apVar.e().f6389b.a("Event created with reverse previous/current timestamps");
        }
        this.f = a(apVar, bundle);
    }

    private static EventParams a(ap apVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new EventParams(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                it.remove();
            } else {
                apVar.g();
                Object a2 = g.a((TextUtils.isEmpty(next) || !next.startsWith("_")) ? i.o() : i.p(), bundle2.get(next), false);
                if (a2 == null) {
                    it.remove();
                } else {
                    apVar.g().a(bundle2, next, a2);
                }
            }
        }
        return new EventParams(bundle2);
    }
}
