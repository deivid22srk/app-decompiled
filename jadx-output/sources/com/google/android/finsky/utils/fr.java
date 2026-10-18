package com.google.android.finsky.utils;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class fr implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4884a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f4885b;
    final /* synthetic */ View c;
    final /* synthetic */ View.OnClickListener d;

    fr(Context context, Document document, View view, View.OnClickListener onClickListener) {
        this.f4884a = context;
        this.f4885b = document;
        this.c = view;
        this.d = onClickListener;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        a.a(this.f4884a, this.f4885b, "23", this.c.getWidth(), this.c.getHeight());
        this.d.onClick(null);
    }
}
