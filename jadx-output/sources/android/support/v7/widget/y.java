package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class y implements Comparable<y> {

    /* renamed from: a, reason: collision with root package name */
    public final ResolveInfo f871a;

    /* renamed from: b, reason: collision with root package name */
    public float f872b;
    final /* synthetic */ x c;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(y yVar) {
        return Float.floatToIntBits(yVar.f872b) - Float.floatToIntBits(this.f872b);
    }

    public y(x xVar, ResolveInfo resolveInfo) {
        this.c = xVar;
        this.f871a = resolveInfo;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f872b) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f872b) == Float.floatToIntBits(((y) obj).f872b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("resolveInfo:").append(this.f871a.toString());
        sb.append("; weight:").append(new BigDecimal(this.f872b));
        sb.append("]");
        return sb.toString();
    }
}
