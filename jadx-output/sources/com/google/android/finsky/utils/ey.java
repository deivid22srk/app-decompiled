package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class ey {

    /* renamed from: b, reason: collision with root package name */
    private static fd f4863b;

    /* renamed from: a, reason: collision with root package name */
    private static Set<com.google.android.play.layout.a> f4862a = new HashSet();
    private static android.support.v4.h.g<String, fd> c = new ez();

    public static void a() {
        FinskyApp.a().k.a(new fa());
        FinskyApp.a().p.a(new fb());
        com.google.android.play.layout.b.a().a(new fc());
    }

    static fd a(String str) {
        jm.a();
        return c.a((android.support.v4.h.g<String, fd>) str);
    }

    static void a(String str, gr grVar, boolean z) {
        jm.a();
        if (f4863b == null) {
            fd fdVar = new fd();
            fdVar.f4866a = new gr(grVar);
            fdVar.f4867b = Boolean.valueOf(z).booleanValue();
            c.a(str, fdVar);
            return;
        }
        fd fdVar2 = f4863b;
        gr grVar2 = fdVar2.f4866a;
        grVar2.f4917a = grVar.f4917a;
        grVar2.f4918b = grVar.f4918b;
        grVar2.c = grVar.c;
        grVar2.d = grVar.d;
        grVar2.e = grVar.e;
        fdVar2.f4867b = Boolean.valueOf(z).booleanValue();
        c.a(str, fdVar2);
        if (f4863b == fdVar2) {
            f4863b = null;
        }
    }

    static void b() {
        jm.a();
        c.a(-1);
        f4863b = null;
    }

    static /* synthetic */ void b(String str) {
        jm.a();
        c.b(str);
    }

    static /* synthetic */ void c() {
        jm.a();
        for (com.google.android.play.layout.a aVar : f4862a) {
            fe.a((Document) aVar.getData(), aVar);
        }
    }
}
