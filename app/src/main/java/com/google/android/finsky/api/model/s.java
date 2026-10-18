package com.google.android.finsky.api.model;

import android.text.TextUtils;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s<T extends d<?>> {

    /* renamed from: a, reason: collision with root package name */
    public T f1988a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, i> f1989b = new HashMap();

    public s(T t) {
        this.f1988a = t;
    }

    public final Document a(int i) {
        return (Document) this.f1988a.c(i);
    }

    public final i a(String str) {
        Document document = null;
        for (int i = 0; i < this.f1988a.p() && ((document = (Document) this.f1988a.a(i, false)) == null || !str.equals(document.f1963a.f3890a)); i++) {
        }
        Document document2 = document;
        i iVar = this.f1989b.get(str);
        if (iVar == null) {
            if (document2 == null) {
                FinskyLog.e("Trying to create secondary level list for null cluster doc", new Object[0]);
                return null;
            }
            String str2 = document2.f1963a.y.c;
            iVar = new i(this.f1988a.b(), cz.a(document2.b()), str2, TextUtils.isEmpty(str2) ? false : true);
            this.f1989b.put(str, iVar);
        } else if (document2 != null) {
            iVar.a(document2.b());
        }
        return iVar;
    }

    public final void a() {
        this.f1988a.s();
        for (Map.Entry<String, i> entry : this.f1989b.entrySet()) {
            i value = entry.getValue();
            String key = entry.getKey();
            int p = this.f1988a.p();
            int i = 0;
            while (true) {
                if (i >= p) {
                    break;
                }
                Document document = (Document) this.f1988a.a(i, false);
                if (document == null || !key.equals(document.f1963a.f3890a)) {
                    i++;
                } else if (this.f1988a.b(i)) {
                    value.s();
                } else {
                    value.t();
                }
            }
        }
        this.f1988a.g = null;
    }
}
