package com.android.ex.photo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.ay;
import android.support.v4.view.dl;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements ay<Cursor>, dl, b, h, x {

    /* renamed from: a, reason: collision with root package name */
    public static int f1161a;

    /* renamed from: b, reason: collision with root package name */
    public static int f1162b;
    private final View.OnSystemUiVisibilityChangeListener B;
    private String C;
    private String D;
    private int E;
    private String F;
    private String[] G;
    private boolean J;
    private boolean K;
    private final AccessibilityManager L;
    private long M;
    private boolean N;
    public final t c;
    int d;
    protected boolean f;
    protected View g;
    protected View h;
    protected PhotoViewPager i;
    protected ImageView j;
    protected com.android.ex.photo.apkg.d k;
    protected boolean l;
    boolean m;
    protected float o;
    protected String p;
    protected String q;
    protected boolean r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected boolean w;
    protected boolean x;
    protected boolean y;
    protected u z;
    protected int e = -1;
    private final Map<Integer, j> H = new HashMap();
    private final Set<i> I = new HashSet();
    protected boolean n = true;
    protected final Handler A = new Handler();
    private final Runnable O = new m(this);

    @Override // android.support.v4.app.ay
    public final /* synthetic */ void a(android.support.v4.b.n<Cursor> nVar, Cursor cursor) {
        Uri build;
        Uri build2;
        Cursor cursor2 = cursor;
        if (nVar.n == 100) {
            if (cursor2 == null || cursor2.getCount() == 0) {
                this.f = true;
                this.k.a((Cursor) null);
                return;
            }
            this.e = cursor2.getCount();
            if (this.F != null) {
                int columnIndex = cursor2.getColumnIndex("uri");
                if (Build.VERSION.SDK_INT >= 11) {
                    build = Uri.parse(this.F).buildUpon().clearQuery().build();
                } else {
                    build = Uri.parse(this.F).buildUpon().query(null).build();
                }
                cursor2.moveToPosition(-1);
                int i = 0;
                while (true) {
                    if (!cursor2.moveToNext()) {
                        break;
                    }
                    String string = cursor2.getString(columnIndex);
                    if (Build.VERSION.SDK_INT >= 11) {
                        build2 = Uri.parse(string).buildUpon().clearQuery().build();
                    } else {
                        build2 = Uri.parse(string).buildUpon().query(null).build();
                    }
                    if (build != null && build.equals(build2)) {
                        this.E = i;
                        break;
                    }
                    i++;
                }
            }
            if (this.n) {
                this.J = true;
                this.k.a((Cursor) null);
                return;
            }
            boolean z = this.f;
            this.f = false;
            this.k.a(cursor2);
            if (this.i.getAdapter() == null) {
                this.i.setAdapter(this.k);
            }
            a(cursor2);
            if (this.E < 0) {
                this.E = 0;
            }
            this.i.a(this.E, false);
            if (!z) {
                return;
            }
            e(this.E);
        }
    }

    public k(t tVar) {
        this.c = tVar;
        if (Build.VERSION.SDK_INT < 11) {
            this.B = null;
        } else {
            this.B = new l(this);
        }
        this.L = (AccessibilityManager) tVar.i().getSystemService("accessibility");
    }

    private View d(int i) {
        return this.c.findViewById(i);
    }

    public final void d() {
        a(this.l, false);
        this.n = false;
        if (this.J) {
            this.J = false;
            this.c.b_().a(100, null, this);
        }
    }

    public final void e() {
        this.n = true;
    }

    public final boolean f() {
        ViewPropertyAnimator duration;
        if (this.l && !this.x) {
            a();
        } else {
            if (!this.r) {
                return false;
            }
            this.c.getIntent();
            int measuredWidth = this.g.getMeasuredWidth();
            int measuredHeight = this.g.getMeasuredHeight();
            float max = Math.max(this.u / measuredWidth, this.v / measuredHeight);
            int a2 = a(this.s, this.u, measuredWidth, max);
            int a3 = a(this.t, this.v, measuredHeight, max);
            int i = Build.VERSION.SDK_INT;
            if (i >= 14) {
                this.h.animate().alpha(0.0f).setDuration(250L).start();
                this.h.setVisibility(0);
                p pVar = new p(this);
                if (this.j.getVisibility() == 0) {
                    duration = this.j.animate().scaleX(max).scaleY(max).translationX(a2).translationY(a3).setDuration(250L);
                } else {
                    duration = this.i.animate().scaleX(max).scaleY(max).translationX(a2).translationY(a3).setDuration(250L);
                }
                if (!this.D.equals(this.F)) {
                    duration.alpha(0.0f);
                }
                if (i >= 16) {
                    duration.withEndAction(pVar);
                } else {
                    this.A.postDelayed(pVar, 250L);
                }
                duration.start();
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(250L);
                this.h.startAnimation(alphaAnimation);
                this.h.setVisibility(0);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, max, max);
                scaleAnimation.setDuration(250L);
                scaleAnimation.setAnimationListener(new q(this));
                if (this.j.getVisibility() == 0) {
                    this.j.startAnimation(scaleAnimation);
                } else {
                    this.i.startAnimation(scaleAnimation);
                }
            }
        }
        return true;
    }

    public final void b(Bundle bundle) {
        bundle.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", this.D);
        bundle.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", this.F);
        bundle.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", this.E);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", this.l);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", this.p);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", this.q);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", this.K);
    }

    @Override // com.android.ex.photo.h
    public final void a(int i, j jVar) {
        this.H.put(Integer.valueOf(i), jVar);
    }

    @Override // com.android.ex.photo.h
    public final void c(int i) {
        this.H.remove(Integer.valueOf(i));
    }

    @Override // com.android.ex.photo.h
    public final synchronized void a(i iVar) {
        this.I.add(iVar);
    }

    @Override // com.android.ex.photo.h
    public final synchronized void b(i iVar) {
        this.I.remove(iVar);
    }

    @Override // com.android.ex.photo.h
    public final boolean b(Fragment fragment) {
        if (this.i == null || this.k == null || this.k.a() == 0) {
            return this.l;
        }
        return this.l || this.i.getCurrentItem() != this.k.b(fragment);
    }

    @Override // com.android.ex.photo.h
    public final void a() {
        a(!this.l, true);
    }

    @Override // android.support.v4.app.ay
    public android.support.v4.b.n<Cursor> a(int i, Bundle bundle) {
        if (i == 100) {
            return new com.android.ex.photo.cpkg.d(this.c.i(), Uri.parse(this.C), this.G);
        }
        return null;
    }

    @Override // com.android.ex.photo.h
    public android.support.v4.b.n<com.android.ex.photo.cpkg.c> a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return new com.android.ex.photo.cpkg.a(this.c.i(), str);
            default:
                return null;
        }
    }

    private synchronized void a(Cursor cursor) {
        Iterator<i> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().a(cursor);
        }
    }

    @Override // android.support.v4.view.dl
    public final void a(int i, float f, int i2) {
        if (f < 1.0E-4d) {
            j jVar = this.H.get(Integer.valueOf(i - 1));
            if (jVar != null) {
                jVar.c_();
            }
            j jVar2 = this.H.get(Integer.valueOf(i + 1));
            if (jVar2 != null) {
                jVar2.c_();
            }
        }
    }

    @Override // android.support.v4.view.dl
    public final void a_(int i) {
        this.E = i;
        e(i);
    }

    @Override // android.support.v4.view.dl
    public final void b(int i) {
    }

    @Override // com.android.ex.photo.h
    public final boolean a(Fragment fragment) {
        return (this.i == null || this.k == null || this.i.getCurrentItem() != this.k.b(fragment)) ? false : true;
    }

    @Override // com.android.ex.photo.x
    public final w g() {
        boolean z = false;
        boolean z2 = false;
        for (j jVar : this.H.values()) {
            if (!z2) {
                z2 = jVar.e_();
            }
            z = !z ? jVar.f_() : z;
        }
        if (z2) {
            if (z) {
                return w.BOTH;
            }
            return w.LEFT;
        }
        if (z) {
            return w.RIGHT;
        }
        return w.NONE;
    }

    protected final void a(boolean z, boolean z2) {
        if (com.android.ex.photo.epkg.i.a(this.L)) {
            z2 = false;
            z = false;
        }
        boolean z3 = z != this.l;
        this.l = z;
        if (this.l) {
            b(true);
            l();
        } else {
            b(false);
            if (z2) {
                k();
            }
        }
        if (z3) {
            Iterator<j> it = this.H.values().iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    private void k() {
        if (this.w) {
            this.A.postDelayed(this.O, this.M);
        }
    }

    private void l() {
        this.A.removeCallbacks(this.O);
    }

    private void e(int i) {
        j jVar = this.H.get(Integer.valueOf(i));
        if (jVar != null) {
            jVar.d_();
        }
        Cursor m = m();
        this.E = i;
        this.F = m.getString(m.getColumnIndex("uri"));
        int currentItem = this.i.getCurrentItem() + 1;
        boolean z = this.e >= 0;
        Cursor m2 = m();
        if (m2 != null) {
            this.p = m2.getString(m2.getColumnIndex("_display_name"));
        } else {
            this.p = null;
        }
        if (this.f || !z || currentItem <= 0) {
            this.q = null;
        } else {
            this.q = this.c.getResources().getString(ag.photo_view_count, Integer.valueOf(currentItem), Integer.valueOf(this.e));
        }
        a(this.c.j());
        if (this.L.isEnabled() && !this.N) {
            String string = this.q != null ? this.c.i().getResources().getString(ag.titles, this.p, this.q) : this.p;
            if (string != null) {
                View view = this.g;
                AccessibilityManager accessibilityManager = this.L;
                if (Build.VERSION.SDK_INT >= 16) {
                    view.announceForAccessibility(string);
                } else {
                    Context applicationContext = view.getContext().getApplicationContext();
                    if (accessibilityManager == null) {
                        accessibilityManager = (AccessibilityManager) applicationContext.getSystemService("accessibility");
                    }
                    if (accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(8);
                        obtain.getText().add(string);
                        obtain.setEnabled(view.isEnabled());
                        obtain.setClassName(view.getClass().getName());
                        obtain.setPackageName(applicationContext.getPackageName());
                        android.support.v4.view.apkg.a.a(obtain).a(view);
                        if (Build.VERSION.SDK_INT >= 14) {
                            view.getParent().requestSendAccessibilityEvent(view, obtain);
                        } else {
                            accessibilityManager.sendAccessibilityEvent(obtain);
                        }
                    }
                }
                this.N = true;
            }
        }
        l();
        k();
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.a(a(this.p));
            aVar.b(a(this.q));
        }
    }

    private static final String a(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    private Cursor m() {
        if (this.i == null) {
            return null;
        }
        int currentItem = this.i.getCurrentItem();
        Cursor e = this.k.e();
        if (e == null) {
            return null;
        }
        e.moveToPosition(currentItem);
        return e;
    }

    @Override // com.android.ex.photo.b
    public final void a(boolean z) {
        if (z) {
            l();
        } else {
            k();
        }
    }

    @Override // com.android.ex.photo.h
    public final void a(com.android.ex.photo.bpkg.a aVar, boolean z) {
        if (this.j.getVisibility() != 8 && TextUtils.equals(aVar.u(), this.F)) {
            if (z) {
                this.j.setVisibility(8);
                this.i.setVisibility(0);
            } else {
                Log.w("PhotoViewController", "Failed to load fragment image");
                this.j.setVisibility(8);
                this.i.setVisibility(0);
            }
            this.c.b_().a();
        }
    }

    @Override // com.android.ex.photo.h
    public final com.android.ex.photo.apkg.d c() {
        return this.k;
    }

    public final void h() {
        this.K = true;
        this.i.setVisibility(0);
        b(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        int measuredWidth = this.g.getMeasuredWidth();
        int measuredHeight = this.g.getMeasuredHeight();
        this.j.setVisibility(0);
        float max = Math.max(this.u / measuredWidth, this.v / measuredHeight);
        int a2 = a(this.s, this.u, measuredWidth, max);
        int a3 = a(this.t, this.v, measuredHeight, max);
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            this.h.setAlpha(0.0f);
            this.h.animate().alpha(1.0f).setDuration(250L).start();
            this.h.setVisibility(0);
            this.j.setScaleX(max);
            this.j.setScaleY(max);
            this.j.setTranslationX(a2);
            this.j.setTranslationY(a3);
            n nVar = new n(this);
            ViewPropertyAnimator duration = this.j.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250L);
            if (i >= 16) {
                duration.withEndAction(nVar);
            } else {
                this.A.postDelayed(nVar, 250L);
            }
            duration.start();
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250L);
        this.h.startAnimation(alphaAnimation);
        this.h.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(a2, a3, 0.0f, 0.0f);
        translateAnimation.setDuration(250L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(max, max, 0.0f, 0.0f);
        scaleAnimation.setDuration(250L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(new o(this));
        this.j.startAnimation(animationSet);
    }

    private static int a(int i, int i2, int i3, float f) {
        return (i - Math.round((i3 - (i3 * f)) / 2.0f)) - Math.round(((i3 * f) - i2) / 2.0f);
    }

    public void i() {
        this.c.j().c();
    }

    public void j() {
        this.c.j().d();
    }

    public final void a(Bundle bundle) {
        byte b2 = 0;
        if (f1162b == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) this.c.i().getSystemService("window");
            com.android.ex.photo.epkg.e eVar = com.android.ex.photo.epkg.b.f1151a;
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            switch (s.f1171a[eVar.ordinal()]) {
                case 1:
                    f1162b = (Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) * 800) / 1000;
                    break;
                default:
                    f1162b = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
                    break;
            }
        }
        f1161a = ((ActivityManager) this.c.getApplicationContext().getSystemService("activity")).getMemoryClass();
        Intent intent = this.c.getIntent();
        if (intent.hasExtra("photos_uri")) {
            this.C = intent.getStringExtra("photos_uri");
        }
        this.w = intent.getBooleanExtra("enable_timer_lights_out", true);
        if (intent.getBooleanExtra("scale_up_animation", false)) {
            this.r = true;
            this.s = intent.getIntExtra("start_x_extra", 0);
            this.t = intent.getIntExtra("start_y_extra", 0);
            this.u = intent.getIntExtra("start_width_extra", 0);
            this.v = intent.getIntExtra("start_height_extra", 0);
        }
        this.x = intent.getBooleanExtra("action_bar_hidden_initially", false) && !com.android.ex.photo.epkg.i.a(this.L);
        this.y = intent.getBooleanExtra("display_thumbs_fullscreen", false);
        if (intent.hasExtra("projection")) {
            this.G = intent.getStringArrayExtra("projection");
        } else {
            this.G = null;
        }
        this.o = intent.getFloatExtra("max_scale", 1.0f);
        this.F = null;
        this.E = -1;
        if (intent.hasExtra("photo_index")) {
            this.E = intent.getIntExtra("photo_index", -1);
        }
        if (intent.hasExtra("initial_photo_uri")) {
            this.D = intent.getStringExtra("initial_photo_uri");
            this.F = this.D;
        }
        this.f = true;
        if (bundle != null) {
            this.D = bundle.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
            this.F = bundle.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
            this.E = bundle.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
            this.l = bundle.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", false) && !com.android.ex.photo.epkg.i.a(this.L);
            this.p = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
            this.q = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
            this.K = bundle.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", false);
        } else {
            this.l = this.x;
        }
        this.c.setContentView(af.photo_activity_view);
        this.k = new com.android.ex.photo.a.d(this.c.i(), this.c.d(), this.o, this.y);
        Resources resources = this.c.getResources();
        this.g = d(ad.photo_activity_root_view);
        if (Build.VERSION.SDK_INT >= 11) {
            this.g.setOnSystemUiVisibilityChangeListener(this.B);
        }
        this.h = d(ad.photo_activity_background);
        this.j = (ImageView) d(ad.photo_activity_temporary_image);
        this.i = (PhotoViewPager) d(ad.photo_view_pager);
        this.i.setAdapter(this.k);
        this.i.setOnPageChangeListener(this);
        this.i.setOnInterceptTouchListener(this);
        this.i.setPageMargin(resources.getDimensionPixelSize(ab.photo_page_margin));
        this.z = new u(this, b2);
        if (!this.r || this.K) {
            this.c.b_().a(100, null, this);
            this.h.setVisibility(0);
        } else {
            this.i.setVisibility(8);
            Bundle bundle2 = new Bundle();
            bundle2.putString("image_uri", this.D);
            this.c.b_().a(2, bundle2, this.z);
        }
        this.M = resources.getInteger(ae.reenter_fullscreen_delay_time_in_millis);
        a j = this.c.j();
        if (j != null) {
            j.a();
            j.a(this);
            j.b();
            a(j);
        }
        if (!this.r) {
            b(this.l);
        } else {
            b(false);
        }
    }

    @Override // android.support.v4.app.ay
    public final void b() {
        if (!this.m) {
            this.k.a((Cursor) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if ((android.os.Process.myUid() > 100000) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(boolean r9) {
        /*
            r8 = this;
            r7 = 16
            r6 = 11
            r5 = 19
            r1 = 1
            r0 = 0
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r7) goto L27
            r3 = r1
        Ld:
            if (r9 == 0) goto L57
            boolean r2 = r8.r
            if (r2 == 0) goto L17
            boolean r2 = r8.K
            if (r2 == 0) goto L57
        L17:
            if (r4 > r5) goto L35
            if (r4 != r5) goto L48
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 == r5) goto L29
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "kitkatIsSecondary user is only callable on KitKat"
            r0.<init>(r1)
            throw r0
        L27:
            r3 = r0
            goto Ld
        L29:
            int r2 = android.os.Process.myUid()
            r5 = 100000(0x186a0, float:1.4013E-40)
            if (r2 <= r5) goto L46
            r2 = r1
        L33:
            if (r2 != 0) goto L48
        L35:
            r0 = 3846(0xf06, float:5.39E-42)
        L37:
            if (r3 == 0) goto L3c
            r8.j()
        L3c:
            if (r4 < r6) goto L45
            r8.d = r0
            android.view.View r1 = r8.g
            r1.setSystemUiVisibility(r0)
        L45:
            return
        L46:
            r2 = r0
            goto L33
        L48:
            if (r4 < r7) goto L4d
            r0 = 1285(0x505, float:1.8E-42)
            goto L37
        L4d:
            r2 = 14
            if (r4 < r2) goto L53
            r0 = r1
            goto L37
        L53:
            if (r4 < r6) goto L37
            r0 = r1
            goto L37
        L57:
            if (r4 < r5) goto L61
            r0 = 1792(0x700, float:2.511E-42)
        L5b:
            if (r3 == 0) goto L3c
            r8.i()
            goto L3c
        L61:
            if (r4 < r7) goto L66
            r0 = 1280(0x500, float:1.794E-42)
            goto L5b
        L66:
            r1 = 14
            if (r4 >= r1) goto L5b
            if (r4 < r6) goto L5b
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.k.b(boolean):void");
    }

    static /* synthetic */ void a(k kVar) {
        kVar.c.finish();
        kVar.c.overridePendingTransition(0, 0);
    }

    static /* synthetic */ void a(k kVar, Drawable drawable) {
        if (kVar.K) {
            return;
        }
        kVar.j.setImageDrawable(drawable);
        if (drawable != null) {
            if (kVar.g.getMeasuredWidth() == 0) {
                View view = kVar.g;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new r(kVar, view));
            } else {
                kVar.n();
            }
        }
        kVar.c.b_().a(100, null, kVar);
    }
}
