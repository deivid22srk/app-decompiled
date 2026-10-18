package com.google.android.gms.people.internal;

/* loaded from: classes.dex */
final class v extends ThreadLocal<StringBuilder> {
    v() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ StringBuilder initialValue() {
        return new StringBuilder();
    }
}
