package com.google.android.finsky.activities.onboard;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.a.i;
import com.google.android.finsky.layout.ControlsContainerBackground;
import com.google.android.finsky.layout.play.ad;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.utils.da;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;

@TargetApi(14)
/* loaded from: classes.dex */
public class AnimatedEntertainmentOnboardPage extends FrameLayout {
    private static final boolean c;
    private View A;
    private View B;
    private View C;
    private TextView D;
    private TextView E;
    private Button F;
    private ArgbEvaluator G;
    private Interpolator H;
    private Interpolator I;
    private cy J;
    private i K;

    /* renamed from: a, reason: collision with root package name */
    da f1853a;

    /* renamed from: b, reason: collision with root package name */
    da f1854b;
    private final Handler d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final TransitionDrawable j;
    private final TransitionDrawable k;
    private final Drawable l;
    private final Drawable m;
    private final Property<TextView, Integer> n;
    private final int o;
    private final int p;
    private final float q;
    private View r;
    private View s;
    private View t;
    private TextView u;
    private ImageView v;
    private ImageView w;
    private TextView x;
    private ControlsContainerBackground y;
    private View z;

    static {
        c = Build.VERSION.SDK_INT >= 21;
    }

    public AnimatedEntertainmentOnboardPage(Context context) {
        this(context, null);
    }

    public AnimatedEntertainmentOnboardPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnimatedEntertainmentOnboardPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Handler();
        this.e = 0;
        Resources resources = context.getResources();
        this.i = Build.VERSION.SDK_INT >= 17 && getLayoutDirection() == 1;
        this.j = new TransitionDrawable(new Drawable[]{new ColorDrawable(resources.getColor(R.color.play_white)), new ColorDrawable(resources.getColor(R.color.onboard_store_bg_color))});
        this.k = new TransitionDrawable(new Drawable[]{new ColorDrawable(resources.getColor(R.color.onboard_store_bg_color)), new ColorDrawable(resources.getColor(R.color.onboard_entertainment_bg_color))});
        setActivityBackground(this.j);
        this.l = new ColorDrawable(resources.getColor(ai.a(3)));
        this.m = new ColorDrawable(resources.getColor(ai.a(13)));
        this.n = new b(this, Integer.TYPE, "textColor");
        this.o = resources.getColor(R.color.play_white);
        this.p = resources.getColor(R.color.play_white_disabled);
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.onboard_image_horizon_ratio_bottom, typedValue, true);
        this.q = typedValue.getFloat();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.r = findViewById(R.id.image_box);
        this.s = findViewById(R.id.splash_logo);
        this.t = findViewById(R.id.splash_image);
        this.u = (TextView) findViewById(R.id.apps_games_welcome_text);
        this.v = (ImageView) findViewById(R.id.apps_games_image);
        this.w = (ImageView) findViewById(R.id.entertainment_image);
        this.x = (TextView) findViewById(R.id.entertainment_welcome_text);
        this.y = (ControlsContainerBackground) findViewById(R.id.tab_background);
        this.z = findViewById(R.id.tab_box);
        this.A = findViewById(R.id.tab_row);
        this.B = findViewById(R.id.tab_strip);
        this.C = findViewById(R.id.shadow);
        this.D = (TextView) findViewById(R.id.apps_games_tab);
        this.E = (TextView) findViewById(R.id.entertainment_tab);
        this.F = (Button) findViewById(R.id.play_onboard_center_button);
        this.I = new android.support.v4.view.b.b();
        this.H = new android.support.v4.view.b.c();
        this.G = new ArgbEvaluator();
        this.F.setOnClickListener(new c(this));
        this.F.setText(this.F.getText().toString().toUpperCase(getResources().getConfiguration().locale));
        if (c) {
            this.y.setOutlineProvider(new d(this));
            this.C.setVisibility(8);
        }
        this.D.setOnClickListener(new e(this));
        this.E.setOnClickListener(new f(this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.g = true;
        a();
    }

    public void setEventLogger(i iVar) {
        this.K = iVar;
    }

    public void setParentUiElementNode(cy cyVar) {
        this.J = cyVar;
    }

    public void setEntertainmentWelcomeText(String str) {
        this.x.setText(str);
    }

    public void setIsActivityResumed(boolean z) {
        this.f = z;
        a();
    }

    private void setActivityBackground(Drawable drawable) {
        ((Activity) getContext()).getWindow().setBackgroundDrawable(drawable);
    }

    private void a() {
        if (this.f && this.g) {
            if (this.h) {
                return;
            }
            FinskyLog.a("resuming state machine from state %d", Integer.valueOf(this.e));
            this.h = true;
            b();
            return;
        }
        if (!this.h) {
            return;
        }
        FinskyLog.a("pausing state machine at state %d", Integer.valueOf(this.e));
        this.d.removeCallbacksAndMessages(null);
        this.h = false;
    }

    private void b() {
        switch (this.e) {
            case 0:
                a(1);
                break;
            case 1:
                a(2, 500L);
                break;
            case 2:
                a(3, 2333L);
                break;
            case 3:
                a(4, 3167L);
                break;
        }
    }

    private void a(int i, long j) {
        FinskyLog.a("scheduling state change to state %d in %d ms", Integer.valueOf(i), Long.valueOf(j));
        this.d.postDelayed(new g(this, i), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        FinskyLog.a("Changing state from %d to %d", Integer.valueOf(this.e), Integer.valueOf(i));
        this.e = i;
        int i5 = this.e;
        switch (i5) {
            case 3:
                this.j.startTransition(500);
                break;
            case 4:
                setActivityBackground(this.k);
                this.k.startTransition(500);
                break;
            case 5:
                this.k.reverseTransition(500);
                break;
        }
        switch (i5) {
            case 1:
                this.s.setAlpha(0.0f);
                break;
            case 2:
                this.s.animate().alpha(1.0f).setDuration(500L);
                break;
            case 3:
                this.s.animate().alpha(0.0f).setDuration(250L);
                break;
        }
        int width = this.i ? getWidth() : -getWidth();
        switch (i5) {
            case 1:
                this.t.getLocationOnScreen(new int[2]);
                this.t.setPivotX(this.t.getWidth() * 0.5f);
                this.t.setPivotY(this.t.getHeight() * 0.5f);
                this.t.setAlpha(0.0f);
                this.t.setTranslationX(((getWidth() - this.t.getWidth()) * 0.5f) - r5[0]);
                this.t.setTranslationY(((getHeight() - this.t.getHeight()) * 0.5f) - r5[1]);
                break;
            case 2:
                this.t.animate().alpha(1.0f).setDuration(500L);
                break;
            case 3:
                float width2 = (this.v.getWidth() * 0.24f) / this.t.getWidth();
                this.t.setPivotY(this.t.getHeight());
                this.t.animate().scaleX(width2).scaleY(width2).translationX(0.0f).translationY(0.0f).setDuration(500L).setInterpolator(this.H);
                break;
            case 4:
                a(this.t).start();
                this.t.animate().translationX(width).setDuration(500L).setInterpolator(this.I);
                break;
            case 5:
                b(this.t).start();
                this.t.animate().translationX(0.0f);
                break;
        }
        int width3 = this.i ? getWidth() : -getWidth();
        switch (i5) {
            case 1:
                a(this.u, this.r);
                this.u.setAlpha(0.0f);
                break;
            case 3:
                this.u.animate().alpha(1.0f).setDuration(333L).setStartDelay(667L);
                if (ik.c(getContext())) {
                    this.u.sendAccessibilityEvent(32);
                    break;
                }
                break;
            case 4:
                a(this.u).start();
                this.u.animate().translationX(width3).setDuration(500L).setStartDelay(0L).setInterpolator(this.I);
                break;
            case 5:
                b(this.u).start();
                this.u.animate().translationX(0.0f);
                break;
        }
        int width4 = this.i ? getWidth() : -getWidth();
        switch (i5) {
            case 1:
                this.v.setPivotX(this.v.getWidth() * 0.5f);
                this.v.setPivotY(this.v.getHeight() * (1.0f - this.q));
                this.v.setScaleX(1.0f / this.v.getWidth());
                this.v.setScaleY(1.0f / this.v.getHeight());
                this.v.setAlpha(0.0f);
                this.v.animate().setInterpolator(this.I);
                this.f1853a = new da(getContext(), this.v);
                jm.a(this.f1853a, Integer.valueOf(R.raw.illo_onboarding_01));
                break;
            case 3:
                this.v.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(500L).setStartDelay(333L);
                break;
            case 4:
                a(this.v).start();
                this.v.animate().translationX(width4).setStartDelay(0L);
                break;
            case 5:
                b(this.v).start();
                this.v.animate().translationX(0.0f);
                break;
        }
        int width5 = this.i ? -getWidth() : getWidth();
        switch (i5) {
            case 1:
                a(this.x, this.r);
                this.x.setTranslationX(width5);
                this.w.setTranslationX(width5);
                this.x.setAlpha(0.0f);
                this.w.setAlpha(0.0f);
                this.x.animate().setInterpolator(this.I);
                this.w.animate().setInterpolator(this.I);
                this.f1854b = new da(getContext(), this.w);
                jm.a(this.f1854b, Integer.valueOf(R.raw.illo_onboarding_02));
                break;
            case 4:
                b(this.x).start();
                this.x.animate().translationX(0.0f).setDuration(500L);
                b(this.w).start();
                this.w.animate().translationX(0.0f).setDuration(500L);
                if (ik.c(getContext())) {
                    this.x.sendAccessibilityEvent(32);
                    break;
                }
                break;
            case 5:
                a(this.x).start();
                this.x.animate().translationX(width5);
                a(this.w).start();
                this.w.animate().translationX(width5);
                break;
        }
        switch (i5) {
            case 1:
                this.z.setPivotX(this.z.getWidth() * 0.5f);
                this.z.setPivotY(0.0f);
                this.z.setScaleX(1.0f / this.z.getWidth());
                this.z.setScaleY(1.0f / this.z.getHeight());
                this.z.setAlpha(0.0f);
                this.z.animate().setInterpolator(this.I);
                break;
            case 3:
                this.z.setAlpha(1.0f);
                this.z.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(500L).setDuration(500L);
                break;
        }
        Drawable drawable = null;
        TextView textView = null;
        switch (i5) {
            case 1:
                this.y.a(this.A.getHeight(), this.A.getHeight());
                this.y.a(this.l, 0, false);
                break;
            case 4:
                textView = this.E;
                drawable = this.m;
                break;
            case 5:
                textView = this.D;
                drawable = this.l;
                break;
        }
        if (textView != null && drawable != null) {
            this.y.a(drawable, (textView.getWidth() / 2) + ((int) textView.getX()), true);
        }
        int i6 = this.o;
        switch (i5) {
            case 2:
                this.D.setTextColor(i6);
                i2 = i6;
                z = false;
                break;
            case 3:
                this.D.setClickable(false);
                i2 = i6;
                z = false;
                break;
            case 4:
                int i7 = this.p;
                this.D.setClickable(true);
                i2 = i7;
                z = true;
                break;
            case 5:
                this.D.setClickable(false);
                i2 = i6;
                z = true;
                break;
            default:
                i2 = i6;
                z = false;
                break;
        }
        if (z) {
            ObjectAnimator duration = ObjectAnimator.ofInt(this.D, this.n, i2).setDuration(500L);
            duration.setEvaluator(this.G);
            duration.start();
        }
        int i8 = this.p;
        switch (i5) {
            case 2:
                this.E.setTextColor(i8);
                i3 = i8;
                z2 = false;
                break;
            case 3:
                this.E.setClickable(false);
                i3 = i8;
                z2 = false;
                break;
            case 4:
                int i9 = this.o;
                this.E.setClickable(false);
                i3 = i9;
                z2 = true;
                break;
            case 5:
                this.E.setClickable(true);
                i3 = i8;
                z2 = true;
                break;
            default:
                i3 = i8;
                z2 = false;
                break;
        }
        if (z2) {
            ObjectAnimator duration2 = ObjectAnimator.ofInt(this.E, this.n, i3).setDuration(500L);
            duration2.setEvaluator(this.G);
            duration2.start();
        }
        int width6 = (this.i ? -1 : 1) * this.B.getWidth();
        switch (i5) {
            case 1:
                this.B.animate().setInterpolator(this.I);
                break;
            case 4:
                this.B.animate().translationX(width6).setStartDelay(0L).setDuration(500L);
                break;
            case 5:
                this.B.animate().translationX(0.0f);
                break;
        }
        switch (i5) {
            case 1:
                this.F.setEnabled(false);
                this.F.setAlpha(0.0f);
                break;
            case 3:
                this.F.setEnabled(true);
                this.F.animate().alpha(1.0f).setDuration(333L).setStartDelay(667L);
                this.F.requestFocus();
                break;
        }
        switch (this.e) {
            case 2:
                i4 = 5008;
                break;
            case 3:
            case 5:
                i4 = 5007;
                break;
            case 4:
                i4 = 5006;
                break;
        }
        this.J.a(new ad(i4, this.J));
        b();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.i = i == 1;
    }

    private static ObjectAnimator a(View view) {
        return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(167L);
    }

    private static ObjectAnimator b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(333L);
        duration.setStartDelay(167L);
        return duration;
    }

    private static void a(View view, View view2) {
        float y = (view2.getY() - view.getBottom()) - view.getTop();
        if (y > 0.0f) {
            view.setTranslationY(y * 0.5f);
        }
    }
}
