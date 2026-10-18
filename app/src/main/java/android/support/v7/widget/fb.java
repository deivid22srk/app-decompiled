package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class fb implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f812a;

    fb(SearchView searchView) {
        this.f812a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f812a.onTextChanged(charSequence);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
