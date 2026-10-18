package com.google.android.finsky.layout.play;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.finsky.utils.ik;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PlayListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3355a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f3356b;
    private Interpolator c;
    private Interpolator d;
    private DataSetObserver e;
    private boolean f;
    private Map<Object, RectF> g;
    private int[] h;
    private RectF i;

    static {
        f3355a = Build.VERSION.SDK_INT >= 14;
        f3356b = Build.VERSION.SDK_INT >= 16;
    }

    public PlayListView(Context context) {
        this(context, null);
    }

    public PlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        if (f3355a) {
            this.e = new cp(this);
            this.c = new AccelerateDecelerateInterpolator();
            this.d = new LinearInterpolator();
            this.g = new HashMap();
            this.h = new int[2];
            this.i = new RectF();
        }
    }

    public void setAnimateChanges(boolean z) {
        if (f3355a && this.f != z) {
            this.f = z;
            ListAdapter adapter = getAdapter();
            if (adapter != null) {
                if (z) {
                    adapter.registerDataSetObserver(this.e);
                } else {
                    adapter.unregisterDataSetObserver(this.e);
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = getAdapter();
        if (f3355a && this.f && adapter != null) {
            adapter.unregisterDataSetObserver(this.e);
        }
        super.setAdapter(listAdapter);
        if (f3355a && this.f && listAdapter != null) {
            listAdapter.registerDataSetObserver(this.e);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!f3355a || !this.f || this.g.isEmpty()) {
            return;
        }
        a(this, false);
        this.g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(16)
    private void a(View view, boolean z) {
        if (view instanceof ag) {
            String identifier = ((ag) view).getIdentifier();
            if (z) {
                view.getLocationInWindow(this.h);
                this.g.put(identifier, new RectF(this.h[0], this.h[1], this.h[0] + view.getWidth(), this.h[1] + view.getHeight()));
                view.animate().cancel();
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            RectF rectF = this.g.get(identifier);
            if (rectF != null) {
                view.getLocationInWindow(this.h);
                this.i.set(this.h[0], this.h[1], this.h[0] + view.getWidth(), this.h[1] + view.getHeight());
                float centerX = rectF.centerX() - this.i.centerX();
                float centerY = rectF.centerY() - this.i.centerY();
                if (Math.abs(centerX) > 5.0f || Math.abs(centerY) > 5.0f) {
                    view.setTranslationX(centerX);
                    view.setTranslationY(centerY);
                    view.animate().translationX(0.0f).translationY(0.0f).setDuration(150L).setInterpolator(this.c).setStartDelay(0L);
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        a((ViewGroup) parent);
                        return;
                    }
                    return;
                }
                return;
            }
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setStartDelay(150L).setInterpolator(this.d).setDuration(150L);
            if (f3356b) {
                view.animate().withLayer();
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), z);
            }
        }
    }

    private void a(ViewGroup viewGroup) {
        while (true) {
            viewGroup.setClipChildren(false);
            ViewParent parent = viewGroup.getParent();
            if ((parent instanceof ViewGroup) && viewGroup != this) {
                viewGroup = (ViewGroup) parent;
            } else {
                return;
            }
        }
    }

    static /* synthetic */ void a(PlayListView playListView) {
        if (!f3355a) {
            return;
        }
        playListView.g.clear();
        if (!ik.a(playListView) || playListView.getChildCount() == 0) {
            return;
        }
        playListView.a(playListView, true);
    }
}
