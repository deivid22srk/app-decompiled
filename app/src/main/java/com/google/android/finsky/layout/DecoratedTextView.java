package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.google.android.play.layout.PlayTextView;

/* loaded from: classes.dex */
public class DecoratedTextView extends PlayTextView implements com.google.android.play.image.k {
    public DecoratedTextView(Context context) {
        super(context);
    }

    public DecoratedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(com.google.android.play.image.e eVar, com.google.android.finsky.protos.ds dsVar, int i) {
        if (!dsVar.l) {
            i = 0;
        }
        Bitmap bitmap = eVar.a(dsVar.f, i, i, this).f6944a;
        if (bitmap != null) {
            setDecorationBitmap(bitmap);
        }
    }

    @Override // com.android.volley.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void a_(com.google.android.play.image.j jVar) {
        Bitmap bitmap = jVar.f6944a;
        if (bitmap != null) {
            setDecorationBitmap(bitmap);
        }
    }
}
