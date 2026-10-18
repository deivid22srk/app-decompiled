package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.et;
import com.google.android.finsky.utils.ex;
import com.google.android.play.layout.PlayCardThumbnail;

/* loaded from: classes.dex */
public abstract class ch extends cm implements Animation.AnimationListener, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public final int f3188a;

    /* renamed from: b, reason: collision with root package name */
    protected final bj f3189b;
    protected final bj c;
    public boolean d;
    private final int e;
    private final com.google.android.finsky.a.ai f;
    private int g;
    private com.google.android.finsky.layout.play.cy h;
    private PlayCardThumbnail i;
    private TextView j;

    protected ch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.e = getResources().getDimensionPixelSize(R.dimen.my_account_row_min_height);
        this.f3188a = getResources().getDimensionPixelSize(R.dimen.my_account_row_height_expanded2);
        this.f = com.google.android.finsky.a.i.a(i);
        this.f3189b = new bj(this);
        this.f3189b.setDuration(150L);
        this.f3189b.setAnimationListener(this);
        this.c = new bj(this);
        this.c.setDuration(150L);
        this.c.setAnimationListener(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.i = (PlayCardThumbnail) findViewById(R.id.li_thumbnail_frame);
        this.j = (TextView) findViewById(R.id.title);
    }

    protected DocImageView getThumbnailCover() {
        if (this.i != null) {
            return (DocImageView) this.i.getImageView();
        }
        return null;
    }

    protected final void a(Document document, String str, com.google.android.play.image.e eVar, boolean z, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.d = z;
        this.h = cyVar;
        this.j.setText(str);
        com.google.android.finsky.a.i.a(this.f, document.f1963a.R);
        cyVar.a(this);
        DocImageView thumbnailCover = getThumbnailCover();
        if (thumbnailCover == null) {
            this.i.setVisibility(8);
            return;
        }
        thumbnailCover.a(document, eVar, ex.f);
        if (com.google.android.finsky.navigationmanager.b.h()) {
            thumbnailCover.setTransitionName("transition_card_details:cover:" + document.f1963a.f3890a);
            setTransitionGroup(true);
        }
        if (com.google.android.finsky.navigationmanager.b.b(document)) {
            this.i.setOnClickListener(bVar.a(document, new com.google.android.finsky.layout.play.ad(2605, this), (String) null, -1, getThumbnailCover()));
        }
        this.i.setVisibility(0);
    }

    protected final void a() {
        getLayoutParams().height = this.d ? this.f3188a : this.e;
        this.f3189b.a(this.e, this.f3188a);
        this.c.a(this.f3188a, this.e);
        requestLayout();
    }

    protected static void a(View view) {
        view.setVisibility(0);
        et.a(view);
    }

    public final void b() {
        this.d = !this.d;
        setClickable(this.d ? false : true);
        startAnimation(this.d ? this.f3189b : this.c);
    }

    public void setRowPosition(int i) {
        this.g = i;
    }

    public int getRowPosition() {
        return this.g;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // com.google.android.finsky.layout.cm
    protected final int a(boolean z) {
        if (z) {
            return getWidth();
        }
        return 0;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
