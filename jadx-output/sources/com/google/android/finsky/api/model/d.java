package com.google.android.finsky.api.model;

import com.google.android.finsky.protos.gx;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d<T> extends y<T, Document> {

    /* renamed from: a, reason: collision with root package name */
    public Document f1970a;

    /* renamed from: b, reason: collision with root package name */
    protected com.google.android.finsky.api.b f1971b;

    protected d(com.google.android.finsky.api.b bVar, String str) {
        super(str);
        this.f1971b = bVar;
    }

    protected d(com.google.android.finsky.api.b bVar, String str, boolean z) {
        super(str, z);
        this.f1971b = bVar;
    }

    protected d(com.google.android.finsky.api.b bVar, List<Document> list, String str, boolean z) {
        super(list, str, z);
        this.f1971b = bVar;
    }

    public final void a(com.google.android.finsky.api.b bVar) {
        this.f1971b = bVar;
    }

    public final com.google.android.finsky.api.b b() {
        return this.f1971b;
    }

    protected final Document[] a(gx gxVar) {
        if (gxVar != null) {
            this.f1970a = new Document(gxVar);
            int length = gxVar.x.length;
            Document[] documentArr = new Document[length];
            for (int i = 0; i < length; i++) {
                documentArr[i] = new Document(gxVar.x[i]);
            }
            return documentArr;
        }
        return new Document[0];
    }

    public int c() {
        if (this.f1970a == null) {
            return 0;
        }
        return this.f1970a.f1963a.g;
    }
}
