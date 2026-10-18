package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.FadingEdgeImageView;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.ForegroundRelativeLayout;

/* loaded from: classes.dex */
public class CreatorAvatarCardClusterModuleLayoutV2 extends ForegroundRelativeLayout implements bp, bq, bs, com.google.android.finsky.layout.am, com.google.android.finsky.layout.an {

    /* renamed from: a, reason: collision with root package name */
    FifeImageView f2493a;

    /* renamed from: b, reason: collision with root package name */
    View f2494b;
    FadingEdgeImageView c;
    TextView d;
    TextView e;
    int f;
    int g;
    float h;
    final int i;
    private BucketRow j;
    private final int k;
    private final int l;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private int u;
    private boolean v;
    private final int w;

    public CreatorAvatarCardClusterModuleLayoutV2(Context context) {
        this(context, null);
    }

    public CreatorAvatarCardClusterModuleLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.l = resources.getDimensionPixelSize(R.dimen.creator_avatar_cover_image_height_gap);
        this.k = resources.getDimensionPixelSize(R.dimen.creator_avatar_cover_image_height);
        this.q = resources.getDimensionPixelSize(R.dimen.creator_avatar_size);
        this.r = resources.getDimensionPixelSize(R.dimen.creator_avatar_bucket_gap);
        this.s = resources.getDimensionPixelSize(R.dimen.creator_avatar_text_gap);
        this.t = resources.getDimensionPixelSize(R.dimen.creator_avatar_more_button_bottom_gap);
        this.f = ik.e(resources);
        this.u = br.a(resources, resources.getBoolean(R.bool.use_wide_layout));
        if (this.u > 0) {
            this.u -= resources.getDimensionPixelSize(R.dimen.play_card_inset);
        }
        this.w = resources.getDimensionPixelSize(R.dimen.creator_avatar_content_vpadding);
        this.i = resources.getColor(R.color.play_fg_primary);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2493a = (FifeImageView) findViewById(R.id.avatar_image);
        this.f2494b = findViewById(R.id.cover_fill);
        this.c = (FadingEdgeImageView) findViewById(R.id.cover_image);
        this.e = (TextView) findViewById(R.id.title);
        this.d = (TextView) findViewById(R.id.more_button);
        this.j = (BucketRow) findViewById(R.id.bucket_row);
    }

    final void a() {
        int i;
        int childCount = this.j.getChildCount();
        if (childCount != this.g) {
            while (childCount > this.g) {
                this.j.removeViewAt(childCount - 1);
                childCount--;
            }
            int i2 = this.g - childCount;
            if (i2 > 0) {
                Context context = getContext();
                LayoutInflater from = LayoutInflater.from(context);
                Resources resources = context.getResources();
                for (int i3 = 0; i3 < i2; i3++) {
                    if (resources.getBoolean(R.bool.play_can_use_mini_cards)) {
                        i = R.layout.play_card_mini;
                    } else {
                        i = R.layout.play_card_small;
                    }
                    this.j.addView(from.inflate(i, (ViewGroup) this.j, false));
                }
            }
        }
    }

    final void a(com.google.android.finsky.layout.s sVar) {
        int min = Math.min(sVar.d(), this.g);
        for (int i = 0; i < min; i++) {
            if (sVar.a(i) == 1.441f) {
                this.v = true;
                return;
            }
        }
        this.v = false;
    }

    final void b(com.google.android.finsky.layout.s sVar) {
        for (int i = 0; i < this.g; i++) {
            sVar.a(this.j.getChildAt(i), i);
        }
    }

    private int a(int i) {
        int paddingLeft = getPaddingLeft();
        return paddingLeft + ((((((i - paddingLeft) - getPaddingRight()) - this.j.getPaddingLeft()) - this.j.getPaddingRight()) / this.f) * (this.f - this.g));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = size - (this.u * 2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int a2 = a(i3);
        int i4 = this.v ? this.l : 0;
        this.e.measure(View.MeasureSpec.makeMeasureSpec(a2 - paddingLeft, Integer.MIN_VALUE), 0);
        this.d.measure(0, 0);
        this.j.measure(View.MeasureSpec.makeMeasureSpec((i3 - a2) - paddingRight, 1073741824), 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.q, 1073741824);
        this.f2493a.measure(makeMeasureSpec, makeMeasureSpec);
        int max = Math.max(this.v ? this.j.getMeasuredHeight() - (i4 * 2) : Math.max(this.k, this.j.getMeasuredHeight() + (this.r * 2)), (this.s * 2) + this.t + this.d.getMeasuredHeight() + this.e.getMeasuredHeight() + this.f2493a.getMeasuredHeight());
        this.c.measure(View.MeasureSpec.makeMeasureSpec(Math.min((int) (max / this.h), size), 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.f2494b.measure(i, View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        if (this.c.getVisibility() != 8 && this.c.getMeasuredWidth() < size) {
            this.c.a(this.g > 0 ? false : true, true, (int) (0.1f * size), this.i);
        } else {
            this.c.b();
        }
        setMeasuredDimension(size, (this.w * 2) + max);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredHeight = this.f2493a.getMeasuredHeight();
        int measuredWidth = this.f2493a.getMeasuredWidth();
        int measuredHeight2 = this.e.getMeasuredHeight();
        int measuredWidth2 = this.e.getMeasuredWidth();
        int measuredHeight3 = this.d.getMeasuredHeight();
        int measuredWidth3 = this.d.getMeasuredWidth();
        int measuredHeight4 = getMeasuredHeight();
        int measuredWidth4 = getMeasuredWidth();
        int a2 = a(measuredWidth4 - (this.u * 2));
        int i5 = (paddingLeft + a2) / 2;
        this.f2494b.layout(0, this.w, measuredWidth4, this.w + this.f2494b.getMeasuredHeight());
        int measuredWidth5 = this.g > 0 ? 0 : (measuredWidth4 - this.c.getMeasuredWidth()) / 2;
        this.c.layout(measuredWidth5, this.w, this.c.getMeasuredWidth() + measuredWidth5, this.w + this.c.getMeasuredHeight());
        int measuredHeight5 = (measuredHeight4 - this.j.getMeasuredHeight()) / 2;
        this.j.layout(this.u + a2, measuredHeight5, a2 + this.u + this.j.getMeasuredWidth(), this.j.getMeasuredHeight() + measuredHeight5);
        int i6 = (this.u + i5) - (measuredWidth3 / 2);
        int i7 = (measuredHeight4 - this.w) - this.t;
        this.d.layout(i6, i7 - measuredHeight3, measuredWidth3 + i6, i7);
        int i8 = (this.u + i5) - (measuredWidth2 / 2);
        int top = this.d.getTop() - this.s;
        this.e.layout(i8, top - measuredHeight2, measuredWidth2 + i8, top);
        int i9 = (this.u + i5) - (measuredWidth / 2);
        int top2 = this.e.getTop() - this.s;
        this.f2493a.layout(i9, top2 - measuredHeight, measuredWidth + i9, top2);
    }
}
