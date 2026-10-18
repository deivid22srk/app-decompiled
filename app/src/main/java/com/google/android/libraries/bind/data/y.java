package com.google.android.libraries.bind.data;

/* loaded from: classes.dex */
final class y implements Comparable<y> {

    /* renamed from: a, reason: collision with root package name */
    public final m f6708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6709b = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(y yVar) {
        y yVar2 = yVar;
        if (this.f6709b > yVar2.f6709b) {
            return 1;
        }
        return this.f6709b < yVar2.f6709b ? -1 : 0;
    }

    public y(m mVar) {
        this.f6708a = mVar;
    }
}
