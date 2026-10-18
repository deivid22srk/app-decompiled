package com.google.gson.b.a;

import com.google.gson.JsonSyntaxException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class x extends com.google.gson.aj<Time> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.ak f7809a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f7810b = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.aj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Time a(com.google.gson.stream.a aVar) {
        Time time;
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            time = null;
        } else {
            try {
                time = new Time(this.f7810b.parse(aVar.i()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
        return time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.aj
    public synchronized void a(com.google.gson.stream.f fVar, Time time) {
        fVar.b(time == null ? null : this.f7810b.format((Date) time));
    }
}
