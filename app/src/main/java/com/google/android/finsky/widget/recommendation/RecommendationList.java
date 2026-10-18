package com.google.android.finsky.widget.recommendation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public static class RecommendationList implements Parcelable, Collection<Recommendation> {
    public static final Parcelable.Creator<RecommendationList> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List<Recommendation> f5228a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final int f5229b;
    public String c;

    public RecommendationList(String str, int i) {
        this.c = str;
        this.f5229b = i;
    }

    public final void a(Context context) {
        try {
            ParcelUtils.a(c.b(context, this.f5229b), this);
        } catch (IOException e) {
            FinskyLog.a(e, "Unable to cache recs for %d", Integer.valueOf(this.f5229b));
        }
    }

    @Override // java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(Recommendation recommendation) {
        return this.f5228a.add(recommendation);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Recommendation> collection) {
        for (Recommendation recommendation : collection) {
            if (!contains(recommendation) && !add(recommendation)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public void clear() {
        this.f5228a.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f5228a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f5228a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f5228a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Recommendation> iterator() {
        return this.f5228a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return this.f5228a.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f5228a.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f5228a.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.f5228a.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return toArray(new Recommendation[size()]);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f5228a.toArray(tArr);
    }

    public String toString() {
        return "[" + this.f5229b + ", " + this.f5228a + "]";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(1L);
        parcel.writeString(this.c);
        parcel.writeInt(this.f5229b);
        parcel.writeTypedList(this.f5228a);
    }
}
