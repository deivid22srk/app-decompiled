package com.google.android.finsky.adapters;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.eu;

/* loaded from: classes.dex */
final class k implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Spinner f1926a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eu[] f1927b;
    final /* synthetic */ CardRecyclerViewAdapter c;

    k(CardRecyclerViewAdapter cardRecyclerViewAdapter, Spinner spinner, eu[] euVarArr) {
        this.c = cardRecyclerViewAdapter;
        this.f1926a = spinner;
        this.f1927b = euVarArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        eu euVar = (eu) this.f1926a.getAdapter().getItem(i);
        if (this.f1926a.getVisibility() == 0 && !euVar.f3800a) {
            FinskyApp.a().h().a(249, euVar.g, this.c.e);
            com.google.android.finsky.apkg.i.c(this.c.e);
            eu[] euVarArr = this.f1927b;
            int length = euVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                eu euVar2 = euVarArr[i2];
                euVar2.f3800a = euVar2 == euVar;
                euVar2.f3801b = true;
            }
            this.c.m.clear();
            T t = this.c.r.f1988a;
            t.a(euVar.e);
            t.q();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
