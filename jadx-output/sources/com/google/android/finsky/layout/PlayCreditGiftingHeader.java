package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayCreditGiftingHeader extends FrameLayout implements com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3041a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3042b;
    public FifeImageView c;
    private View d;

    public PlayCreditGiftingHeader(Context context) {
        this(context, null);
    }

    public PlayCreditGiftingHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(R.id.background);
        this.f3041a = (TextView) findViewById(R.id.gift_header_title);
        this.f3042b = (TextView) findViewById(R.id.gift_header_description);
        this.c = (FifeImageView) findViewById(R.id.gift_header_image);
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        this.d.setBackgroundColor(bitmap.getPixel(0, bitmap.getHeight() - 1));
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }

    public static int a(Resources resources) {
        return resources.getDimensionPixelOffset(R.dimen.play_credit_header_height);
    }
}
