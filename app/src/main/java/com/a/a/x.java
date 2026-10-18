package com.a.a;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f1051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1052b;
    public final String e;
    public final String f;

    public x(String str, String str2, String str3, String str4) {
        this.e = str;
        this.f1051a = str2;
        this.f1052b = str3;
        this.f = str4;
    }

    public static x a(String str) {
        String str2;
        Matcher matcher = c.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = d.matcher(str);
        String str3 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group == null || !group.equalsIgnoreCase("charset")) {
                str2 = str3;
            } else {
                str2 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str3 != null && !str2.equalsIgnoreCase(str3)) {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
            }
            str3 = str2;
        }
        return new x(str, lowerCase, lowerCase2, str3);
    }

    public final String toString() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).e.equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
