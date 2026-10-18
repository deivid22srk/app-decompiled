package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.as;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.an;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

/* loaded from: classes.dex */
public class LogEventParcelable implements SafeParcelable {
    public static final g CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final int f5550a;

    /* renamed from: b, reason: collision with root package name */
    public PlayLoggerContext f5551b;
    public byte[] c;
    public int[] d;
    public final an e;
    public final d f;
    public final d g;

    LogEventParcelable(int i, PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr) {
        this.f5550a = i;
        this.f5551b = playLoggerContext;
        this.c = bArr;
        this.d = iArr;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, an anVar, d dVar, d dVar2, int[] iArr) {
        this.f5550a = 1;
        this.f5551b = playLoggerContext;
        this.e = anVar;
        this.f = dVar;
        this.g = dVar2;
        this.d = iArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return this.f5550a == logEventParcelable.f5550a && at.a(this.f5551b, logEventParcelable.f5551b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && at.a(this.e, logEventParcelable.e) && at.a(this.f, logEventParcelable.f) && at.a(this.g, logEventParcelable.g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5550a), this.f5551b, this.c, this.d, this.e, this.f, this.g});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f5550a);
        sb.append(", ");
        sb.append(this.f5551b);
        sb.append(", ");
        sb.append(this.c == null ? null : new String(this.c));
        sb.append(", ");
        sb.append(this.d != null ? new as(", ").a(new StringBuilder(), Arrays.asList(this.d)).toString() : null);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append("]");
        return sb.toString();
    }
}
