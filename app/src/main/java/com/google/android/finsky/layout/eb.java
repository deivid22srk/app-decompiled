package com.google.android.finsky.layout;

import android.widget.ImageView;

/* loaded from: classes.dex */
final class eb implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SongSnippet f3252a;

    eb(SongSnippet songSnippet) {
        this.f3252a = songSnippet;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        ImageView imageView;
        if (jVar != null) {
            imageView = this.f3252a.v;
            imageView.setImageBitmap(jVar.f6944a);
        }
    }
}
