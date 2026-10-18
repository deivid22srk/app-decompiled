package com.google.android.finsky.layout;

import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;

/* loaded from: classes.dex */
public final class bi extends bv {
    public bi(View view, by byVar) {
        super(view, R.id.page_content, R.id.loading_indicator, byVar, 2);
    }

    @Override // com.google.android.finsky.layout.bv
    protected final void a(boolean z, boolean z2) {
        FinskyHeaderListLayout finskyHeaderListLayout;
        if (this.c > 0 && (finskyHeaderListLayout = (FinskyHeaderListLayout) this.f3173b.findViewById(this.c)) != null) {
            if (!z) {
                if (!z2) {
                    finskyHeaderListLayout.setVisibility(8);
                    return;
                } else {
                    finskyHeaderListLayout.setVisibility(0);
                    finskyHeaderListLayout.f3293a.setVisibility(8);
                    return;
                }
            }
            finskyHeaderListLayout.setVisibility(0);
            finskyHeaderListLayout.f3293a.setVisibility(0);
        }
    }
}
