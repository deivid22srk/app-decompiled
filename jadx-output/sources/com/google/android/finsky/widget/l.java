package com.google.android.finsky.widget;

import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.aw;
import com.google.android.finsky.utils.cz;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements com.android.volley.s, x {
    p c;
    boolean d;
    com.google.android.finsky.api.model.i e;
    int f;
    private final com.google.android.play.image.e h;
    private final int[] i;
    private final n j;
    private int l;
    private int k = 0;
    private final int g = 10;

    /* renamed from: a, reason: collision with root package name */
    final List<o> f5218a = cz.a(10);

    /* renamed from: b, reason: collision with root package name */
    final int f5219b = R.dimen.widget_image_max_height;

    public l(com.google.android.play.image.e eVar, int[] iArr, n nVar) {
        this.h = eVar;
        this.i = iArr;
        this.j = nVar;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        boolean z;
        this.f5218a.clear();
        this.d = false;
        this.k = 0;
        int min = Math.min(this.e.p(), this.g);
        this.l = min;
        for (int i = 0; i < min; i++) {
            Document c = this.e.c(i);
            ds a2 = this.j.a(c, this.f);
            if (this.i == null) {
                z = true;
            } else {
                if (c.f1963a.f) {
                    int i2 = c.f1963a.e;
                    for (int i3 : this.i) {
                        if (i3 == i2) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            if (!z || a2 == null || TextUtils.isEmpty(a2.f)) {
                this.l--;
                a();
            } else {
                com.google.android.play.image.j a3 = this.h.a(a2.f, 0, a2.l ? this.f : 0, new m(this, c));
                if (a3.f6944a != null) {
                    a(c, a3, 2);
                }
            }
        }
        a();
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.d = false;
        this.c.a(aw.a(FinskyApp.a(), volleyError));
    }

    final void a(Document document, com.google.android.play.image.j jVar, int i) {
        this.k++;
        if (jVar.f6944a != null) {
            this.f5218a.add(new o(jVar.f6944a, i, document.f1963a.i, document.f1963a.m, document));
        }
        a();
    }

    private void a() {
        if (this.k == this.l) {
            this.c.a();
        }
    }
}
