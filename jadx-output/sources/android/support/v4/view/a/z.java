package android.support.v4.view.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class z implements af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f332a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f333b;

    z(y yVar, w wVar) {
        this.f333b = yVar;
        this.f332a = wVar;
    }

    @Override // android.support.v4.view.a.af
    public final boolean a() {
        return w.b();
    }

    @Override // android.support.v4.view.a.af
    public final List<Object> b() {
        List list = null;
        w.c();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((j) list.get(i)).f325b);
        }
        return arrayList;
    }

    @Override // android.support.v4.view.a.af
    public final Object c() {
        w.a();
        return null;
    }
}
