package com.google.android.finsky.layout;

import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public final class be implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FamilyShareToggle f3154a;

    public be(FamilyShareToggle familyShareToggle) {
        this.f3154a = familyShareToggle;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchCompat switchCompat;
        com.google.android.finsky.detailspage.bc bcVar;
        switchCompat = this.f3154a.f2988b;
        switchCompat.setOnCheckedChangeListener(null);
        bcVar = this.f3154a.f2987a;
        bcVar.a(z);
    }
}
