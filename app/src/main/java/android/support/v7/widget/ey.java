package android.support.v7.widget;

import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
final class ey implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f808a;

    ey(SearchView searchView) {
        this.f808a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f808a.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            fk fkVar = SearchView.HIDDEN_METHOD_INVOKER;
            SearchView searchView = this.f808a;
            if (fkVar.c != null) {
                try {
                    fkVar.c.invoke(inputMethodManager, 0, null);
                    return;
                } catch (Exception e) {
                }
            }
            inputMethodManager.showSoftInput(searchView, 0);
        }
    }
}
