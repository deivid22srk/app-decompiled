package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bo;
import android.support.v4.view.q;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.ex.photo.aa;
import com.android.ex.photo.ab;

/* loaded from: classes.dex */
public class PhotoView extends View implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {
    private static int q;
    private static boolean r;
    private static int s;
    private static Bitmap t;
    private static Bitmap u;
    private static Paint v;
    private static Paint w;
    private boolean A;
    private byte[] B;
    private boolean C;
    private boolean D;
    private Rect E;
    private int F;
    private float G;
    private boolean H;
    private boolean I;
    private boolean J;
    private float K;
    private float L;
    private RectF M;
    private float N;
    private float O;
    private boolean P;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f1174a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f1175b;
    public boolean c;
    public q d;
    public ScaleGestureDetector e;
    public View.OnClickListener f;
    public boolean g;
    public c h;
    public float i;
    public e j;
    public d k;
    public b l;
    public RectF m;
    public RectF n;
    public float[] o;
    public boolean p;
    private Matrix x;
    private Matrix y;
    private int z;

    public PhotoView(Context context) {
        super(context);
        this.f1175b = new Matrix();
        this.y = new Matrix();
        this.z = -1;
        this.E = new Rect();
        this.H = true;
        this.m = new RectF();
        this.M = new RectF();
        this.n = new RectF();
        this.o = new float[9];
        c();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1175b = new Matrix();
        this.y = new Matrix();
        this.z = -1;
        this.E = new Rect();
        this.H = true;
        this.m = new RectF();
        this.M = new RectF();
        this.n = new RectF();
        this.o = new float[9];
        c();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1175b = new Matrix();
        this.y = new Matrix();
        this.z = -1;
        this.E = new Rect();
        this.H = true;
        this.m = new RectF();
        this.M = new RectF();
        this.n = new RectF();
        this.o = new float[9];
        c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.e != null && this.d != null) {
            this.e.onTouchEvent(motionEvent);
            this.d.a(motionEvent);
            switch (motionEvent.getAction()) {
                case 1:
                case 3:
                    z = this.j.g;
                    if (!z) {
                        b();
                    }
                case 2:
                default:
                    return true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.p = true;
        if (this.P) {
            return false;
        }
        return a(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (this.P) {
                    this.N = motionEvent.getX();
                    this.O = motionEvent.getY();
                    break;
                }
                break;
            case 1:
                if (this.P) {
                    break;
                }
                break;
            case 2:
                if (this.P && this.p) {
                    int x = (int) (motionEvent.getX() - this.N);
                    int y = (int) (motionEvent.getY() - this.O);
                    if ((x * x) + (y * y) > q) {
                        this.p = false;
                        break;
                    }
                }
                break;
        }
        return false;
    }

    private boolean a(MotionEvent motionEvent) {
        boolean z;
        float min;
        float min2;
        float f;
        float min3;
        if (this.H && this.g && this.p) {
            if (this.I) {
                z = false;
            } else {
                float scale = getScale();
                if (scale > this.i) {
                    min = this.i;
                    float f2 = min / scale;
                    f = ((getWidth() / 2) - (this.n.centerX() * f2)) / (1.0f - f2);
                    min3 = ((getHeight() / 2) - (this.n.centerY() * f2)) / (1.0f - f2);
                } else {
                    min = Math.min(this.K, Math.max(this.i, scale * 2.0f));
                    float f3 = min / scale;
                    float width = (getWidth() - this.n.width()) / f3;
                    float height = (getHeight() - this.n.height()) / f3;
                    if (this.n.width() <= width * 2.0f) {
                        min2 = this.n.centerX();
                    } else {
                        min2 = Math.min(Math.max(this.n.left + width, motionEvent.getX()), this.n.right - width);
                    }
                    if (this.n.height() <= height * 2.0f) {
                        f = min2;
                        min3 = this.n.centerY();
                    } else {
                        f = min2;
                        min3 = Math.min(Math.max(this.n.top + height, motionEvent.getY()), this.n.bottom - height);
                    }
                }
                this.h.a(scale, min, f, min3);
                z = true;
            }
            this.I = false;
        } else {
            z = false;
        }
        this.p = false;
        return z;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f != null && !this.J) {
            this.f.onClick(this);
        }
        this.J = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.g && !this.h.i) {
            a(-f, -f2);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.g) {
            this.j.a();
            this.k.a();
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.g && !this.h.i) {
            e eVar = this.j;
            if (!eVar.g) {
                eVar.f = -1L;
                eVar.f1184b = f;
                eVar.c = f2;
                float atan2 = (float) Math.atan2(eVar.c, eVar.f1184b);
                eVar.d = (float) (Math.cos(atan2) * 20000.0d);
                eVar.e = (float) (Math.sin(atan2) * 20000.0d);
                eVar.h = false;
                eVar.g = true;
                eVar.f1183a.post(eVar);
            }
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.g && !this.h.i) {
            this.J = false;
            a(getScale() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.g && !this.h.i) {
            this.h.a();
            this.J = true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.g && this.J) {
            this.I = true;
            a();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public Bitmap getPhoto() {
        if (this.f1174a == null || !(this.f1174a instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) this.f1174a).getBitmap();
    }

    public Drawable getDrawable() {
        return this.f1174a;
    }

    public byte[] getVideoData() {
        return this.B;
    }

    public final void setFullScreen$25decb5(boolean z) {
        if (z != this.c) {
            this.c = z;
            requestLayout();
            invalidate();
        }
    }

    public Bitmap getCroppedPhoto() {
        if (!this.D) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 256.0f / (this.E.right - this.E.left);
        Matrix matrix = new Matrix(this.x);
        matrix.postTranslate(-this.E.left, -this.E.top);
        matrix.postScale(f, f);
        if (this.f1174a != null) {
            canvas.concat(matrix);
            this.f1174a.draw(canvas);
            return createBitmap;
        }
        return createBitmap;
    }

    public final void a() {
        this.f1175b.set(this.y);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1174a != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (this.x != null) {
                canvas.concat(this.x);
            }
            this.f1174a.draw(canvas);
            canvas.restoreToCount(saveCount);
            if (this.B != null) {
                canvas.drawBitmap(this.C ? t : u, (getWidth() - r0.getWidth()) / 2, (getHeight() - r0.getHeight()) / 2, (Paint) null);
            }
            this.n.set(this.f1174a.getBounds());
            if (this.x != null) {
                this.x.mapRect(this.n);
            }
            if (this.D) {
                int saveCount2 = canvas.getSaveCount();
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v);
                canvas.save();
                canvas.clipRect(this.E);
                if (this.x != null) {
                    canvas.concat(this.x);
                }
                this.f1174a.draw(canvas);
                canvas.restoreToCount(saveCount2);
                canvas.drawRect(this.E, w);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A = true;
        int width = getWidth();
        int height = getHeight();
        if (this.D) {
            this.F = Math.min(s, Math.min(width, height));
            int i5 = (width - this.F) / 2;
            int i6 = (height - this.F) / 2;
            this.E.set(i5, i6, this.F + i5, this.F + i6);
        }
        b(z);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.z != -1) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.z, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.z);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return this.f1174a == drawable || super.verifyDrawable(drawable);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f1174a == drawable) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setFixedHeight(int i) {
        boolean z = i != this.z;
        this.z = i;
        setMeasuredDimension(getMeasuredWidth(), this.z);
        if (z) {
            b(true);
            requestLayout();
        }
    }

    public final void a(boolean z) {
        this.g = z;
        if (!this.g) {
            a();
        }
    }

    public final void b(boolean z) {
        boolean z2 = false;
        if (this.f1174a != null && this.A) {
            int intrinsicWidth = this.f1174a.getIntrinsicWidth();
            int intrinsicHeight = this.f1174a.getIntrinsicHeight();
            boolean z3 = (intrinsicWidth < 0 || getWidth() == intrinsicWidth) && (intrinsicHeight < 0 || getHeight() == intrinsicHeight);
            this.f1174a.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (z || (this.i == 0.0f && this.f1174a != null && this.A)) {
                int intrinsicWidth2 = this.f1174a.getIntrinsicWidth();
                int intrinsicHeight2 = this.f1174a.getIntrinsicHeight();
                int width = this.D ? s : getWidth();
                int height = this.D ? s : getHeight();
                if ((intrinsicWidth2 < 0 || width == intrinsicWidth2) && (intrinsicHeight2 < 0 || height == intrinsicHeight2)) {
                    z2 = true;
                }
                if (z2 && !this.D) {
                    this.f1175b.reset();
                } else {
                    this.m.set(0.0f, 0.0f, intrinsicWidth2, intrinsicHeight2);
                    if (this.D) {
                        this.M.set(this.E);
                    } else {
                        this.M.set(0.0f, 0.0f, width, height);
                    }
                    RectF rectF = new RectF((width / 2) - ((intrinsicWidth2 * this.G) / 2.0f), (height / 2) - ((intrinsicHeight2 * this.G) / 2.0f), (width / 2) + ((intrinsicWidth2 * this.G) / 2.0f), (height / 2) + ((intrinsicHeight2 * this.G) / 2.0f));
                    if (this.M.contains(rectF)) {
                        this.f1175b.setRectToRect(this.m, rectF, Matrix.ScaleToFit.CENTER);
                    } else {
                        this.f1175b.setRectToRect(this.m, this.M, Matrix.ScaleToFit.CENTER);
                    }
                }
                this.y.set(this.f1175b);
                int intrinsicWidth3 = this.f1174a.getIntrinsicWidth();
                int intrinsicHeight3 = this.f1174a.getIntrinsicHeight();
                int cropSize = this.D ? getCropSize() : getWidth();
                int cropSize2 = this.D ? getCropSize() : getHeight();
                if (intrinsicWidth3 < cropSize && intrinsicHeight3 < cropSize2 && !this.D) {
                    this.i = 1.0f;
                } else {
                    this.i = getScale();
                }
                this.K = Math.max(this.i * 4.0f, 4.0f);
            }
            if (z3 || this.f1175b.isIdentity()) {
                this.x = null;
            } else {
                this.x = this.f1175b;
            }
        }
    }

    private int getCropSize() {
        return this.F > 0 ? this.F : s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getScale() {
        this.f1175b.getValues(this.o);
        return this.o[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2, float f3) {
        this.f1175b.postRotate(-this.L, getWidth() / 2, getHeight() / 2);
        float min = Math.min(Math.max(f, this.i), this.K * 1.5f);
        float scale = getScale();
        if (min > this.K && scale <= this.K) {
            postDelayed(new a(this), 600L);
        }
        float f4 = min / scale;
        this.f1175b.postScale(f4, f4, f2, f3);
        this.f1175b.postRotate(this.L, getWidth() / 2, getHeight() / 2);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(float f, float f2) {
        float max;
        float max2;
        this.n.set(this.m);
        this.f1175b.mapRect(this.n);
        float f3 = this.D ? this.E.left : 0.0f;
        float width = this.D ? this.E.right : getWidth();
        float f4 = this.n.left;
        float f5 = this.n.right;
        if (this.D) {
            max = Math.max(f3 - this.n.right, Math.min(width - this.n.left, f));
        } else if (f5 - f4 < width - f3) {
            max = f3 + (((width - f3) - (f4 + f5)) / 2.0f);
        } else {
            max = Math.max(width - f5, Math.min(f3 - f4, f));
        }
        float f6 = this.D ? this.E.top : 0.0f;
        float height = this.D ? this.E.bottom : getHeight();
        float f7 = this.n.top;
        float f8 = this.n.bottom;
        if (this.D) {
            max2 = Math.max(f6 - this.n.bottom, Math.min(height - this.n.top, f2));
        } else if (f8 - f7 < height - f6) {
            max2 = f6 + (((height - f6) - (f7 + f8)) / 2.0f);
        } else {
            max2 = Math.max(height - f8, Math.min(f6 - f7, f2));
        }
        this.f1175b.postTranslate(max, max2);
        invalidate();
        boolean z = max == f;
        boolean z2 = max2 == f2;
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        float f;
        float f2 = 0.0f;
        this.n.set(this.m);
        this.f1175b.mapRect(this.n);
        float f3 = this.D ? this.E.left : 0.0f;
        float width = this.D ? this.E.right : getWidth();
        float f4 = this.n.left;
        float f5 = this.n.right;
        if (f5 - f4 < width - f3) {
            f = f3 + (((width - f3) - (f4 + f5)) / 2.0f);
        } else if (f4 > f3) {
            f = f3 - f4;
        } else {
            f = f5 < width ? width - f5 : 0.0f;
        }
        float f6 = this.D ? this.E.top : 0.0f;
        float height = this.D ? this.E.bottom : getHeight();
        float f7 = this.n.top;
        float f8 = this.n.bottom;
        if (f8 - f7 < height - f6) {
            f2 = (((height - f6) - (f8 + f7)) / 2.0f) + f6;
        } else if (f7 > f6) {
            f2 = f6 - f7;
        } else if (f8 < height) {
            f2 = height - f8;
        }
        if (Math.abs(f) > 20.0f || Math.abs(f2) > 20.0f) {
            d dVar = this.k;
            if (dVar.e) {
                return;
            }
            dVar.d = -1L;
            dVar.f1182b = f;
            dVar.c = f2;
            dVar.f = false;
            dVar.e = true;
            dVar.f1181a.postDelayed(dVar, 250L);
            return;
        }
        this.f1175b.postTranslate(f, f2);
        invalidate();
    }

    private void c() {
        Context context = getContext();
        if (!r) {
            r = true;
            Resources resources = context.getApplicationContext().getResources();
            s = resources.getDimensionPixelSize(ab.photo_crop_width);
            Paint paint = new Paint();
            v = paint;
            paint.setAntiAlias(true);
            v.setColor(resources.getColor(aa.photo_crop_dim_color));
            v.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            w = paint2;
            paint2.setAntiAlias(true);
            w.setColor(resources.getColor(aa.photo_crop_highlight_color));
            w.setStyle(Paint.Style.STROKE);
            w.setStrokeWidth(resources.getDimension(ab.photo_crop_stroke_width));
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            q = scaledTouchSlop * scaledTouchSlop;
        }
        this.d = new q(context, this, (byte) 0);
        this.e = new ScaleGestureDetector(context, this);
        this.P = bo.a(this.e);
        this.h = new c(this);
        this.j = new e(this);
        this.k = new d(this);
        this.l = new b(this);
    }

    public void setMaxInitialScale(float f) {
        this.G = f;
    }

    static /* synthetic */ void a(PhotoView photoView, float f) {
        photoView.L += f;
        photoView.f1175b.postRotate(f, photoView.getWidth() / 2, photoView.getHeight() / 2);
        photoView.invalidate();
    }
}
