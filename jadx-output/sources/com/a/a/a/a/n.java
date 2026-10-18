package com.a.a.a.a;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
final class n extends ThreadLocal<DateFormat> {
    n() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ DateFormat initialValue() {
        TimeZone timeZone;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        timeZone = m.f905a;
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat;
    }
}
