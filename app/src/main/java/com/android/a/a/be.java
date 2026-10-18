package com.android.a.a;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f1099a;

    static {
        HashMap hashMap = new HashMap();
        f1099a = hashMap;
        hashMap.put("AM", "hy");
        f1099a.put("CN", "zh");
        f1099a.put("HK", "zh");
        f1099a.put("JP", "ja");
        f1099a.put("KP", "ko");
        f1099a.put("KR", "ko");
        f1099a.put("MO", "zh");
        f1099a.put("TH", "th");
        f1099a.put("TW", "zh");
        f1099a.put("VN", "vi");
    }

    static boolean a(String str) {
        Matcher matcher = Pattern.compile("\\w{2,3}[-_](\\w{4})").matcher(str.toUpperCase());
        return matcher.lookingAt() && matcher.group(1).equals("LATN");
    }

    static String b(String str) {
        Matcher matcher = Pattern.compile("(\\w{2,3})(?:[-_]\\w{4})?(?:[-_]\\w{2})?").matcher(str);
        return matcher.matches() ? matcher.group(1).toLowerCase() : "und";
    }

    static String c(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() != 0) {
            return trim;
        }
        return null;
    }

    static void a(Object obj) {
        a(obj, "This object should not be null.");
    }

    static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    static String a(String str, String... strArr) {
        StringBuilder sb = null;
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (str2 != null) {
                String trim = str2.trim();
                if (trim.length() > 0) {
                    if (sb == null) {
                        sb = new StringBuilder(trim);
                    } else {
                        sb.append(str).append(trim);
                    }
                }
            }
        }
        if (sb == null) {
            return null;
        }
        return sb.toString();
    }

    static Map<String, String> a(String[] strArr, String[] strArr2, String[] strArr3) {
        if (strArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = strArr.length;
        for (String str : strArr) {
            hashMap.put(str.toLowerCase(), str);
        }
        if (strArr2 != null) {
            if (strArr2.length > length) {
                throw new IllegalStateException("names length (" + strArr2.length + ") is greater than keys length (" + strArr.length + ")");
            }
            for (int i = 0; i < length; i++) {
                if (i < strArr2.length && strArr2[i].length() > 0) {
                    hashMap.put(strArr2[i].toLowerCase(), strArr[i]);
                }
            }
        }
        if (strArr3 != null) {
            if (strArr3.length > length) {
                throw new IllegalStateException("lnames length (" + strArr3.length + ") is greater than keys length (" + strArr.length + ")");
            }
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 < strArr3.length && strArr3[i2].length() > 0) {
                    hashMap.put(strArr3[i2].toLowerCase(), strArr[i2]);
                }
            }
            return hashMap;
        }
        return hashMap;
    }

    public static String a(Locale locale, String str) {
        String upperCase = str.toUpperCase();
        if (f1099a.containsKey(upperCase)) {
            String language = locale.getLanguage();
            if (!language.equals(f1099a.get(upperCase))) {
                StringBuilder sb = new StringBuilder(language);
                sb.append("_latn");
                if (locale.getCountry().length() > 0) {
                    sb.append("_");
                    sb.append(locale.getCountry());
                }
                return sb.toString();
            }
        }
        return locale.toString();
    }
}
