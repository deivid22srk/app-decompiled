package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.DocImageView;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.play.search.PlaySearchToolbar;

/* loaded from: classes.dex */
public class PlayHighlightsBannerItemView extends ForegroundRelativeLayout implements com.google.android.finsky.activities.bg, cy, com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3350a = {2};
    public static StringBuilder l;
    private final Rect A;
    private final Interpolator B;
    private final ViewTreeObserver.OnScrollChangedListener C;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3351b;
    public TextView c;
    public View d;
    public View e;
    public View f;
    public DocImageView g;
    public com.google.android.play.image.t h;
    public float i;
    public com.google.android.finsky.apkg.ai j;
    public cy k;
    private View q;
    private int r;
    private com.google.android.play.bpkg.a s;
    private int t;
    private float u;
    private int v;
    private cn w;
    private int x;
    private int y;
    private Interpolator z;

    static {
        if (com.google.android.finsky.navigationmanager.b.h()) {
            StringBuilder sb = new StringBuilder();
            l = sb;
            sb.append("transition_generic_circle:");
        }
    }

    public PlayHighlightsBannerItemView(Context context) {
        this(context, null);
    }

    public PlayHighlightsBannerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHighlightsBannerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 1.0f;
        this.A = new Rect();
        this.B = new android.support.v4.view.bpkg.b();
        this.C = new cl(this);
        this.j = com.google.android.finsky.apkg.i.a(523);
        getCardViewGroupDelegate().a(this, context, attributeSet, i);
        int d = InsetsFrameLayout.f3009a ? ik.d(getContext()) : 0;
        Resources resources = context.getResources();
        this.x = d + PlaySearchToolbar.a(context) + resources.getDimensionPixelSize(R.dimen.finsky_extra_toolbar_height);
        this.y = resources.getDimensionPixelSize(R.dimen.play_header_list_tab_strip_height);
    }

    public com.google.android.play.cpkg.i getCardViewGroupDelegate() {
        return com.google.android.play.cpkg.j.f6829a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3351b = (TextView) findViewById(R.id.li_title);
        this.c = (TextView) findViewById(R.id.li_subtitle);
        this.q = findViewById(R.id.highlight_overlay_title);
        this.s = new com.google.android.play.bpkg.a(this.q);
        this.g = (DocImageView) findViewById(R.id.li_thumbnail);
        this.d = findViewById(R.id.swatch);
        this.f = findViewById(R.id.gradient_overlay);
        Resources resources = getResources();
        int d = InsetsFrameLayout.f3009a ? 0 : ik.d(getContext());
        this.r = resources.getDimensionPixelSize(R.dimen.highlight_banner_swatch_solid_height) - d;
        this.t = resources.getDimensionPixelSize(R.dimen.highlight_banner_swatch_full_height) - d;
        this.u = this.r / this.t;
        this.e = findViewById(R.id.background);
        this.g.setPadding(0, this.r, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (i4 != this.v) {
            this.v = i4;
            this.w = new cn(this.v + this.y, this.x);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.C);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.C);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.j;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (this.d != null) {
            int pixel = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), Math.min(20, bitmap.getHeight())), 1, 1, false).getPixel(0, 0);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.t, new int[]{pixel, pixel, Color.argb(0, Color.red(pixel), Color.green(pixel), Color.blue(pixel))}, new float[]{0.0f, this.u, 1.0f}, Shader.TileMode.CLAMP);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setShader(linearGradient);
            ik.a(this.d, shapeDrawable);
            ik.a(this.e, new ColorDrawable(pixel));
        }
        if (this.h != null) {
            this.h.a(fifeImageView, bitmap);
        }
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
        if (this.h != null) {
            this.h.a(fifeImageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getPositionBasedTitleAlpha() {
        getGlobalVisibleRect(this.A);
        int i = this.A.bottom;
        int i2 = i - this.v;
        float f = (i2 / this.i) - i2;
        this.s.c(f);
        int centerX = this.A.centerX();
        int width = this.A.width();
        ((View) getParent()).getGlobalVisibleRect(this.A);
        float max = Math.max(0.0f, 1.0f - this.B.getInterpolation(Math.abs(centerX - this.A.centerX()) / width));
        return (max > 0.0f ? this.w.a(i + f) : 0.0f) * max;
    }

    @Override // com.google.android.finsky.activities.bg
    public final void a(float f, boolean z) {
        Interpolator eVar;
        if (this.z == null) {
            Path path = new Path();
            path.lineTo(0.375f, z ? 0.0f : 1.0f);
            path.lineTo(1.0f, 1.0f);
            if (Build.VERSION.SDK_INT >= 21) {
                eVar = new PathInterpolator(path);
            } else {
                eVar = new android.support.v4.view.bpkg.e(path);
            }
            this.z = eVar;
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.z.getInterpolation(z ? 1.0f - Math.abs(f) : Math.abs(f))));
        if (!z) {
            max = 1.0f - max;
        }
        this.s.a(max * getPositionBasedTitleAlpha());
        if (f == 1.0f || f == 0.0f || f == -1.0f) {
            this.z = null;
        }
    }
}
