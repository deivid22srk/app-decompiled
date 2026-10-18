package android.support.v7.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
final class bm extends android.support.v7.view.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bg bgVar, Window.Callback callback) {
        super(callback);
        this.f509a = bgVar;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel && !this.f509a.f502b) {
            this.f509a.f501a.m();
            this.f509a.f502b = true;
        }
        return onPreparePanel;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        byte b2 = 0;
        switch (i) {
            case 0:
                Menu s = this.f509a.f501a.s();
                if (onPreparePanel(i, null, s) && onMenuOpened(i, s)) {
                    bg bgVar = this.f509a;
                    if (bgVar.d == null && (s instanceof android.support.v7.view.menu.i)) {
                        android.support.v7.view.menu.i iVar = (android.support.v7.view.menu.i) s;
                        Context b3 = bgVar.f501a.b();
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme newTheme = b3.getResources().newTheme();
                        newTheme.setTo(b3.getTheme());
                        newTheme.resolveAttribute(android.support.v7.b.b.actionBarPopupTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme.applyStyle(typedValue.resourceId, true);
                        }
                        newTheme.resolveAttribute(android.support.v7.b.b.panelMenuListTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme.applyStyle(typedValue.resourceId, true);
                        } else {
                            newTheme.applyStyle(android.support.v7.b.k.Theme_AppCompat_CompactMenu, true);
                        }
                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(b3, 0);
                        contextThemeWrapper.getTheme().setTo(newTheme);
                        bgVar.d = new android.support.v7.view.menu.g(contextThemeWrapper, android.support.v7.b.i.abc_list_menu_item_layout);
                        bgVar.d.g = new bl(bgVar, b2);
                        iVar.a(bgVar.d);
                    }
                    if (s == null || bgVar.d == null) {
                        return null;
                    }
                    if (bgVar.d.b().getCount() > 0) {
                        return (View) bgVar.d.a(bgVar.f501a.a());
                    }
                    return null;
                }
                break;
        }
        return super.onCreatePanelView(i);
    }
}
