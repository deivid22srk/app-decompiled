package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class PlayBundleBannerView extends ci {

    /* renamed from: a, reason: collision with root package name */
    private FifeImageView f3299a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f3300b;
    private PlayActionButton c;
    private TextView d;
    private LinearLayout e;
    private int f;
    private String g;
    private View h;
    private View.OnClickListener i;

    public PlayBundleBannerView(Context context) {
        this(context, null);
    }

    public PlayBundleBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3299a = (FifeImageView) findViewById(R.id.background_image);
        this.d = (TextView) findViewById(R.id.card_description);
        this.f3300b = (TextView) findViewById(R.id.explore_button);
        this.c = (PlayActionButton) findViewById(R.id.install_all_button);
        this.e = (LinearLayout) findViewById(R.id.images);
        this.h = findViewById(R.id.li_overflow);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 420;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f <= 0) {
            setMeasuredDimension(size, 0);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((size / this.f) + getPaddingTop() + getPaddingBottom(), 1073741824));
        }
    }

    public final void a(com.google.android.play.image.e eVar, Document document, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i, View.OnClickListener onClickListener3) {
        this.i = onClickListener3;
        if (document.f1963a.f3890a != this.g) {
            Resources resources = getResources();
            this.g = document.f1963a.f3890a;
            this.f = i;
            ds dsVar = document.b(14).get(0);
            this.f3299a.a(dsVar.f, dsVar.l, eVar);
            this.f3299a.setOnClickListener(onClickListener);
            this.f3299a.setContentDescription(resources.getString(R.string.content_description_explore_bundle, document.f1963a.i));
            this.d.setText(document.f1963a.i);
            this.f3300b.setText(resources.getString(R.string.explore).toUpperCase());
            this.c.a(3, R.string.install_all, onClickListener2);
            int min = Math.min(5, document.a());
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= 5) {
                    break;
                }
                FifeImageView fifeImageView = (FifeImageView) this.e.getChildAt(i3);
                if (i3 < min) {
                    fifeImageView.a(document.a(i3).b(4).get(0).f, false, eVar);
                    fifeImageView.setVisibility(0);
                } else {
                    fifeImageView.setVisibility(8);
                }
                i2 = i3 + 1;
            }
            if (onClickListener3 != null) {
                com.google.android.play.layout.d dVar = new com.google.android.play.layout.d(getContext(), this.h);
                dVar.a(0, resources.getString(R.string.content_description_recommendation_dismiss), true, new am(this, onClickListener3));
                this.h.setOnClickListener(new an(this, dVar));
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
            e();
        }
    }
}
