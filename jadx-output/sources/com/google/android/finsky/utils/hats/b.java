package com.google.android.finsky.utils.hats;

import android.view.View;

/* loaded from: classes.dex */
final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HappinessSurveyController f4936a;

    b(HappinessSurveyController happinessSurveyController) {
        this.f4936a = happinessSurveyController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4936a.removeSurveyPrompt();
    }
}
