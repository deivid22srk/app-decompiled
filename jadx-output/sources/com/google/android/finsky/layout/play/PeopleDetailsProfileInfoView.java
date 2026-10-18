package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PeopleDetailsProfileInfoView extends com.google.android.finsky.layout.bp implements View.OnClickListener, com.google.android.finsky.adapters.ap, y {

    /* renamed from: a, reason: collision with root package name */
    public FifeImageView f3295a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3296b;
    public PlayCirclesButton c;
    public ProfileButton d;
    public Document e;
    public cy f;
    private View g;
    private View h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public PeopleDetailsProfileInfoView(Context context) {
        this(context, null);
    }

    public PeopleDetailsProfileInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.i = resources.getDimensionPixelSize(R.dimen.play_profile_avatar_overlap);
        this.j = resources.getDimensionPixelSize(R.dimen.play_card_default_elevation) * 2;
        this.k = resources.getDimensionPixelSize(R.dimen.play_card_default_inset);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3295a = (FifeImageView) findViewById(R.id.avatar);
        this.g = findViewById(R.id.profile_block);
        this.f3296b = (TextView) this.g.findViewById(R.id.display_name);
        this.h = this.g.findViewById(R.id.button_container);
        this.c = (PlayCirclesButton) this.h.findViewById(R.id.gplus_circle_status);
        this.d = (ProfileButton) this.h.findViewById(R.id.gplus_view_profile);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3295a.setZ(this.g.getZ() + 1.0f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.l = HeroGraphicView.a(getContext(), size, true, 0.5625f);
        if (InsetsFrameLayout.f3009a) {
            this.l -= ik.d(getContext());
        }
        ViewGroup.LayoutParams layoutParams = this.f3295a.getLayoutParams();
        this.f3295a.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
        this.g.measure(View.MeasureSpec.makeMeasureSpec(size - ((marginLayoutParams.rightMargin + marginLayoutParams.leftMargin) - (this.k * 2)), 1073741824), 0);
        setMeasuredDimension(size, this.l + this.g.getMeasuredHeight() + this.j);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int measuredHeight = this.f3295a.getMeasuredHeight();
        int measuredWidth = this.f3295a.getMeasuredWidth();
        int i5 = (this.l - measuredHeight) + this.i;
        int i6 = (width - measuredWidth) / 2;
        this.f3295a.layout(i6, i5, measuredWidth + i6, measuredHeight + i5);
        int i7 = this.l - this.k;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
        this.g.layout(marginLayoutParams.leftMargin - this.k, i7, marginLayoutParams.leftMargin + this.g.getMeasuredWidth(), this.g.getMeasuredHeight() + i7);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getContext() instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) view.getContext();
            if (view == this.d && this.e != null) {
                FinskyApp.a().h().a(281, (byte[]) null, this.f);
                String str = this.e.f1963a.c;
                com.google.android.gms.e.b bVar = new com.google.android.gms.e.b();
                bVar.f5795a.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", "g:" + str);
                bVar.f5795a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", FinskyApp.a().j());
                bVar.f5795a.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 121);
                mainActivity.startActivityForResult(bVar.f5795a, 0);
            }
        }
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.f3295a.a();
    }
}
