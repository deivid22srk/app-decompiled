package com.google.android.finsky.adapters;

import android.content.Context;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.jx;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class bc<T extends com.google.android.finsky.api.model.d<?>> extends CardRecyclerViewAdapter<T> implements jx {
    private Set<String> x;

    public bc(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.model.s<T> sVar, cy cyVar, boolean z) {
        super(context, bVar, bVar2, eVar, dfeToc, acVar, sVar, null, z, false, cyVar);
        this.x = new HashSet();
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, com.google.android.finsky.adapters.al, com.google.android.finsky.api.model.x
    public final void m_() {
        this.x.clear();
        super.m_();
    }

    @Override // com.google.android.finsky.utils.jx
    public final void a(String str, boolean z, boolean z2) {
        if (!z2) {
            if (z) {
                this.x.remove(str);
            } else {
                this.x.add(str);
            }
            this.f774a.a();
            return;
        }
        if (!z) {
            this.x.remove(str);
            T t = this.r.f1988a;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= t.p()) {
                    break;
                }
                if (!str.equals(((Document) t.c(i2)).f1963a.f3890a)) {
                    i = i2 + 1;
                } else {
                    t.d(i2);
                    break;
                }
            }
            a((bc<T>) t);
        }
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final boolean a(Document document) {
        return this.x.contains(document.f1963a.f3890a);
    }
}
