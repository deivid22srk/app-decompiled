package com.google.android.finsky.layout.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.layout.play.ad;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.search.FinskySearch;
import com.google.android.finsky.utils.av;
import com.google.android.finsky.utils.bg;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;

/* loaded from: classes.dex */
public class FinskySearchToolbar extends PlaySearchToolbar implements cy {
    public View o;
    private c u;
    private int v;
    private final ai w;

    public FinskySearchToolbar(Context context) {
        this(context, null);
    }

    public FinskySearchToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = com.google.android.finsky.a.i.a(5300);
    }

    public void setCurrentBackendId(int i) {
        String string;
        ((FinskySearch) getSearchView()).setCurrentBackendId(i);
        ((FinskySearch) getActionView()).setCurrentBackendId(i);
        if (!FinskyApp.a().e().a(12603098L)) {
            return;
        }
        Resources resources = getContext().getResources();
        switch (i) {
            case 1:
                string = resources.getString(R.string.play_search_box_hint_books);
                break;
            case 2:
                string = resources.getString(R.string.play_search_box_hint_music);
                break;
            case 3:
                string = resources.getString(R.string.play_search_box_hint_apps_games);
                break;
            case 4:
                string = resources.getString(R.string.play_search_box_hint_movies);
                break;
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                string = resources.getString(R.string.play_search_box_hint);
                break;
            case 6:
                string = resources.getString(R.string.play_search_box_hint_newsstand);
                break;
            case 7:
                string = resources.getString(R.string.play_search_box_hint_tv);
                break;
            case 13:
                string = resources.getString(R.string.play_search_box_hint_entertainment);
                break;
        }
        getSearchView().setHint(string);
        getActionView().setHint(string);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.search.PlaySearchToolbar
    public final boolean g() {
        return true;
    }

    public void setNavigationManager(com.google.android.finsky.navigationmanager.b bVar) {
        ((FinskySearch) getSearchView()).setNavigationManager(bVar);
        ((FinskySearch) getActionView()).setNavigationManager(bVar);
    }

    public void setActionBarController(c cVar) {
        this.u = cVar;
    }

    @Override // com.google.android.play.search.PlaySearchToolbar
    public final void a(boolean z, int i) {
        boolean z2 = z && !((PlaySearchToolbar) this).q;
        super.a(z, i);
        if (z2) {
            if (bg.aV.b(av.e()).a().intValue() == 0 && av.c()) {
                if (this.o == null) {
                    this.o = getSearchView().findViewById(R.id.dot_notification);
                }
                this.o.setVisibility(0);
            }
            FinskyApp.a().h().a(0L, getBurgerMenuPlayStoreUiElementNode());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.search.PlaySearchToolbar
    public final void h() {
        if (this.u != null) {
            this.u.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.search.PlaySearchToolbar
    public final void i() {
        if (this.u != null) {
            this.u.u();
        }
    }

    public final boolean j() {
        return this.o != null && this.o.getVisibility() == 0;
    }

    @Override // com.google.android.play.search.PlaySearchToolbar, android.support.v7.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(new k(this, onClickListener));
    }

    public void setSearchBoxFixedWidth(int i) {
        this.v = i;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.search.PlaySearchToolbar, android.support.v7.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.v > 0) {
            int size = (View.MeasureSpec.getSize(i) - this.v) / 2;
            PlaySearch searchView = getSearchView();
            searchView.a(size, searchView.getSearchPlateMarginTop(), size, searchView.getSearchPlateMarginBottom(), false);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cy getBurgerMenuPlayStoreUiElementNode() {
        ad adVar = new ad(5301, this);
        return j() ? new ad(299, adVar) : adVar;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return this.w;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
