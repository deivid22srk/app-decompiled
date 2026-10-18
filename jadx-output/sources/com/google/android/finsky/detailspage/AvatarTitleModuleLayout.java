package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;
import java.util.List;

/* loaded from: classes.dex */
public class AvatarTitleModuleLayout extends FrameLayout implements bp, bq, com.google.android.finsky.layout.aj {

    /* renamed from: a, reason: collision with root package name */
    PlayTextView f2480a;

    /* renamed from: b, reason: collision with root package name */
    FifeImageView f2481b;
    boolean c;
    private int d;

    public AvatarTitleModuleLayout(Context context) {
        this(context, null);
    }

    public AvatarTitleModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2481b = (FifeImageView) findViewById(R.id.title_thumbnail);
        this.f2480a = (PlayTextView) findViewById(R.id.title_title);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_profile_avatar_size);
        this.d = resources.getDimensionPixelSize(R.dimen.play_profile_avatar_overlap);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = (-dimensionPixelSize) + this.d;
        setLayoutParams(marginLayoutParams);
    }

    @Override // com.google.android.finsky.layout.aj
    public final void a(List<Integer> list) {
        list.add(Integer.valueOf(R.id.title_title));
        if (!this.c) {
            list.add(Integer.valueOf(R.id.title_thumbnail));
        }
    }

    @Override // com.google.android.finsky.layout.aj
    public final void b(List<View> list) {
        list.add(this.f2480a);
        if (!this.c) {
            list.add(this.f2481b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.f2480a.measure(i, 0);
        ViewGroup.LayoutParams layoutParams = this.f2481b.getLayoutParams();
        this.f2481b.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.f2480a.getMeasuredHeight() + this.f2481b.getMeasuredHeight()) - this.d);
    }
}
