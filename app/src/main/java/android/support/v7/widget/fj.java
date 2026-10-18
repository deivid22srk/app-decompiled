package android.support.v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
final class fj implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f820a;

    fj(SearchView searchView) {
        this.f820a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f820a.onSubmitQuery();
        return true;
    }
}
