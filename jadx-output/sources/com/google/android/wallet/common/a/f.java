package com.google.android.wallet.common.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f7253b = Pattern.compile("/");
    private static final Pattern c = Pattern.compile("--");
    private static final char[] d = a.a();
    private static final Pattern e = Pattern.compile("(\\\\d|\\d|[^\\^\\w])");
    private static final Pattern f = Pattern.compile("^[\\w \\-]+$");

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7252a = Pattern.compile("[_-]");

    public static int[] a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = o.b(strArr[i]);
        }
        return iArr;
    }

    public static String a(JSONObject jSONObject, String str) {
        if (jSONObject == null || str == null) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static String[] b(JSONObject jSONObject, String str) {
        String a2 = a(jSONObject, str);
        if (a2 == null) {
            return null;
        }
        return a2.split("~");
    }

    public static int[] a(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (iArr == null) {
            return null;
        }
        SparseArray sparseArray = new SparseArray(274);
        sparseArray.put(858, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i5 : iArr) {
            if (i5 != 0 && i5 != 858) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            String b2 = b(intValue);
            if (TextUtils.isEmpty(b2)) {
                Log.w("AddressUtils", new StringBuilder(39).append("Region code '").append(intValue).append("' without label").toString());
                b2 = "";
            }
            sparseArray.put(intValue, b2);
        }
        Collections.sort(arrayList, new g(Collator.getInstance(Locale.getDefault()), sparseArray));
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < size) {
            int intValue2 = ((Integer) arrayList.get(i6)).intValue();
            if (intValue2 != i7) {
                i3 = i8 + 1;
            } else {
                intValue2 = i7;
                i3 = i8;
            }
            i6++;
            i8 = i3;
            i7 = intValue2;
        }
        int[] iArr2 = new int[i8];
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            int intValue3 = ((Integer) arrayList.get(i10)).intValue();
            if (intValue3 != i4) {
                iArr2[i9] = intValue3;
                i = i9 + 1;
                i2 = intValue3;
            } else {
                i = i9;
                i2 = i4;
            }
            i10++;
            i4 = i2;
            i9 = i;
        }
        return iArr2;
    }

    public static String a(Context context, char c2, JSONObject jSONObject) {
        switch (c2) {
            case '1':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_address_line_1);
            case '2':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_address_line_2);
            case '3':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_address_line_3);
            case 'A':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_address_line_1);
            case 'C':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_locality);
            case 'D':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_dependent_locality);
            case 'N':
                throw new IllegalArgumentException("Recipient labels should be read from an AddressForm proto.");
            case 'O':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_organization);
            case 'R':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_country);
            case 'S':
                String a2 = a(jSONObject, "state_name_type");
                if ("province".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_province);
                }
                if ("state".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_state);
                }
                if ("area".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_area);
                }
                if ("county".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_county);
                }
                if ("department".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_department);
                }
                if ("district".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_district);
                }
                if ("do_si".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_do_si);
                }
                if ("emirate".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_emirate);
                }
                if ("island".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_island);
                }
                if ("parish".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_parish);
                }
                if ("prefecture".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_prefecture);
                }
                if ("region".equals(a2)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_region);
                }
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_admin_area_province);
            case 'X':
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_sorting_code);
            case 'Z':
                String a3 = a(jSONObject, "zip_name_type");
                if ("postal".equals(a3)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_postal_code);
                }
                if ("zip".equals(a3)) {
                    return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_zip_code);
                }
                return context.getString(com.google.android.wallet.e.j.wallet_uic_address_field_postal_code);
            default:
                return null;
        }
    }

    public static int a(char c2) {
        switch (c2) {
            case '1':
                return com.google.android.wallet.e.g.address_field_address_line_1;
            case '2':
                return com.google.android.wallet.e.g.address_field_address_line_2;
            case '3':
                return com.google.android.wallet.e.g.address_field_address_line_3;
            case 'A':
                return com.google.android.wallet.e.g.address_field_address_line_1;
            case 'C':
                return com.google.android.wallet.e.g.address_field_locality;
            case 'D':
                return com.google.android.wallet.e.g.address_field_dependent_locality;
            case 'N':
                return com.google.android.wallet.e.g.address_field_recipient;
            case 'O':
                return com.google.android.wallet.e.g.address_field_organization;
            case 'R':
                return com.google.android.wallet.e.g.address_field_country;
            case 'S':
                return com.google.android.wallet.e.g.address_field_admin_area;
            case 'X':
                return com.google.android.wallet.e.g.address_field_sorting_code;
            case 'Z':
                return com.google.android.wallet.e.g.address_field_postal_code;
            default:
                return 0;
        }
    }

    public static int a(int i) {
        switch (i) {
            case 1:
                return com.google.android.wallet.e.g.address_field_country;
            case 2:
                return com.google.android.wallet.e.g.address_field_recipient;
            case 3:
                return com.google.android.wallet.e.g.address_field_address_line_1;
            case 4:
                return com.google.android.wallet.e.g.address_field_address_line_2;
            case 5:
                return com.google.android.wallet.e.g.address_field_locality;
            case 6:
                return com.google.android.wallet.e.g.address_field_admin_area;
            case 7:
                return com.google.android.wallet.e.g.address_field_postal_code;
            case 8:
                return com.google.android.wallet.e.g.address_field_phone_number;
            case 9:
                return com.google.android.wallet.e.g.address_field_sorting_code;
            case 10:
                return com.google.android.wallet.e.g.address_field_dependent_locality;
            case 11:
                return com.google.android.wallet.e.g.address_field_organization;
            default:
                throw new IllegalArgumentException(new StringBuilder(40).append("Unexpected addressFormField: ").append(i).toString());
        }
    }

    public static char[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new UnknownFormatConversionException("Cannot convert null/empty formats");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = c(str).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.matches("%.") && !next.equals("%n")) {
                arrayList.add(Character.valueOf(next.charAt(1)));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            char charValue = ((Character) it2.next()).charValue();
            if (charValue == 'A') {
                arrayList2.add('1');
                arrayList2.add('2');
                arrayList2.add('3');
            } else {
                arrayList2.add(Character.valueOf(charValue));
            }
        }
        char[] cArr = new char[arrayList2.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < cArr.length) {
                cArr[i2] = ((Character) arrayList2.get(i2)).charValue();
                i = i2 + 1;
            } else {
                return cArr;
            }
        }
    }

    public static boolean a(char c2, JSONObject jSONObject) {
        if (c2 == 'N') {
            return true;
        }
        String a2 = a(jSONObject, "require");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        if (c2 == '1') {
            c2 = 'A';
        }
        return a2.contains(String.valueOf(c2));
    }

    public static int a(JSONObject jSONObject) {
        String a2;
        if (jSONObject == null || (a2 = a(jSONObject, "id")) == null) {
            return 0;
        }
        String[] split = f7253b.split(a2);
        switch (split.length) {
            case 2:
            case 3:
                return o.b(c.split(split[1])[0]);
            default:
                String valueOf = String.valueOf(a2);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid address data id: ".concat(valueOf) : new String("Invalid address data id: "));
        }
    }

    public static Pattern b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String a2 = a(jSONObject, "zip");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String a3 = a(jSONObject, "id");
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        switch (f7253b.split(a3).length) {
        }
        return null;
    }

    public static Pattern b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Pattern.compile(new StringBuilder(String.valueOf(str).length() + 4).append("(").append(str).append(").*").toString(), 2);
    }

    public static boolean c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        String a2 = a(jSONObject, "zip");
        return !TextUtils.isEmpty(a2) && e.matcher(a2).replaceAll("").length() == 0;
    }

    public static String d(JSONObject jSONObject) {
        boolean matches;
        if (jSONObject == null) {
            return null;
        }
        String a2 = a(jSONObject, "zip");
        if (TextUtils.isEmpty(a2)) {
            matches = false;
        } else {
            matches = f.matcher(a2).matches();
        }
        if (matches) {
            return a2;
        }
        return null;
    }

    public static String c(JSONObject jSONObject, String str) {
        String[] strArr;
        String[] b2;
        int i;
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr2 = {str};
        String[] strArr3 = new String[1];
        Pattern b3 = b(jSONObject);
        if (b3 != null) {
            String[] b4 = b(jSONObject, "sub_zips");
            if (b4 == null || b4.length == 0) {
                strArr = strArr3;
                return strArr[0];
            }
            for (int i2 = 0; i2 <= 0; i2++) {
                String str2 = strArr2[0];
                if (!TextUtils.isEmpty(str2) && b3.matcher(str2).matches()) {
                    int i3 = -1;
                    int i4 = 0;
                    int i5 = 0;
                    int length = b4.length;
                    while (i5 < length) {
                        Matcher matcher = b(b4[i5]).matcher(str2);
                        if (matcher.matches()) {
                            int length2 = matcher.group(1).length();
                            if (i3 == -1 || length2 > i4) {
                                i4 = length2;
                                i = i5;
                                i5++;
                                i3 = i;
                            }
                        }
                        i = i3;
                        i5++;
                        i3 = i;
                    }
                    if (i3 >= 0 && (b2 = b(jSONObject, "sub_keys")) != null && i3 < b2.length) {
                        strArr3[0] = b2[i3];
                    }
                }
            }
        }
        strArr = strArr3;
        return strArr[0];
    }

    public static ArrayList<com.google.c.a.b> a(Collection<com.google.c.a.b> collection, char[] cArr) {
        if (collection == null) {
            return null;
        }
        if (cArr == null) {
            cArr = d;
        } else {
            for (int i = 0; i < cArr.length; i++) {
                if (!a.a(cArr[i])) {
                    cArr[i] = 0;
                }
            }
        }
        ArrayList<com.google.c.a.b> arrayList = new ArrayList<>(collection);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int size2 = arrayList.size() - 1;
            while (true) {
                if (size2 < 0) {
                    break;
                }
                if (size != size2 && a(arrayList.get(size), arrayList.get(size2), cArr)) {
                    arrayList.remove(size);
                    break;
                }
                size2--;
            }
        }
        return arrayList;
    }

    private static boolean a(com.google.c.a.b bVar, com.google.c.a.b bVar2, char[] cArr) {
        if (bVar == null || bVar2 == null || cArr == null) {
            return false;
        }
        boolean z = false;
        for (char c2 : cArr) {
            if (c2 != 0) {
                String a2 = b.a(bVar, c2);
                if (TextUtils.isEmpty(a2)) {
                    continue;
                } else {
                    if (!a2.equals(b.a(bVar2, c2))) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean d(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!jSONObject.has("lname") && !jSONObject.has("sub_lnames") && !jSONObject.has("lfmt")) {
            return false;
        }
        String a2 = a(jSONObject, "lang");
        if (TextUtils.isEmpty(a2)) {
            return a(a(jSONObject), str);
        }
        return a(a2, Locale.ENGLISH.getLanguage()) || !a(a2, str);
    }

    public static String e(JSONObject jSONObject, String str) {
        String[] b2 = b(jSONObject, "languages");
        if (b2 == null || b2.length <= 1) {
            return null;
        }
        String a2 = a(jSONObject, "lang");
        if (TextUtils.isEmpty(a2) || a(a2, str)) {
            return null;
        }
        for (String str2 : b2) {
            if (a(str2, str)) {
                return str2;
            }
        }
        return null;
    }

    private static ArrayList<String> c(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        boolean z = false;
        for (char c2 : str.toCharArray()) {
            if (z) {
                if ("%n".equals(new StringBuilder(2).append("%").append(c2).toString())) {
                    arrayList.add("%n");
                    z = false;
                } else {
                    if (!a.a(c2)) {
                        throw new UnknownFormatConversionException(new StringBuilder(37).append("Cannot determine AddressField for '").append(c2).append("'").toString());
                    }
                    arrayList.add(new StringBuilder(2).append("%").append(c2).toString());
                    z = false;
                }
            } else if (c2 == '%') {
                z = true;
            } else {
                arrayList.add(Character.toString(c2));
            }
        }
        return arrayList;
    }

    public static String b(int i) {
        Locale locale = Locale.getDefault();
        return new Locale(locale.getLanguage(), o.a(i), locale.getVariant()).getDisplayCountry();
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return f7252a.split(str)[0].equalsIgnoreCase(f7252a.split(str2)[0]);
    }

    public static boolean a(int i, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        switch (i) {
            case 37:
            case 167:
                str2 = "ar";
                break;
            case 45:
                str2 = "hy";
                break;
            case 110:
            case 267:
            case 431:
            case 663:
                str2 = "zh";
                break;
            case 336:
                str2 = "ja";
                break;
            case 368:
            case 370:
                str2 = "ko";
                break;
            case 597:
                str2 = "ru";
                break;
            case 648:
                str2 = "th";
                break;
            case 673:
                str2 = "uk";
                break;
            case 718:
                str2 = "vi";
                break;
            default:
                str2 = null;
                break;
        }
        return (TextUtils.isEmpty(str2) || a(str2, str)) ? false : true;
    }
}
