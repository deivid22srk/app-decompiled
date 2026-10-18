package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/* loaded from: classes.dex */
final class ex extends cm implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    android.support.v7.a.d f806a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eu f807b;
    private final int[] c;
    private TextView d;
    private ImageView e;
    private View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(eu euVar, Context context, android.support.v7.a.d dVar) {
        super(context, null, android.support.v7.b.b.actionBarTabStyle);
        this.f807b = euVar;
        this.c = new int[]{R.attr.background};
        this.f806a = dVar;
        fx a2 = fx.a(context, null, this.c, android.support.v7.b.b.actionBarTabStyle);
        if (a2.e(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        a2.f836a.recycle();
        setGravity(8388627);
        a();
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (z2 && z) {
            sendAccessibilityEvent(4);
        }
    }

    @Override // android.support.v7.widget.cm, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.support.v7.a.d.class.getName());
    }

    @Override // android.support.v7.widget.cm, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 14) {
            accessibilityNodeInfo.setClassName(android.support.v7.a.d.class.getName());
        }
    }

    @Override // android.support.v7.widget.cm, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f807b.f802b > 0 && getMeasuredWidth() > this.f807b.f802b) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f807b.f802b, 1073741824), i2);
        }
    }

    public final void a() {
        android.support.v7.a.d dVar = this.f806a;
        View c = dVar.c();
        if (c != null) {
            ViewParent parent = c.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(c);
                }
                addView(c);
            }
            this.f = c;
            if (this.d != null) {
                this.d.setVisibility(8);
            }
            if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
                return;
            }
            return;
        }
        if (this.f != null) {
            removeView(this.f);
            this.f = null;
        }
        Drawable a2 = dVar.a();
        CharSequence b2 = dVar.b();
        if (a2 != null) {
            if (this.e == null) {
                ImageView imageView = new ImageView(getContext());
                cn cnVar = new cn(-2, -2);
                cnVar.h = 16;
                imageView.setLayoutParams(cnVar);
                addView(imageView, 0);
                this.e = imageView;
            }
            this.e.setImageDrawable(a2);
            this.e.setVisibility(0);
        } else if (this.e != null) {
            this.e.setVisibility(8);
            this.e.setImageDrawable(null);
        }
        boolean z = !TextUtils.isEmpty(b2);
        if (z) {
            if (this.d == null) {
                bm bmVar = new bm(getContext(), null, android.support.v7.b.b.actionBarTabTextStyle);
                bmVar.setEllipsize(TextUtils.TruncateAt.END);
                cn cnVar2 = new cn(-2, -2);
                cnVar2.h = 16;
                bmVar.setLayoutParams(cnVar2);
                addView(bmVar);
                this.d = bmVar;
            }
            this.d.setText(b2);
            this.d.setVisibility(0);
        } else if (this.d != null) {
            this.d.setVisibility(8);
            this.d.setText((CharSequence) null);
        }
        if (this.e != null) {
            this.e.setContentDescription(dVar.d());
        }
        if (!z && !TextUtils.isEmpty(dVar.d())) {
            setOnLongClickListener(this);
        } else {
            setOnLongClickListener(null);
            setLongClickable(false);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        Toast makeText = Toast.makeText(context, this.f806a.d(), 0);
        makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
        makeText.show();
        return true;
    }
}
