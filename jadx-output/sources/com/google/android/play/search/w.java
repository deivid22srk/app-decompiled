package com.google.android.play.search;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

/* loaded from: classes.dex */
final class w extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearchSuggestionsList f7058a;

    w(PlaySearchSuggestionsList playSearchSuggestionsList) {
        this.f7058a = playSearchSuggestionsList;
    }

    @Override // android.support.v7.widget.ec
    public final View a(View view, int i) {
        return (i != 130 || a(view) < v() + (-1)) ? super.a(view, i) : view;
    }
}
