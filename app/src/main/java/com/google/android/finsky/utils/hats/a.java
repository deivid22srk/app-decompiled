package com.google.android.finsky.utils.hats;

import android.view.View;

/* loaded from: classes.dex */
final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HappinessSurveyController f4935a;

    a(HappinessSurveyController happinessSurveyController) {
        this.f4935a = happinessSurveyController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4935a.showSurveyDialog();
    }
}
