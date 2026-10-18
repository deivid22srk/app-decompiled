package com.google.android.libraries.happiness;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HatsSurveyManager f6732a;

    f(HatsSurveyManager hatsSurveyManager) {
        this.f6732a = hatsSurveyManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f6732a.f6725a.isComplete()) {
            this.f6732a.c();
            this.f6732a.f6725a.onSurveyCanceled();
        }
    }
}
