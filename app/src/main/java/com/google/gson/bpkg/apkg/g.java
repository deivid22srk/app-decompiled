package com.google.gson.bpkg.apkg;

import com.google.gson.JsonSyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class g extends com.google.gson.aj<Date> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.ak f7789a = new h();

    /* renamed from: b, reason: collision with root package name */
    public final DateFormat f7790b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    public final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    public final DateFormat d;

    public g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.d = simpleDateFormat;
    }

    public synchronized Date a(String str) {
        Date parse;
        try {
            parse = this.c.parse(str);
        } catch (ParseException e) {
            try {
                parse = this.f7790b.parse(str);
            } catch (ParseException e2) {
                try {
                    parse = this.d.parse(str);
                } catch (ParseException e3) {
                    throw new JsonSyntaxException(str, e3);
                }
            }
        }
        return parse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.aj
    public synchronized void a(com.google.gson.stream.f fVar, Date date) {
        if (date == null) {
            fVar.e();
        } else {
            fVar.b(this.f7790b.format(date));
        }
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Date a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return a(aVar.i());
    }
}
