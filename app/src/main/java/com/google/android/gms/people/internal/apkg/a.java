package com.google.android.gms.people.internal.apkg;

import android.os.Bundle;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public static c f6408a = new c(Bundle.EMPTY);

    /* renamed from: b, reason: collision with root package name */
    public static b f6409b = new b(Bundle.EMPTY);
    public final char c = 1;
    public final char d = 2;
    public final String e = Pattern.quote(String.valueOf(this.c));
    public final String f = Pattern.quote(String.valueOf(this.d));
    public final Bundle g;

    a(Bundle bundle) {
        this.g = bundle;
    }
}
