package com.google.android.finsky.widget.recommendation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.ex;
import java.util.List;

/* loaded from: classes.dex */
public class Recommendation implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Document f5226a;

    /* renamed from: b, reason: collision with root package name */
    final ds f5227b;
    final long c;
    private static final int[] d = {4, 2, 0};
    private static final int[] e = ex.g;
    public static final Parcelable.Creator<Recommendation> CREATOR = new a();

    public Recommendation(Document document) {
        this(document, com.google.android.finsky.c.d.ce.b().longValue() + System.currentTimeMillis());
    }

    Recommendation(Document document, long j) {
        this.f5226a = document;
        this.f5227b = a();
        this.c = j;
    }

    private ds a() {
        for (int i : this.f5226a.f1963a.g == 3 ? e : d) {
            List<ds> b2 = this.f5226a.b(i);
            if (b2 != null && !b2.isEmpty()) {
                return b2.get(0);
            }
        }
        return null;
    }

    public int hashCode() {
        return (this.f5226a.hashCode() * 31) + this.f5227b.f3746a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Recommendation)) {
            return false;
        }
        return ((Recommendation) obj).f5226a.f1963a.f3890a.equals(this.f5226a.f1963a.f3890a);
    }

    public String toString() {
        if (this.f5226a.aH()) {
            return this.f5226a.aI().f3872a;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(2L);
        parcel.writeParcelable(this.f5226a, 0);
        parcel.writeLong(this.c);
    }
}
