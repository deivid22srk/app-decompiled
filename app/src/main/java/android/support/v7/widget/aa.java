package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f642a;

    /* renamed from: b, reason: collision with root package name */
    public final long f643b;
    public final float c;

    public aa(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
    }

    public aa(ComponentName componentName, long j, float f) {
        this.f642a = componentName;
        this.f643b = j;
        this.c = f;
    }

    public final int hashCode() {
        return (((((this.f642a == null ? 0 : this.f642a.hashCode()) + 31) * 31) + ((int) (this.f643b ^ (this.f643b >>> 32)))) * 31) + Float.floatToIntBits(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aa aaVar = (aa) obj;
            if (this.f642a == null) {
                if (aaVar.f642a != null) {
                    return false;
                }
            } else if (!this.f642a.equals(aaVar.f642a)) {
                return false;
            }
            return this.f643b == aaVar.f643b && Float.floatToIntBits(this.c) == Float.floatToIntBits(aaVar.c);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("; activity:").append(this.f642a);
        sb.append("; time:").append(this.f643b);
        sb.append("; weight:").append(new BigDecimal(this.c));
        sb.append("]");
        return sb.toString();
    }
}
