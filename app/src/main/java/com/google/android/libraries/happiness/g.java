package com.google.android.libraries.happiness;

import com.google.android.libraries.happiness.HatsSurveyManager;

/* loaded from: classes.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HatsSurveyManager.HatsSurveyClientImpl f6733a;

    g(HatsSurveyManager.HatsSurveyClientImpl hatsSurveyClientImpl) {
        this.f6733a = hatsSurveyClientImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        aVar = this.f6733a.f6728b;
        aVar.onWindowError();
    }
}
