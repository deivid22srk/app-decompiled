package com.google.android.play.image;

import android.R;
import android.animation.Animator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class FifeImageView extends ImageView implements k {
    private static boolean e;
    private static boolean f;
    private boolean A;
    private boolean B;
    private boolean C;
    private final float D;
    private Handler E;

    /* renamed from: a, reason: collision with root package name */
    e f6920a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6921b;
    public p c;
    public boolean d;
    private t g;
    private String h;
    private boolean i;
    private Drawable j;
    private Drawable k;
    private final Rect l;
    private boolean m;
    private int n;
    private int o;
    private boolean p;
    private float q;
    private final PointF r;
    private final Matrix s;
    private boolean t;
    private Animation u;
    private int v;
    private Animation.AnimationListener w;
    private Animator.AnimatorListener x;
    private float y;
    private Bitmap z;

    static {
        e = Build.VERSION.SDK_INT >= 11;
        f = Build.VERSION.SDK_INT >= 14;
    }

    public FifeImageView(Context context) {
        this(context, null);
    }

    public FifeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FifeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new Rect();
        this.m = false;
        this.r = new PointF(0.5f, 0.5f);
        this.s = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.play.o.FifeImageView);
        this.t = obtainStyledAttributes.getBoolean(com.google.android.play.o.FifeImageView_fade_in_after_load, true);
        this.B = obtainStyledAttributes.getBoolean(com.google.android.play.o.FifeImageView_fixed_bounds, false);
        int i2 = getResources().getDisplayMetrics().densityDpi;
        if (obtainStyledAttributes.hasValue(com.google.android.play.o.FifeImageView_cap_dpi)) {
            this.D = Math.min(obtainStyledAttributes.getInt(com.google.android.play.o.FifeImageView_cap_dpi, i2) / i2, u.a());
        } else {
            this.D = u.a();
        }
        this.p = obtainStyledAttributes.hasValue(com.google.android.play.o.FifeImageView_zoom);
        if (this.p) {
            this.q = obtainStyledAttributes.getFraction(com.google.android.play.o.FifeImageView_zoom, 1, 1, 1.0f);
            super.setScaleType(ImageView.ScaleType.MATRIX);
        } else {
            this.q = 1.0f;
        }
        Resources resources = context.getResources();
        if (obtainStyledAttributes.getBoolean(com.google.android.play.o.FifeImageView_is_avatar, false)) {
            this.c = a.a(resources);
        } else if (obtainStyledAttributes.getBoolean(com.google.android.play.o.FifeImageView_is_avatar_no_ring, false)) {
            this.c = a.b(resources);
        }
        this.y = obtainStyledAttributes.getFraction(com.google.android.play.o.FifeImageView_request_scale_factor, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
        Drawable drawable = obtainStyledAttributes2.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        obtainStyledAttributes2.recycle();
        this.v = resources.getInteger(R.integer.config_shortAnimTime);
        this.C = true;
        this.E = new Handler(Looper.getMainLooper());
    }

    public void setDefaultDrawable(Drawable drawable) {
        this.j = drawable;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        if (this.k != drawable) {
            if (this.k != null) {
                this.k.setCallback(null);
                unscheduleDrawable(this.k);
            }
            this.k = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public final void a(String str, boolean z, e eVar) {
        if (!str.equals(this.h)) {
            this.h = str;
            this.i = z;
            a(false, (Bitmap) null);
        }
        this.f6920a = eVar;
        b(false);
    }

    public void a() {
        this.j = null;
        this.h = null;
        j jVar = (j) getTag();
        if (jVar != null) {
            jVar.a();
            setTag(null);
        }
        setImageBitmap(null);
        a(false, (Bitmap) null);
    }

    public void setOnLoadedListener(t tVar) {
        this.g = tVar;
    }

    public void setBitmapTransformation(p pVar) {
        this.c = pVar;
        setWillNotDraw(false);
    }

    public void setHasFixedBounds(boolean z) {
        this.B = z;
    }

    public final synchronized boolean c() {
        return this.f6921b;
    }

    private synchronized void a(boolean z, Bitmap bitmap) {
        this.f6921b = z;
        if (this.f6921b && this.g != null) {
            this.g.a(this, bitmap);
        }
    }

    public void setToFadeInAfterLoad(boolean z) {
        this.t = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.g != null) {
            this.g.a(this);
        }
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(j jVar) {
        if (this.d) {
            return;
        }
        Bitmap bitmap = jVar.f6944a;
        if (bitmap == null) {
            a(false, (Bitmap) null);
            return;
        }
        if (this.c != null) {
            bitmap = this.c.a(bitmap, getWidth(), getHeight());
        }
        boolean z = !this.f6921b;
        setImageBitmap(bitmap);
        a(bitmap != null, bitmap);
        if (z && this.t) {
            if (f) {
                if (this.x == null && this.g != null) {
                    this.x = new r(this);
                }
                setAlpha(0.0f);
                animate().alpha(1.0f).setDuration(this.v).setListener(this.x);
                return;
            }
            if (this.u == null) {
                this.u = AnimationUtils.loadAnimation(getContext(), com.google.android.play.e.play_fade_in);
            }
            if (this.w == null && this.g != null) {
                this.w = new q(this);
            }
            this.u.setAnimationListener(this.w);
            startAnimation(this.u);
            return;
        }
        b();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.p) {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        }
        super.setScaleType(scaleType);
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        if (this.p) {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        }
        super.setImageMatrix(matrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(boolean r9) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.image.FifeImageView.b(boolean):void");
    }

    public void setLocalImageBitmap(Bitmap bitmap) {
        this.h = null;
        this.z = bitmap;
        b(false);
    }

    public final void a(boolean z) {
        this.d = false;
        setTag(null);
        b(z);
    }

    public void setUseCachedPlaceholder(boolean z) {
        this.C = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap, boolean z) {
        if (!this.d) {
            setImageBitmap(bitmap);
            a(z, bitmap);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b(true);
        this.m = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.k;
    }

    @Override // android.widget.ImageView, android.view.View
    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (e && this.k != null) {
            this.k.jumpToCurrentState();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.k != null && this.k.isStateful()) {
            this.k.setState(getDrawableState());
        }
        if (this.c != null) {
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        if (this.k != null) {
            this.k.setHotspot(f2, f3);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.k != null) {
            this.k.setVisible(i == 0, false);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z = false;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.c != null) {
            if (isPressed() && (isDuplicateParentStateEnabled() || isClickable())) {
                z = true;
            }
            if (z) {
                this.c.b(canvas, width, height);
            }
            if (isFocused()) {
                this.c.a(canvas, width, height);
                return;
            }
            return;
        }
        if (this.k == null) {
            return;
        }
        if (this.m) {
            this.m = false;
            Rect rect = this.l;
            rect.set(0, 0, getWidth(), getHeight());
            this.k.setBounds(rect);
        }
        this.k.draw(canvas);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        d();
        super.setImageDrawable(drawable);
        this.A = false;
        if (this.p) {
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        d();
        super.setImageResource(i);
        this.A = false;
        if (this.p) {
            e();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.p) {
            e();
        }
        this.m = true;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        d();
        super.setImageURI(uri);
        this.A = false;
    }

    @Override // android.view.View
    public void requestLayout() {
        if (!this.A) {
            super.requestLayout();
        }
    }

    public void setDefaultZoom(float f2) {
        if (!this.p || this.q != f2) {
            this.p = true;
            this.q = f2;
            super.setScaleType(ImageView.ScaleType.MATRIX);
            e();
        }
    }

    private void d() {
        if (this.B) {
            this.A = true;
        }
    }

    private void e() {
        Drawable drawable = getDrawable();
        float width = getWidth();
        float height = getHeight();
        if (drawable != null && width != 0.0f && height != 0.0f) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0.0f || intrinsicHeight <= 0.0f) {
                this.s.reset();
            } else {
                float max = Math.max(width / intrinsicWidth, height / intrinsicHeight);
                float max2 = Math.max(intrinsicWidth - (width / max), 0.0f);
                float max3 = Math.max(intrinsicHeight - (height / max), 0.0f);
                float f2 = this.r.x * max2;
                float f3 = this.r.y * max3;
                float f4 = (this.q - 1.0f) * intrinsicWidth;
                float f5 = (this.q - 1.0f) * intrinsicHeight;
                this.s.setRectToRect(new RectF(f2 + (f4 / 2.0f), f3 + (f5 / 2.0f), (intrinsicWidth - (max2 - f2)) - (f4 / 2.0f), (intrinsicHeight - (max3 - f3)) - (f5 / 2.0f)), new RectF(0.0f, 0.0f, width, height), Matrix.ScaleToFit.FILL);
            }
            super.setImageMatrix(this.s);
        }
    }
}
