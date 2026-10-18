package com.google.android.wallet.ui.address;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class k implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7388a;

    k(b bVar) {
        this.f7388a = bVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        b.e(this.f7388a);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
