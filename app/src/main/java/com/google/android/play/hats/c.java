package com.google.android.play.hats;

import com.google.android.finsky.protos.pk;
import com.google.android.finsky.protos.pl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f6884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6885b;
    public final List<d> c = new ArrayList();

    public c(pl plVar) {
        this.f6884a = plVar.f4255a;
        this.f6885b = plVar.c;
        for (pk pkVar : plVar.e) {
            this.c.add(new d(pkVar.f4253a, pkVar.d, pkVar.c.f, pkVar.c.l));
        }
    }
}
