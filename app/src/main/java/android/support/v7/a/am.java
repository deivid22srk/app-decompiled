package android.support.v7.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.by;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class am extends aj {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(al alVar, Window.Callback callback) {
        super(alVar, callback);
        this.f479b = alVar;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f479b.p ? a(callback) : super.onWindowStartingActionMode(callback);
    }

    final ActionMode a(ActionMode.Callback callback) {
        Context context;
        android.support.v7.view.h hVar = new android.support.v7.view.h(this.f479b.f476b, callback);
        al alVar = this.f479b;
        if (alVar.q != null) {
            alVar.q.c();
        }
        ay ayVar = new ay(alVar, hVar);
        a a2 = alVar.a();
        if (a2 != null) {
            alVar.q = a2.a(ayVar);
        }
        if (alVar.q == null) {
            alVar.m();
            if (alVar.q != null) {
                alVar.q.c();
            }
            ay ayVar2 = new ay(alVar, ayVar);
            if (alVar.r == null) {
                if (alVar.l) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = alVar.f476b.getTheme();
                    theme.resolveAttribute(android.support.v7.b.b.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = alVar.f476b.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new android.support.v7.view.e(alVar.f476b, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = alVar.f476b;
                    }
                    alVar.r = new ActionBarContextView(context);
                    alVar.s = new PopupWindow(context, (AttributeSet) null, android.support.v7.b.b.actionModePopupWindowStyle);
                    android.support.v4.widget.as.a(alVar.s, 2);
                    alVar.s.setContentView(alVar.r);
                    alVar.s.setWidth(-1);
                    context.getTheme().resolveAttribute(android.support.v7.b.b.actionBarSize, typedValue, true);
                    alVar.r.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    alVar.s.setHeight(-2);
                    alVar.t = new au(alVar);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) alVar.v.findViewById(android.support.v7.b.g.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(alVar.l()));
                        alVar.r = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (alVar.r != null) {
                alVar.m();
                alVar.r.b();
                android.support.v7.view.f fVar = new android.support.v7.view.f(alVar.r.getContext(), alVar.r, ayVar2, alVar.s == null);
                if (ayVar.a(fVar, fVar.b())) {
                    fVar.d();
                    alVar.r.a(fVar);
                    alVar.q = fVar;
                    by.c((View) alVar.r, 0.0f);
                    alVar.u = by.t(alVar.r).a(1.0f);
                    alVar.u.a(new aw(alVar));
                    if (alVar.s != null) {
                        alVar.c.getDecorView().post(alVar.t);
                    }
                } else {
                    alVar.q = null;
                }
            }
            alVar.q = alVar.q;
        }
        android.support.v7.view.b bVar = alVar.q;
        if (bVar != null) {
            return hVar.b(bVar);
        }
        return null;
    }
}
