package com.google.android.finsky.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public final class bd extends gj implements View.OnClickListener {
    @Override // com.google.android.finsky.activities.gj, android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        Dialog c = super.c(bundle);
        ((ContentFiltersDialogView) this.ai).setOnPositiveClickListener(this);
        return c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w();
    }
}
