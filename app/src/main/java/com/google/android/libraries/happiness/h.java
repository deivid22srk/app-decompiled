package com.google.android.libraries.happiness;

import com.google.android.libraries.happiness.HatsSurveyManager;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HatsSurveyManager.HatsSurveyClientImpl f6734a;

    h(HatsSurveyManager.HatsSurveyClientImpl hatsSurveyClientImpl) {
        this.f6734a = hatsSurveyClientImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        aVar = this.f6734a.f6728b;
        aVar.onSurveyReady();
    }
}
