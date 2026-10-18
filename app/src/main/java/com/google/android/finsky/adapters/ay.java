package com.google.android.finsky.adapters;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.finsky.protos.of;

/* loaded from: classes.dex */
final class ay implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ of[] f1905a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Spinner f1906b;
    final /* synthetic */ ax c;

    ay(ax axVar, of[] ofVarArr, Spinner spinner) {
        this.c = axVar;
        this.f1905a = ofVarArr;
        this.f1906b = spinner;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        of ofVar = this.f1905a[i];
        if (this.c.u.q() == 7 && this.f1906b.getVisibility() == 0 && !ofVar.i) {
            this.c.u.a(ofVar.f4203a, ((com.google.android.finsky.api.model.m) this.c.r.f1988a).c, ofVar.e, this.c.e);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
