package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    SparseArray<ArrayList<eq>> f783a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    SparseIntArray f784b = new SparseIntArray();
    int c = 0;

    public final void a(int i, int i2) {
        this.f784b.put(i, i2);
        ArrayList<eq> arrayList = this.f783a.get(i);
        if (arrayList != null) {
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    final void a() {
        this.c++;
    }

    final void b() {
        this.c--;
    }
}
