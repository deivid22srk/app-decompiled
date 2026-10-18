package com.google.android.finsky.billing.carrierbilling.bpkg;

import android.view.View;
import android.widget.RadioGroup;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2186a;

    b(a aVar) {
        this.f2186a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioGroup radioGroup;
        RadioGroup radioGroup2;
        radioGroup = this.f2186a.c;
        if (radioGroup.getVisibility() != 8) {
            radioGroup2 = this.f2186a.c;
            if (radioGroup2.getCheckedRadioButtonId() != R.id.tos_accept) {
                this.f2186a.v();
                return;
            }
        }
        this.f2186a.w();
    }
}
