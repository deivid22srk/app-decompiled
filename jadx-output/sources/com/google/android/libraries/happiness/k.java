package com.google.android.libraries.happiness;

import com.google.android.libraries.happiness.HatsSurveyManager;

/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HatsSurveyManager.HatsSurveyClientImpl f6739a;

    k(HatsSurveyManager.HatsSurveyClientImpl hatsSurveyClientImpl) {
        this.f6739a = hatsSurveyClientImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        aVar = this.f6739a.f6728b;
        aVar.onSurveyCanceled();
    }
}
