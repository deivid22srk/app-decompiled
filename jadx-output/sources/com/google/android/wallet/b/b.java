package com.google.android.wallet.b;

import android.text.TextUtils;
import com.google.b.a.a.a.b.a.b.i;
import com.google.b.a.a.a.b.a.b.j;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final i f7244a;

    public b(i iVar) {
        this.f7244a = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        i iVar = ((b) obj).f7244a;
        if (this.f7244a.f7675a == iVar.f7675a && this.f7244a.f7676b == iVar.f7676b) {
            switch (this.f7244a.f7676b) {
                case 1:
                    if (this.f7244a.c.f7679a == null) {
                        return iVar.c.f7679a == null;
                    }
                    if (this.f7244a.c.f7679a.f7677a != null) {
                        return Arrays.equals(this.f7244a.c.f7679a.f7677a, iVar.c.f7679a.f7677a);
                    }
                    if (!TextUtils.isEmpty(this.f7244a.c.f7679a.f7678b)) {
                        return this.f7244a.c.f7679a.f7678b.equals(iVar.c.f7679a.f7678b);
                    }
                    throw new IllegalArgumentException(String.format("TriggerValueReference for component %d does not have a known value for newValue component value", Integer.valueOf(this.f7244a.f7675a)));
                case 2:
                    return true;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Unknown trigger type for trigger on component %s", Integer.valueOf(this.f7244a.f7675a)));
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7244a.f7675a * 31 * this.f7244a.f7676b * 37;
        if (this.f7244a.c != null) {
            j jVar = this.f7244a.c.f7679a;
            if (jVar == null) {
                return i * 41;
            }
            if (jVar.f7677a != null) {
                return i * Arrays.hashCode(jVar.f7677a);
            }
            if (!TextUtils.isEmpty(jVar.f7678b)) {
                return i * jVar.f7678b.hashCode();
            }
            throw new IllegalArgumentException(String.format("TriggerValueReference for component %d does not have a known value for newValue component value", Integer.valueOf(this.f7244a.f7675a)));
        }
        return i;
    }
}
