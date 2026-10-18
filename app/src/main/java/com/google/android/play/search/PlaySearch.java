package com.google.android.play.search;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import java.util.List;

/* loaded from: classes.dex */
public class PlaySearch extends FrameLayout implements android.support.v7.view.d, View.OnFocusChangeListener, n {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f7007a;

    /* renamed from: b, reason: collision with root package name */
    public PlaySearchPlate f7008b;
    public l c;
    View d;
    private n e;
    private PlaySearchSuggestionsList f;
    private Point g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;

    static {
        f7007a = Build.VERSION.SDK_INT >= 21;
    }

    public PlaySearch(Context context) {
        this(context, null);
    }

    public PlaySearch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7008b = (PlaySearchPlate) findViewById(com.google.android.play.k.play_search_plate);
        this.f = (PlaySearchSuggestionsList) findViewById(com.google.android.play.k.play_search_suggestions_list);
        this.h = findViewById(com.google.android.play.k.play_search_overlay);
        this.d = findViewById(com.google.android.play.k.play_search_container);
        this.h.setOnClickListener(new e(this));
        this.c = new l();
        this.c.a(this);
        this.f7008b.setPlaySearchController(this.c);
        this.f.setPlaySearchController(this.c);
        PlaySearchPlate playSearchPlate = this.f7008b;
        int focusViewId = this.f.getFocusViewId();
        PlaySearchPlateTextContainer playSearchPlateTextContainer = playSearchPlate.f7016b;
        playSearchPlateTextContainer.f7017a.setOnFocusChangeListener(this);
        playSearchPlateTextContainer.f7017a.setNextFocusDownId(focusViewId);
        PlaySearchSuggestionsList playSearchSuggestionsList = this.f;
        int focusViewId2 = this.f7008b.getFocusViewId();
        playSearchSuggestionsList.f7019a.setOnFocusChangeListener(this);
        playSearchSuggestionsList.f7019a.setNextFocusUpId(focusViewId2);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (!z) {
            post(new f(this));
        }
    }

    public final void a(com.google.android.play.image.e eVar) {
        this.f.setBitmapLoader(eVar);
    }

    public void setHint(CharSequence charSequence) {
        this.f7008b.setHint(charSequence);
    }

    public void setListener(n nVar) {
        this.e = nVar;
    }

    public final void b(int i) {
        this.c.a(i);
    }

    public void setSteadyStateMode(int i) {
        if (i != 1 && i != 2) {
            throw new UnsupportedOperationException("Unsupported search box steady state mode");
        }
        this.c.c = i;
    }

    public int getSteadyStateMode() {
        return this.c.c;
    }

    public void setIdleModeDrawerIconState(int i) {
        this.f7008b.setIdleModeDrawerIconState(i);
    }

    public void setQuery(String str) {
        this.c.a(str, true);
    }

    public void setSuggestions(List<? extends v> list) {
        this.f.setSuggestions(list);
    }

    public int getMode() {
        return this.c.f7048b;
    }

    public void setOnNavButtonClickListener(View.OnClickListener onClickListener) {
        this.c.e = onClickListener;
    }

    public void a(String str, boolean z) {
        if (this.e != null) {
            this.e.a(str, z);
        }
    }

    public void a(int i) {
        if (this.e != null) {
            this.e.a(i);
        }
        boolean z = i == 3;
        a(z, z || i == 2);
    }

    public void a(String str) {
        if (this.e != null) {
            this.e.a(str);
        }
    }

    public void a(v vVar) {
        if (this.e != null) {
            this.e.a(vVar);
        }
    }

    @Override // com.google.android.play.search.n
    public final boolean b(v vVar) {
        if (this.e != null) {
            return this.e.b(vVar);
        }
        return false;
    }

    @Override // android.support.v7.view.d
    public void onActionViewExpanded() {
        setVisibility(0);
        if (!f7007a) {
            b(3);
            return;
        }
        if (((View) getParent()) == null || this.d == null || !this.d.isAttachedToWindow()) {
            return;
        }
        Point revealCenter = getRevealCenter();
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.d, revealCenter.x, revealCenter.y, 0.0f, r0.getWidth());
        createCircularReveal.setDuration(300L);
        this.c.b();
        createCircularReveal.addListener(new h(this));
        createCircularReveal.start();
    }

    public void setRevealCenter(Point point) {
        this.g = new Point(point);
    }

    public final void a(int i, int i2, int i3, int i4, boolean z) {
        this.i = i;
        this.k = i2;
        this.j = i3;
        this.l = i4;
        if (z) {
            requestLayout();
        }
    }

    public int getSearchPlateMarginLeft() {
        return this.i;
    }

    public int getSearchPlateMarginRight() {
        return this.j;
    }

    public int getSearchPlateMarginTop() {
        return this.k;
    }

    public int getSearchPlateMarginBottom() {
        return this.l;
    }

    Point getRevealCenter() {
        if (this.g != null) {
            Point point = new Point(this.g);
            Rect rect = new Rect();
            Point point2 = new Point();
            getGlobalVisibleRect(rect, point2);
            point.offset(-point2.x, -point2.y);
            return point;
        }
        View view = (View) getParent();
        return new Point(view.getRight() - (view.getHeight() / 2), (view.getBottom() + view.getTop()) / 2);
    }

    private void a(boolean z, boolean z2) {
        if (this.h != null) {
            if (z) {
                this.h.setVisibility(0);
            } else if (this.h.getVisibility() != 8) {
                if (!z && !z2) {
                    this.h.setVisibility(8);
                    return;
                }
            } else {
                return;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new j(this, z));
            this.h.startAnimation(alphaAnimation);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        a(false, false);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.d.measure(View.MeasureSpec.makeMeasureSpec((size - this.i) - this.j, 1073741824), 0);
        boolean z = this.h.getVisibility() == 8;
        if (!z) {
            this.h.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        if (z) {
            size2 = this.d.getMeasuredHeight() + this.k + this.l;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.h.getVisibility() != 8) {
            this.h.layout(0, 0, this.h.getMeasuredWidth(), this.h.getMeasuredHeight());
        }
        this.d.layout(this.i, this.k, this.i + this.d.getMeasuredWidth(), this.k + this.d.getMeasuredHeight());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("play_search.parent_instance_state", super.onSaveInstanceState());
        if (this.c != null) {
            bundle.putInt("play_search.mode_state", getMode());
            bundle.putString("play_search.query_state", this.c.d);
        }
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("play_search.parent_instance_state"));
            int i = bundle.getInt("play_search.mode_state", -1);
            if (i >= 0) {
                b(i);
            }
            String string = bundle.getString("play_search.query_state");
            if (string != null) {
                setQuery(string);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.support.v7.view.d
    public void onActionViewCollapsed() {
        this.c.b();
    }
}
