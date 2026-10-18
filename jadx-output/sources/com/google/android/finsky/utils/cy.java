package com.google.android.finsky.utils;

import android.accounts.Account;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import java.util.List;

/* loaded from: classes.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    private static com.google.android.finsky.g.r f4813a;

    /* renamed from: b, reason: collision with root package name */
    private static com.google.android.finsky.g.r f4814b;

    public static Account a(Document document, com.google.android.finsky.g.h hVar, Account account) {
        if (!a(document, hVar.a(account))) {
            if (document.f1963a.e == 1) {
                return a(document, hVar);
            }
            return null;
        }
        return account;
    }

    public static Account a(List<Document> list, com.google.android.finsky.g.h hVar, Account account) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Account a2 = a(list.get(i), hVar, account);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static Account a(Document document, com.google.android.finsky.g.h hVar) {
        List<com.google.android.finsky.g.a> e = hVar.e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            com.google.android.finsky.g.a aVar = e.get(i);
            if (a(document, aVar)) {
                return aVar.i;
            }
        }
        return null;
    }

    public static boolean a(Document document, com.google.android.finsky.g.p pVar) {
        return a(document.c(), pVar);
    }

    public static boolean a(com.google.android.finsky.protos.dp dpVar, com.google.android.finsky.g.p pVar) {
        return b(dpVar, pVar) != null;
    }

    public static com.google.android.finsky.g.r b(com.google.android.finsky.protos.dp dpVar, com.google.android.finsky.g.p pVar) {
        boolean z = true;
        com.google.android.finsky.g.r b2 = b(dpVar, pVar, 1);
        if (dpVar.e != 4 && dpVar.e != 1) {
            z = false;
        }
        if (b2 == null && z) {
            b2 = b(dpVar, pVar, 3);
        }
        if (b2 == null && dpVar.e == 4) {
            com.google.android.finsky.g.r b3 = b(dpVar, pVar, 7);
            if (b3 == null) {
                return b(dpVar, pVar, 4);
            }
            return b3;
        }
        return b2;
    }

    public static synchronized boolean a(Document document, com.google.android.finsky.g.p pVar, int i) {
        boolean a2;
        synchronized (cy.class) {
            a2 = a(document.c(), pVar, i);
        }
        return a2;
    }

    public static boolean a(com.google.android.finsky.protos.dp dpVar, com.google.android.finsky.g.p pVar, int i) {
        return b(dpVar, pVar, i) != null;
    }

    private static synchronized com.google.android.finsky.g.r b(com.google.android.finsky.protos.dp dpVar, com.google.android.finsky.g.p pVar, int i) {
        com.google.android.finsky.g.r a2;
        synchronized (cy.class) {
            String a3 = com.google.android.finsky.g.a.a(dpVar.e);
            if (f4813a == null) {
                f4813a = com.google.android.finsky.g.r.a(com.google.android.finsky.g.r.f, a3, dpVar, i);
            } else {
                com.google.android.finsky.g.r rVar = f4813a;
                rVar.h = a3;
                rVar.i = dpVar.e;
                rVar.j = dpVar.f3740a;
                rVar.k = dpVar.c;
                rVar.l = i;
            }
            a2 = pVar.a(f4813a);
            if (a2 != null) {
                if (System.currentTimeMillis() >= a2.n) {
                    a2 = null;
                }
            }
        }
        return a2;
    }

    public static com.google.android.finsky.g.r a() {
        if (f4814b == null) {
            f4814b = new com.google.android.finsky.g.r(com.google.android.finsky.g.r.f, com.google.android.finsky.g.a.a(2), 2, com.google.android.finsky.c.d.df.b(), 15, 1);
        }
        return f4814b;
    }

    public static int b(Document document, com.google.android.finsky.g.p pVar) {
        return c(document.c(), pVar);
    }

    private static int c(com.google.android.finsky.protos.dp dpVar, com.google.android.finsky.g.p pVar) {
        if (a(dpVar, pVar, 1)) {
            return 1;
        }
        return a(dpVar, pVar, 7) ? 7 : -1;
    }

    public static boolean c(Document document, com.google.android.finsky.g.p pVar) {
        int b2 = b(document, pVar);
        if (b2 == -1) {
            return false;
        }
        com.google.android.finsky.g.r a2 = pVar.a(com.google.android.finsky.g.r.a(com.google.android.finsky.g.r.f, com.google.android.finsky.g.a.a(document.f1963a.g), document, b2));
        if (a2 == null || !a2.o) {
            return false;
        }
        com.google.android.finsky.protos.ea d = document.d(b2);
        return d == null || Document.a(d);
    }

    public static boolean d(Document document, com.google.android.finsky.g.p pVar) {
        return e(document, pVar) != null;
    }

    public static boolean a(Document document, DfeToc dfeToc, com.google.android.finsky.g.p pVar) {
        if (document.f1963a.g != 0) {
            if (dfeToc != null) {
                if (dfeToc.a(document.f1963a.g) == null) {
                    FinskyLog.a("Corpus for %s is not available.", document.f1963a.f3890a);
                    return false;
                }
            } else if (document.f1963a.g != 3) {
                return false;
            }
        }
        int Q = document.Q();
        boolean z = Q == 1;
        if (!z) {
            if ((document.f1963a.v != null && document.f1963a.v.d) && a(document, pVar)) {
                FinskyLog.a("%s available because owned, overriding [restriction=%d].", document.f1963a.f3890a, Integer.valueOf(Q));
                z = true;
            }
        }
        if (!z) {
            FinskyLog.a("%s not available [restriction=%d].", document.f1963a.f3890a, Integer.valueOf(Q));
        }
        return z;
    }

    public static com.google.android.finsky.protos.dp e(Document document, com.google.android.finsky.g.p pVar) {
        com.google.android.finsky.protos.dp[] b2;
        if (document.f1963a.g == 4 && !document.aS()) {
            com.google.android.finsky.protos.ae aeVar = document.f1963a.C;
            if (aeVar != null && aeVar.O != null) {
                b2 = aeVar.O.i;
            } else {
                b2 = com.google.android.finsky.protos.dp.b();
            }
            for (com.google.android.finsky.protos.dp dpVar : b2) {
                int c = c(dpVar, pVar);
                if (c != -1) {
                    com.google.android.finsky.g.r a2 = pVar.a(com.google.android.finsky.g.r.a(com.google.android.finsky.g.r.f, com.google.android.finsky.g.a.a(dpVar.e), dpVar, c));
                    if (a2 != null && a2.o) {
                        return dpVar;
                    }
                }
            }
        }
        return null;
    }
}
