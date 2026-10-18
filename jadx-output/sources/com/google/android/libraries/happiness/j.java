package com.google.android.libraries.happiness;

import com.google.android.libraries.happiness.HatsSurveyManager;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6737a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6738b;
    final /* synthetic */ HatsSurveyManager.HatsSurveyClientImpl c;

    j(HatsSurveyManager.HatsSurveyClientImpl hatsSurveyClientImpl, String str, String str2) {
        this.c = hatsSurveyClientImpl;
        this.f6737a = str;
        this.f6738b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        aVar = this.c.f6728b;
        aVar.onSurveyResponse(this.f6737a, this.f6738b);
    }
}
