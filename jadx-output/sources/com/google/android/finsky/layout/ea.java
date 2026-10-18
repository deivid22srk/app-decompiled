package com.google.android.finsky.layout;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ea implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SongSnippet f3251a;

    ea(SongSnippet songSnippet) {
        this.f3251a = songSnippet;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Document document;
        Context context = this.f3251a.getContext();
        document = this.f3251a.d;
        com.google.android.finsky.utils.cr.a(context, document, this.f3251a);
        return true;
    }
}
