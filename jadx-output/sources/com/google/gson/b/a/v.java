package com.google.gson.b.a;

import com.google.gson.JsonSyntaxException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public final class v extends com.google.gson.aj<Date> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.ak f7807a = new w();

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f7808b = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.aj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Date a(com.google.gson.stream.a aVar) {
        Date date;
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            date = null;
        } else {
            try {
                date = new Date(this.f7808b.parse(aVar.i()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
        return date;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.aj
    public synchronized void a(com.google.gson.stream.f fVar, Date date) {
        fVar.b(date == null ? null : this.f7808b.format((java.util.Date) date));
    }
}
