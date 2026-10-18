package com.google.android.libraries.bind.data;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.widget.LoadingView;

/* loaded from: classes.dex */
final class af implements ad {
    af() {
    }

    @Override // com.google.android.libraries.bind.data.ad
    public final View a(ViewGroup viewGroup) {
        return new LoadingView(viewGroup.getContext());
    }
}
