package com.google.android.finsky.utils;

import android.text.Html;

/* loaded from: classes.dex */
public abstract class bc {
    public static CharSequence a(String str) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str);
        a(sb, "<p>", "\n\n");
        a(sb, "<br>", "\n");
        int indexOf2 = sb.indexOf("<");
        if (indexOf2 != -1) {
            FinskyLog.a("Doing slow HTML parse due to unexpected tag %s", sb.substring(indexOf2, Math.min(indexOf2 + 10, sb.length())));
            return Html.fromHtml(str);
        }
        int i = 0;
        while (true) {
            int indexOf3 = sb.indexOf("&", i);
            if (indexOf3 != -1 && (indexOf = sb.indexOf(";", indexOf3)) != -1) {
                String substring = sb.substring(indexOf3 + 1, indexOf);
                sb.delete(indexOf3 + 1, indexOf + 1);
                if (substring.charAt(0) == '#') {
                    try {
                        sb.setCharAt(indexOf3, (char) Integer.parseInt(substring.substring(1)));
                    } catch (NumberFormatException e) {
                        FinskyLog.a("Doing slow HTML parse due to unexpected &# escape %s", substring);
                        return Html.fromHtml(str);
                    }
                } else if ("quot".equals(substring)) {
                    sb.setCharAt(indexOf3, '\"');
                } else if ("apos".equals(substring)) {
                    sb.setCharAt(indexOf3, '\'');
                } else if ("amp".equals(substring)) {
                    sb.setCharAt(indexOf3, '&');
                } else if ("lt".equals(substring)) {
                    sb.setCharAt(indexOf3, '<');
                } else {
                    if (!"gt".equals(substring)) {
                        FinskyLog.a("Doing slow HTML parse due to unexpected & escape %s", substring);
                        return Html.fromHtml(str);
                    }
                    sb.setCharAt(indexOf3, '>');
                }
                i = indexOf3 + 1;
            }
            return sb;
        }
    }

    private static void a(StringBuilder sb, String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        while (true) {
            int indexOf = sb.indexOf(str, i);
            if (indexOf == -1) {
                return;
            }
            sb.replace(indexOf, indexOf + length, str2);
            i = indexOf + length2;
        }
    }
}
