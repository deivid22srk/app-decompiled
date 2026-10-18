package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
public class PlayQuickLinksBannerItemPillView extends cr {
    private Paint d;
    private RectF e;
    private int f;

    public PlayQuickLinksBannerItemPillView(Context context) {
        super(context);
        b();
    }

    public PlayQuickLinksBannerItemPillView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public PlayQuickLinksBannerItemPillView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        setWillNotDraw(false);
        this.d = new Paint();
        this.d.setAntiAlias(true);
        this.d.setStyle(Paint.Style.FILL);
        this.e = new RectF();
    }

    @Override // com.google.android.finsky.layout.play.cr
    public final void a(com.google.android.finsky.protos.ba baVar, com.google.android.finsky.navigationmanager.b bVar, DfeToc dfeToc, com.google.android.play.image.e eVar, cy cyVar) {
        super.a(baVar, bVar, dfeToc, eVar, cyVar);
        this.d.setColor(this.c);
        if (baVar.f3620b) {
            this.f3478a.setText(baVar.f3619a.toUpperCase());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.ForegroundLinearLayout, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = this.e.height();
        canvas.drawRoundRect(this.e, height / 2.0f, height / 2.0f, this.d);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + this.f, getMeasuredHeight());
    }

    public void setAdditionalWidth(int i) {
        this.f = i;
    }
}
