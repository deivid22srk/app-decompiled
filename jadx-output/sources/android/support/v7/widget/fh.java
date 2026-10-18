package android.support.v7.widget;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
final class fh implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f818a;

    fh(SearchView searchView) {
        this.f818a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        SearchView.SearchAutoComplete searchAutoComplete;
        imageView = this.f818a.mSearchButton;
        if (view == imageView) {
            this.f818a.onSearchClicked();
            return;
        }
        imageView2 = this.f818a.mCloseButton;
        if (view == imageView2) {
            this.f818a.onCloseClicked();
            return;
        }
        imageView3 = this.f818a.mGoButton;
        if (view == imageView3) {
            this.f818a.onSubmitQuery();
            return;
        }
        imageView4 = this.f818a.mVoiceButton;
        if (view == imageView4) {
            this.f818a.onVoiceClicked();
            return;
        }
        searchAutoComplete = this.f818a.mSearchSrcTextView;
        if (view == searchAutoComplete) {
            this.f818a.forceSuggestionQuery();
        }
    }
}
