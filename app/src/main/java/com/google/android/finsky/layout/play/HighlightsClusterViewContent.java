package com.google.android.finsky.layout.play;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class HighlightsClusterViewContent extends PlayClusterViewContentV2 implements com.google.android.finsky.activities.bg {
    int q;
    private final Interpolator y;

    public HighlightsClusterViewContent(Context context) {
        this(context, null);
    }

    public HighlightsClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT < 21) {
            this.y = new ae(this);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (com.google.android.play.bpkg.d.f6818a == null) {
            com.google.android.play.bpkg.d.f6818a = new com.google.android.play.bpkg.e(applicationContext);
        }
        this.y = com.google.android.play.bpkg.d.f6818a;
    }

    @Override // com.google.android.finsky.layout.play.PlayClusterViewContentV2
    protected int getPreloadRadius() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.activities.bg
    public final void a(float f, boolean z) {
        float copySign;
        float f2;
        if (this.w != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (z) {
                copySign = Math.copySign(this.y.getInterpolation(Math.abs(f)), f);
            } else {
                copySign = Math.copySign(1.0f - this.y.getInterpolation(1.0f - Math.abs(f)), f);
            }
            if (this.q == Integer.MAX_VALUE) {
                this.q = getScrolledToItemPosition() + 1;
            }
            int i = this.q;
            if (f == 0.0f || f == 1.0f || f == -1.0f) {
                this.q = Integer.MAX_VALUE;
                f2 = 0.0f;
            } else {
                f2 = copySign;
            }
            View a2 = linearLayoutManager.a(i);
            if (a2 != 0) {
                if (a2 instanceof com.google.android.finsky.activities.bg) {
                    ((com.google.android.finsky.activities.bg) a2).a(f, z);
                }
                linearLayoutManager.a(i, ((int) (a2.getWidth() * f2)) + getLeadingGapForSnapping());
            }
        }
    }
}
