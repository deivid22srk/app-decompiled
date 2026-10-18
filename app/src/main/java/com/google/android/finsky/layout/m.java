package com.google.android.finsky.layout;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.finsky.protos.sa;
import java.util.List;

/* loaded from: classes.dex */
final class m implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BillingAddress f3287a;

    m(BillingAddress billingAddress) {
        this.f3287a = billingAddress;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        List list;
        sa saVar;
        p pVar;
        p pVar2;
        sa saVar2;
        list = this.f3287a.k;
        sa saVar3 = (sa) list.get(i);
        saVar = this.f3287a.l;
        if (saVar != null) {
            saVar2 = this.f3287a.l;
            if (saVar2.f4367a.equals(saVar3.f4367a)) {
                return;
            }
        }
        pVar = this.f3287a.r;
        if (pVar != null) {
            pVar2 = this.f3287a.r;
            pVar2.a(saVar3);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        onItemSelected(adapterView, null, 0, 0L);
    }
}
