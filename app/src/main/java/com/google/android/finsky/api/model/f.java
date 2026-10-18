package com.google.android.finsky.api.model;

import com.google.android.finsky.protos.ga;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends j implements com.android.volley.t<ga> {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.finsky.api.b f1974a;

    /* renamed from: b, reason: collision with root package name */
    private ga f1975b;
    private final List<String> c;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ga gaVar) {
        this.f1975b = gaVar;
        l();
    }

    public f(com.google.android.finsky.api.b bVar, List<String> list, int[] iArr, boolean z) {
        this.f1974a = bVar;
        this.c = list;
        bVar.a(this.c, iArr, z, this, this);
    }

    public final List<Document> b() {
        if (this.f1975b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f1975b.f3856a.length; i++) {
            gx gxVar = this.f1975b.f3856a[i].f3852a;
            if (gxVar == null) {
                new Object[1][0] = this.c.get(i);
            } else {
                arrayList.add(new Document(gxVar));
            }
        }
        return arrayList;
    }

    public final List<String> c() {
        boolean z;
        if (this.f1975b == null) {
            return Collections.emptyList();
        }
        int length = this.f1975b.f3856a.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (this.f1975b.f3856a[i].f3852a != null) {
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return Collections.emptyList();
        }
        ArrayList a2 = cz.a(this.c);
        int length2 = this.f1975b.f3856a.length;
        for (int i2 = 0; i2 < length2; i2++) {
            gx gxVar = this.f1975b.f3856a[i2].f3852a;
            if (gxVar != null) {
                a2.remove(gxVar.f3890a);
            }
        }
        return a2;
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        return this.f1975b != null;
    }
}
