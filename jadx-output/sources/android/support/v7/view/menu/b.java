package android.support.v7.view.menu;

import android.support.v7.widget.cu;
import android.support.v7.widget.cy;

/* loaded from: classes.dex */
final class b extends cy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionMenuItemView f583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f583a = actionMenuItemView;
    }

    @Override // android.support.v7.widget.cy
    public final cu a() {
        c cVar;
        c cVar2;
        cVar = this.f583a.f;
        if (cVar == null) {
            return null;
        }
        cVar2 = this.f583a.f;
        return cVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.cy
    public final boolean b() {
        k kVar;
        k kVar2;
        m mVar;
        cu a2;
        kVar = this.f583a.d;
        if (kVar == null) {
            return false;
        }
        kVar2 = this.f583a.d;
        mVar = this.f583a.f575a;
        return kVar2.a(mVar) && (a2 = a()) != null && a2.c.isShowing();
    }
}
