package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PersonAvatarView;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class ReviewItemLayout extends RelativeLayout implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f3056a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3057b;
    private TextView c;
    private ReviewItemHeaderLayout d;
    private TextView e;
    private TextView f;
    private TextView g;
    private PersonAvatarView h;
    private View i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private ViewStub m;
    private ReviewReplyLayout n;
    private TextView o;
    private ImageView p;
    private boolean q;
    private boolean r;
    private boolean s;
    private dl t;
    private com.google.android.finsky.layout.play.cy u;

    public ReviewItemLayout(Context context) {
        this(context, null);
    }

    public ReviewItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3056a = new Rect();
        this.f3057b = context.getResources().getDimensionPixelSize(R.dimen.play_card_overflow_touch_extend) * 2;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.review_author);
        this.d = (ReviewItemHeaderLayout) findViewById(R.id.review_header);
        this.e = (TextView) findViewById(R.id.review_title);
        this.f = (TextView) findViewById(R.id.review_text);
        this.g = (TextView) findViewById(R.id.review_metadata);
        this.h = (PersonAvatarView) findViewById(R.id.user_profile_image);
        this.i = findViewById(R.id.action_container);
        this.o = (TextView) findViewById(R.id.main_action);
        this.j = (ImageView) findViewById(R.id.action_image);
        this.k = (TextView) findViewById(R.id.action_text);
        this.p = (ImageView) findViewById(R.id.review_action_overflow);
        this.l = (TextView) findViewById(R.id.your_review_label);
        this.m = (ViewStub) findViewById(R.id.review_reply_stub);
        this.n = (ReviewReplyLayout) findViewById(R.id.review_reply_container);
    }

    public final void a(Document document, ny nyVar, int i, com.google.android.finsky.navigationmanager.b bVar, boolean z, boolean z2, boolean z3, boolean z4, com.google.android.finsky.layout.play.cy cyVar) {
        long j;
        String quantityString;
        int color;
        String string;
        int i2;
        this.u = cyVar;
        this.s = z2;
        Context context = getContext();
        Resources resources = getResources();
        this.q = z;
        this.r = (this.q || TextUtils.isEmpty(nyVar.f4191a)) ? false : true;
        if (this.q) {
            ImageView imageView = this.j;
            int i3 = document.f1963a.g;
            switch (i3) {
                case 1:
                    i2 = R.drawable.ic_edit_books;
                    break;
                case 2:
                    i2 = R.drawable.ic_edit_music;
                    break;
                case 3:
                    if (!com.google.android.finsky.utils.ai.a()) {
                        i2 = R.drawable.ic_edit_app;
                        break;
                    } else {
                        i2 = R.drawable.ic_edit_app_ent;
                        break;
                    }
                case 4:
                    i2 = R.drawable.ic_edit_movies;
                    break;
                case 5:
                default:
                    throw new IllegalArgumentException("Unsupported backend ID (" + i3 + ")");
                case 6:
                    i2 = R.drawable.ic_edit_newsstand;
                    break;
            }
            imageView.setImageDrawable(android.support.v4.b.g.a(context, i2));
            this.k.setText(resources.getString(R.string.edit_review).toUpperCase());
            this.k.setTextColor(com.google.android.finsky.utils.ai.a(context, document.f1963a.g));
            this.k.setVisibility(0);
            this.i.setContentDescription(this.k.getText());
            this.l.setText(resources.getString(R.string.your_review_label).toUpperCase(resources.getConfiguration().locale));
            this.l.setVisibility(0);
        } else {
            this.i.setVisibility(this.r ? 0 : 8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            if (this.s) {
                this.j.setVisibility(8);
                if (this.r) {
                    this.o.setVisibility(0);
                    this.i.setFocusable(false);
                    this.i.setBackgroundDrawable(null);
                    this.o.setFocusable(true);
                    int a2 = com.google.android.finsky.utils.ai.a(getContext(), document.f1963a.g);
                    if (z3) {
                        long j2 = nyVar.A + 1;
                        j = j2;
                        quantityString = resources.getQuantityString(R.plurals.review_feedback_unmark_helpful_icon_description, (int) j2, Long.valueOf(j2));
                        color = a2;
                    } else {
                        j = nyVar.A;
                        quantityString = resources.getQuantityString(R.plurals.review_feedback_helpful_icon_description, (int) j, Long.valueOf(j));
                        color = resources.getColor(R.color.play_fg_secondary);
                    }
                    if (j > 0) {
                        this.o.setText(String.valueOf(j));
                        this.o.setContentDescription(quantityString);
                        this.o.setTextColor(color);
                    } else {
                        this.o.setText("");
                        this.o.setContentDescription(resources.getString(R.string.review_feedback_mark_helpful_icon_description));
                    }
                    Drawable c = android.support.v4.c.apkg.a.c(android.support.v4.b.g.a(context, R.drawable.ic_thumb_up));
                    if (z3) {
                        android.support.v4.c.apkg.a.a(c.mutate(), a2);
                    }
                    android.support.v4.view.by.a(this.i, this.i.getPaddingLeft(), this.i.getPaddingTop(), 0, this.i.getPaddingBottom());
                    android.support.v4.widget.bq.a(this.o, null, c, null);
                    this.p.setVisibility(0);
                    this.p.setOnClickListener(new dj(this, z4));
                    this.o.setOnClickListener(new di(this));
                }
            } else {
                this.j.setVisibility(0);
                this.j.setImageDrawable(android.support.v4.b.g.a(context, R.drawable.ic_review));
                this.i.setFocusable(true);
                this.i.setContentDescription(resources.getString(R.string.review_feedback_icon_description));
                this.o.setVisibility(8);
                this.p.setVisibility(8);
            }
        }
        if (nyVar.c != null && !TextUtils.isEmpty(nyVar.c.i)) {
            this.c.setText(nyVar.c.i);
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        this.d.setReviewInfo(nyVar);
        if (!TextUtils.isEmpty(nyVar.g)) {
            this.e.setVisibility(0);
            this.e.setText(Html.fromHtml(nyVar.g));
        } else {
            this.e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(nyVar.i)) {
            this.f.setVisibility(0);
            this.f.setText(Html.fromHtml(nyVar.i));
            this.f.setMaxLines(i);
        } else {
            this.f.setVisibility(8);
        }
        if (document.f1963a.g != 3) {
            string = null;
        } else {
            String str = nyVar.o;
            String str2 = nyVar.s;
            boolean z5 = !TextUtils.isEmpty(str);
            boolean z6 = !TextUtils.isEmpty(str2);
            if (!z5) {
                string = z6 ? str2 : null;
            } else {
                com.google.android.finsky.protos.ag E = document.E();
                if (E.h && str.equals(E.g)) {
                    string = z6 ? str2 : null;
                } else {
                    Context context2 = getContext();
                    string = z6 ? context2.getString(R.string.review_older_version_with_device_name, str2) : context2.getString(R.string.review_older_version);
                }
            }
        }
        if (!TextUtils.isEmpty(string)) {
            this.g.setVisibility(0);
            this.g.setText(string);
        } else {
            this.g.setVisibility(8);
        }
        gx gxVar = nyVar.c;
        if (gxVar != null) {
            this.h.a(gxVar, bVar, FinskyApp.a().d, new com.google.android.finsky.layout.play.ad(279, gxVar.R, this.u));
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        if (nyVar.v) {
            if (this.n == null) {
                this.n = (ReviewReplyLayout) this.m.inflate();
            }
            ReviewReplyLayout reviewReplyLayout = this.n;
            if (!nyVar.v) {
                reviewReplyLayout.setVisibility(8);
            }
            Context context3 = reviewReplyLayout.getContext();
            String str3 = document.f1963a.m;
            if (nyVar.x) {
                long j3 = nyVar.w;
                String a3 = com.google.android.finsky.utils.aj.a(j3);
                if (!nyVar.r || nyVar.q <= j3) {
                    reviewReplyLayout.b();
                    reviewReplyLayout.f3058a.setText(Html.fromHtml(context3.getString(R.string.review_reply_title, str3, a3)));
                } else {
                    reviewReplyLayout.d = false;
                    reviewReplyLayout.c.setVisibility(0);
                    reviewReplyLayout.f3059b.setVisibility(8);
                    reviewReplyLayout.setOnClickListener(new dm(reviewReplyLayout));
                    reviewReplyLayout.a();
                    reviewReplyLayout.f3058a.setText(Html.fromHtml(context3.getString(R.string.review_reply_after_edit_title, str3, a3)));
                }
            } else {
                reviewReplyLayout.b();
                reviewReplyLayout.f3058a.setText(context3.getString(R.string.review_reply_no_date_title, str3));
            }
            reviewReplyLayout.f3059b.setText(nyVar.u);
            reviewReplyLayout.setVisibility(0);
            return;
        }
        if (this.n != null) {
            this.n.setVisibility(8);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.s && this.f3056a.isEmpty()) {
            this.o.getHitRect(this.f3056a);
            this.f3056a.inset(-this.f3057b, -this.f3057b);
            ((ViewGroup) this.o.getParent()).setTouchDelegate(new com.google.android.play.utils.i(this.f3056a, this.o));
        }
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
    }

    public void setReviewFeedbackActionListener(dl dlVar) {
        this.t = dlVar;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        if (this.t != null) {
            switch (i) {
                case 1:
                    this.t.b(this);
                    break;
                default:
                    FinskyLog.e("Unknown item selected on ReviewItemLayout overflow menu: %d", Integer.valueOf(i));
                    break;
            }
        }
    }
}
