package com.google.android.finsky.widget.consumption;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.services.ConsumptionAppDoc;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public static class ConsumptionAppDocList extends ArrayList<ConsumptionAppDoc> implements Parcelable {
    public static final Parcelable.Creator<ConsumptionAppDocList> CREATOR = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator<ConsumptionAppDocList> f5166b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f5167a;

    public ConsumptionAppDocList(int i) {
        this.f5167a = i;
    }

    public ConsumptionAppDocList(int i, List<ConsumptionAppDoc> list) {
        this(i);
        addAll(list);
    }

    public static ConsumptionAppDocList a(int i, List<Bundle> list) {
        ArrayList a2 = cz.a(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            a2.add(new ConsumptionAppDoc(it.next()));
        }
        return new ConsumptionAppDocList(i, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(ConsumptionAppDoc consumptionAppDoc) {
        if (consumptionAppDoc != null) {
            return super.add(consumptionAppDoc);
        }
        FinskyLog.e("Not adding a null document for backend=[%d]", Integer.valueOf(this.f5167a));
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends ConsumptionAppDoc> collection) {
        boolean z = true;
        Iterator<? extends ConsumptionAppDoc> it = collection.iterator();
        while (true) {
            boolean z2 = z;
            if (it.hasNext()) {
                z = add(it.next()) & z2;
            } else {
                return z2;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5167a);
        parcel.writeTypedList(this);
    }
}
