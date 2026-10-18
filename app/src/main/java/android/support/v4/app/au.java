package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
final class au implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f184a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Transition f185b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ Transition d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ Transition f;
    final /* synthetic */ ArrayList g;
    final /* synthetic */ Map h;
    final /* synthetic */ ArrayList i;
    final /* synthetic */ Transition j;
    final /* synthetic */ View k;

    au(View view, Transition transition, ArrayList arrayList, Transition transition2, ArrayList arrayList2, Transition transition3, ArrayList arrayList3, Map map, ArrayList arrayList4, Transition transition4, View view2) {
        this.f184a = view;
        this.f185b = transition;
        this.c = arrayList;
        this.d = transition2;
        this.e = arrayList2;
        this.f = transition3;
        this.g = arrayList3;
        this.h = map;
        this.i = arrayList4;
        this.j = transition4;
        this.k = view2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f184a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f185b != null) {
            aq.a(this.f185b, (ArrayList<View>) this.c);
        }
        if (this.d != null) {
            aq.a(this.d, (ArrayList<View>) this.e);
        }
        if (this.f != null) {
            aq.a(this.f, (ArrayList<View>) this.g);
        }
        for (Map.Entry entry : this.h.entrySet()) {
            ((View) entry.getValue()).setTransitionName((String) entry.getKey());
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.j.excludeTarget((View) this.i.get(i), false);
        }
        this.j.excludeTarget(this.k, false);
        return true;
    }
}
