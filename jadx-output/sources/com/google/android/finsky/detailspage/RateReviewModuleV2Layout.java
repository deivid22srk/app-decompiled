package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.MyReviewReplyLayout;
import com.google.android.finsky.layout.RateReviewEditor2;
import com.google.android.finsky.layout.play.PersonAvatarView;
import com.google.android.finsky.layout.play.PlayRatingBar;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.StarRatingBar;

/* loaded from: classes.dex */
public class RateReviewModuleV2Layout extends FrameLayout implements bp, com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    cr f2504a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2505b;
    com.google.android.finsky.layout.play.cy c;
    com.google.android.finsky.navigationmanager.b d;
    Document e;
    gx f;
    PersonAvatarView g;
    TextView h;
    PlayRatingBar i;
    StarRatingBar j;
    PlayTextView k;
    ImageView l;
    View m;
    RateReviewEditor2 n;
    MyReviewReplyLayout o;
    ViewStub p;
    View q;
    private Rect r;
    private int s;
    private TextView t;

    public RateReviewModuleV2Layout(Context context) {
        this(context, null);
    }

    public RateReviewModuleV2Layout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new Rect();
        this.s = context.getResources().getDimensionPixelSize(R.dimen.play_card_overflow_touch_extend);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (PersonAvatarView) findViewById(R.id.my_avatar);
        this.t = (TextView) findViewById(R.id.my_display_name);
        this.h = (TextView) findViewById(R.id.my_rating_text);
        this.i = (PlayRatingBar) findViewById(R.id.review_rating_bar);
        this.j = (StarRatingBar) findViewById(R.id.my_rating_bar);
        this.l = (ImageView) findViewById(R.id.rating_overflow);
        this.k = (PlayTextView) findViewById(R.id.review_text);
        this.m = findViewById(R.id.gplus_disclaimer);
        this.n = (RateReviewEditor2) findViewById(R.id.rate_review_editor);
        this.p = (ViewStub) findViewById(R.id.review_reply_stub);
        this.q = findViewById(R.id.bottom_divider);
    }

    final void a() {
        String str = this.f == null ? null : this.f.i;
        if (str != null) {
            this.t.setText(str);
        } else {
            this.t.setVisibility(8);
        }
        if (this.f != null) {
            this.g.a(this.f, this.d, FinskyApp.a().d, new com.google.android.finsky.layout.play.ad(279, this.f.R, this.c));
        } else {
            this.g.setOnClickListener(null);
            this.g.setVisibility(8);
        }
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        if (this.f2504a != null) {
            switch (i) {
                case 1:
                    this.f2504a.e();
                    break;
                case 2:
                    this.f2504a.g();
                    break;
                default:
                    FinskyLog.e("Unknown item selected on RateReviewModuleV2Layout overflow menu: %d", Integer.valueOf(i));
                    break;
            }
        }
    }

    final void a(boolean z) {
        this.l.setOnClickListener(new cp(this, z));
        this.l.setVisibility(0);
        if (this.r.isEmpty()) {
            this.l.getHitRect(this.r);
            this.r.inset(-this.s, -this.s);
            setTouchDelegate(new com.google.android.play.utils.i(this.r, this.l));
        }
    }
}
