package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.et;
import com.google.android.finsky.utils.ex;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.play.layout.PlayCardThumbnail;

/* loaded from: classes.dex */
public abstract class cl extends ForegroundRelativeLayout implements Animation.AnimationListener, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public final int f3195a;

    /* renamed from: b, reason: collision with root package name */
    protected final bj f3196b;
    protected final bj c;
    public boolean d;
    private final int e;
    private int f;
    private TextView g;
    private PlayCardThumbnail h;
    private int i;
    private final com.google.android.finsky.a.ai j;
    private com.google.android.finsky.layout.play.cy k;

    protected cl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.e = getResources().getDimensionPixelSize(R.dimen.my_account_row_height);
        this.f3195a = getResources().getDimensionPixelSize(R.dimen.my_account_row_height_expanded);
        this.j = com.google.android.finsky.a.i.a(i);
        this.f3196b = new bj(this);
        this.f3196b.setDuration(150L);
        this.f3196b.setAnimationListener(this);
        this.c = new bj(this);
        this.c.setDuration(150L);
        this.c.setAnimationListener(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.title);
        this.h = (PlayCardThumbnail) findViewById(R.id.li_thumbnail_frame);
    }

    protected DocImageView getThumbnailCover() {
        if (this.h != null) {
            return (DocImageView) this.h.getImageView();
        }
        return null;
    }

    protected final void a(Document document, String str, com.google.android.play.image.e eVar, boolean z, com.google.android.finsky.layout.play.cy cyVar, int i, com.google.android.finsky.navigationmanager.b bVar) {
        this.d = z;
        this.i = i;
        this.k = cyVar;
        this.g.setText(str);
        com.google.android.finsky.a.i.a(this.j, document.f1963a.R);
        cyVar.a(this);
        DocImageView thumbnailCover = getThumbnailCover();
        if (thumbnailCover != null) {
            thumbnailCover.a(document, eVar, ex.f);
            if (com.google.android.finsky.navigationmanager.b.h()) {
                thumbnailCover.setTransitionName("transition_card_details:cover:" + document.f1963a.f3890a);
                setTransitionGroup(true);
            }
            if (com.google.android.finsky.navigationmanager.b.b(document)) {
                this.h.setOnClickListener(bVar.a(document, new com.google.android.finsky.layout.play.ad(2605, this), (String) null, -1, getThumbnailCover()));
            }
        }
    }

    protected final void a() {
        getLayoutParams().height = this.d ? this.f3195a : this.e;
        this.f3196b.a(this.e, this.f3195a);
        this.c.a(this.f3195a, this.e);
        c();
        requestLayout();
    }

    protected static void a(View view) {
        view.setVisibility(0);
        et.a(view);
    }

    public final void b() {
        this.d = !this.d;
        setClickable(this.d ? false : true);
        startAnimation(this.d ? this.f3196b : this.c);
        c();
    }

    public void setRowPosition(int i) {
        this.f = i;
    }

    public int getRowPosition() {
        return this.f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    public final void c() {
        setBackgroundResource(this.d ? R.color.white : this.i);
        if (Build.VERSION.SDK_INT >= 21) {
            float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.play_card_default_elevation);
            if (!this.d) {
                dimensionPixelSize = 0.0f;
            }
            setElevation(dimensionPixelSize);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.j;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
