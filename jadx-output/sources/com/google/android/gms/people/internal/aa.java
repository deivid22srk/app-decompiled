package com.google.android.gms.people.internal;

/* loaded from: classes.dex */
final class aa extends ThreadLocal<String[]> {
    aa() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ String[] initialValue() {
        return new String[5];
    }
}
