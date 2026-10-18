package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.fp;

/* loaded from: classes.dex */
public final class ds implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fp f3239b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ RottenTomatoesReviewsHeader d;

    public ds(RottenTomatoesReviewsHeader rottenTomatoesReviewsHeader, com.google.android.finsky.navigationmanager.b bVar, fp fpVar, DfeToc dfeToc) {
        this.d = rottenTomatoesReviewsHeader;
        this.f3238a = bVar;
        this.f3239b = fpVar;
        this.c = dfeToc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3238a.a(this.f3239b.j, this.c, this.d.getContext().getPackageManager());
    }
}
