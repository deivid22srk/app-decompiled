package com.google.android.finsky.api.model;

import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r extends j implements x {

    /* renamed from: a, reason: collision with root package name */
    private VolleyError f1986a;

    /* renamed from: b, reason: collision with root package name */
    protected final List<f> f1987b = new ArrayList();

    public final void a(com.google.android.finsky.api.b bVar, List<String> list, int[] iArr, boolean z) {
        f fVar = new f(bVar, list, iArr, z);
        fVar.a((x) this);
        fVar.a((com.android.volley.s) this);
        this.f1987b.add(fVar);
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        for (int i = 0; i < this.f1987b.size(); i++) {
            if (!this.f1987b.get(i).a()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f1987b.size()) {
                f fVar = this.f1987b.get(i2);
                if (!fVar.i() && fVar.a()) {
                    i = i2 + 1;
                } else {
                    return;
                }
            } else {
                b();
                l();
                return;
            }
        }
    }

    @Override // com.google.android.finsky.api.model.j, com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.f1986a == null) {
            b(volleyError);
            this.f1986a = volleyError;
        }
    }

    protected void b() {
    }

    @Override // com.google.android.finsky.api.model.j
    public final VolleyError h() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean i() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.finsky.api.model.j
    protected final void j() {
        throw new UnsupportedOperationException();
    }
}
