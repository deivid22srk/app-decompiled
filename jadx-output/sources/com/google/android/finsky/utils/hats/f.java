package com.google.android.finsky.utils.hats;

import com.google.android.finsky.activities.SurveyActivity;
import com.google.android.finsky.layout.r;

/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f4942a;

    public f(e eVar) {
        this.f4942a = eVar;
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        h.a(1, this.f4942a.c.f4251a, -1, this.f4942a.c.e);
        e eVar = this.f4942a;
        eVar.a();
        eVar.f4940a.startActivity(SurveyActivity.a(eVar.c.f4251a, eVar.c.e, eVar.c.d));
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        h.a(2, this.f4942a.c.f4251a, -1, this.f4942a.c.e);
        this.f4942a.a();
        h.a(this.f4942a.c.f4251a, 1);
    }
}
