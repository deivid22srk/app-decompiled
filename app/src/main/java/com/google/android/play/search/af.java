package com.google.android.play.search;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
final class af extends android.support.v4.view.n {
    final /* synthetic */ PlaySearchToolbar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(PlaySearchToolbar playSearchToolbar, Context context) {
        super(context);
        this.c = playSearchToolbar;
    }

    @Override // android.support.v4.view.n
    public final View a() {
        PlaySearch playSearch;
        playSearch = this.c.u;
        return playSearch;
    }
}
