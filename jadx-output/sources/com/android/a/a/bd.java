package com.android.a.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<e, List<f>> f1098a;

    static {
        HashMap hashMap = new HashMap();
        a(hashMap, e.COUNTRY, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD, f.UNKNOWN_VALUE);
        a(hashMap, e.ADMIN_AREA, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD, f.UNKNOWN_VALUE);
        a(hashMap, e.LOCALITY, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD, f.UNKNOWN_VALUE);
        a(hashMap, e.DEPENDENT_LOCALITY, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD, f.UNKNOWN_VALUE);
        a(hashMap, e.POSTAL_CODE, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD, f.UNRECOGNIZED_FORMAT, f.MISMATCHING_VALUE);
        a(hashMap, e.STREET_ADDRESS, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD);
        a(hashMap, e.SORTING_CODE, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD);
        a(hashMap, e.ORGANIZATION, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD);
        a(hashMap, e.RECIPIENT, f.USING_UNUSED_FIELD, f.MISSING_REQUIRED_FIELD);
        f1098a = Collections.unmodifiableMap(hashMap);
    }

    private static void a(Map<e, List<f>> map, e eVar, f... fVarArr) {
        map.put(eVar, Collections.unmodifiableList(Arrays.asList(fVarArr)));
    }
}
