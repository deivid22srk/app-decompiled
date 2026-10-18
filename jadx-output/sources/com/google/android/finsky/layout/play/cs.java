package com.google.android.finsky.layout.play;

import android.view.View;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.np;

/* loaded from: classes.dex */
final class cs implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f3480a;

    cs(cr crVar) {
        this.f3480a = crVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.protos.ba baVar;
        com.google.android.finsky.protos.ba baVar2;
        com.google.android.finsky.protos.ba baVar3;
        DfeToc dfeToc;
        bVar = this.f3480a.f;
        baVar = this.f3480a.e;
        np npVar = baVar.d;
        baVar2 = this.f3480a.e;
        String str = baVar2.f3619a;
        baVar3 = this.f3480a.e;
        int i = baVar3.g;
        dfeToc = this.f3480a.g;
        bVar.a(npVar, str, i, dfeToc, this.f3480a, (String) null);
    }
}
