package android.support.v4.g;

import java.util.Locale;

/* loaded from: classes.dex */
class i {
    private i() {
    }

    /* synthetic */ i(byte b2) {
        this();
    }

    public int a(Locale locale) {
        String str;
        String str2;
        if (locale != null && !locale.equals(h.f277a)) {
            String a2 = a.a(locale);
            if (a2 == null) {
                switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                    case 1:
                    case 2:
                        return 1;
                    default:
                        return 0;
                }
            }
            str = h.c;
            if (a2.equalsIgnoreCase(str)) {
                return 1;
            }
            str2 = h.d;
            if (a2.equalsIgnoreCase(str2)) {
                return 1;
            }
        }
        return 0;
    }
}
