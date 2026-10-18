package com.google.android.gms.internal;

import java.util.Comparator;

/* loaded from: classes.dex */
final class cd implements Comparator<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc f5918a;

    cd(cc ccVar) {
        this.f5918a = ccVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(String str, String str2) {
        return str2.length() - str.length();
    }
}
