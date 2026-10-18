package com.google.android.libraries.bind.card;

import android.view.View;

/* loaded from: classes.dex */
final class b implements View.OnLongClickListener {
    b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view instanceof com.google.android.libraries.bind.data.d) {
            return ((com.google.android.libraries.bind.data.d) view).b();
        }
        return false;
    }
}
