package com.google.android.gms.people.internal.a;

import android.os.Bundle;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public static c f6408a = new c(Bundle.EMPTY);

    /* renamed from: b, reason: collision with root package name */
    public static b f6409b = new b(Bundle.EMPTY);
    private final char c = 1;
    private final char d = 2;
    private final String e = Pattern.quote(String.valueOf(this.c));
    private final String f = Pattern.quote(String.valueOf(this.d));
    private final Bundle g;

    a(Bundle bundle) {
        this.g = bundle;
    }
}
