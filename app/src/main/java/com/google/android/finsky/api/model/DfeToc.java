package com.google.android.finsky.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.ParcelableProto;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public static class DfeToc extends j implements Parcelable {
    public static final Parcelable.Creator<DfeToc> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final pw f1961a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, pt> f1962b = new LinkedHashMap();

    public DfeToc(pw pwVar) {
        this.f1961a = pwVar;
        for (pt ptVar : this.f1961a.f4273a) {
            this.f1962b.put(Integer.valueOf(ptVar.f4268a), ptVar);
        }
    }

    public final pt a(int i) {
        return this.f1962b.get(Integer.valueOf(i));
    }

    public final pt a(String str) {
        for (pt ptVar : this.f1961a.f4273a) {
            if (ptVar.e.equals(str)) {
                return ptVar;
            }
        }
        return null;
    }

    public final String b(int i) {
        if (i == 0) {
            return this.f1961a.x;
        }
        pt ptVar = this.f1962b.get(Integer.valueOf(i));
        if (ptVar != null) {
            return ptVar.k;
        }
        return null;
    }

    public final List<pt> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f1962b.values());
        return arrayList;
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.a(this.f1961a), 0);
    }
}
