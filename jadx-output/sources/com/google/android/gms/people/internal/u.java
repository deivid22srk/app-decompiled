package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.av;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, Integer> f6425a;

    /* renamed from: b, reason: collision with root package name */
    public static Iterable<?> f6426b;
    public static final Handler c;
    public static final String[] d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final String i;
    public static final String j;
    public static final SecureRandom k;
    private static final ThreadLocal<StringBuilder> l;
    private static final ThreadLocal<String[]> m;
    private static final ThreadLocal<String[]> n;
    private static final ThreadLocal<String[]> o;
    private static final ThreadLocal<String[]> p;
    private static final ThreadLocal<String[]> q;

    static {
        HashMap hashMap = new HashMap();
        f6425a = hashMap;
        hashMap.put("circle", -1);
        f6425a.put("extendedCircles", 4);
        f6425a.put("myCircles", 3);
        f6425a.put("domain", 2);
        f6425a.put("public", 1);
        f6425a.put(null, -2);
        f6426b = new c();
        c = new Handler(Looper.getMainLooper());
        d = new String[0];
        e = Pattern.compile("\\,");
        f = Pattern.compile("[\u2028\u2029  \u1680\u180e\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\t\u000b\f\u001c\u001d\u001e\u001f\n\r]+");
        g = Pattern.compile(Pattern.quote("\u0001"));
        h = Pattern.compile(Pattern.quote("\u0002"));
        i = "\u0001";
        j = "\u0002";
        k = new SecureRandom();
        l = new v();
        m = new w();
        n = new x();
        o = new y();
        p = new z();
        q = new aa();
    }

    public static String a(Bundle bundle) {
        return a(bundle, "", new StringBuilder()).toString();
    }

    public static void a(String str, String str2) {
        av.a(str, (Object) str2);
        av.b(str.startsWith("g:") || str.startsWith("e:"), str2 + ": Expecting qualified-id, not gaia-id");
    }

    private static StringBuilder a(Object obj, String str, StringBuilder sb) {
        if (obj == null) {
            sb.append("[null]\n");
        } else {
            String str2 = str + "  ";
            sb.append("(").append(obj.getClass().getSimpleName()).append(") ");
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                if (bundle.isEmpty()) {
                    sb.append("{ }\n");
                } else {
                    sb.append("{\n");
                    for (String str3 : bundle.keySet()) {
                        sb.append(str2).append(str3).append(" : ");
                        a(bundle.get(str3), str2, sb);
                    }
                    sb.append(str).append("}\n");
                }
            } else if (obj instanceof DataHolder) {
                DataHolder dataHolder = (DataHolder) obj;
                sb.append(" [");
                if (dataHolder.b()) {
                    sb.append("CLOSED");
                } else {
                    sb.append(dataHolder.h);
                }
                sb.append("] ").append(obj).append("\n");
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    sb.append("[ ]\n");
                } else {
                    sb.append("[\n");
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        sb.append(str2).append(i2).append(" : ");
                        a(arrayList.get(i2), str2, sb);
                    }
                    sb.append(str).append("]\n");
                }
            } else if (obj instanceof byte[]) {
                int length = ((byte[]) obj).length;
                sb.append(" [").append(length).append("] ");
                byte[] bArr = new byte[Math.min(length, 56)];
                System.arraycopy(obj, 0, bArr, 0, bArr.length);
                sb.append(Base64.encodeToString(bArr, 0));
            } else if (obj instanceof char[]) {
                sb.append("\"").append(new String((char[]) obj)).append("\"\n");
            } else if (obj.getClass().isArray()) {
                if (Array.getLength(obj) == 0) {
                    sb.append("[ ]\n");
                } else {
                    sb.append("[ ");
                    sb.append(Array.get(obj, 0));
                    for (int i3 = 1; i3 < Array.getLength(obj); i3++) {
                        sb.append(", ").append(Array.get(obj, i3));
                    }
                    sb.append(" ]\n");
                }
            } else if (obj instanceof String) {
                sb.append("\"").append(obj).append("\"\n");
            } else {
                sb.append(obj).append("\n");
            }
        }
        return sb;
    }
}
