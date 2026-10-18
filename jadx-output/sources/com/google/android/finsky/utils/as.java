package com.google.android.finsky.utils;

import android.content.res.Resources;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f4748a;

    static {
        HashMap hashMap = new HashMap();
        f4748a = hashMap;
        hashMap.put("app", 3);
        f4748a.put("album", 2);
        f4748a.put("artist", 2);
        f4748a.put("book", 1);
        f4748a.put("device", 5);
        f4748a.put("magazine", 6);
        f4748a.put("magazineissue", 6);
        f4748a.put("newsedition", 6);
        f4748a.put("newsissue", 6);
        f4748a.put("movie", 4);
        f4748a.put("song", 2);
        f4748a.put("tvepisode", 7);
        f4748a.put("tvseason", 7);
        f4748a.put("tvshow", 7);
    }

    public static int a(String str) {
        int length = str.length();
        if (length <= 0) {
            return -1;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '-' || charAt == ':') {
                Integer num = f4748a.get(str.substring(0, i));
                if (num != null) {
                    return num.intValue();
                }
                return -1;
            }
        }
        return 3;
    }

    public static String b(String str) {
        if (str.startsWith("subs:")) {
            return f(str);
        }
        return null;
    }

    public static String c(String str) {
        if (str.startsWith("inapp:")) {
            return f(str);
        }
        return null;
    }

    private static String f(String str) {
        int indexOf = str.indexOf(58);
        int indexOf2 = str.indexOf(58, indexOf + 1);
        if (indexOf <= 0 || indexOf >= indexOf2 || indexOf2 >= str.length()) {
            return null;
        }
        return str.substring(indexOf + 1, indexOf2);
    }

    public static String d(String str) {
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf <= 0 || lastIndexOf >= str.length()) {
            return null;
        }
        return str.substring(lastIndexOf + 1, str.length());
    }

    public static String a(long j, Resources resources) {
        String string;
        long j2 = 0;
        if (j < 0) {
            return "";
        }
        int i = 0;
        while (j >= 990) {
            j2 = 1023 & j;
            j >>= 10;
            i++;
        }
        switch (i) {
            case 0:
                if (resources != null) {
                    string = resources.getString(R.string.byteShort);
                    break;
                } else {
                    string = "B";
                    break;
                }
            case 1:
                if (resources != null) {
                    string = resources.getString(R.string.kilobyteShort);
                    break;
                } else {
                    string = "KB";
                    break;
                }
            case 2:
                if (resources != null) {
                    string = resources.getString(R.string.megabyteShort);
                    break;
                } else {
                    string = "MB";
                    break;
                }
            case 3:
                if (resources != null) {
                    string = resources.getString(R.string.gigabyteShort);
                    break;
                } else {
                    string = "GB";
                    break;
                }
            case 4:
                if (resources != null) {
                    string = resources.getString(R.string.terabyteShort);
                    break;
                } else {
                    string = "TB";
                    break;
                }
            case 5:
                if (resources != null) {
                    string = resources.getString(R.string.petabyteShort);
                    break;
                } else {
                    string = "PB";
                    break;
                }
            case 6:
                if (resources != null) {
                    string = resources.getString(R.string.exabyteShort);
                    break;
                } else {
                    string = "EB";
                    break;
                }
            default:
                string = "";
                break;
        }
        if (j >= 10) {
            return ((int) Math.round((j2 / 1024.0d) + j)) + " " + string;
        }
        return (Math.round(((j2 / 1024.0d) + j) * 10.0d) / 10.0d) + " " + string;
    }

    public static boolean a(com.google.android.finsky.g.h hVar, String str) {
        Iterator<com.google.android.finsky.g.a> it = hVar.e().iterator();
        while (it.hasNext()) {
            List<com.google.android.finsky.g.u> g = it.next().g(str);
            for (int i = 0; i < g.size(); i++) {
                if (g.get(i).e) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int a(Document document) {
        int Q = document.Q();
        int i = R.string.availability_restriction_generic;
        switch (Q) {
            case 2:
                i = R.string.availability_restriction_country;
                break;
            case 8:
                i = R.string.availability_restriction_not_in_group;
                break;
            case 9:
                if (document.f1963a.e == 1) {
                    i = R.string.availability_restriction_hardware_app;
                    break;
                } else {
                    i = R.string.availability_restriction_hardware;
                    break;
                }
            case 10:
                i = R.string.availability_restriction_carrier;
                break;
            case 11:
                i = R.string.availability_restriction_country_or_carrier;
                break;
            case 12:
                i = R.string.availability_restriction_search_level;
                break;
            case 21:
                i = R.string.availability_restriction_for_managed_account;
                break;
            case 22:
                i = R.string.availability_restriction_missing_permission;
                break;
        }
        FinskyLog.a("Item is not available. Reason: " + Q, new Object[0]);
        return i;
    }

    public static int a(com.google.android.finsky.protos.ea[] eaVarArr) {
        int i;
        int i2 = 0;
        for (com.google.android.finsky.protos.ea eaVar : eaVarArr) {
            if (eaVar.i && ((i = eaVar.A) == 1 || i == 7 || i == 3 || i == 4)) {
                i2++;
            }
        }
        return i2;
    }

    public static com.google.android.finsky.protos.ea b(com.google.android.finsky.protos.ea[] eaVarArr) {
        return a(eaVarArr, true, (au) null);
    }

    public static com.google.android.finsky.protos.ea a(com.google.android.finsky.protos.ea[] eaVarArr, boolean z, au auVar) {
        com.google.android.finsky.protos.ea eaVar;
        int i;
        com.google.android.finsky.protos.ea eaVar2 = null;
        int length = eaVarArr.length;
        int i2 = 0;
        long j = Long.MAX_VALUE;
        while (i2 < length) {
            com.google.android.finsky.protos.ea eaVar3 = eaVarArr[i2];
            if (eaVar3.i && (((i = eaVar3.A) == 1 || i == 7 || i == 3 || i == 4) && (auVar == null || auVar.a(i)))) {
                long j2 = eaVar3.d;
                if ((z || j2 != 0) && j2 < j) {
                    j = j2;
                    eaVar = eaVar3;
                    i2++;
                    eaVar2 = eaVar;
                }
            }
            eaVar = eaVar2;
            i2++;
            eaVar2 = eaVar;
        }
        return eaVar2;
    }

    private static float b(com.google.android.finsky.protos.ea eaVar) {
        if (!eaVar.s) {
            return 0.0f;
        }
        long j = eaVar.r;
        long j2 = j - eaVar.d;
        if (j <= 0 || j2 <= 0) {
            return 0.0f;
        }
        return j2 / j;
    }

    public static boolean a(com.google.android.finsky.protos.ea eaVar) {
        return b(eaVar) > 0.0f;
    }

    private static com.google.android.finsky.protos.ea c(com.google.android.finsky.protos.ea[] eaVarArr) {
        float f;
        float f2 = 0.0f;
        com.google.android.finsky.protos.ea eaVar = null;
        int length = eaVarArr.length;
        int i = 0;
        while (i < length) {
            com.google.android.finsky.protos.ea eaVar2 = eaVarArr[i];
            float b2 = b(eaVar2);
            if (b2 > f2) {
                f = b2;
            } else {
                eaVar2 = eaVar;
                f = f2;
            }
            i++;
            f2 = f;
            eaVar = eaVar2;
        }
        return eaVar;
    }

    public static com.google.android.finsky.protos.ea a(Document document, DfeToc dfeToc, com.google.android.finsky.g.p pVar, int i) {
        if (document == null) {
            return null;
        }
        if ((document.f1963a.e != 17 && document.f1963a.e != 25) || !cy.a(document, dfeToc, pVar)) {
            return null;
        }
        for (com.google.android.finsky.protos.ea eaVar : document.f1963a.u) {
            if (eaVar.A == i) {
                return eaVar;
            }
        }
        return null;
    }

    public static List<Document> c(Document document, DfeToc dfeToc, com.google.android.finsky.g.p pVar) {
        if (!document.aM()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List<Document> aN = document.aN();
        int size = aN.size();
        for (int i = 0; i < size; i++) {
            Document document2 = aN.get(i);
            if (cy.a(document2, dfeToc, pVar) && document2.f1963a.u.length > 0) {
                arrayList.add(document2);
            }
        }
        return arrayList;
    }

    public static com.google.android.finsky.protos.dp a(int i, int i2, String str) {
        com.google.android.finsky.protos.dp dpVar = new com.google.android.finsky.protos.dp();
        dpVar.e = i;
        dpVar.f = true;
        dpVar.c = i2;
        dpVar.d = true;
        dpVar.f3740a = str;
        dpVar.f3741b = true;
        return dpVar;
    }

    public static boolean a(com.google.android.finsky.protos.dp dpVar) {
        return dpVar.e == 3 && (dpVar.c == 11 || dpVar.c == 15);
    }

    public static String a(int i, String str) {
        return String.format("id-%d-%d-%s", 2, Integer.valueOf(i), str);
    }

    public static String e(String str) {
        return "movie-" + str;
    }

    public static boolean a(com.google.android.finsky.g.h hVar, Document document) {
        switch (document.f1963a.e) {
            case 1:
                return !hVar.a(document.E().w).isEmpty();
            case 2:
            case 5:
            case 6:
            case 16:
            case 18:
            case 24:
                return true;
            default:
                return false;
        }
    }

    public static com.google.android.finsky.protos.ea a(Document document, DfeToc dfeToc, com.google.android.finsky.g.p pVar) {
        List<Document> c;
        int size;
        com.google.android.finsky.protos.ea[] eaVarArr;
        com.google.android.finsky.protos.ea a2;
        if (document.f1963a.e == 16 || document.f1963a.e == 24) {
            com.google.android.finsky.protos.jl K = document.K();
            if ((K == null || !K.i) && (size = (c = c(document, dfeToc, pVar)).size()) > 0) {
                if (size != 1) {
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        i += c.get(i2).f1963a.u.length;
                    }
                    com.google.android.finsky.protos.ea[] eaVarArr2 = new com.google.android.finsky.protos.ea[i];
                    int i3 = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        com.google.android.finsky.protos.ea[] eaVarArr3 = c.get(i4).f1963a.u;
                        System.arraycopy(eaVarArr3, 0, eaVarArr2, i3, eaVarArr3.length);
                        i3 += eaVarArr3.length;
                    }
                    eaVarArr = eaVarArr2;
                } else {
                    eaVarArr = c.get(0).f1963a.u;
                }
                com.google.android.finsky.protos.ea a3 = a(eaVarArr, false, (au) null);
                com.google.android.finsky.protos.ea a4 = a3 == null ? a(eaVarArr, true, (au) null) : a3;
                if (a4 != null) {
                    return a4;
                }
            }
            Document b2 = b(document);
            if (b2 == null || (a2 = a(b2, dfeToc, pVar, 1)) == null || !a2.i) {
                return null;
            }
            return a2;
        }
        return a(document.f1963a.u, true, (au) null);
    }

    public static com.google.android.finsky.protos.ea b(Document document, DfeToc dfeToc, com.google.android.finsky.g.p pVar) {
        com.google.android.finsky.protos.ea a2;
        float f;
        if (document.f1963a.e == 16 || document.f1963a.e == 24) {
            List<Document> c = c(document, dfeToc, pVar);
            float f2 = 0.0f;
            com.google.android.finsky.protos.ea eaVar = null;
            int size = c.size();
            int i = 0;
            while (i < size) {
                com.google.android.finsky.protos.ea c2 = c(c.get(i).f1963a.u);
                if (c2 != null) {
                    float b2 = b(c2);
                    if (b2 > f2) {
                        f = b2;
                        i++;
                        f2 = f;
                        eaVar = c2;
                    }
                }
                c2 = eaVar;
                f = f2;
                i++;
                f2 = f;
                eaVar = c2;
            }
            Document b3 = b(document);
            return (b3 == null || (a2 = a(b3, dfeToc, pVar, 1)) == null || !a2.i || b(a2) <= f2) ? eaVar : a2;
        }
        return c(document.f1963a.u);
    }

    public static Document b(Document document) {
        if (document.f1963a.e != 16 && document.f1963a.e != 24) {
            throw new IllegalArgumentException("This method should be called only on magazine docs. Passed type " + document.f1963a.e);
        }
        if (document.a() == 0) {
            return null;
        }
        return document.a(0);
    }
}
