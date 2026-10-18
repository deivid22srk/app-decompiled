package com.google.android.volley.guava;

import com.google.android.volley.guava.UrlRules;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c implements Comparable {
    public static final c e = new c();

    /* renamed from: a, reason: collision with root package name */
    public final String f7201a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7202b;
    public final String c;
    public final boolean d;

    public c(String str, String str2) {
        Pattern pattern;
        this.f7201a = str;
        pattern = UrlRules.f7196a;
        String[] split = pattern.split(str2);
        if (split.length == 0) {
            throw new UrlRules.RuleFormatException("Empty rule");
        }
        this.f7202b = split[0];
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
        this.f7201a = "DEFAULT";
        this.f7202b = "";
        this.c = null;
        this.d = false;
    }

    public final String a(String str) {
        if (this.d) {
            return null;
        }
        if (this.c != null) {
            return this.c + str.substring(this.f7202b.length());
        }
        return str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((c) obj).f7202b.compareTo(this.f7202b);
    }
}
