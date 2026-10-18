package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.dv;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class PlaySearchSuggestionsList extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f7019a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7020b;
    private final int c;
    private final float d;
    private int e;
    private r f;
    private l g;
    private dv h;
    private Animation i;
    private int j;

    static /* synthetic */ Animation c(PlaySearchSuggestionsList playSearchSuggestionsList) {
        playSearchSuggestionsList.i = null;
        return null;
    }

    public PlaySearchSuggestionsList(Context context) {
        this(context, null);
    }

    public PlaySearchSuggestionsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f7020b = resources.getDimensionPixelSize(com.google.android.play.i.play_search_one_suggestion_height);
        this.c = resources.getDimensionPixelOffset(com.google.android.play.i.play_search_suggestions_list_bottom_margin);
        this.d = getResources().getDisplayMetrics().density;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7019a = (RecyclerView) findViewById(com.google.android.play.k.suggestion_list_recycler_view);
        RecyclerView recyclerView = this.f7019a;
        getContext();
        recyclerView.setLayoutManager(new w(this));
        this.f = new r();
        this.f7019a.setAdapter(this.f);
        this.h = new x(this);
        this.f.a(this.h);
        this.f7019a.setOnTouchListener(new y(this, (InputMethodManager) getContext().getSystemService("input_method")));
        this.j = getContext().getResources().getDisplayMetrics().heightPixels;
    }

    public void setBitmapLoader(com.google.android.play.image.e eVar) {
        this.f.d = eVar;
    }

    public void setPlaySearchController(l lVar) {
        if (this.g != null) {
            this.g.b(this);
        }
        this.g = lVar;
        this.g.a(this);
        this.f.c = lVar;
    }

    public void setSuggestions(List<? extends v> list) {
        this.f.a(list);
    }

    public int getFocusViewId() {
        return this.f7019a.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.g == null) {
            return;
        }
        int i = this.g.f7048b;
        if (this.f.a() <= 0 || i == 1 || i == 2) {
            a(false);
        } else {
            a(true);
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(int i) {
        if (i == 1) {
            b();
        } else {
            a();
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(String str, boolean z) {
    }

    @Override // com.google.android.play.search.n
    public final void a(String str) {
        b();
    }

    @Override // com.google.android.play.search.n
    public final void a(v vVar) {
        b();
    }

    @Override // com.google.android.play.search.n
    public final boolean b(v vVar) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.i != null) {
            this.i.cancel();
            this.f7019a.getLayoutParams().height = 0;
            this.f7019a.setVisibility(8);
            setVisibility(8);
        }
    }

    private void b() {
        this.f.a(Collections.emptyList());
    }

    private void a(boolean z) {
        if (this.i != null) {
            this.i.cancel();
        }
        if (z) {
            setVisibility(0);
            this.f7019a.setVisibility(0);
            if (this.e == 0) {
                return;
            }
        }
        int height = this.f7019a.getHeight();
        int min = z ? Math.min(this.e, this.f.a() * this.f7020b) : 0;
        if (height != min) {
            z zVar = new z(this, height, min - height);
            zVar.setAnimationListener(new aa(this, z));
            zVar.setDuration(Math.max(50, Math.min(200, (int) (r0 / this.d))));
            this.i = zVar;
            this.f7019a.startAnimation(zVar);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e == 0) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (rect.top > 0) {
                this.e = ((this.j - rect.top) - this.f7019a.getTop()) + this.c;
            }
            a();
        }
    }
}
