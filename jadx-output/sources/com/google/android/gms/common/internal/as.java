package com.google.android.gms.common.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final String f5704a;

    public as(String str) {
        this.f5704a = str;
    }

    private static CharSequence a(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder a(StringBuilder sb, Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            sb.append(a(it.next()));
            while (it.hasNext()) {
                sb.append(this.f5704a);
                sb.append(a(it.next()));
            }
        }
        return sb;
    }
}
