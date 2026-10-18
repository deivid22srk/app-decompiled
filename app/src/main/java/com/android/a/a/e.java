package com.android.a.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum e {
    ADMIN_AREA('S', "state"),
    LOCALITY('C', "city"),
    RECIPIENT('N', "name"),
    ORGANIZATION('O', "organization"),
    ADDRESS_LINE_1('1', "street1"),
    ADDRESS_LINE_2('2', "street2"),
    DEPENDENT_LOCALITY('D'),
    POSTAL_CODE('Z'),
    SORTING_CODE('X'),
    STREET_ADDRESS('A'),
    COUNTRY('R');

    private static final Map<Character, e> l = new HashMap();
    private final char m;
    private final String n;

    static {
        for (e eVar : values()) {
            l.put(Character.valueOf(eVar.m), eVar);
        }
    }

    e(char c, String str) {
        this.m = c;
        this.n = str;
    }

    e(char c) {
        this(c, null);
    }

    static e a(char c) {
        return l.get(Character.valueOf(c));
    }
}
