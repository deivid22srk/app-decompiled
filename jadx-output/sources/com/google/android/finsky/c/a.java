package com.google.android.finsky.c;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.protos.ContentFilters;
import com.google.android.finsky.protos.ev;
import com.google.android.finsky.protos.ew;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static Pattern f2449b = Pattern.compile(Character.toString(':'));
    private static Pattern c = Pattern.compile(Character.toString(';'));

    /* renamed from: a, reason: collision with root package name */
    static int f2448a = -1;

    public static void a(boolean z, ContentFilters.ContentFilterSettingsResponse contentFilterSettingsResponse, b[] bVarArr, o<String> oVar, o<String> oVar2) {
        if (!z) {
            oVar2.c();
            return;
        }
        if (bVarArr != null && contentFilterSettingsResponse != null) {
            oVar.a((o<String>) a(bVarArr));
            ew[] ewVarArr = contentFilterSettingsResponse.f3574a;
            StringBuilder sb = new StringBuilder();
            for (ew ewVar : ewVarArr) {
                int i = 0;
                while (true) {
                    if (i >= bVarArr.length) {
                        break;
                    }
                    String a2 = a(ewVar, bVarArr[i]);
                    if (a2 == null) {
                        i++;
                    } else {
                        sb.append(a2);
                        break;
                    }
                }
            }
            oVar2.a((o<String>) sb.toString());
        }
    }

    public static b[] a(o<String> oVar) {
        b[] a2 = a(oVar.a());
        if (a2 == null) {
            oVar.c();
        }
        return a2;
    }

    public static int a(ew ewVar, b[] bVarArr) {
        for (int i = 0; bVarArr != null && i < bVarArr.length; i++) {
            if (a(ewVar.f3804a, bVarArr[i].f2450a) && ewVar.f3805b == bVarArr[i].f2451b) {
                return i;
            }
        }
        return -1;
    }

    public static ev b(ew ewVar, b[] bVarArr) {
        int a2 = a(ewVar, bVarArr);
        b bVar = a2 == -1 ? null : bVarArr[a2];
        for (ev evVar : ewVar.d) {
            if (a(evVar, bVar)) {
                return evVar;
            }
        }
        return null;
    }

    public static Intent a(ew[] ewVarArr, b[] bVarArr) {
        Intent intent = new Intent();
        for (ew ewVar : ewVarArr) {
            ev b2 = b(ewVar, bVarArr);
            if (b2 != null) {
                for (int i : ewVar.f3804a) {
                    intent.putExtra(String.valueOf(i), a(ewVar, b2));
                }
            }
        }
        return intent;
    }

    public static Bundle a(ew ewVar, ev evVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("authority", ewVar.f3805b);
        bundle.putInt("filter_level", evVar.f3802a);
        bundle.putString("label", evVar.d);
        if (evVar.c != null && evVar.c.f != null) {
            bundle.putString("icon", evVar.c.f);
        }
        return bundle;
    }

    public static boolean a(ev evVar, b bVar) {
        if (bVar == null) {
            return evVar.h;
        }
        return evVar.f3803b ? bVar.c == evVar.f3802a : bVar.c == f2448a;
    }

    public static b[] a(b[] bVarArr, ew ewVar, ev evVar) {
        b[] bVarArr2;
        int i = f2448a;
        if (evVar.f3803b) {
            i = evVar.f3802a;
        }
        b bVar = new b(ewVar.f3804a, ewVar.f3805b, i);
        for (int i2 = 0; bVarArr != null && i2 < bVarArr.length; i2++) {
            if (a(ewVar.f3804a, bVarArr[i2].f2450a)) {
                bVarArr[i2] = bVar;
                return bVarArr;
            }
        }
        if (bVarArr == null) {
            bVarArr2 = new b[1];
        } else {
            bVarArr2 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
        }
        bVarArr2[bVarArr2.length - 1] = bVar;
        return bVarArr2;
    }

    public static String a(b[] bVarArr) {
        String[] strArr = new String[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            b bVar = bVarArr[i];
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < bVar.f2450a.length; i2++) {
                stringBuffer.append(bVar.f2450a[i2]);
                if (i2 + 1 < bVar.f2450a.length) {
                    stringBuffer.append(':');
                }
            }
            stringBuffer.append(';');
            stringBuffer.append(bVar.f2451b);
            stringBuffer.append(';');
            stringBuffer.append(bVar.c);
            strArr[i] = stringBuffer.toString();
        }
        return jm.a(strArr);
    }

    public static b[] a(String str) {
        if (str != null && str.length() > 0) {
            String[] d = jm.d(str);
            b[] bVarArr = new b[d.length];
            for (int i = 0; i < d.length; i++) {
                b b2 = b(d[i]);
                if (b2 == null) {
                    return null;
                }
                bVarArr[i] = b2;
            }
            return bVarArr;
        }
        return new b[0];
    }

    private static b b(String str) {
        String[] split = c.split(str);
        if (split.length < 3) {
            FinskyLog.d("Incorrect number of values, expected at least 3 in: %s", str);
            return null;
        }
        String[] split2 = f2449b.split(split[0]);
        int[] iArr = new int[split2.length];
        for (int i = 0; i < split2.length; i++) {
            try {
                iArr[i] = Integer.parseInt(split2[i]);
            } catch (NumberFormatException e) {
                FinskyLog.a(e, "Could not parse number selection values from: %s", split[i]);
                return null;
            }
        }
        try {
            try {
                return new b(iArr, Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            } catch (NumberFormatException e2) {
                FinskyLog.a(e2, "Could not parse number selection values from: %s", split[2]);
                return null;
            }
        } catch (NumberFormatException e3) {
            FinskyLog.a(e3, "Could not parse number selection values from: %s", split[1]);
            return null;
        }
    }

    private static String a(ew ewVar, b bVar) {
        if (bVar.f2451b < 0 || bVar.f2450a == null) {
            FinskyLog.d("Badly formatted ContentFilterSelection authorityId is negative or documentTypes is null. [ContentFilterSelection=%s]", bVar);
            return null;
        }
        if (!ewVar.c || ewVar.f3804a == null) {
            FinskyLog.d("Badly formatted FilterRange authorityId is missing or documentType is null. [FilterRange=%s]", ewVar);
            return null;
        }
        if (ewVar.f3805b == bVar.f2451b && a(ewVar.f3804a, bVar.f2450a)) {
            for (int i = 0; i < ewVar.d.length; i++) {
                ev evVar = ewVar.d[i];
                if (evVar.f3803b && evVar.g && bVar.c == evVar.f3802a) {
                    return evVar.f;
                }
            }
        }
        return null;
    }

    private static boolean a(int[] iArr, int[] iArr2) {
        for (int i : iArr2) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }
}
