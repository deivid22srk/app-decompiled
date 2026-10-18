package com.google.android.finsky.search;

import android.content.Context;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f4528a = null;

    /* renamed from: b, reason: collision with root package name */
    private final int f4529b;
    private final o f;
    private final int g;
    private final boolean h;
    private final g i;
    private boolean j;
    private com.android.volley.l k;

    public h(Context context, int i, String str, o oVar, boolean z, g gVar) {
        super(str, context);
        this.g = i;
        this.f = oVar;
        this.h = z;
        this.f4529b = context.getResources().getDimensionPixelSize(R.dimen.play_search_suggestion_icon_size);
        this.i = gVar;
        if (f4528a == null) {
            f4528a = Boolean.valueOf(this.d.getPackageManager().hasSystemFeature("com.google.android.tv"));
        }
        this.j = !f4528a.booleanValue() || com.google.android.finsky.c.d.j.b().booleanValue();
    }

    @Override // com.google.android.finsky.search.l
    protected final void a(n nVar) {
        if (this.h && TextUtils.isEmpty(this.c)) {
            nVar.a();
            return;
        }
        FinskyApp a2 = FinskyApp.a();
        this.k = a2.b((String) null).a(this.c, this.g, this.f4529b, this.j, new j(this, nVar), new k(this, nVar), a2.e().a(12605728L) ? new i(this, nVar) : null);
        b();
    }

    @Override // com.google.android.finsky.search.l
    protected final void a() {
        if (this.k != null) {
            this.k.d();
        }
    }
}
