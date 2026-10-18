package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.PlayRatingBar;
import com.google.android.finsky.utils.gx;

/* loaded from: classes.dex */
public class RateReviewEditor extends MaxWidthLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected PlayRatingBar f3052a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f3053b;
    protected EditText c;
    protected int d;
    protected db e;
    TextWatcher f;
    private EditText g;

    public static boolean a() {
        return FinskyApp.a().e().a(12602636L);
    }

    public RateReviewEditor(Context context) {
        this(context, null);
    }

    public RateReviewEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new cz(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3052a = (PlayRatingBar) findViewById(R.id.rating_setter);
        this.f3053b = (TextView) findViewById(R.id.rating_description);
        this.g = (EditText) findViewById(R.id.review_title);
        this.c = (EditText) findViewById(R.id.review_comment);
    }

    public final void a(int i, int i2, String str, boolean z, int i3, String str2, String str3) {
        this.d = i2;
        b(i3);
        a(i3);
        TextView textView = (TextView) findViewById(R.id.item_title);
        if (z) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        if (i == 1) {
            this.g.setVisibility(8);
            this.c.setVisibility(8);
        } else {
            this.g.setText(str2);
            this.c.setText(str3);
        }
        this.c.addTextChangedListener(this.f);
    }

    protected final void a(int i) {
        this.f3052a.a(i, this.d, new da(this));
        this.f3052a.setVerticalPadding(R.dimen.review_editor_rating_padding);
    }

    protected final void b() {
        if (this.e != null) {
            this.e.g();
        }
    }

    public void setReviewChangeListener(db dbVar) {
        this.e = dbVar;
    }

    public int getUserRating() {
        return this.f3052a.getRating();
    }

    public String getUserTitle() {
        return this.g.getText().toString().trim();
    }

    public String getUserComment() {
        return this.c.getText().toString().trim();
    }

    public void setUserComment(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g != null) {
            this.g.removeTextChangedListener(this.f);
        }
        this.c.removeTextChangedListener(this.f);
    }

    protected void b(int i) {
        Resources resources = getResources();
        this.f3053b.setText(gx.a(i));
        if (i == 0) {
            this.f3053b.setTextColor(resources.getColor(R.color.play_fg_secondary));
        } else {
            this.f3053b.setTextColor(com.google.android.finsky.utils.ai.c(getContext(), this.d));
        }
    }
}
