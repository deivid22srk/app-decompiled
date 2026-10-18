package com.google.android.libraries.happiness;

import com.google.android.libraries.happiness.HatsSurveyManager;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f6735a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f6736b;
    final /* synthetic */ HatsSurveyManager.HatsSurveyClientImpl c;

    i(HatsSurveyManager.HatsSurveyClientImpl hatsSurveyClientImpl, boolean z, boolean z2) {
        this.c = hatsSurveyClientImpl;
        this.f6735a = z;
        this.f6736b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        aVar = this.c.f6728b;
        aVar.onSurveyComplete(this.f6735a, this.f6736b);
    }
}
