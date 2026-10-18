package com.a.a.a.a;

import com.a.a.af;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.a.a.ab f893a;

    /* renamed from: b, reason: collision with root package name */
    public final af f894b;

    public /* synthetic */ c(com.a.a.ab abVar, af afVar, byte b2) {
        this(abVar, afVar);
    }

    private c(com.a.a.ab abVar, af afVar) {
        this.f893a = abVar;
        this.f894b = afVar;
    }

    public static boolean a(af afVar, com.a.a.ab abVar) {
        switch (afVar.c) {
            case 200:
            case 203:
            case 300:
            case 301:
            case 308:
            case 410:
                break;
            case 302:
            case 307:
                if (afVar.a("Expires") == null && afVar.c().e == -1 && afVar.c().f == -1 && !afVar.c().g) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return (afVar.c().d || abVar.d().d) ? false : true;
    }
}
