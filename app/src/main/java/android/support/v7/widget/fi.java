package android.support.v7.widget;

import android.app.SearchableInfo;
import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
final class fi implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f819a;

    fi(SearchView searchView) {
        this.f819a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchableInfo searchableInfo;
        SearchView.SearchAutoComplete searchAutoComplete;
        SearchView.SearchAutoComplete searchAutoComplete2;
        SearchView.SearchAutoComplete searchAutoComplete3;
        SearchView.SearchAutoComplete searchAutoComplete4;
        boolean onSuggestionsKey;
        searchableInfo = this.f819a.mSearchable;
        if (searchableInfo == null) {
            return false;
        }
        searchAutoComplete = this.f819a.mSearchSrcTextView;
        if (searchAutoComplete.isPopupShowing()) {
            searchAutoComplete4 = this.f819a.mSearchSrcTextView;
            if (searchAutoComplete4.getListSelection() != -1) {
                onSuggestionsKey = this.f819a.onSuggestionsKey(view, i, keyEvent);
                return onSuggestionsKey;
            }
        }
        searchAutoComplete2 = this.f819a.mSearchSrcTextView;
        if (SearchView.SearchAutoComplete.a(searchAutoComplete2) || !android.support.v4.view.z.b(keyEvent) || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        SearchView searchView = this.f819a;
        searchAutoComplete3 = this.f819a.mSearchSrcTextView;
        searchView.launchQuerySearch(0, null, searchAutoComplete3.getText().toString());
        return true;
    }
}
