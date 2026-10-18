package com.android.a.a;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ba {
    private static final bc d = new bc();

    /* renamed from: a, reason: collision with root package name */
    protected final ad f1094a;

    /* renamed from: b, reason: collision with root package name */
    protected final bc f1095b;
    protected final Map<e, List<f>> c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ba(com.android.a.a.ad r3) {
        /*
            r2 = this;
            com.android.a.a.bc r0 = com.android.a.a.ba.d
            java.util.Map<com.android.a.a.e, java.util.List<com.android.a.a.f>> r1 = com.android.a.a.bd.f1098a
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.a.a.ba.<init>(com.android.a.a.ad):void");
    }

    private ba(ad adVar, bc bcVar) {
        this.f1094a = adVar;
        this.f1095b = bcVar;
        this.c = bd.f1098a;
    }

    protected static void a() {
    }

    protected final boolean a(at atVar, ad adVar, e eVar, String str, g gVar) {
        boolean z;
        List<f> list = this.c.get(eVar);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (f fVar : list) {
            boolean z2 = false;
            String c = be.c(str);
            switch (fVar) {
                case USING_UNUSED_FIELD:
                    if (c != null && !adVar.f1059a.contains(eVar)) {
                        z2 = true;
                        break;
                    }
                    break;
                case MISSING_REQUIRED_FIELD:
                    if (adVar.f1060b.contains(eVar) && c == null) {
                        z2 = true;
                        break;
                    }
                    break;
                case UNKNOWN_VALUE:
                    if (c != null) {
                        String c2 = be.c(c);
                        be.a((Object) c2);
                        if (atVar == null) {
                            z = adVar.c == null || adVar.c.containsKey(c2.toLowerCase());
                        } else {
                            String[] strArr = atVar == at.LATIN ? adVar.e : adVar.f;
                            HashSet hashSet = new HashSet();
                            if (strArr != null) {
                                for (String str2 : strArr) {
                                    hashSet.add(str2.toLowerCase());
                                }
                            }
                            if (adVar.d != null) {
                                for (String str3 : adVar.d) {
                                    hashSet.add(str3.toLowerCase());
                                }
                            }
                            if (hashSet.size() == 0 || c2 == null) {
                                z = true;
                            } else {
                                z = hashSet.contains(c.toLowerCase());
                            }
                        }
                        if (z) {
                            z2 = false;
                            break;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    break;
                case UNRECOGNIZED_FORMAT:
                    if (c != null && adVar.g != null && !adVar.g.matcher(c).matches()) {
                        z2 = true;
                        break;
                    }
                    break;
                case MISMATCHING_VALUE:
                    if (c != null && adVar.h != null && !adVar.h.matcher(c).lookingAt()) {
                        z2 = true;
                        break;
                    }
                    break;
                default:
                    throw new RuntimeException("Unknown problem: " + fVar);
            }
            if (z2) {
                gVar.f1108a.put(eVar, fVar);
            }
            if (!(!z2)) {
                return false;
            }
        }
        return true;
    }
}
