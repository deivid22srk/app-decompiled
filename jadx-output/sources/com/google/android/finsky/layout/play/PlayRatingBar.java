package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class PlayRatingBar extends ViewGroup implements View.OnClickListener, View.OnFocusChangeListener, cv {

    /* renamed from: a, reason: collision with root package name */
    private PlayRatingStar[] f3365a;

    /* renamed from: b, reason: collision with root package name */
    private cu f3366b;
    private int c;
    private int d;

    public PlayRatingBar(Context context) {
        this(context, null);
    }

    public PlayRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        Resources resources = getResources();
        this.f3365a = new PlayRatingStar[5];
        this.f3365a[0] = (PlayRatingStar) findViewById(R.id.star1);
        this.f3365a[0].setContentDescription(resources.getString(R.string.one_star));
        this.f3365a[1] = (PlayRatingStar) findViewById(R.id.star2);
        this.f3365a[1].setContentDescription(resources.getString(R.string.two_star));
        this.f3365a[2] = (PlayRatingStar) findViewById(R.id.star3);
        this.f3365a[2].setContentDescription(resources.getString(R.string.three_star));
        this.f3365a[3] = (PlayRatingStar) findViewById(R.id.star4);
        this.f3365a[3].setContentDescription(resources.getString(R.string.four_star));
        this.f3365a[4] = (PlayRatingStar) findViewById(R.id.star5);
        this.f3365a[4].setContentDescription(resources.getString(R.string.five_star));
    }

    public void setVerticalPadding(int i) {
        this.d = i > 0 ? getResources().getDimensionPixelSize(i) : 0;
        requestLayout();
        invalidate();
    }

    public final void a(int i, int i2, cu cuVar) {
        int i3;
        int i4;
        this.f3366b = cuVar;
        int i5 = 0;
        while (i5 < 5) {
            PlayRatingStar playRatingStar = this.f3365a[i5];
            playRatingStar.j = i5;
            playRatingStar.f3367a = R.raw.btn_rating_star_normal;
            playRatingStar.f3368b = R.raw.btn_rating_star;
            playRatingStar.c = R.drawable.btn_rating_star_focused;
            playRatingStar.d = R.color.play_fg_secondary;
            playRatingStar.e = com.google.android.finsky.utils.ai.a(i2);
            playRatingStar.f = R.drawable.btn_rating_star_normal;
            playRatingStar.g = R.drawable.btn_rating_star_normal_focused;
            switch (i2) {
                case 1:
                    i3 = R.drawable.btn_rating_star_books;
                    break;
                case 2:
                    i3 = R.drawable.btn_rating_star_music;
                    break;
                case 3:
                    if (!com.google.android.finsky.utils.ai.a()) {
                        i3 = R.drawable.btn_rating_star_apps;
                        break;
                    } else {
                        i3 = R.drawable.btn_rating_star_apps_ent;
                        break;
                    }
                case 4:
                    i3 = R.drawable.btn_rating_star_movies;
                    break;
                case 5:
                default:
                    throw new IllegalArgumentException("Unsupported backend ID (" + i2 + ")");
                case 6:
                    i3 = R.drawable.btn_rating_star_newsstand;
                    break;
            }
            playRatingStar.h = i3;
            switch (i2) {
                case 1:
                    i4 = R.drawable.btn_rating_star_books_focused;
                    break;
                case 2:
                    i4 = R.drawable.btn_rating_star_music_focused;
                    break;
                case 3:
                    if (!com.google.android.finsky.utils.ai.a()) {
                        i4 = R.drawable.btn_rating_star_apps_focused;
                        break;
                    } else {
                        i4 = R.drawable.btn_rating_star_apps_ent_focused;
                        break;
                    }
                case 4:
                    i4 = R.drawable.btn_rating_star_movies_focused;
                    break;
                case 5:
                default:
                    throw new IllegalArgumentException("Unsupported backend ID (" + i2 + ")");
                case 6:
                    i4 = R.drawable.btn_rating_star_newsstand_focused;
                    break;
            }
            playRatingStar.i = i4;
            playRatingStar.a();
            playRatingStar.setOnFocusChangeListener(this);
            playRatingStar.setOnPressStateChangeListener(this);
            playRatingStar.setOnClickListener(this);
            playRatingStar.setFilled(i5 < i);
            i5++;
        }
        this.c = i;
    }

    private void a() {
        int i = 0;
        while (i < this.f3365a.length) {
            this.f3365a[i].setFocused(false);
            this.f3365a[i].setFilled(i < this.c);
            i++;
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        View focusedChild = getFocusedChild();
        if (focusedChild == null || !focusedChild.isFocused()) {
            a();
            return;
        }
        int index = ((PlayRatingStar) view).getIndex();
        if (!z) {
            this.f3365a[index].setFocused(false);
            this.f3365a[index].setFilled(false);
            return;
        }
        int i = 0;
        while (i < this.f3365a.length) {
            boolean z2 = i <= index;
            this.f3365a[i].setFocused(z2);
            this.f3365a[i].setFilled(z2);
            i++;
        }
    }

    @Override // com.google.android.finsky.layout.play.cv
    public final void a(View view, boolean z) {
        int index = ((PlayRatingStar) view).getIndex();
        if (!z) {
            int i = 0;
            while (i < this.f3365a.length) {
                this.f3365a[i].setFilled(i < this.c);
                i++;
            }
            return;
        }
        int i2 = 0;
        while (i2 < this.f3365a.length) {
            this.f3365a[i2].setFilled(i2 <= index);
            i2++;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int index = ((PlayRatingStar) view).getIndex();
        int i = 0;
        while (i < this.f3365a.length) {
            this.f3365a[i].setFilled(i <= index);
            i++;
        }
        this.c = index + 1;
        this.f3366b.a(this, index + 1);
    }

    public int getRating() {
        return this.c;
    }

    public void setRating(int i) {
        this.c = i;
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.f3365a[0].measure(0, 0);
        int measuredHeight = (this.d * 2) + this.f3365a[0].getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int length = this.f3365a.length;
        int i3 = size;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i3 / (length - i4);
            this.f3365a[i4].measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), makeMeasureSpec);
            i3 -= i5;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int length = this.f3365a.length;
        int width = getWidth();
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            PlayRatingStar playRatingStar = this.f3365a[i6];
            int measuredWidth = playRatingStar.getMeasuredWidth();
            int measuredHeight = playRatingStar.getMeasuredHeight();
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, i5);
            playRatingStar.layout(a2, 0, a2 + measuredWidth, measuredHeight);
            i5 += measuredWidth;
        }
    }
}
