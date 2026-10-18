package com.google.android.libraries.bind.data;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes.dex */
final class ag implements ad {
    ag() {
    }

    @Override // com.google.android.libraries.bind.data.ad
    public final View a(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        textView.setText("Error! (replace me)");
        return textView;
    }
}
