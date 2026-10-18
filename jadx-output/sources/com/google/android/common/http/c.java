package com.google.android.common.http;

import com.google.android.common.http.UrlRules;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c implements Comparable {
    public static final c e = new c();

    /* renamed from: a, reason: collision with root package name */
    public final String f1430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1431b;
    public final String c;
    public final boolean d;

    public c(String str, String str2) {
        Pattern pattern;
        this.f1430a = str;
        pattern = UrlRules.f1425a;
        String[] split = pattern.split(str2);
        if (split.length == 0) {
            throw new UrlRules.RuleFormatException("Empty rule");
        }
        this.f1431b = split[0];
        String str3 = null;
        boolean z = false;
        int i = 1;
        while (i < split.length) {
            String lowerCase = split[i].toLowerCase();
            if (lowerCase.equals("rewrite") && i + 1 < split.length) {
                str3 = split[i + 1];
                i += 2;
            } else if (lowerCase.equals("block")) {
                i++;
                z = true;
            } else {
                throw new UrlRules.RuleFormatException("Illegal rule: " + str2);
            }
        }
        this.c = str3;
        this.d = z;
    }

    private c() {
        this.f1430a = "DEFAULT";
        this.f1431b = "";
        this.c = null;
        this.d = false;
    }

    public final String a(String str) {
        if (this.d) {
            return null;
        }
        if (this.c != null) {
            return this.c + str.substring(this.f1431b.length());
        }
        return str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((c) obj).f1431b.compareTo(this.f1431b);
    }
}
