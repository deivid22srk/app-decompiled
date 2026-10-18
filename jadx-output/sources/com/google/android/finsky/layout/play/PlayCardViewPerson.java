package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.fe;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.List;

/* loaded from: classes.dex */
public class PlayCardViewPerson extends PlayCardViewAvatar implements View.OnClickListener, com.google.android.finsky.i.c {
    private PlayCirclesIcon E;
    private TextView F;
    private ImageView G;

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.i.a f3343a;

    public PlayCardViewPerson(Context context) {
        this(context, null);
    }

    public PlayCardViewPerson(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.E = (PlayCirclesIcon) findViewById(R.id.gplus_circle_status);
        this.E.setOnClickListener(this);
        this.F = (TextView) findViewById(R.id.circles_status);
        this.G = (ImageView) findViewById(R.id.circles_status_icon);
    }

    @Override // com.google.android.play.layout.a
    public final void a(Object obj, int i) {
        super.a(obj, i);
        Document document = (Document) getData();
        if (this.f3343a != null && (this.f3343a.f2851b != FinskyApp.a().j() || this.f3343a.f2850a.f1963a.c != document.f1963a.c)) {
            this.f3343a.d = null;
            this.f3343a = null;
        }
        if (this.f3343a == null) {
            String j = FinskyApp.a().j();
            this.f3343a = FinskyApp.a().a(j).a(document, j);
            this.f3343a.d = this;
            this.f3343a.a(FinskyApp.a().getApplicationContext(), ((com.google.android.finsky.e.t) getContext()).l());
        }
        b(this.f3343a.c);
    }

    public final void a(boolean z) {
        this.E.setVisibility(z ? 0 : 8);
    }

    @Override // com.google.android.finsky.i.c
    public final void a(List<AudienceMember> list) {
        b(list);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if ((view.getContext() instanceof android.support.v4.app.t) && view == this.E) {
            FinskyApp.a().h().a(280, (byte[]) null, fe.b(this));
            this.f3343a.a((android.support.v4.app.t) view.getContext());
        }
    }

    private void b(List<AudienceMember> list) {
        boolean z = (list == null || list.isEmpty()) ? false : true;
        if (z) {
            this.F.setText(com.google.android.finsky.utils.bp.a(list, getResources()));
            this.G.setVisibility(0);
        } else {
            this.F.setText(this.f3343a.f2850a.f1963a.k);
            this.G.setVisibility(8);
        }
        PlayCirclesIcon playCirclesIcon = this.E;
        String str = this.f3343a.f2850a.f1963a.i;
        if (z) {
            playCirclesIcon.setContentDescription(playCirclesIcon.getResources().getString(R.string.content_description_following_on_gplus, str));
            playCirclesIcon.setImageResource(R.drawable.btn_added_friend);
        } else {
            playCirclesIcon.setContentDescription(playCirclesIcon.getResources().getString(R.string.content_description_add_on_gplus, str));
            playCirclesIcon.setImageResource(R.drawable.btn_add_friend);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.PlayCardViewAvatar, com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
        this.G.measure(0, 0);
        int i3 = (paddingLeft - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        if (this.G.getVisibility() == 0) {
            i3 -= this.G.getMeasuredWidth();
        }
        this.F.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), 0);
        this.E.measure(0, 0);
        setMeasuredDimension(size, marginLayoutParams.bottomMargin + getMeasuredHeight() + marginLayoutParams.topMargin + this.F.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.PlayCardViewAvatar, com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int width = getWidth();
        if (this.F.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
            int bottom = ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin + this.h.getBottom() + marginLayoutParams.topMargin;
            boolean z3 = this.G.getVisibility() == 0;
            int measuredWidth = this.F.getMeasuredWidth();
            int measuredWidth2 = this.G.getMeasuredWidth();
            int a2 = ((((width - n) - o) - ((z3 ? measuredWidth2 : 0) + ((android.support.v4.view.ao.a(marginLayoutParams) + measuredWidth) + android.support.v4.view.ao.b(marginLayoutParams)))) / 2) + n;
            if (this.G.getVisibility() == 0) {
                int measuredHeight = ((this.F.getMeasuredHeight() / 2) + bottom) - (this.G.getMeasuredHeight() / 2);
                int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, a2);
                this.G.layout(a3, measuredHeight, measuredWidth2 + a3, this.G.getMeasuredHeight() + measuredHeight);
                a2 += this.G.getMeasuredWidth();
            }
            int a4 = com.google.android.play.utils.j.a(width, measuredWidth, z2, android.support.v4.view.ao.a(marginLayoutParams) + a2);
            this.F.layout(a4, bottom, a4 + measuredWidth, this.F.getMeasuredHeight() + bottom);
        }
        int bottom2 = this.b_.getBottom() - this.b_.getPaddingBottom();
        int measuredWidth3 = this.E.getMeasuredWidth();
        int b2 = com.google.android.play.utils.j.b(z2 ? this.b_.getRight() : this.b_.getLeft(), measuredWidth3, z2, android.support.v4.view.by.o(this.b_));
        this.E.layout(b2, bottom2 - this.E.getMeasuredHeight(), measuredWidth3 + b2, bottom2);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardViewAvatar, com.google.android.play.layout.a
    public int getCardType() {
        return 12;
    }

    @Override // com.google.android.play.layout.a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.f3343a != null) {
            this.f3343a.d = null;
            this.f3343a = null;
        }
        super.onDetachedFromWindow();
    }
}
