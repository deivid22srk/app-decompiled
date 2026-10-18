package com.google.android.finsky.adapters;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.eb;
import android.view.View;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class r extends eb {

    /* renamed from: a, reason: collision with root package name */
    private int f1936a;

    public r(Context context) {
        this.f1936a = context.getResources().getDimensionPixelSize(R.dimen.play_card_default_inset);
    }

    @Override // android.support.v7.widget.eb
    public final void a(Rect rect, View view) {
        if (view.getId() == R.id.editorial_description) {
            rect.set(-this.f1936a, -this.f1936a, -this.f1936a, 0);
        }
    }
}
