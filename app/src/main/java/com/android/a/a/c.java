package com.android.a.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public String f1101b = null;

    /* renamed from: a, reason: collision with root package name */
    final Map<e, String> f1100a = new HashMap();

    public c() {
    }

    public c(a aVar) {
        a(aVar);
    }

    public final c a(String str) {
        return a(e.COUNTRY, str);
    }

    public final c b(String str) {
        return a(e.ADMIN_AREA, str);
    }

    public final c c(String str) {
        return a(e.LOCALITY, str);
    }

    public final c d(String str) {
        return a(e.POSTAL_CODE, str);
    }

    private c a(a aVar) {
        this.f1100a.clear();
        for (e eVar : e.values()) {
            if (eVar != e.STREET_ADDRESS) {
                a(eVar, aVar.a(eVar));
            }
        }
        b();
        this.f1101b = aVar.k;
        return this;
    }

    public final c e(String str) {
        return a(e.ADDRESS_LINE_1, str);
    }

    public final c f(String str) {
        return a(e.ADDRESS_LINE_2, str);
    }

    public final c g(String str) {
        return a(e.RECIPIENT, str);
    }

    public final c a(e eVar, String str) {
        if (str == null || str.length() == 0) {
            this.f1100a.remove(eVar);
        } else {
            this.f1100a.put(eVar, str.trim());
        }
        b();
        return this;
    }

    public final a a() {
        return new a(this, (byte) 0);
    }

    private void b() {
        String str;
        String str2 = this.f1100a.get(e.ADDRESS_LINE_1);
        String str3 = this.f1100a.get(e.ADDRESS_LINE_2);
        if (str2 == null || str2.trim().length() == 0) {
            str = null;
        } else {
            str3 = str2;
            str = str3;
        }
        if (str3 != null) {
            String[] split = str3.split("\n");
            if (split.length > 1) {
                str3 = split[0];
                str = split[1];
            }
        }
        this.f1100a.put(e.ADDRESS_LINE_1, str3);
        this.f1100a.put(e.ADDRESS_LINE_2, str);
    }
}
