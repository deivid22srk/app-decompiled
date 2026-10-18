package com.google.android.finsky.wear;

import android.content.Context;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class bc {
    private static final String[] e = {"com.google.android.gms"};

    /* renamed from: a, reason: collision with root package name */
    final Context f5112a;

    /* renamed from: b, reason: collision with root package name */
    final String f5113b;
    final com.google.android.finsky.gpkg.h c;
    final com.google.android.finsky.bpkg.a d;
    private final WearSupportService f;
    private final com.google.android.finsky.api.k g;
    private final h h;
    private final int i;
    private final String j;
    private com.google.android.finsky.api.model.t k;

    public bc(WearSupportService wearSupportService, Context context, String str, com.google.android.finsky.gpkg.h hVar, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.api.k kVar, h hVar2, int i, String str2) {
        this.f = wearSupportService;
        this.f5112a = context;
        this.f5113b = str;
        this.c = hVar;
        this.d = aVar;
        this.g = kVar;
        this.h = hVar2;
        this.i = i;
        this.j = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(bg bgVar, boolean z) {
        if (bgVar != null) {
            bgVar.a(z);
        }
    }

    static /* synthetic */ boolean a(bc bcVar, List list, String[] strArr) {
        boolean z;
        boolean z2;
        FinskyLog.a("*** BulkDetails node %s returned %d documents", bcVar.f5113b, Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            com.google.android.finsky.protos.ag E = ((Document) it.next()).E();
            if (strArr.length > 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    }
                    if (E.w.equals(strArr[i])) {
                        z = false;
                        break;
                    }
                    i++;
                }
            } else {
                z = false;
            }
            FinskyLog.a("***  pkg=%s v=%d blocked=%b", E.w, Integer.valueOf(E.e), Boolean.valueOf(z));
            if (z) {
                z2 = z3;
            } else {
                bcVar.h.a(bcVar.f5113b, E.w, E.e, null, "wear_auto_update");
                z2 = true;
            }
            z3 = z2;
        }
        return z3;
    }
}
