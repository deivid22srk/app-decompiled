package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class gl {

    /* renamed from: a, reason: collision with root package name */
    static String f4906a;

    /* renamed from: b, reason: collision with root package name */
    static boolean f4907b;
    static boolean c;
    static boolean d;
    static boolean e;
    static boolean f;

    public static void a(Account account, com.google.android.finsky.receivers.f fVar, com.google.android.finsky.g.h hVar, com.google.android.finsky.b.a aVar, DfeToc dfeToc, int i, Document document, gq gqVar) {
        boolean z;
        gqVar.a();
        gqVar.f4916b = document.f1963a.g;
        com.google.android.finsky.g.a a2 = hVar.a(account);
        com.google.android.finsky.protos.ea a3 = as.a(document, dfeToc, a2);
        Account a4 = cy.a(document, hVar, account);
        boolean z2 = a4 != null;
        boolean z3 = z2 && cy.c(document, a2);
        boolean z4 = !z2 && cy.d(document, a2);
        if (a3 != null || z3 || z4 || document.P()) {
            gqVar.f4915a = z2;
            switch (gqVar.f4916b) {
                case 1:
                case 2:
                case 4:
                    if (z2) {
                        if (z3) {
                            gqVar.a(9, document, a4);
                            gqVar.c = 3;
                            break;
                        } else {
                            gqVar.a(6, document, a4);
                            if (cy.a(document, a2, 3) || cy.a(document, a2, 4)) {
                                gqVar.c = 7;
                            } else {
                                gqVar.c = 6;
                            }
                            if (gqVar.f4916b == 4 && !com.google.android.play.utils.j.a(FinskyApp.a()) && !document.aS()) {
                                gqVar.a(12, document, account);
                                break;
                            }
                        }
                    } else if (z4) {
                        gqVar.a(16, document, account);
                        break;
                    } else if (cy.a(document, dfeToc, a2)) {
                        a(document, a3, account, a2, i, gqVar);
                        break;
                    }
                    break;
                case 3:
                    a(account);
                    gqVar.f4915a = false;
                    if (a4 == null) {
                        a4 = account;
                    }
                    if (a3 == null) {
                        if (document.P()) {
                            if (FinskyApp.a().z.a(document.f1963a.f3890a, a4)) {
                                gqVar.c = 11;
                                break;
                            } else {
                                gqVar.c = 10;
                                break;
                            }
                        }
                    } else {
                        if (document.f1963a.e == 1) {
                            com.google.android.finsky.protos.ag E = document.E();
                            com.google.android.finsky.activities.a aVar2 = new com.google.android.finsky.activities.a(E.w, aVar, hVar);
                            if (aVar2.f1527a) {
                                if (aVar2.l) {
                                    gqVar.c = 2;
                                    gqVar.a(14, document, a4);
                                } else if (aVar2.b(document)) {
                                    if (fVar.i(E.w) != 0) {
                                        gqVar.c = 9;
                                    } else {
                                        gqVar.a(8, a3, document, a4);
                                        gqVar.c = 5;
                                    }
                                } else {
                                    gqVar.a(6, document, a4);
                                }
                                gqVar.f4915a = true;
                                break;
                            } else if (fVar.i(E.w) != 0) {
                                gqVar.c = 1;
                                break;
                            }
                        }
                        if (cy.a(document, dfeToc, a2)) {
                            if (z2 && a3.w) {
                                boolean z5 = e && i == 2 && document.f1963a.g == 3 && document.s() > 0;
                                gqVar.f4915a = true;
                                gqVar.a(z5 ? 18 : 7, a3, document, a4);
                                gqVar.c = 6;
                                break;
                            } else if (cy.a(document, dfeToc, a2)) {
                                a(document, a3, a4, a2, i, gqVar);
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                default:
                    FinskyLog.e("Unsupported backend: %d", Integer.valueOf(document.f1963a.g));
                    if (cy.a(document, dfeToc, a2)) {
                        a(document, a3, account, a2, i, gqVar);
                        break;
                    }
                    break;
                case 6:
                    boolean a5 = FinskyApp.a().e().a(12602952L);
                    if (a3 != null) {
                        gqVar.e = a3.h;
                        if (a(a3)) {
                            gqVar.f = a3.t;
                        }
                    }
                    Document b2 = (document.f1963a.e == 16 || document.f1963a.e == 24) ? as.b(document) : (document.f1963a.e == 17 || document.f1963a.e == 25) ? document : null;
                    boolean z6 = false;
                    boolean z7 = false;
                    if (b2 != null) {
                        if (cy.a(b2, hVar, account) != null) {
                            z6 = true;
                        } else if (a5 && cy.a(b2, a2, 2)) {
                            z7 = true;
                        }
                        if (z6 || z7) {
                            gqVar.f4915a = true;
                            gqVar.a(6, b2, account);
                        }
                    }
                    boolean z8 = document.f1963a.e == 16 || document.f1963a.e == 17;
                    if (document.aM()) {
                        if (cy.a(document.aN(), hVar, account) != null) {
                            if (b2 == null) {
                                gqVar.f4915a = true;
                                gqVar.a(6, document, account);
                            }
                            gqVar.c = 8;
                            z = false;
                        } else if (cy.a(document, dfeToc, a2)) {
                            com.google.android.finsky.protos.ea a6 = as.a(b2, dfeToc, a2, 1);
                            com.google.android.finsky.protos.ea a7 = as.a(b2, dfeToc, a2, 2);
                            if (a5 && z8 && !z6 && ((a6 != null && a6.d > 0) || a7 != null)) {
                                gqVar.a(15, a3, false, document, account);
                                z = true;
                            } else {
                                gqVar.a(2, a3, false, document, account);
                            }
                        }
                        if (z6 && b2 != null && cy.a(b2, dfeToc, a2)) {
                            boolean z9 = 17 == b2.f1963a.e;
                            com.google.android.finsky.protos.ea a8 = as.a(b2, dfeToc, a2, 1);
                            com.google.android.finsky.protos.ea a9 = as.a(b2, dfeToc, a2, 2);
                            if (a9 != null && !z7) {
                                if (a5 && z9) {
                                    gqVar.a(11, a9, b2, account);
                                } else {
                                    gqVar.a(6, b2, account);
                                }
                                if (a5 && z9 && !document.aM() && a8 != null && a8.d > 0) {
                                    gqVar.a(4, a8, b2, account);
                                }
                            } else if (a8 != null) {
                                if (!a8.w) {
                                    gqVar.a(19, a8, b2, account);
                                } else if (!a5 || !z || a8.d == 0) {
                                    gqVar.a(a8.d > 0 ? 4 : 7, a8, b2, account);
                                }
                            }
                            if (!gqVar.c()) {
                                gqVar.c = 4;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z6) {
                    }
                    break;
            }
        }
    }

    static boolean a(com.google.android.finsky.protos.ea eaVar) {
        return eaVar.e && eaVar.s && eaVar.u && eaVar.r > eaVar.d;
    }

    private static synchronized void a(Account account) {
        synchronized (gl.class) {
            if (!TextUtils.equals(f4906a, account.name)) {
                com.google.android.finsky.d.d d2 = FinskyApp.a().d(account.name);
                boolean a2 = d2.a(12602778L);
                f4907b = a2;
                c = !a2 && d2.a(12602779L);
                d = d2.a(12602780L);
                e = d2.a(12603516L);
                f = d2.a(12603329L);
                f4906a = account.name;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.google.android.finsky.api.model.Document r18, com.google.android.finsky.protos.ea r19, android.accounts.Account r20, com.google.android.finsky.g.p r21, int r22, com.google.android.finsky.utils.gq r23) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.utils.gl.a(com.google.android.finsky.api.model.Document, com.google.android.finsky.protos.ea, android.accounts.Account, com.google.android.finsky.g.p, int, com.google.android.finsky.utils.gq):void");
    }

    public static void a(gp gpVar, int i, gr grVar) {
        a(gpVar, i, true, true, grVar);
    }

    public static void a(gp gpVar, int i, boolean z, boolean z2, gr grVar) {
        int i2 = R.string.buy;
        grVar.a();
        switch (gpVar.f4913a) {
            case 1:
                if (gpVar.e == 0) {
                    if (gpVar.d) {
                        i2 = R.string.purchase_resolution;
                    }
                    grVar.f4917a = i2;
                } else if (i == 3) {
                    if (!z2) {
                        i2 = -1;
                    }
                    grVar.f4917a = i2;
                } else if (i == 4) {
                    if (gpVar.e == 7) {
                        grVar.f4917a = R.string.buy_hd;
                    } else {
                        grVar.f4917a = R.string.buy_sd;
                    }
                } else if (z2) {
                    grVar.f4917a = R.string.buy;
                } else {
                    grVar.f4917a = -1;
                }
                grVar.f4918b = gpVar.f4914b;
                grVar.c = gpVar.c;
                break;
            case 2:
                grVar.f4917a = R.string.magazine_subscribe;
                break;
            case 3:
                if (gpVar.e == 0) {
                    grVar.f4917a = gpVar.d ? R.string.rent_resolution : R.string.rent;
                } else if (i == 4) {
                    if (gpVar.e == 4) {
                        grVar.f4917a = R.string.rent_hd;
                    } else {
                        grVar.f4917a = R.string.rent_sd;
                    }
                } else {
                    grVar.f4917a = R.string.rent;
                }
                grVar.f4918b = gpVar.f4914b;
                grVar.c = gpVar.c;
                break;
            case 4:
                grVar.f4917a = z ? R.string.magazine_buy_current_long : R.string.magazine_buy_current;
                grVar.f4918b = gpVar.f4914b;
                grVar.c = gpVar.c;
                break;
            case 5:
                if (i == 4) {
                    if (gpVar.e == 7) {
                        grVar.f4917a = R.string.preorder_hd;
                    } else {
                        grVar.f4917a = R.string.preorder_sd;
                    }
                } else {
                    grVar.f4917a = R.string.preorder;
                }
                grVar.f4918b = gpVar.f4914b;
                grVar.c = gpVar.c;
                break;
            case 6:
                switch (i) {
                    case 1:
                    case 6:
                        grVar.f4917a = R.string.read;
                        break;
                    case 2:
                        grVar.f4917a = R.string.listen;
                        break;
                    case 3:
                    case 5:
                    default:
                        grVar.f4917a = R.string.open;
                        break;
                    case 4:
                        grVar.f4917a = R.string.play;
                        break;
                }
            case 7:
            case 19:
                if (i == 3) {
                    grVar.f4917a = R.string.install;
                    break;
                } else if (i == 6) {
                    grVar.f4917a = R.string.add_to_newsstand;
                    break;
                } else {
                    grVar.f4917a = R.string.add_to_library;
                    break;
                }
            case 8:
                grVar.f4917a = R.string.updates_list_state;
                break;
            case 9:
                grVar.f4917a = R.string.cancel_preorder;
                break;
            case 10:
            case 11:
                grVar.f4917a = R.string.sample;
                break;
            case 12:
                grVar.f4917a = R.string.download;
                break;
            case 13:
                grVar.f4917a = R.string.purchase_or_rent_resolution;
                grVar.f4918b = gpVar.f4914b;
                grVar.c = gpVar.c;
                break;
            case 14:
                grVar.f4917a = R.string.enable;
                break;
            case 15:
                grVar.f4917a = R.string.buy_no_price;
                break;
            case 16:
                grVar.f4917a = R.string.view_bundle;
                break;
            case 17:
                if (i == 3) {
                    grVar.f4917a = R.string.buy_with_size;
                    grVar.f4918b = gpVar.f4914b;
                    grVar.c = gpVar.c;
                    grVar.d = gpVar.g;
                    break;
                } else {
                    FinskyLog.e("Unsupported backend for %d", Integer.valueOf(gpVar.f4913a));
                    break;
                }
            case 18:
                if (i == 3) {
                    grVar.f4917a = R.string.install_with_size;
                    grVar.d = gpVar.g;
                    break;
                } else {
                    FinskyLog.e("Unsupported backend for %d", Integer.valueOf(gpVar.f4913a));
                    break;
                }
            default:
                FinskyLog.e("Unrecognized action %d", Integer.valueOf(gpVar.f4913a));
                break;
        }
    }

    public static boolean a(gp gpVar) {
        return (gpVar.f4913a == 9 || gpVar.f4913a == 12 || gpVar.f4913a == 16) ? false : true;
    }

    public static View.OnClickListener a(gp gpVar, int i, com.google.android.finsky.navigationmanager.b bVar, String str, com.google.android.finsky.layout.play.cy cyVar, Context context) {
        int i2 = 200;
        switch (gpVar.f4913a) {
            case 1:
            case 13:
            case 15:
            case 17:
                if (gpVar.e == 7) {
                    i2 = 232;
                    break;
                } else if (i == 4) {
                    i2 = 231;
                    break;
                }
                break;
            case 2:
                i2 = 226;
                break;
            case 3:
                if (gpVar.e == 4) {
                    i2 = 229;
                    break;
                } else if (i == 4) {
                    i2 = 228;
                    break;
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
            case 10:
                return bVar.a(gpVar.h, gpVar.i, cyVar);
            case 7:
            case 18:
                i2 = 221;
                break;
            case 8:
                i2 = 217;
                break;
            case 9:
            case 12:
            case 16:
            default:
                FinskyLog.e("Unrecognized action %d", gpVar);
                return null;
            case 11:
                i2 = 222;
                break;
            case 14:
                return new go(gpVar, context);
            case 19:
                return new gm(cyVar, bVar, gpVar, str);
        }
        return bVar.a(gpVar.i, gpVar.h, gpVar.e, gpVar.f, str, i2, cyVar);
    }
}
