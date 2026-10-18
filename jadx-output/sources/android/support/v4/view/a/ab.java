package android.support.v4.view.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ab implements ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f317a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f318b;

    ab(aa aaVar, w wVar) {
        this.f318b = aaVar;
        this.f317a = wVar;
    }

    @Override // android.support.v4.view.a.ai
    public final boolean a() {
        return w.b();
    }

    @Override // android.support.v4.view.a.ai
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

    @Override // android.support.v4.view.a.ai
    public final Object c() {
        w.a();
        return null;
    }

    @Override // android.support.v4.view.a.ai
    public final Object d() {
        w.d();
        return null;
    }
}
