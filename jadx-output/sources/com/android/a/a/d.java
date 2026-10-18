package com.android.a.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
enum d {
    COUNTRIES,
    FMT,
    ID,
    KEY,
    LANG,
    LFMT,
    REQUIRE,
    STATE_NAME_TYPE,
    SUB_KEYS,
    SUB_LNAMES,
    SUB_MORES,
    SUB_NAMES,
    XZIP,
    ZIP,
    ZIP_NAME_TYPE;

    private static final Map<String, d> p = new HashMap();

    static {
        for (d dVar : values()) {
            p.put(dVar.toString().toLowerCase(), dVar);
        }
    }

    static d a(String str) {
        return p.get(str.toLowerCase());
    }
}
