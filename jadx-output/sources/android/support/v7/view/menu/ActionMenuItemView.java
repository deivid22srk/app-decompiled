package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.by;
import android.support.v7.widget.bm;
import android.support.v7.widget.cy;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/* loaded from: classes.dex */
public class ActionMenuItemView extends bm implements aa, android.support.v7.widget.s, View.OnClickListener, View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    private m f575a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f576b;
    private Drawable c;
    private k d;
    private cy e;
    private c f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = resources.getBoolean(android.support.v7.b.c.abc_config_allowActionMenuItemTextWithIcon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.b.l.ActionMenuItemView, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.b.l.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.j = -1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.g = getContext().getResources().getBoolean(android.support.v7.b.c.abc_config_allowActionMenuItemTextWithIcon);
        e();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.v7.view.menu.aa
    public m getItemData() {
        return this.f575a;
    }

    @Override // android.support.v7.view.menu.aa
    public final void a(m mVar) {
        this.f575a = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.a((aa) this));
        setId(mVar.getItemId());
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.e == null) {
            this.e = new b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f575a.hasSubMenu() && this.e != null && this.e.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.d != null) {
            this.d.a(this.f575a);
        }
    }

    public void setItemInvoker(k kVar) {
        this.d = kVar;
    }

    public void setPopupCallback(c cVar) {
        this.f = cVar;
    }

    @Override // android.support.v7.view.menu.aa
    public final boolean a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (this.f575a == null) {
                return;
            }
            this.f575a.f597b.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r5.h != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            r5 = this;
            r1 = 1
            r2 = 0
            java.lang.CharSequence r0 = r5.f576b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            r0 = r1
        Lb:
            android.graphics.drawable.Drawable r3 = r5.c
            if (r3 == 0) goto L23
            android.support.v7.view.menu.m r3 = r5.f575a
            int r3 = r3.c
            r3 = r3 & 4
            r4 = 4
            if (r3 != r4) goto L2f
            r3 = r1
        L19:
            if (r3 == 0) goto L24
            boolean r3 = r5.g
            if (r3 != 0) goto L23
            boolean r3 = r5.h
            if (r3 == 0) goto L24
        L23:
            r2 = r1
        L24:
            r0 = r0 & r2
            if (r0 == 0) goto L31
            java.lang.CharSequence r0 = r5.f576b
        L29:
            r5.setText(r0)
            return
        L2d:
            r0 = r2
            goto Lb
        L2f:
            r3 = r2
            goto L19
        L31:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.ActionMenuItemView.e():void");
    }

    public void setIcon(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                float f = this.k / intrinsicWidth;
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.k) {
                float f2 = this.k / intrinsicHeight;
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f576b = charSequence;
        setContentDescription(this.f576b);
        e();
    }

    @Override // android.support.v7.widget.s
    public final boolean c() {
        return b() && this.f575a.getIcon() == null;
    }

    @Override // android.support.v7.widget.s
    public final boolean d() {
        return b();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (b()) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = (width / 2) + iArr[0];
        if (by.h(view) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        Toast makeText = Toast.makeText(context, this.f575a.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean b2 = b();
        if (b2 && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!b2 && this.c != null) {
            super.setPadding((getMeasuredWidth() - this.c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }
}
