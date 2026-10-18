package com.google.android.common.http;

import android.content.ContentResolver;
import android.util.Log;
import com.google.android.a.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class UrlRules {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f1425a = Pattern.compile(" +");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f1426b = Pattern.compile("\\W");
    private static UrlRules c = new UrlRules(new c[0]);
    private static Object d;
    private final c[] e;
    private final Pattern f;

    public class RuleFormatException extends Exception {
        public RuleFormatException(String str) {
            super(str);
        }
    }

    private UrlRules(c[] cVarArr) {
        Arrays.sort(cVarArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < cVarArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(f1426b.matcher(cVarArr[i].f1431b).replaceAll("\\\\$0"));
        }
        this.f = Pattern.compile(sb.append(")").toString());
        this.e = cVarArr;
    }

    public final c a(String str) {
        Matcher matcher = this.f.matcher(str);
        if (matcher.lookingAt()) {
            for (int i = 0; i < this.e.length; i++) {
                if (matcher.group(i + 1) != null) {
                    return this.e[i];
                }
            }
        }
        return c.e;
    }

    public static synchronized UrlRules a(ContentResolver contentResolver) {
        UrlRules urlRules;
        synchronized (UrlRules.class) {
            Object a2 = d.a(contentResolver);
            if (a2 == d) {
                if (Log.isLoggable("UrlRules", 2)) {
                    Log.v("UrlRules", "Using cached rules, versionToken: " + a2);
                }
                urlRules = c;
            } else {
                if (Log.isLoggable("UrlRules", 2)) {
                    Log.v("UrlRules", "Scanning for Gservices \"url:*\" rules");
                }
                Map<String, String> a3 = d.a(contentResolver, "url:");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : a3.entrySet()) {
                    try {
                        String substring = entry.getKey().substring(4);
                        String value = entry.getValue();
                        if (value != null && value.length() != 0) {
                            if (Log.isLoggable("UrlRules", 2)) {
                                Log.v("UrlRules", "  Rule " + substring + ": " + value);
                            }
                            arrayList.add(new c(substring, value));
                        }
                    } catch (RuleFormatException e) {
                        Log.e("UrlRules", "Invalid rule from Gservices", e);
                    }
                }
                c = new UrlRules((c[]) arrayList.toArray(new c[arrayList.size()]));
                d = a2;
                if (Log.isLoggable("UrlRules", 2)) {
                    Log.v("UrlRules", "New rules stored, versionToken: " + a2);
                }
                urlRules = c;
            }
        }
        return urlRules;
    }
}
