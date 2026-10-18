package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* loaded from: classes.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private final String f5734a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f5735b;

    public z(ComponentName componentName) {
        this.f5734a = null;
        this.f5735b = (ComponentName) av.a(componentName);
    }

    public z(String str) {
        this.f5734a = av.a(str);
        this.f5735b = null;
    }

    public final Intent a() {
        return this.f5734a != null ? new Intent(this.f5734a).setPackage("com.google.android.gms") : new Intent().setComponent(this.f5735b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return at.a(this.f5734a, zVar.f5734a) && at.a(this.f5735b, zVar.f5735b);
    }

    public final String toString() {
        return this.f5734a == null ? this.f5735b.flattenToString() : this.f5734a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5734a, this.f5735b});
    }
}
