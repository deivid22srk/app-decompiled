package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
final class as implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f180a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Transition f181b;
    final /* synthetic */ View c;
    final /* synthetic */ aw d;
    final /* synthetic */ Map e;
    final /* synthetic */ Map f;
    final /* synthetic */ ArrayList g;

    as(View view, Transition transition, View view2, aw awVar, Map map, Map map2, ArrayList arrayList) {
        this.f180a = view;
        this.f181b = transition;
        this.c = view2;
        this.d = awVar;
        this.e = map;
        this.f = map2;
        this.g = arrayList;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f180a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f181b != null) {
            this.f181b.removeTarget(this.c);
        }
        View a2 = this.d.a();
        if (a2 != null) {
            if (!this.e.isEmpty()) {
                aq.a((Map<String, View>) this.f, a2);
                this.f.keySet().retainAll(this.e.values());
                for (Map.Entry entry : this.e.entrySet()) {
                    View view = (View) this.f.get((String) entry.getValue());
                    if (view != null) {
                        view.setTransitionName((String) entry.getKey());
                    }
                }
            }
            if (this.f181b == null) {
                return true;
            }
            aq.a((ArrayList<View>) this.g, a2);
            this.g.removeAll(this.f.values());
            this.g.add(this.c);
            aq.b(this.f181b, this.g);
            return true;
        }
        return true;
    }
}
