package com.google.android.play.search;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
final class y implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InputMethodManager f7060a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlaySearchSuggestionsList f7061b;

    y(PlaySearchSuggestionsList playSearchSuggestionsList, InputMethodManager inputMethodManager) {
        this.f7061b = playSearchSuggestionsList;
        this.f7060a = inputMethodManager;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f7060a.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return false;
    }
}
