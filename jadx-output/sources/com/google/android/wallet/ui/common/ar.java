package com.google.android.wallet.ui.common;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class ar implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RegionCodeSelectorSpinner f7489a;

    ar(RegionCodeSelectorSpinner regionCodeSelectorSpinner) {
        this.f7489a = regionCodeSelectorSpinner;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        as asVar;
        as asVar2;
        Integer num = (Integer) this.f7489a.getItemAtPosition(i);
        asVar = this.f7489a.e;
        if (asVar != null) {
            asVar2 = this.f7489a.e;
            asVar2.a(num.intValue(), this.f7489a.getId(), view != null);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        Log.i("RegionCodeSelectorSpinn", "Listener fired for onNothingSelected; ignoring");
    }
}
