package com.google.android.finsky.api.model;

import android.text.TextUtils;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.je;
import com.google.android.finsky.protos.qm;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends d<je> {
    public String c;
    public String d;
    private qm e;

    @Override // com.google.android.finsky.api.model.y
    protected final /* synthetic */ Document[] b(Object obj) {
        int i = 0;
        je jeVar = (je) obj;
        if (jeVar.f3991b == null || jeVar.f3991b.length == 0) {
            return new Document[0];
        }
        Document[] a2 = a(jeVar.f3991b[0]);
        if (TextUtils.isEmpty(this.c)) {
            return a2;
        }
        while (true) {
            if (i >= a2.length) {
                i = -1;
                break;
            }
            if (a2[i].f1963a.f3890a.equals(this.c)) {
                break;
            }
            i++;
        }
        return i == -1 ? a2 : (Document[]) com.google.android.finsky.utils.p.a(a2, i);
    }

    @Override // com.google.android.finsky.api.model.y
    protected final /* bridge */ /* synthetic */ String c(Object obj) {
        je jeVar = (je) obj;
        if (jeVar.f3991b.length != 1) {
            return null;
        }
        gx gxVar = jeVar.f3991b[0];
        if (gxVar.y == null) {
            return null;
        }
        return gxVar.y.c;
    }

    public i(com.google.android.finsky.api.b bVar, String str, boolean z, qm qmVar) {
        super(bVar, str, z);
        this.c = null;
        this.d = str;
        this.e = qmVar;
    }

    public i(com.google.android.finsky.api.b bVar, String str, boolean z) {
        this(bVar, str, z, (qm) null);
    }

    public i(com.google.android.finsky.api.b bVar, List<Document> list, String str, boolean z) {
        super(bVar, list, str, z);
        this.c = null;
        this.d = str;
        this.e = null;
    }

    public final void a(Document[] documentArr) {
        if (documentArr != null) {
            int min = Math.min(documentArr.length, this.j.size());
            for (int i = 0; i < min; i++) {
                this.j.set(i, documentArr[i]);
            }
        }
    }

    @Override // com.google.android.finsky.api.model.y
    public final void a(String str) {
        this.d = str;
        super.a(str);
    }

    @Override // com.google.android.finsky.api.model.y
    protected final com.android.volley.l<?> b(String str) {
        return this.f1971b.b(str, this.e, this, this);
    }

    @Override // com.google.android.finsky.api.model.y
    protected final void d() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.k.size()) {
                this.f1971b.b(this.k.get(i2).f2000b);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
