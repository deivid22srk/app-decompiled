package com.google.android.gms.internal;

import android.webkit.ConsoleMessage;

/* loaded from: classes.dex */
final /* synthetic */ class jg {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f6087a = new int[ConsoleMessage.MessageLevel.values().length];

    static {
        try {
            f6087a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f6087a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f6087a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f6087a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f6087a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
