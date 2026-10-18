package com.google.android.finsky.autoupdate;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.bpkg.y;
import com.google.android.finsky.protos.ag;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f2032a = 7;

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator<a> f2033b = new b();
    public final Document c;
    public final y d;
    public int e;
    public int f;
    public int g;
    public String h;
    public int i;
    public int j;
    public int k;
    public int l;

    public a(Document document, y yVar) {
        this.c = document;
        this.d = yVar;
    }

    public final String toString() {
        ag E = this.c.E();
        return String.format("%s v:%d", E.w, Integer.valueOf(E.e));
    }
}
