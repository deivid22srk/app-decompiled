package com.google.android.libraries.happiness;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f6740a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f6741b = new HashMap();

    public l(String str, String str2) {
        a("site_id", str2);
        if (str != null) {
            a("zwieback_cookie", str);
        }
        a("survey_url", "http://www.google.com/insights/consumersurveys/async_survey");
        a("locale", "en-US");
    }

    private l a(String str, String str2) {
        this.f6740a.put(str, str2);
        return this;
    }

    public final String a(String str) {
        return this.f6740a.get(str);
    }

    public final String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str + "['params'] = {};\n");
        sb.append(str + "['logging_params'] = {};\n");
        for (Map.Entry<String, String> entry : this.f6740a.entrySet()) {
            sb.append(String.format(str + "['params']['%s'] = '%s';\n", entry.getKey(), entry.getValue()));
        }
        for (Map.Entry<String, String> entry2 : this.f6741b.entrySet()) {
            sb.append(String.format(str + "['logging_params']['%s'] = '%s'\n;", entry2.getKey(), entry2.getValue()));
        }
        return sb.toString();
    }
}
