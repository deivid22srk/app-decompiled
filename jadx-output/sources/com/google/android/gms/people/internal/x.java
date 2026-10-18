package com.google.android.gms.people.internal;

/* loaded from: classes.dex */
final class x extends ThreadLocal<String[]> {
    x() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ String[] initialValue() {
        return new String[2];
    }
}
