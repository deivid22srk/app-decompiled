package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gc;

/* loaded from: classes.dex */
public class DiscoveryBadgeDowloadCount extends a {
    private TextView f;
    private TextView g;
    private Drawable h;
    private RelativeLayout i;
    private Paint j;
    private int k;
    private float l;
    private int m;
    private int n;
    private int o;

    public DiscoveryBadgeDowloadCount(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeDowloadCount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.discovery_badge_icon_container_size) / 2;
        this.h = android.support.v4.c.apkg.a.c(android.support.v4.b.g.a(context, R.drawable.download_magnitude_background).mutate());
        this.j = new Paint(1);
        this.k = resources.getDimensionPixelSize(R.dimen.discovery_badge_download_count_stroke_width);
        this.l = 0.5f * resources.getDimensionPixelSize(R.dimen.play_avatar_noring_outline);
        this.m = resources.getColor(R.color.play_avatar_pressed_fill);
        this.n = resources.getColor(R.color.play_avatar_pressed_outline);
        this.o = resources.getColor(R.color.play_avatar_focused_outline);
        setWillNotDraw(false);
    }

    @Override // com.google.android.finsky.layout.play.a, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = (TextView) findViewById(R.id.download_count_number);
        this.g = (TextView) findViewById(R.id.download_magnitude);
        this.i = (RelativeLayout) findViewById(R.id.download_magnitude_container);
    }

    @Override // com.google.android.finsky.layout.play.a
    @SuppressLint({"NewApi"})
    public final void a(gc gcVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, DfeToc dfeToc, PackageManager packageManager, cy cyVar) {
        super.a(gcVar, eVar, bVar, document, dfeToc, packageManager, cyVar);
        Resources resources = getResources();
        if (gcVar.q.length() < 4) {
            this.f.setTextSize(0, resources.getDimensionPixelSize(R.dimen.discovery_badge_download_count_size_big));
        } else {
            this.f.setTextSize(0, resources.getDimensionPixelSize(R.dimen.discovery_badge_download_count_size_small));
        }
        this.f.setText(gcVar.q);
        this.g.setText(gcVar.s);
        if (TextUtils.isEmpty(gcVar.s)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            if (gcVar.s.length() == 1) {
                layoutParams.addRule(7, R.id.icon_container);
            } else {
                layoutParams.addRule(14);
            }
            this.i.setLayoutParams(layoutParams);
        }
        android.support.v4.c.apkg.a.a(this.h, this.c);
        if (Build.VERSION.SDK_INT >= 16) {
            this.i.setBackground(this.h);
        } else {
            this.i.setBackgroundDrawable(this.h);
        }
        this.f3387b.setText(gcVar.f3859a);
        this.f.setContentDescription(null);
        this.g.setContentDescription(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.SeparatorLinearLayout, android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int i = this.d;
        this.j.setColor(this.c);
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth(this.k);
        canvas.drawCircle(width, i, this.d - ((this.k * 2) / 3), this.j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() / 2;
        int i = this.d;
        if (isPressed() && (isDuplicateParentStateEnabled() || isClickable())) {
            this.j.setColor(this.m);
            this.j.setStyle(Paint.Style.FILL);
            canvas.drawCircle(width, i, this.d, this.j);
            this.j.setColor(this.n);
            this.j.setStyle(Paint.Style.STROKE);
            this.j.setStrokeWidth(this.l);
            canvas.drawCircle(width, i, this.d, this.j);
            return;
        }
        if (isFocused()) {
            this.j.setColor(this.o);
            this.j.setStyle(Paint.Style.STROKE);
            this.j.setStrokeWidth(this.l);
            canvas.drawCircle(width, i, this.d, this.j);
        }
    }

    @Override // com.google.android.finsky.layout.play.a
    protected int getPlayStoreUiElementType() {
        return 1805;
    }
}
