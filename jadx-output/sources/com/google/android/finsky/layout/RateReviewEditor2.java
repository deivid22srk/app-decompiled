package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.gx;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class RateReviewEditor2 extends RateReviewEditor {
    private TextView g;
    private ButtonBar h;
    private Drawable i;
    private InsetDrawable j;
    private View.OnFocusChangeListener k;
    private String l;
    private boolean m;

    public static String a(String str, String str2) {
        ArrayList arrayList = new ArrayList(2);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        return TextUtils.join("\n", arrayList);
    }

    public RateReviewEditor2(Context context) {
        this(context, null);
    }

    public RateReviewEditor2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.RateReviewEditor, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.review_tip);
        this.h = (ButtonBar) findViewById(R.id.rate_review_buttonbar);
        this.i = this.c.getBackground();
    }

    public final void a(int i, int i2, int i3, String str, boolean z) {
        int i4;
        String string;
        int i5 = R.color.play_apps_ent_primary_edittext;
        this.l = str;
        this.d = i2;
        this.m = z;
        if (this.j == null) {
            this.h.measure(0, 0);
            int measuredHeight = this.h.getMeasuredHeight();
            ((LinearLayout.LayoutParams) this.h.getLayoutParams()).setMargins(0, -measuredHeight, 0, 0);
            this.j = new InsetDrawable(this.i, 0, 0, 0, measuredHeight);
        }
        b(i3);
        a(i3);
        this.h.setVisibility(8);
        this.h.setPositiveButtonTextColor(com.google.android.play.utils.h.a(getContext(), i2).getDefaultColor());
        this.h.setNegativeButtonTextColor(getResources().getColor(R.color.play_secondary_text));
        if (i == 1) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(str);
            EditText editText = this.c;
            Context context = getContext();
            switch (this.d) {
                case 1:
                    i5 = R.color.play_books_primary_edittext;
                    i4 = i5;
                    break;
                case 2:
                    i5 = R.color.play_music_primary_edittext;
                    i4 = i5;
                    break;
                case 3:
                    if (!com.google.android.finsky.utils.ai.a()) {
                        i4 = R.color.play_apps_primary_edittext;
                        break;
                    } else {
                        i4 = R.color.play_apps_ent_primary_edittext;
                        break;
                    }
                case 4:
                    i5 = R.color.play_movies_primary_edittext;
                    i4 = i5;
                    break;
                case 5:
                default:
                    if (!com.google.android.finsky.utils.ai.a()) {
                        i5 = R.color.play_multi_primary_edittext;
                    }
                    i4 = i5;
                    break;
                case 6:
                    i5 = R.color.play_newsstand_primary_edittext;
                    i4 = i5;
                    break;
            }
            android.support.v4.view.by.a(editText, context.getResources().getColorStateList(i4));
        }
        Resources resources = getContext().getResources();
        switch (this.d) {
            case 1:
                string = resources.getString(R.string.rate_review_books_tip);
                break;
            default:
                string = null;
                break;
        }
        if (string != null) {
            this.g.setText(string);
        } else {
            this.g.setVisibility(8);
        }
        this.c.addTextChangedListener(this.f);
        this.c.setOnFocusChangeListener(new dc(this));
    }

    public void setCommentFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.k = onFocusChangeListener;
    }

    @Override // com.google.android.finsky.layout.RateReviewEditor
    public int getUserRating() {
        return this.f3052a.getRating();
    }

    @Override // com.google.android.finsky.layout.RateReviewEditor
    public String getUserTitle() {
        return "";
    }

    @Override // com.google.android.finsky.layout.RateReviewEditor
    public String getUserComment() {
        return this.c.getText().toString().trim();
    }

    @Override // com.google.android.finsky.layout.RateReviewEditor
    protected final void b(int i) {
        Resources resources = getResources();
        if (this.m) {
            this.f3053b.setText(R.string.rating_submitted);
        } else {
            this.f3053b.setText(gx.a(i));
        }
        this.f3053b.setTextColor(resources.getColor(R.color.play_fg_secondary));
    }

    public void setClickListener(r rVar) {
        this.h.setClickListener(new de(this, rVar));
    }

    static /* synthetic */ void a(RateReviewEditor2 rateReviewEditor2, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 21) {
            rateReviewEditor2.postDelayed(runnable, 150L);
        } else {
            runnable.run();
        }
    }
}
