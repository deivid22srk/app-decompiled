package android.support.v7.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class q extends FrameLayout implements android.support.v7.view.d {

    /* renamed from: a, reason: collision with root package name */
    final CollapsibleActionView f599a;

    /* JADX WARN: Multi-variable type inference failed */
    q(View view) {
        super(view.getContext());
        this.f599a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // android.support.v7.view.d
    public final void onActionViewExpanded() {
        this.f599a.onActionViewExpanded();
    }

    @Override // android.support.v7.view.d
    public final void onActionViewCollapsed() {
        this.f599a.onActionViewCollapsed();
    }
}
