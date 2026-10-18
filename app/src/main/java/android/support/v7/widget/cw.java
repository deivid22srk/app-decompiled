package android.support.v7.widget;

import android.widget.AdapterView;

/* loaded from: classes.dex */
final class cw implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cu f753a;

    cw(cu cuVar) {
        this.f753a = cuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r0 = r2.f753a.d;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
        /*
            r2 = this;
            r0 = -1
            if (r5 == r0) goto Lf
            android.support.v7.widget.cu r0 = r2.f753a
            android.support.v7.widget.cx r0 = android.support.v7.widget.cu.a(r0)
            if (r0 == 0) goto Lf
            r1 = 0
            android.support.v7.widget.cx.a(r0, r1)
        Lf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cw.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
