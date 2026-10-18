package com.google.android.libraries.bind.data;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class aa implements Comparable<aa> {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObserver f6681a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6682b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(aa aaVar) {
        aa aaVar2 = aaVar;
        if (this.f6682b > aaVar2.f6682b) {
            return 1;
        }
        return this.f6682b < aaVar2.f6682b ? -1 : 0;
    }

    public aa(DataSetObserver dataSetObserver, int i) {
        this.f6681a = dataSetObserver;
        this.f6682b = i;
    }
}
