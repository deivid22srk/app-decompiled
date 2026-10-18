package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f4734a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: b, reason: collision with root package name */
    private static final DateFormat f4735b;
    private static final DateFormat c;
    private static final DateFormat d;

    static {
        FinskyApp a2 = FinskyApp.a();
        f4735b = android.text.format.DateFormat.getLongDateFormat(a2);
        c = android.text.format.DateFormat.getDateFormat(a2);
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(a2);
        d = dateFormat;
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static synchronized String a(String str) {
        synchronized (aj.class) {
            try {
                str = f4735b.format(f4734a.parse(str));
            } catch (ParseException e) {
                if (!Pattern.matches("^\\d\\d\\d\\d$", str)) {
                    throw e;
                }
            }
        }
        return str;
    }

    public static Date a(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e) {
            FinskyLog.e("Cannot parse date %s", str);
            return null;
        }
    }

    public static synchronized String a(Date date) {
        String format;
        synchronized (aj.class) {
            format = f4735b.format(date);
        }
        return format;
    }

    public static String a(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }

    public static synchronized String a(long j) {
        String format;
        synchronized (aj.class) {
            format = c.format(new Date(j));
        }
        return format;
    }

    public static synchronized String b(long j) {
        String format;
        synchronized (aj.class) {
            format = d.format(new Date(j));
        }
        return format;
    }
}
