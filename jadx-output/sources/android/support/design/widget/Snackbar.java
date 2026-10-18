package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class Snackbar {
    private static final Handler d = new Handler(Looper.getMainLooper(), new aj());

    /* renamed from: a, reason: collision with root package name */
    final ViewGroup f68a;

    /* renamed from: b, reason: collision with root package name */
    final SnackbarLayout f69b;
    final az c = new am(this);
    private final Context e;
    private int f;
    private final AccessibilityManager g;

    private Snackbar(ViewGroup viewGroup) {
        this.f68a = viewGroup;
        this.e = viewGroup.getContext();
        bi.a(this.e);
        this.f69b = (SnackbarLayout) LayoutInflater.from(this.e).inflate(android.support.design.g.design_layout_snackbar, this.f68a, false);
        this.g = (AccessibilityManager) this.e.getSystemService("accessibility");
    }

    public static Snackbar a(View view) {
        CharSequence text = view.getResources().getText(R.string.review_feedback_posted);
        Snackbar snackbar = new Snackbar(b(view));
        snackbar.f69b.getMessageView().setText(text);
        snackbar.f = 0;
        return snackbar;
    }

    private static ViewGroup b(View view) {
        ViewGroup viewGroup = null;
        View view2 = view;
        while (!(view2 instanceof CoordinatorLayout)) {
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    return (ViewGroup) view2;
                }
                viewGroup = (ViewGroup) view2;
            }
            if (view2 != null) {
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            if (view2 == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view2;
    }

    public final Snackbar a(View.OnClickListener onClickListener) {
        CharSequence text = this.e.getText(R.string.review_feedback_undo);
        Button actionView = this.f69b.getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
        } else {
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new al(this, onClickListener));
        }
        return this;
    }

    public final void a() {
        ax a2 = ax.a();
        int i = this.f;
        az azVar = this.c;
        synchronized (a2.f97a) {
            if (!a2.d(azVar)) {
                if (!a2.e(azVar)) {
                    a2.d = new ba(i, azVar);
                } else {
                    a2.d.f101b = i;
                }
                if (a2.c == null || !a2.a(a2.c, 4)) {
                    a2.c = null;
                    a2.b();
                    return;
                }
                return;
            }
            a2.c.f101b = i;
            a2.f98b.removeCallbacksAndMessages(a2.c);
            a2.a(a2.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (Build.VERSION.SDK_INT >= 14) {
            android.support.v4.view.by.b(this.f69b, this.f69b.getHeight());
            android.support.v4.view.by.t(this.f69b).c(0.0f).a(a.f73b).a(250L).a(new ar(this)).b();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f69b.getContext(), android.support.design.b.design_snackbar_in);
        loadAnimation.setInterpolator(a.f73b);
        loadAnimation.setDuration(250L);
        loadAnimation.setAnimationListener(new as(this));
        this.f69b.startAnimation(loadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ax a2 = ax.a();
        az azVar = this.c;
        synchronized (a2.f97a) {
            if (a2.d(azVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.b();
                }
            }
        }
        ViewParent parent = this.f69b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f69b);
        }
    }

    public class SnackbarLayout extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        TextView f70a;

        /* renamed from: b, reason: collision with root package name */
        Button f71b;
        private int c;
        private int d;
        private aw e;
        private av f;

        public SnackbarLayout(Context context) {
            this(context, null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.design.i.SnackbarLayout);
            this.c = obtainStyledAttributes.getDimensionPixelSize(android.support.design.i.SnackbarLayout_android_maxWidth, -1);
            this.d = obtainStyledAttributes.getDimensionPixelSize(android.support.design.i.SnackbarLayout_maxActionInlineWidth, -1);
            if (obtainStyledAttributes.hasValue(android.support.design.i.SnackbarLayout_elevation)) {
                android.support.v4.view.by.f(this, obtainStyledAttributes.getDimensionPixelSize(android.support.design.i.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(android.support.design.g.design_layout_snackbar_include, this);
            android.support.v4.view.by.m(this);
            android.support.v4.view.by.c((View) this, 1);
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.f70a = (TextView) findViewById(android.support.design.f.snackbar_text);
            this.f71b = (Button) findViewById(android.support.design.f.snackbar_action);
        }

        TextView getMessageView() {
            return this.f70a;
        }

        Button getActionView() {
            return this.f71b;
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            boolean z;
            super.onMeasure(i, i2);
            if (this.c > 0 && getMeasuredWidth() > this.c) {
                i = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
                super.onMeasure(i, i2);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(android.support.design.e.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(android.support.design.e.design_snackbar_padding_vertical);
            boolean z2 = this.f70a.getLayout().getLineCount() > 1;
            if (z2 && this.d > 0 && this.f71b.getMeasuredWidth() > this.d) {
                if (a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    z = true;
                }
                z = false;
            } else {
                if (!z2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (a(0, dimensionPixelSize, dimensionPixelSize)) {
                    z = true;
                }
                z = false;
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z && this.e != null) {
                this.e.a();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f != null) {
                this.f.a();
            }
        }

        void setOnLayoutChangeListener(aw awVar) {
            this.e = awVar;
        }

        void setOnAttachStateChangeListener(av avVar) {
            this.f = avVar;
        }

        private boolean a(int i, int i2, int i3) {
            boolean z = false;
            if (i != getOrientation()) {
                setOrientation(i);
                z = true;
            }
            if (this.f70a.getPaddingTop() != i2 || this.f70a.getPaddingBottom() != i3) {
                TextView textView = this.f70a;
                if (android.support.v4.view.by.C(textView)) {
                    android.support.v4.view.by.a(textView, android.support.v4.view.by.n(textView), i2, android.support.v4.view.by.o(textView), i3);
                } else {
                    textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
                }
                return true;
            }
            return z;
        }
    }

    static /* synthetic */ void a(Snackbar snackbar, int i) {
        ax a2 = ax.a();
        az azVar = snackbar.c;
        synchronized (a2.f97a) {
            if (a2.d(azVar)) {
                a2.a(a2.c, i);
            } else if (a2.e(azVar)) {
                a2.a(a2.d, i);
            }
        }
    }

    static /* synthetic */ void f(Snackbar snackbar) {
        ax a2 = ax.a();
        az azVar = snackbar.c;
        synchronized (a2.f97a) {
            if (a2.d(azVar)) {
                a2.a(a2.c);
            }
        }
    }
}
