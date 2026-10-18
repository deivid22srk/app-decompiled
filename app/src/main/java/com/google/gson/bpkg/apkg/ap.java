package com.google.gson.bpkg.apkg;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class ap extends com.google.gson.aj<Calendar> {
    ap() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Calendar calendar) {
        if (calendar == null) {
            fVar.e();
            return;
        }
        fVar.c();
        fVar.a("year");
        fVar.a(r4.get(1));
        fVar.a("month");
        fVar.a(r4.get(2));
        fVar.a("dayOfMonth");
        fVar.a(r4.get(5));
        fVar.a("hourOfDay");
        fVar.a(r4.get(11));
        fVar.a("minute");
        fVar.a(r4.get(12));
        fVar.a("second");
        fVar.a(r4.get(13));
        fVar.d();
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Calendar a(com.google.gson.stream.a aVar) {
        int i = 0;
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        aVar.c();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (aVar.f() != com.google.gson.stream.e.END_OBJECT) {
            String h = aVar.h();
            int n = aVar.n();
            if ("year".equals(h)) {
                i6 = n;
            } else if ("month".equals(h)) {
                i5 = n;
            } else if ("dayOfMonth".equals(h)) {
                i4 = n;
            } else if ("hourOfDay".equals(h)) {
                i3 = n;
            } else if ("minute".equals(h)) {
                i2 = n;
            } else if ("second".equals(h)) {
                i = n;
            }
        }
        aVar.d();
        return new GregorianCalendar(i6, i5, i4, i3, i2, i);
    }
}
