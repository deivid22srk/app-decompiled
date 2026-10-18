package com.android.a.a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1055a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1056b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    final String i;
    public final String j;
    public final String k;

    /* synthetic */ a(c cVar, byte b2) {
        this(cVar);
    }

    private a(c cVar) {
        this.f1055a = cVar.f1100a.get(e.COUNTRY);
        this.d = cVar.f1100a.get(e.ADMIN_AREA);
        this.e = cVar.f1100a.get(e.LOCALITY);
        this.f = cVar.f1100a.get(e.DEPENDENT_LOCALITY);
        this.g = cVar.f1100a.get(e.POSTAL_CODE);
        this.h = cVar.f1100a.get(e.SORTING_CODE);
        this.i = cVar.f1100a.get(e.ORGANIZATION);
        this.j = cVar.f1100a.get(e.RECIPIENT);
        this.f1056b = cVar.f1100a.get(e.ADDRESS_LINE_1);
        this.c = cVar.f1100a.get(e.ADDRESS_LINE_2);
        this.k = cVar.f1101b;
    }

    public final String a(e eVar) {
        switch (eVar) {
            case COUNTRY:
                return this.f1055a;
            case ADMIN_AREA:
                return this.d;
            case LOCALITY:
                return this.e;
            case DEPENDENT_LOCALITY:
                return this.f;
            case POSTAL_CODE:
                return this.g;
            case SORTING_CODE:
                return this.h;
            case ADDRESS_LINE_1:
                return this.f1056b;
            case ADDRESS_LINE_2:
                return this.c;
            case ORGANIZATION:
                return this.i;
            case RECIPIENT:
                return this.j;
            default:
                throw new IllegalArgumentException("unrecognized key: " + eVar);
        }
    }
}
