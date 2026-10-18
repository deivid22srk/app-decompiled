package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayCardTrustedSourceClusterViewContent extends PlayCardClusterViewContent {

    /* renamed from: a, reason: collision with root package name */
    PersonAvatarView f3337a;

    /* renamed from: b, reason: collision with root package name */
    FifeImageView f3338b;
    TextView c;
    TextView d;
    PlayCirclesButton e;
    Document f;
    private final boolean l;
    private View m;
    private FrameLayout n;
    private boolean o;

    public PlayCardTrustedSourceClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardTrustedSourceClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = context.getResources().getBoolean(R.bool.play_follow_person_cluster_vertical_stack);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.n = (FrameLayout) findViewById(R.id.profile_cover_frame);
        this.f3338b = (FifeImageView) findViewById(R.id.profile_cover);
        this.m = findViewById(R.id.profile_info_block);
        this.f3337a = (PersonAvatarView) this.m.findViewById(R.id.profile_avatar);
        this.c = (TextView) this.m.findViewById(R.id.profile_title);
        this.d = (TextView) this.m.findViewById(R.id.profile_subtitle);
        this.e = (PlayCirclesButton) this.m.findViewById(R.id.action_button);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    public final void a(as asVar, com.google.android.finsky.utils.ac acVar) {
        super.a(asVar, acVar);
        int min = Math.min(this.g.a(), getDocCount());
        this.o = false;
        for (int i = 0; i < min; i++) {
            if (as.b(a(i).f1963a.e) == 1.441f) {
                this.o = true;
                return;
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    protected int getIndexOfFirstCard() {
        return 2;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        int i5 = measuredHeight == 0 ? 0 : (measuredHeight - this.i) - this.j;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        if (this.l) {
            this.m.measure(makeMeasureSpec, 0);
            int measuredHeight2 = this.m.getMeasuredHeight();
            this.n.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((measuredHeight2 - ((int) (this.f3337a.getMeasuredHeight() * 0.5f))) + ((int) (i5 * 0.85f)), 1073741824));
            i4 = measuredHeight2 + i5;
        } else {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(e(size) + ((int) (getExtraColumnOffset() * g(size))), 1073741824);
            this.m.measure(makeMeasureSpec2, 0);
            int measuredHeight3 = this.f3337a.getMeasuredHeight();
            int measuredHeight4 = this.m.getMeasuredHeight() - ((int) (measuredHeight3 * 0.5f));
            if (this.o) {
                i3 = ((int) (i5 * 0.85f)) - ((int) (measuredHeight3 * 0.5f));
            } else {
                i3 = ((int) (measuredHeight3 * 0.0f)) + ((int) (i5 * 0.85f));
            }
            int max = Math.max(measuredHeight4, i3);
            this.n.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(max, 1073741824));
            int i6 = max + ((int) (measuredHeight3 * 0.5f));
            this.m.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            i4 = i6 + ((int) (i5 * 0.14999998f));
        }
        setMeasuredDimension(size, i5 > 0 ? this.i + this.j + i4 : i4);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        int measuredWidth2 = ((int) (this.f3337a.getMeasuredWidth() * 0.5f)) + this.i;
        this.n.layout(0, measuredWidth2, width, this.n.getMeasuredHeight() + measuredWidth2);
        int i5 = this.l ? 0 : this.h;
        this.m.layout(i5, this.i, measuredWidth + i5, measuredHeight + this.i);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        this.f3337a.a();
        this.f3338b.a();
    }
}
