package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.protos.hc;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.ForegroundRelativeLayout;
import java.util.List;

/* loaded from: classes.dex */
public class HeroGraphicView extends ForegroundRelativeLayout implements am, an, com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    public FifeImageView f2997a;

    /* renamed from: b, reason: collision with root package name */
    protected View f2998b;
    protected float c;
    public boolean d;
    public int e;
    private ImageView f;
    private View g;
    private View h;
    private TextView i;
    private int j;
    private int k;
    private boolean l;
    private final boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    public HeroGraphicView(Context context) {
        this(context, null);
    }

    public HeroGraphicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.HeroGraphicView);
        this.q = obtainStyledAttributes.getBoolean(0, false);
        this.s = obtainStyledAttributes.getBoolean(1, false);
        this.l = this.q;
        obtainStyledAttributes.recycle();
        this.k = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2997a = (FifeImageView) findViewById(R.id.hero_image);
        this.f = (ImageView) findViewById(R.id.play_icon);
        this.g = findViewById(R.id.corpus_fill);
        this.h = findViewById(R.id.hero_image_top_overlay);
        this.f2998b = findViewById(R.id.hero_image_bottom_overlay);
        this.i = (TextView) findViewById(R.id.hero_title);
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        this.v = true;
        if (!this.t) {
            this.f2997a.setVisibility(0);
        }
        if (this.l && bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = this.f2997a.getWidth();
            Matrix matrix = new Matrix();
            matrix.setRectToRect(new RectF(0.0f, 0.0f, width, height), new RectF(0.0f, 0.0f, width2, (int) (width2 * (height / width))), Matrix.ScaleToFit.FILL);
            this.f2997a.setScaleType(ImageView.ScaleType.MATRIX);
            this.f2997a.setImageMatrix(matrix);
        }
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
        if (!this.t) {
            setCorpusFillMode(0);
            this.f2997a.setVisibility(0);
            if (this.u) {
                this.f.setVisibility(0);
            }
        }
    }

    @TargetApi(21)
    public final void a() {
        this.t = true;
        this.u = this.f.getVisibility() == 0;
        this.g.setAlpha(0.0f);
        this.g.animate().alpha(1.0f).setDuration(400L).start();
        this.f2997a.setVisibility(4);
        this.f.setVisibility(4);
    }

    @TargetApi(21)
    public final void b() {
        this.t = false;
        if (this.v) {
            this.f2997a.setVisibility(0);
            this.f2997a.setAlpha(0.0f);
            this.f2997a.animate().alpha(1.0f).setDuration(400L).setListener(new bk(this)).start();
            if (this.u) {
                this.f.setVisibility(0);
                this.f.setScaleX(0.0f);
                this.f.setScaleY(0.0f);
                this.f.animate().scaleY(1.0f).setDuration(400L).start();
                this.f.animate().scaleX(1.0f).setDuration(400L).start();
            }
        }
    }

    public final void a(String str, String str2, boolean z, boolean z2, int i, com.google.android.finsky.layout.play.cy cyVar) {
        this.f.setVisibility(0);
        String j = FinskyApp.a().j();
        boolean c = ik.c(getContext());
        (c ? this.f : this).setOnClickListener(new bl(this, cyVar, z2, j, i, str, z));
        if (!TextUtils.isEmpty(str2) && c) {
            this.f.setContentDescription(getContext().getString(R.string.content_description_generic_trailer, str2));
        }
        if (c) {
            android.support.v4.view.by.c((View) this, 2);
            setFocusable(false);
        } else {
            setFocusable(true);
        }
        if (this.t) {
            this.u = true;
            this.f.setVisibility(4);
        }
    }

    public final void a(com.google.android.play.image.e eVar, Document document) {
        this.d = false;
        this.l = true;
        this.c = 0.5625f;
        com.google.android.finsky.protos.ds a2 = a(document, 13);
        if (a2 == null) {
            setVisibility(8);
        } else {
            this.f2997a.a(a2.f, a2.l, eVar);
            setBackgroundResource(0);
        }
    }

    public final void a(com.google.android.play.image.e eVar, List<com.google.android.finsky.protos.ds> list) {
        this.d = false;
        this.c = 0.5625f;
        com.google.android.finsky.protos.ds a2 = com.google.android.finsky.utils.a.a.a(list, 0, getResources().getDimensionPixelSize(R.dimen.play_profile_header_height));
        this.f2997a.a(a2.f, a2.l, eVar);
        setBackgroundResource(0);
    }

    public final void a(Document document, com.google.android.finsky.layout.play.cy cyVar) {
        this.d = false;
        this.c = a(document.f1963a.e);
        if (d(document)) {
            a(document.b(3).get(0).f, document.f1963a.i, false, document.f1963a.T, document.f1963a.g, cyVar);
        }
        com.google.android.finsky.protos.ds c = c(document);
        this.f2997a.setVisibility(0);
        this.f2997a.a(c.f, c.l, FinskyApp.a().d);
        this.s = true;
    }

    public final void a(Document document) {
        com.google.android.play.image.e eVar = FinskyApp.a().d;
        List<com.google.android.finsky.protos.ds> b2 = document.b(14);
        if (b2 == null || b2.isEmpty()) {
            this.f2997a.setVisibility(8);
            return;
        }
        this.f2997a.setVisibility(0);
        this.f2997a.a(b2.get(0).f, b2.get(0).l, eVar);
        this.c = 0.0f;
    }

    public final void a(Document document, com.google.android.play.image.e eVar, com.google.android.finsky.layout.play.cy cyVar) {
        hc ap = document.ap();
        setFillColor(ik.a(ap, b(document.f1963a.g)));
        a(c(document), document, eVar, false, cyVar);
        this.i.setText(TextUtils.isEmpty(ap.e) ? ap.f3899a : ap.e);
        this.i.setVisibility(0);
        this.f2998b.setVisibility(0);
        setContentDescription(getContext().getString(R.string.content_description_generic_trailer, document.f1963a.i));
        this.l = true;
        this.e = FinskySearchToolbar.a(getContext()) * 2;
    }

    public void setCorpusForFill(int i) {
        setFillColor(b(i));
    }

    public void setFillColor(int i) {
        if (this.g != null) {
            this.g.setBackgroundColor(i);
        }
    }

    public void setCorpusFillMode(int i) {
        if (this.g != null && !this.t && this.k != i) {
            this.k = i;
            this.f2997a.setVisibility(this.k == 2 ? 8 : 0);
            this.g.setVisibility(this.k != 0 ? 0 : 8);
        }
    }

    private int b(int i) {
        return com.google.android.finsky.utils.ai.a(getContext(), i);
    }

    public final void a(com.google.android.finsky.protos.ds dsVar, Document document, com.google.android.play.image.e eVar, boolean z, com.google.android.finsky.layout.play.cy cyVar) {
        this.d = true;
        setCorpusForFill(document.f1963a.g);
        if (dsVar == null) {
            setCorpusFillMode(2);
            return;
        }
        setCorpusFillMode(1);
        this.f2997a.setOnLoadedListener(this);
        this.f2997a.setToFadeInAfterLoad(false);
        this.f2997a.a(dsVar.f, dsVar.l, eVar);
        if (d(document)) {
            a(document.b(3).get(0).f, document.f1963a.i, z, document.f1963a.T, document.f1963a.g, cyVar);
        }
        a(dsVar, document);
        setVisibility(0);
    }

    public final void a(com.google.android.finsky.protos.ds dsVar, Document document) {
        if (!this.q) {
            this.c = a(document.f1963a.e);
        } else if (dsVar.e != null && dsVar.e.f3751b && dsVar.e.d) {
            this.c = dsVar.e.c / dsVar.e.f3750a;
        } else {
            this.c = c(document, this.q);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int min;
        int min2;
        int i3 = 0;
        this.f.measure(0, 0);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.j = a(getContext(), size, this.f2997a.getVisibility() != 8, this.c);
        if (this.q) {
            if ((this.k == 2) && this.e == 0) {
                this.j /= 2;
            }
        }
        Context context = getContext();
        boolean z = this.q;
        boolean z2 = this.d;
        float f = this.c;
        if (z && z2) {
            min = size2;
        } else {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i4 = displayMetrics.widthPixels;
            int i5 = displayMetrics.heightPixels;
            if (f > 0.0f && (this.s || i5 > i4)) {
                min = (int) (size * f);
            } else {
                min = Math.min(resources.getDimensionPixelSize(R.dimen.play_profile_header_height), i5 / 2);
            }
        }
        if (this.i.getVisibility() != 8) {
            this.i.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        if (this.f2997a.getVisibility() == 8) {
            this.f2998b.measure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            int i6 = (!this.q || this.e <= 0) ? min : this.j + this.e;
            this.f2997a.measure(i, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            if (this.f2998b.getVisibility() != 8) {
                if (this.v) {
                    Drawable drawable = this.f2997a.getDrawable();
                    if (drawable == null) {
                        this.r = i6;
                    } else {
                        this.r = Math.min((drawable.getIntrinsicHeight() * size) / drawable.getIntrinsicWidth(), i6);
                    }
                    i3 = this.r - Math.min(i6 / 2, this.j - this.i.getMeasuredHeight());
                }
                this.f2998b.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
        }
        if (this.g != null && this.g.getVisibility() != 8) {
            if (this.k == 2) {
                min2 = this.q ? this.j + (FinskySearchToolbar.a(getContext()) * 2) : this.j;
            } else {
                min2 = (!this.q || this.c <= 0.0f) ? min : Math.min((int) (size * this.c), this.f2997a.getMeasuredHeight());
            }
            this.g.measure(i, View.MeasureSpec.makeMeasureSpec(min2, 1073741824));
        }
        if (this.h.getVisibility() != 8) {
            this.h.measure(i, View.MeasureSpec.makeMeasureSpec(this.h.getLayoutParams().height, 1073741824));
        }
        setMeasuredDimension(size, min);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingRight = getPaddingRight();
        int measuredWidth = this.f2997a.getMeasuredWidth();
        int i5 = ((width - measuredWidth) - paddingRight) / 2;
        this.f2997a.layout(i5, 0, measuredWidth + i5, this.f2997a.getMeasuredHeight());
        if (this.f.getVisibility() != 8) {
            int measuredWidth2 = this.f.getMeasuredWidth();
            int measuredHeight = this.f.getMeasuredHeight();
            int i6 = ((width - measuredWidth2) - paddingRight) / 2;
            int i7 = (((this.j == 0 || this.s) ? height : this.j) - measuredHeight) / 2;
            this.f.layout(i6, i7, measuredWidth2 + i6, measuredHeight + i7);
        }
        if (this.g != null && this.g.getVisibility() != 8) {
            this.g.layout(0, 0, this.g.getMeasuredWidth(), this.g.getMeasuredHeight());
        }
        if (this.h.getVisibility() != 8) {
            this.h.layout(0, 0, width, this.h.getMeasuredHeight());
        }
        if (this.f2998b.getVisibility() != 8) {
            this.f2998b.layout(0, this.r - this.f2998b.getMeasuredHeight(), width, this.r);
        }
        if (this.i.getVisibility() != 8) {
            if (this.j != 0) {
                height = this.j;
            }
            this.i.layout(0, height - this.i.getMeasuredHeight(), width, height);
        }
    }

    public static int a(Context context, int i, boolean z, float f) {
        if (!z) {
            return FinskySearchToolbar.a(context) * 3;
        }
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (f > 0.0f && i3 > i2) {
            return (int) (i * f);
        }
        return Math.min(resources.getDimensionPixelSize(R.dimen.play_profile_header_height), i3 / 2);
    }

    public static int a(Context context, Document document, boolean z) {
        Resources resources = context.getResources();
        boolean z2 = z && b(document, z) == null;
        if (a(document, z)) {
            int a2 = a(context, resources.getDisplayMetrics().widthPixels, true, c(document, z));
            int i = z2 ? a2 / 2 : a2;
            if (!z && com.google.android.finsky.activities.cc.c(document.f1963a.e)) {
                i -= resources.getDimensionPixelSize(R.dimen.summary_thumbnail_peek);
            }
            if (InsetsFrameLayout.f3009a) {
                return i - ik.d(context);
            }
            return i;
        }
        return FinskyHeaderListLayout.a(context, 2);
    }

    public static float a(int i) {
        switch (i) {
            case 1:
            case 16:
            case 17:
                return 0.48828125f;
            case 3:
                return 0.5f;
            case 6:
            case 7:
            case 8:
            case 18:
            case 19:
            case 20:
            case 26:
            case 28:
            case 30:
            case 34:
            case 44:
                return 0.5625f;
            default:
                return com.google.android.finsky.layout.play.as.b(i);
        }
    }

    private static float c(Document document, boolean z) {
        return a(z && document.f1963a.e == 2 ? 3 : document.f1963a.e);
    }

    public static boolean a(Document document, boolean z) {
        if (z) {
            return true;
        }
        switch (document.f1963a.e) {
            case 5:
                break;
            default:
                if (b(document, z) == null) {
                    break;
                }
                break;
        }
        return true;
    }

    private static com.google.android.finsky.protos.ds a(Document document, int... iArr) {
        if (document == null) {
            return null;
        }
        for (int i : iArr) {
            List<com.google.android.finsky.protos.ds> b2 = document.b(i);
            if (b2 != null && !b2.isEmpty()) {
                return b2.get(0);
            }
        }
        return null;
    }

    private static boolean d(Document document) {
        List<com.google.android.finsky.protos.ds> b2;
        return (document.Q() == 12 || (b2 = document.b(3)) == null || b2.isEmpty()) ? false : true;
    }

    public static boolean b(Document document) {
        return document.f1963a.e == 6;
    }

    public static com.google.android.finsky.protos.ds c(Document document) {
        switch (document.f1963a.e) {
            case 1:
                return a(document, 2, 0);
            case 2:
                return a(document, 4, 0);
            case 3:
                return a(document, 4, 0);
            case 5:
                return null;
            case 6:
                return a(document, 0, 13);
            case 7:
            case 12:
            case 26:
                return a(document, 1);
            case 8:
                return a(document, 14);
            case 16:
            case 17:
                return a(document, 14);
            case 18:
            case 19:
            case 20:
                return a(document, 2, 4);
            case 30:
                return a(document, 14);
            case 34:
                return a(document, 14);
            case 44:
                return a(document, 14, 0);
            default:
                return a(document, 4, 0);
        }
    }

    public static com.google.android.finsky.protos.ds b(Document document, boolean z) {
        int i = document.f1963a.e;
        Document q = z && i == 2 ? document.q() : document;
        if (q == null) {
            return null;
        }
        return z && (i == 24 || i == 25) ? a(document, 4) : c(q);
    }

    static /* synthetic */ Intent a(HeroGraphicView heroGraphicView, String str, boolean z) {
        if (z) {
            return com.google.android.finsky.utils.cr.b(heroGraphicView.getContext().getPackageManager(), Uri.parse(str), FinskyApp.a().j());
        }
        return com.google.android.finsky.utils.cr.a(heroGraphicView.getContext().getPackageManager(), Uri.parse(str), FinskyApp.a().j());
    }
}
