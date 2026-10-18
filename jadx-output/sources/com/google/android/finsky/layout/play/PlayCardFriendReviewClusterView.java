package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.utils.fe;
import com.google.android.play.layout.StarRatingBar;

/* loaded from: classes.dex */
public class PlayCardFriendReviewClusterView extends ci {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3319a;

    /* renamed from: b, reason: collision with root package name */
    private View f3320b;
    private PlayCardFriendReviewHeaderView c;
    private PersonAvatarView d;
    private TextView e;
    private StarRatingBar f;
    private TextView g;
    private final int h;

    public PlayCardFriendReviewClusterView(Context context) {
        this(context, null);
    }

    public PlayCardFriendReviewClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f3319a = resources.getBoolean(R.bool.use_wide_layout_for_friend_review_cluster);
        this.h = resources.getDimensionPixelSize(R.dimen.friend_review_reviewer_top_margin);
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (PlayCardFriendReviewHeaderView) findViewById(R.id.play_card);
        this.f = (StarRatingBar) this.c.findViewById(R.id.review_rating);
        if (this.f3319a) {
            this.c.getCardViewGroupDelegate().d(this.c, 8388611);
        }
        this.f3320b = findViewById(R.id.reviewer);
        this.d = (PersonAvatarView) this.f3320b.findViewById(R.id.avatar);
        this.e = (TextView) this.f3320b.findViewById(R.id.reviewer_name);
        this.g = (TextView) this.f3320b.findViewById(R.id.review_date);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 424;
    }

    public void setContentHorizontalPadding(int i) {
        android.support.v4.view.by.a(this, i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int size = View.MeasureSpec.getSize(i);
        int i3 = (size - n) - o;
        if (this.f3319a) {
            this.f3320b.measure(0, 0);
            this.c.measure(View.MeasureSpec.makeMeasureSpec(i3 - this.f3320b.getMeasuredWidth(), 1073741824), 0);
            setMeasuredDimension(size, paddingTop + Math.max(this.f3320b.getMeasuredHeight() + this.h, this.c.getMeasuredHeight()) + paddingBottom);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.c.measure(makeMeasureSpec, 0);
        this.f3320b.measure(makeMeasureSpec, 0);
        setMeasuredDimension(size, paddingTop + this.c.getMeasuredHeight() + this.f3320b.getMeasuredHeight() + paddingBottom);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int n = android.support.v4.view.by.n(this);
        int width = getWidth();
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int measuredWidth = this.c.getMeasuredWidth();
        int measuredWidth2 = this.f3320b.getMeasuredWidth();
        if (this.f3319a) {
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, n);
            int i5 = this.h + paddingTop;
            this.f3320b.layout(a2, i5, a2 + measuredWidth2, this.f3320b.getMeasuredHeight() + i5);
            int a3 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n + measuredWidth2);
            this.c.layout(a3, paddingTop, a3 + measuredWidth, this.c.getMeasuredHeight() + paddingTop);
            return;
        }
        int measuredHeight = this.c.getMeasuredHeight();
        int a4 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n);
        this.c.layout(a4, paddingTop, measuredWidth + a4, paddingTop + measuredHeight);
        int i6 = paddingTop + measuredHeight;
        int a5 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, n);
        this.f3320b.layout(a5, i6, a5 + measuredWidth2, this.f3320b.getMeasuredHeight() + i6);
    }

    public final void a(Document document, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, cy cyVar, az azVar) {
        a(document.f1963a.R, cyVar);
        PlayCardFriendReviewHeaderView playCardFriendReviewHeaderView = this.c;
        fe.a(playCardFriendReviewHeaderView, document.a(0), document.f1963a.f3890a, eVar, bVar, false, azVar, getParentOfChildren(), true, -1, false);
        playCardFriendReviewHeaderView.f3321a.setText(com.google.android.finsky.utils.bc.a(document.aA().i));
        ny aA = document.aA();
        this.f.setRating(aA.d);
        this.g.setText(getContext().getString(R.string.play_card_friend_review_reviewed_on, com.google.android.finsky.utils.aj.a(aA.q)));
        gx gxVar = aA.c;
        if (gxVar != null) {
            if (!TextUtils.isEmpty(gxVar.i)) {
                this.e.setText(gxVar.i);
            }
            this.d.a(gxVar, bVar, eVar, null);
            return;
        }
        this.d.setVisibility(8);
    }
}
