package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class a implements ad<Date>, x<Date> {

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f7756a;

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f7757b;
    private final DateFormat c;

    @Override // com.google.gson.ad
    public final /* synthetic */ y serialize(Date date, Type type, ac acVar) {
        return a(date);
    }

    a() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public a(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    public a(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    private a(DateFormat dateFormat, DateFormat dateFormat2) {
        this.f7756a = dateFormat;
        this.f7757b = dateFormat2;
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private y a(Date date) {
        ab abVar;
        synchronized (this.f7757b) {
            abVar = new ab(this.f7756a.format(date));
        }
        return abVar;
    }

    private Date a(y yVar) {
        Date parse;
        synchronized (this.f7757b) {
            try {
                parse = this.f7757b.parse(yVar.b());
            } catch (ParseException e) {
                try {
                    parse = this.f7756a.parse(yVar.b());
                } catch (ParseException e2) {
                    try {
                        parse = this.c.parse(yVar.b());
                    } catch (ParseException e3) {
                        throw new JsonSyntaxException(yVar.b(), e3);
                    }
                }
            }
        }
        return parse;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a.class.getSimpleName());
        sb.append('(').append(this.f7757b.getClass().getSimpleName()).append(')');
        return sb.toString();
    }

    @Override // com.google.gson.x
    public final /* synthetic */ Date deserialize(y yVar, Type type, w wVar) {
        if (!(yVar instanceof ab)) {
            throw new JsonParseException("The date should be a string value");
        }
        Date a2 = a(yVar);
        if (type != Date.class) {
            if (type == Timestamp.class) {
                return new Timestamp(a2.getTime());
            }
            if (type == java.sql.Date.class) {
                return new java.sql.Date(a2.getTime());
            }
            throw new IllegalArgumentException(getClass() + " cannot deserialize to " + type);
        }
        return a2;
    }
}
