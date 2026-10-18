package com.google.android.play.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

@TargetApi(21)
/* loaded from: classes.dex */
final class m extends l {
    private m() {
        super((byte) 0);
    }

    /* synthetic */ m(byte b2) {
        this();
    }

    @Override // com.google.android.play.c.l, com.google.android.play.c.i
    public final void a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray a2 = a(context, attributeSet, i);
        n nVar = new n(a2.getColorStateList(com.google.android.play.o.PlayCardViewGroup_playCardBackgroundColor), a(a2), c(a2));
        view.setClipToOutline(true);
        view.setElevation(b(a2));
        view.setBackground(nVar);
        view.setClipToOutline(a2.getBoolean(com.google.android.play.o.PlayCardViewGroup_playCardClipToOutline, true));
        a2.recycle();
    }

    @Override // com.google.android.play.c.l, com.google.android.play.c.i
    public final void a(View view) {
        view.setElevation(0.0f);
    }
}
