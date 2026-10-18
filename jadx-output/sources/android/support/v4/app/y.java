package android.support.v4.app;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    final z<?> f240a;

    y(z<?> zVar) {
        this.f240a = zVar;
    }

    public final int a() {
        ArrayList<Fragment> arrayList = this.f240a.f.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final List<Fragment> a(List<Fragment> list) {
        if (this.f240a.f.f == null) {
            return null;
        }
        list.addAll(this.f240a.f.f);
        return list;
    }

    public final void b() {
        this.f240a.f.t = false;
    }

    public final boolean c() {
        return this.f240a.f.j();
    }
}
