package com.google.android.libraries.happiness;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* loaded from: classes.dex */
final class d extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HatsSurveyManager f6730a;

    d(HatsSurveyManager hatsSurveyManager) {
        this.f6730a = hatsSurveyManager;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}
