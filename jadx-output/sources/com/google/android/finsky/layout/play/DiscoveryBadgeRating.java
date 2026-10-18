package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gc;
import com.google.android.play.layout.StarRatingBar;

/* loaded from: classes.dex */
public class DiscoveryBadgeRating extends a {
    private TextView f;
    private StarRatingBar g;
    private TextView h;
    private Paint i;
    private Path j;
    private int k;
    private float l;
    private PointF[] m;
    private float n;
    private int o;
    private int p;
    private int q;

    public DiscoveryBadgeRating(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryBadgeRating(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.discovery_badge_icon_container_size) / 2;
        this.i = new Paint(1);
        this.j = new Path();
        this.j.setFillType(Path.FillType.EVEN_ODD);
        setWillNotDraw(false);
        this.m = new PointF[8];
        for (int i = 0; i < 8; i++) {
            this.m[i] = new PointF();
        }
        this.k = resources.getDimensionPixelSize(R.dimen.discovery_badge_rating_white_stroke_width);
        this.l = (this.d - this.k) - (this.k / 2);
        this.o = resources.getColor(R.color.play_avatar_pressed_fill);
        this.p = resources.getColor(R.color.play_avatar_pressed_outline);
        this.q = resources.getColor(R.color.play_avatar_focused_outline);
        this.n = 0.5f * resources.getDimensionPixelSize(R.dimen.play_avatar_noring_outline);
    }

    @Override // com.google.android.finsky.layout.play.a, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = (TextView) findViewById(R.id.average_value);
        this.g = (StarRatingBar) findViewById(R.id.discovery_summary_rating_bar);
        this.h = (TextView) findViewById(R.id.title);
    }

    @Override // com.google.android.finsky.layout.play.a
    public final void a(gc gcVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, DfeToc dfeToc, PackageManager packageManager, cy cyVar) {
        super.a(gcVar, eVar, bVar, document, dfeToc, packageManager, cyVar);
        this.f.setText(com.google.android.finsky.utils.v.a(gcVar.m));
        this.g.setRating(com.google.android.finsky.utils.v.b(gcVar.m));
        this.g.setShowEmptyStars(false);
        this.h.setText(gcVar.f3859a);
        this.f.setContentDescription(null);
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
        this.i.setColor(this.c);
        this.i.setStyle(Paint.Style.FILL);
        a(width, i, this.d);
        canvas.drawPath(this.j, this.i);
        this.i.setStrokeWidth(this.k);
        this.i.setColor(-1);
        this.i.setStyle(Paint.Style.STROKE);
        a(width, i, this.l);
        canvas.drawPath(this.j, this.i);
        if (isPressed() && (isDuplicateParentStateEnabled() || isClickable())) {
            a(width, i, this.d);
            this.i.setColor(this.o);
            this.i.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.j, this.i);
            this.i.setColor(this.p);
            this.i.setStyle(Paint.Style.STROKE);
            this.i.setStrokeWidth(this.n);
            canvas.drawPath(this.j, this.i);
            return;
        }
        if (isFocused()) {
            this.i.setColor(this.q);
            this.i.setStyle(Paint.Style.STROKE);
            this.i.setStrokeWidth(this.n);
            a(width, i, this.d);
            canvas.drawPath(this.j, this.i);
        }
    }

    @Override // com.google.android.finsky.layout.play.a
    protected int getPlayStoreUiElementType() {
        return 1802;
    }

    private void a(float f, float f2, float f3) {
        double sin = Math.sin(0.7853981633974483d);
        this.m[0].x = (-1.0f) * f3;
        this.m[0].y = 0.0f;
        this.m[1].x = -((int) (f3 * sin));
        this.m[1].y = -((int) (f3 * sin));
        this.m[2].x = 0.0f;
        this.m[2].y = -f3;
        this.m[3].x = (int) (f3 * sin);
        this.m[3].y = -((int) (f3 * sin));
        this.m[4].x = f3;
        this.m[4].y = 0.0f;
        this.m[5].x = (int) (f3 * sin);
        this.m[5].y = (int) (f3 * sin);
        this.m[6].x = 0.0f;
        this.m[6].y = f3;
        this.m[7].x = -((int) (f3 * sin));
        this.m[7].y = (int) (sin * f3);
        for (PointF pointF : this.m) {
            pointF.x += f;
            pointF.y += f2;
        }
        this.j.reset();
        this.j.moveTo(this.m[0].x, this.m[0].y);
        for (int i = 1; i < this.m.length; i++) {
            this.j.lineTo(this.m[i].x, this.m[i].y);
        }
        this.j.close();
    }
}
