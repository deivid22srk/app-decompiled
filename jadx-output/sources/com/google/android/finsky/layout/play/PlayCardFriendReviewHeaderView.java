package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.StarRatingBar;

/* loaded from: classes.dex */
public class PlayCardFriendReviewHeaderView extends com.google.android.play.layout.a implements com.google.android.play.layout.k {
    private int E;
    private int F;
    private TextView G;
    private StarRatingBar H;
    private boolean I;
    private String J;
    private String K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private final View.OnClickListener R;
    private final ViewTreeObserver.OnPreDrawListener S;

    /* renamed from: a, reason: collision with root package name */
    PlayTextView f3321a;

    public PlayCardFriendReviewHeaderView(Context context) {
        this(context, null);
    }

    public PlayCardFriendReviewHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new ba(this);
        this.S = new bb(this);
        Resources resources = context.getResources();
        this.P = resources.getDimensionPixelSize(R.dimen.friend_review_card_short_review_bottom_padding);
        this.J = resources.getString(R.string.play_card_friend_review_read_full_review_text).toUpperCase();
        this.K = resources.getString(R.string.play_card_friend_review_read_less_text).toUpperCase();
        this.Q = resources.getBoolean(R.bool.use_wide_layout_for_friend_review_cluster);
        if (this.Q) {
            this.E = (ik.b(resources) / ik.c(resources)) * 2;
            this.F = resources.getDimensionPixelSize(R.dimen.friend_review_card_bubble_size);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3321a = (PlayTextView) findViewById(R.id.review);
        this.G = (TextView) findViewById(R.id.read_full_review);
        this.H = (StarRatingBar) findViewById(R.id.review_rating);
        getViewTreeObserver().addOnPreDrawListener(this.S);
        getCardViewGroupDelegate().d(this, 80);
        if (this.Q) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.width = this.E + this.F;
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 21;
    }

    @Override // com.google.android.play.layout.a
    public com.google.android.play.c.d getCardViewGroupDelegate() {
        return com.google.android.play.c.e.f6827a;
    }

    @Override // com.google.android.play.layout.k
    public final void a(int i, int i2, int i3, int i4) {
        this.L = i;
        this.M = i2;
        this.N = i3;
        this.O = i4;
    }

    @Override // com.google.android.play.layout.k
    public final void a(int[] iArr) {
        iArr[0] = this.L;
        iArr[1] = this.M;
        iArr[2] = this.N;
        iArr[3] = this.O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.Q) {
            this.H.layout(this.H.getLeft() + (this.F / 2), this.H.getTop(), this.H.getRight() + (this.F / 2), this.H.getBottom());
        }
    }

    static /* synthetic */ void b(PlayCardFriendReviewHeaderView playCardFriendReviewHeaderView) {
        playCardFriendReviewHeaderView.I = false;
        playCardFriendReviewHeaderView.f3321a.setMaxLines(3);
        playCardFriendReviewHeaderView.G.setText(playCardFriendReviewHeaderView.J);
    }

    static /* synthetic */ void c(PlayCardFriendReviewHeaderView playCardFriendReviewHeaderView) {
        playCardFriendReviewHeaderView.I = true;
        playCardFriendReviewHeaderView.f3321a.setMaxLines(Integer.MAX_VALUE);
        playCardFriendReviewHeaderView.G.setText(playCardFriendReviewHeaderView.K);
    }
}
