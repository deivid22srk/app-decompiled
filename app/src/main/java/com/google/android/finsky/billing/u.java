package com.google.android.finsky.billing;

import android.content.Context;
import android.graphics.Rect;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.protos.cd;
import com.google.android.finsky.protos.db;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.protos.sa;
import com.google.android.finsky.utils.SetupWizardUtils;
import com.google.android.finsky.utils.hy;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2441a = Pattern.compile("<em>");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2442b = Pattern.compile("</em>");

    public static String a(Context context, String str) {
        if (TextUtils.isEmpty(null)) {
            str = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso().toUpperCase();
        }
        if (TextUtils.isEmpty(str)) {
            return "US";
        }
        return str;
    }

    public static String a(String str) {
        if (str.contains("%locale%")) {
            Locale locale = Locale.getDefault();
            return str.replace("%locale%", locale.getLanguage() + "_" + locale.getCountry().toLowerCase());
        }
        return str;
    }

    public static int a(ViewGroup viewGroup, View view) {
        Rect rect = new Rect();
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return rect.top;
    }

    public static <T extends View> T a(ViewGroup viewGroup, Collection<T> collection) {
        Pair pair = null;
        for (T t : collection) {
            int a2 = a(viewGroup, t);
            pair = (pair == null || a2 < ((Integer) pair.first).intValue()) ? Pair.create(Integer.valueOf(a2), t) : pair;
        }
        if (pair != null) {
            return (T) pair.second;
        }
        return null;
    }

    public static String a() {
        return hy.a(String.valueOf(com.google.android.finsky.api.d.p.b()).getBytes());
    }

    public static sa a(String str, List<sa> list) {
        if (!TextUtils.isEmpty(str)) {
            for (sa saVar : list) {
                if (str.equals(saVar.f4367a)) {
                    return saVar;
                }
            }
        }
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public static com.android.a.a.ah a(int i) {
        com.android.a.a.ai a2 = new com.android.a.a.ai().a(com.android.a.a.e.COUNTRY).a(com.android.a.a.e.RECIPIENT).a(com.android.a.a.e.ORGANIZATION).a(com.android.a.a.e.DEPENDENT_LOCALITY).a(com.android.a.a.e.SORTING_CODE);
        if (i == 1) {
            a2.a(com.android.a.a.e.ADDRESS_LINE_1).a(com.android.a.a.e.ADDRESS_LINE_2);
            a2.a(com.android.a.a.e.LOCALITY);
            a2.a(com.android.a.a.e.ADMIN_AREA).a(com.android.a.a.e.STREET_ADDRESS);
        }
        return a2.a();
    }

    public static com.android.a.a.a a(com.google.android.finsky.protos.v vVar) {
        com.android.a.a.c cVar = new com.android.a.a.c();
        if (vVar.q != null) {
            cVar.a(vVar.q);
        }
        if (vVar.g != null) {
            cVar.e(vVar.g);
        }
        if (vVar.i != null) {
            cVar.f(vVar.i);
        }
        if (vVar.m != null) {
            cVar.b(vVar.m);
        }
        if (vVar.k != null) {
            cVar.c(vVar.k);
        }
        if (vVar.s != null) {
            cVar.a(com.android.a.a.e.DEPENDENT_LOCALITY, vVar.s);
        }
        if (vVar.o != null) {
            cVar.d(vVar.o);
        }
        if (vVar.u != null) {
            cVar.a(com.android.a.a.e.SORTING_CODE, vVar.u);
        }
        if (vVar.f4415a != null) {
            cVar.g(vVar.f4415a);
        }
        if (vVar.w != null) {
            cVar.f1101b = vVar.w;
        }
        return cVar.a();
    }

    public static com.google.android.finsky.protos.v a(com.android.a.a.a aVar, int[] iArr) {
        com.google.android.finsky.protos.v vVar = new com.google.android.finsky.protos.v();
        for (int i : iArr) {
            switch (i) {
                case 4:
                    if (aVar.j != null) {
                        vVar.f4415a = aVar.j;
                        vVar.f4416b = true;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (aVar.f1056b != null) {
                        vVar.g = aVar.f1056b;
                        vVar.h = true;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (aVar.c != null) {
                        vVar.i = aVar.c;
                        vVar.j = true;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (aVar.e != null) {
                        vVar.k = aVar.e;
                        vVar.l = true;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (aVar.d != null) {
                        vVar.m = aVar.d;
                        vVar.n = true;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (aVar.g != null) {
                        vVar.o = aVar.g;
                        vVar.p = true;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (aVar.f1055a != null) {
                        vVar.q = aVar.f1055a;
                        vVar.r = true;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (aVar.f != null) {
                        vVar.s = aVar.f;
                        vVar.t = true;
                        break;
                    } else {
                        break;
                    }
            }
        }
        if (aVar.h != null) {
            vVar.u = aVar.h;
            vVar.v = true;
        }
        if (aVar.k != null) {
            vVar.w = aVar.k;
            vVar.x = true;
        }
        return vVar;
    }

    public static int a(io ioVar) {
        if (ioVar.f == 2 && ioVar.n != null) {
            cd cdVar = ioVar.n;
            if (cdVar.h) {
                return cdVar.g;
            }
        }
        return 0;
    }

    public static db b(int i) {
        return a(i, (String) null);
    }

    public static db a(int i, String str) {
        db dbVar = new db();
        dbVar.f3715a = i;
        dbVar.f3716b = true;
        if (!TextUtils.isEmpty(str)) {
            dbVar.c = str;
            dbVar.d = true;
        }
        return dbVar;
    }

    public static int b() {
        return a((SetupWizardUtils.SetupWizardParams) null);
    }

    public static int a(SetupWizardUtils.SetupWizardParams setupWizardParams) {
        if (setupWizardParams == null) {
            return android.R.style.Theme_InstrumentManager_BuyFlow;
        }
        return setupWizardParams.c ? android.R.style.Theme_InstrumentManager_SetupWizard_Light : android.R.style.Theme_InstrumentManager_SetupWizard;
    }

    public static Spanned a(String str, int i) {
        return Html.fromHtml(f2442b.matcher(f2441a.matcher(str).replaceAll("<b><font color=\"" + String.format("#%06X", Integer.valueOf(16777215 & i)) + "\">")).replaceAll("</font></b>"));
    }
}
