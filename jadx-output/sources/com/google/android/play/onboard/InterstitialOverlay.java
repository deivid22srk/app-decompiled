package com.google.android.play.onboard;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.play.h;
import com.google.android.play.k;
import com.google.android.play.l;
import com.google.android.play.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class InterstitialOverlay extends FrameLayout {
    private List<com.google.android.play.widget.a> c;
    private int[] d;
    private final Random e;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6997b = l.play_onboard_interstitial_overlay;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6996a = {h.play_onboard_accent_color_a, h.play_onboard_accent_color_b, h.play_onboard_accent_color_c, h.play_onboard_accent_color_d};

    public InterstitialOverlay(Context context) {
        this(context, null);
    }

    public InterstitialOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InterstitialOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Random();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            a aVar = new a(this, getResources().getString(m.play_onboard_interstitial_grid_cell));
            ArrayList<View> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this);
            while (!arrayList2.isEmpty()) {
                View view = (View) arrayList2.remove(0);
                if (aVar.a(view)) {
                    arrayList.add(view);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        arrayList2.add(viewGroup.getChildAt(i));
                    }
                }
            }
            if (this.d == null || this.d.length == 0) {
                Context context = getContext();
                int[] iArr = f6996a;
                int[] iArr2 = new int[iArr.length];
                Resources resources = context.getResources();
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr2[i2] = resources.getColor(iArr[i2]);
                }
                setColors(iArr2);
            }
            ArrayList a2 = com.google.android.play.utils.a.a.a(arrayList.size());
            for (View view2 : arrayList) {
                com.google.android.play.widget.a aVar2 = new com.google.android.play.widget.a(getRandomColor(), this.e.nextInt(800));
                if (Build.VERSION.SDK_INT < 16) {
                    view2.setBackgroundDrawable(aVar2);
                } else {
                    view2.setBackground(aVar2);
                }
                a2.add(aVar2);
            }
            this.c = a2;
        }
        Iterator<com.google.android.play.widget.a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    private int getRandomColor() {
        return this.d[this.e.nextInt(this.d.length)];
    }

    public void setCaption(CharSequence charSequence) {
        ((TextView) findViewById(k.caption)).setText(charSequence);
    }

    public void setCaption(int i) {
        ((TextView) findViewById(k.caption)).setText(i);
    }

    protected void setColors(int[] iArr) {
        this.d = iArr;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Iterator<com.google.android.play.widget.a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        super.onDetachedFromWindow();
    }
}
