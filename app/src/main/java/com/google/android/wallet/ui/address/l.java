package com.google.android.wallet.ui.address;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.wallet.ui.common.FormEditText;

/* loaded from: classes.dex */
final class l implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7389a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f7390b;

    l(b bVar, FormEditText formEditText) {
        this.f7390b = bVar;
        this.f7389a = formEditText;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        com.google.android.wallet.common.apkg.d dVar = (com.google.android.wallet.common.apkg.d) adapterView.getItemAtPosition(i);
        com.google.c.a.b bVar = dVar.e;
        if (bVar != null) {
            b.a(this.f7390b, this.f7389a, bVar);
        } else if (!TextUtils.isEmpty(dVar.h)) {
            new o(this.f7390b, this.f7389a).execute(dVar);
        } else if (this.f7389a.af_()) {
            b.a(this.f7390b, this.f7389a);
        }
    }
}
