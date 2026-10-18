package com.google.android.finsky.activities;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
final class ba implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.protos.ew f1606a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1607b;
    final /* synthetic */ ContentFiltersActivity2 c;

    ba(ContentFiltersActivity2 contentFiltersActivity2, com.google.android.finsky.protos.ew ewVar, int i) {
        this.c = contentFiltersActivity2;
        this.f1606a = ewVar;
        this.f1607b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        z = this.c.B;
        if (z) {
            this.c.a(this.f1606a, this.f1607b);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ContentFiltersActivity2.onPinSuccess", 3);
        bundle.putByteArray("ContentFiltersActivity2.filterRange", com.google.protobuf.nano.c.a(this.f1606a));
        bundle.putInt("ContentFiltersActivity2.filterRangeIndex", this.f1607b);
        this.c.a(bundle, false);
    }
}
