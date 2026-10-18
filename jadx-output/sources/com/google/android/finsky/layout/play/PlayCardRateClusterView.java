package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.et;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.ip;

/* loaded from: classes.dex */
public class PlayCardRateClusterView extends PlayCardClusterView implements az {
    private TextView e;
    private ip f;
    private boolean g;

    public PlayCardRateClusterView(Context context) {
        this(context, null);
    }

    public PlayCardRateClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 412;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = (TextView) findViewById(R.id.empty_done);
    }

    public void setClusterFadeOutListener(ip ipVar) {
        this.f = ipVar;
    }

    @Override // com.google.android.finsky.layout.play.az
    public final void a(Document document, com.google.android.play.layout.a aVar) {
        this.f3309b.d(document.f1963a.f3890a);
        a((PlayCardViewRate) aVar);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView
    public final void a(as asVar, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, az azVar, bc bcVar, cy cyVar) {
        super.a(asVar, acVar, bVar, bVar2, eVar, this, bcVar, cyVar);
        int cardChildCount = getCardChildCount();
        for (int i = 0; i < cardChildCount; i++) {
            PlayCardViewRate playCardViewRate = (PlayCardViewRate) a(i);
            playCardViewRate.setRateListener(new bs(this, playCardViewRate));
            playCardViewRate.setState(0);
        }
        if (!((PlayCardRateClusterViewContent) this.f3308a).d()) {
            a(false);
        }
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PlayCardViewRate playCardViewRate) {
        playCardViewRate.startAnimation(et.b(getContext(), 150L, new bt(this, playCardViewRate)));
    }

    private void a(boolean z) {
        if (!z) {
            this.f3308a.setVisibility(4);
            this.e.setVisibility(0);
            return;
        }
        this.f3308a.startAnimation(et.b(getContext(), 250L, new bx(this)));
        Animation a2 = et.a(getContext(), 250L, (Animation.AnimationListener) null);
        this.e.setVisibility(0);
        ik.a(getContext(), this.e.getText(), (View) this.e, true);
        this.e.startAnimation(a2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j != null && this.j.getVisibility() != 8) {
            this.j.measure(i, 0);
            paddingTop += this.j.getMeasuredHeight();
        }
        this.f3308a.measure(i, 0);
        int measuredHeight = paddingTop + this.f3308a.getMeasuredHeight();
        this.e.measure(View.MeasureSpec.makeMeasureSpec(this.f3308a.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3308a.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.j != null && this.j.getVisibility() != 8) {
            this.j.layout(0, paddingTop, width, this.j.getMeasuredHeight() + paddingTop);
            paddingTop += this.j.getMeasuredHeight();
        }
        int measuredHeight = this.f3308a.getMeasuredHeight();
        this.f3308a.layout(0, paddingTop, width, paddingTop + measuredHeight);
        int measuredHeight2 = paddingTop + ((measuredHeight - this.e.getMeasuredHeight()) / 2);
        this.e.layout(0, measuredHeight2, width, this.e.getMeasuredHeight() + measuredHeight2);
    }

    static /* synthetic */ void b(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        int a2 = playCardRateClusterView.f3308a.a(playCardViewRate);
        int width = playCardViewRate.getWidth();
        int cardChildCount = playCardRateClusterView.getCardChildCount();
        int[] iArr = new int[cardChildCount];
        for (int i = 0; i < cardChildCount; i++) {
            iArr[i] = playCardRateClusterView.a(i).getLeft();
        }
        bu buVar = new bu(playCardRateClusterView, width, width, a2, cardChildCount, iArr);
        buVar.setDuration(200L);
        buVar.setInterpolator(new AccelerateDecelerateInterpolator());
        buVar.setAnimationListener(new bv(playCardRateClusterView, playCardViewRate));
        playCardRateClusterView.f3308a.startAnimation(buVar);
    }

    static /* synthetic */ void c(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        playCardRateClusterView.f3308a.removeView(playCardViewRate);
        playCardRateClusterView.f3308a.addView(playCardViewRate);
        PlayCardRateClusterViewContent playCardRateClusterViewContent = (PlayCardRateClusterViewContent) playCardRateClusterView.f3308a;
        playCardRateClusterViewContent.c();
        if (!playCardRateClusterViewContent.d()) {
            playCardRateClusterView.a(true);
        } else {
            playCardViewRate.setState(0);
            playCardViewRate.b();
            playCardViewRate.setVisibility(0);
            int cardChildCount = playCardRateClusterView.getCardChildCount() - 1;
            playCardRateClusterView.f3308a.a(cardChildCount, playCardRateClusterViewContent.f3334a[cardChildCount], playCardRateClusterView);
        }
        playCardRateClusterView.g = false;
    }
}
