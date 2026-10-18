package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.by;
import android.support.v4.view.cq;
import android.support.v4.view.dy;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.cg;
import android.support.v7.widget.gm;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* loaded from: classes.dex */
class ap extends ah implements android.support.v4.view.an, android.support.v7.view.menu.j {
    private View A;
    private boolean B;
    private boolean C;
    private boolean D;
    private bb[] E;
    private bb F;
    private boolean G;
    private boolean H;
    private int I;
    private final Runnable J;
    private boolean K;
    private Rect L;
    private Rect M;
    private be N;
    private android.support.v7.widget.br p;
    android.support.v7.view.b q;
    ActionBarContextView r;
    PopupWindow s;
    Runnable t;
    dy u;
    ViewGroup v;
    private ax w;
    private bc x;
    private boolean y;
    private TextView z;

    static /* synthetic */ boolean b(ap apVar) {
        apVar.H = false;
        return false;
    }

    static /* synthetic */ int c(ap apVar) {
        apVar.I = 0;
        return 0;
    }

    ap(Context context, Window window, af afVar) {
        super(context, window, afVar);
        this.u = null;
        this.J = new aq(this);
    }

    @Override // android.support.v7.a.ag
    public void a(Bundle bundle) {
        if (!(this.d instanceof Activity) || android.support.v4.app.bb.b((Activity) this.d) == null) {
            return;
        }
        a aVar = this.g;
        if (aVar == null) {
            this.K = true;
        } else {
            aVar.b(true);
        }
    }

    @Override // android.support.v7.a.ag
    public final void c() {
        n();
    }

    @Override // android.support.v7.a.ah
    public final void k() {
        n();
        if (this.i && this.g == null) {
            if (this.d instanceof Activity) {
                this.g = new bq((Activity) this.d, this.j);
            } else if (this.d instanceof Dialog) {
                this.g = new bq((Dialog) this.d);
            }
            if (this.g != null) {
                this.g.b(this.K);
            }
        }
    }

    @Override // android.support.v7.a.ag
    public final void a(Toolbar toolbar) {
        if (this.d instanceof Activity) {
            a a2 = a();
            if (a2 instanceof bq) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.h = null;
            if (a2 != null) {
                a2.j();
            }
            bg bgVar = new bg(toolbar, ((Activity) this.f476b).getTitle(), this.e);
            this.g = bgVar;
            this.c.setCallback(bgVar.c);
            bgVar.g();
        }
    }

    @Override // android.support.v7.a.ag
    public final void a(Configuration configuration) {
        a a2;
        if (this.i && this.y && (a2 = a()) != null) {
            a2.a(configuration);
        }
    }

    @Override // android.support.v7.a.ag
    public final void d() {
        a a2 = a();
        if (a2 != null) {
            a2.c(false);
        }
    }

    @Override // android.support.v7.a.ag
    public final void e() {
        a a2 = a();
        if (a2 != null) {
            a2.c(true);
        }
    }

    @Override // android.support.v7.a.ag
    public final void a(View view) {
        n();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.a.ag
    public final void a(int i) {
        n();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f476b).inflate(i, viewGroup);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.a.ag
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.a.ag
    public final void b(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.a.ah, android.support.v7.a.ag
    public final void g() {
        super.g();
        if (this.g != null) {
            this.g.j();
            this.g = null;
        }
    }

    private void n() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        CharSequence charSequence;
        Context context;
        if (this.y) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f476b.obtainStyledAttributes(android.support.v7.b.l.Theme);
        if (!obtainStyledAttributes.hasValue(android.support.v7.b.l.Theme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(android.support.v7.b.l.Theme_windowNoTitle, false)) {
            b(1);
        } else if (obtainStyledAttributes.getBoolean(android.support.v7.b.l.Theme_windowActionBar, false)) {
            b(108);
        }
        if (obtainStyledAttributes.getBoolean(android.support.v7.b.l.Theme_windowActionBarOverlay, false)) {
            b(109);
        }
        if (obtainStyledAttributes.getBoolean(android.support.v7.b.l.Theme_windowActionModeOverlay, false)) {
            b(10);
        }
        this.l = obtainStyledAttributes.getBoolean(android.support.v7.b.l.Theme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(this.f476b);
        if (!this.m) {
            if (this.l) {
                ViewGroup viewGroup3 = (ViewGroup) from.inflate(android.support.v7.b.i.abc_dialog_title_material, (ViewGroup) null);
                this.j = false;
                this.i = false;
                viewGroup2 = viewGroup3;
            } else if (this.i) {
                TypedValue typedValue = new TypedValue();
                this.f476b.getTheme().resolveAttribute(android.support.v7.b.b.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new android.support.v7.view.e(this.f476b, typedValue.resourceId);
                } else {
                    context = this.f476b;
                }
                ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(android.support.v7.b.i.abc_screen_toolbar, (ViewGroup) null);
                this.p = (android.support.v7.widget.br) viewGroup4.findViewById(android.support.v7.b.g.decor_content_parent);
                this.p.setWindowCallback(this.c.getCallback());
                if (this.j) {
                    this.p.a(109);
                }
                if (this.B) {
                    this.p.a(2);
                }
                if (this.C) {
                    this.p.a(5);
                }
                viewGroup2 = viewGroup4;
            } else {
                viewGroup2 = null;
            }
        } else {
            if (this.k) {
                viewGroup = (ViewGroup) from.inflate(android.support.v7.b.i.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) from.inflate(android.support.v7.b.i.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                by.a(viewGroup, new ar(this));
                viewGroup2 = viewGroup;
            } else {
                ((cg) viewGroup).setOnFitSystemWindowsListener(new as(this));
                viewGroup2 = viewGroup;
            }
        }
        if (viewGroup2 == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.i + ", windowActionBarOverlay: " + this.j + ", android:windowIsFloating: " + this.l + ", windowActionModeOverlay: " + this.k + ", windowNoTitle: " + this.m + " }");
        }
        if (this.p == null) {
            this.z = (TextView) viewGroup2.findViewById(android.support.v7.b.g.title);
        }
        gm.b(viewGroup2);
        ViewGroup viewGroup5 = (ViewGroup) this.c.findViewById(R.id.content);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup2.findViewById(android.support.v7.b.g.action_bar_activity_content);
        while (viewGroup5.getChildCount() > 0) {
            View childAt = viewGroup5.getChildAt(0);
            viewGroup5.removeViewAt(0);
            contentFrameLayout.addView(childAt);
        }
        this.c.setContentView(viewGroup2);
        viewGroup5.setId(-1);
        contentFrameLayout.setId(R.id.content);
        if (viewGroup5 instanceof FrameLayout) {
            ((FrameLayout) viewGroup5).setForeground(null);
        }
        contentFrameLayout.setAttachListener(new at(this));
        this.v = viewGroup2;
        if (this.d instanceof Activity) {
            charSequence = ((Activity) this.d).getTitle();
        } else {
            charSequence = this.n;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            b(charSequence);
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.v.findViewById(R.id.content);
        View decorView = this.c.getDecorView();
        contentFrameLayout2.f620b.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (by.H(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.f476b.obtainStyledAttributes(android.support.v7.b.l.Theme);
        obtainStyledAttributes2.getValue(android.support.v7.b.l.Theme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(android.support.v7.b.l.Theme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(android.support.v7.b.l.Theme_windowFixedWidthMajor)) {
            obtainStyledAttributes2.getValue(android.support.v7.b.l.Theme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(android.support.v7.b.l.Theme_windowFixedWidthMinor)) {
            obtainStyledAttributes2.getValue(android.support.v7.b.l.Theme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(android.support.v7.b.l.Theme_windowFixedHeightMajor)) {
            obtainStyledAttributes2.getValue(android.support.v7.b.l.Theme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(android.support.v7.b.l.Theme_windowFixedHeightMinor)) {
            obtainStyledAttributes2.getValue(android.support.v7.b.l.Theme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.y = true;
        bb e = e(0);
        if (this.o) {
            return;
        }
        if (e == null || e.j == null) {
            f(108);
        }
    }

    @Override // android.support.v7.a.ah
    final void b(CharSequence charSequence) {
        if (this.p != null) {
            this.p.setWindowTitle(charSequence);
        } else if (this.g != null) {
            this.g.c(charSequence);
        } else if (this.z != null) {
            this.z.setText(charSequence);
        }
    }

    @Override // android.support.v7.a.ah
    final void c(int i) {
        if (i == 108) {
            a a2 = a();
            if (a2 != null) {
                a2.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            bb e = e(i);
            if (e.o) {
                a(e, false);
            }
        }
    }

    @Override // android.support.v7.a.ah
    final boolean d(int i) {
        if (i != 108) {
            return false;
        }
        a a2 = a();
        if (a2 == null) {
            return true;
        }
        a2.d(true);
        return true;
    }

    @Override // android.support.v7.a.ag
    public final void f() {
        a a2 = a();
        if (a2 == null || !a2.g()) {
            f(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (this.u != null) {
            this.u.a();
        }
    }

    @Override // android.support.v7.a.ah
    final boolean a(int i, KeyEvent keyEvent) {
        a a2 = a();
        if (a2 != null && a2.a(i, keyEvent)) {
            return true;
        }
        if (this.F != null && a(this.F, keyEvent.getKeyCode(), keyEvent)) {
            if (this.F == null) {
                return true;
            }
            this.F.n = true;
            return true;
        }
        if (this.F == null) {
            bb e = e(0);
            b(e, keyEvent);
            boolean a3 = a(e, keyEvent.getKeyCode(), keyEvent);
            e.m = false;
            if (a3) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.a.ah
    final boolean a(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (keyEvent.getKeyCode() == 82 && this.d.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 4:
                    this.G = (keyEvent.getFlags() & 128) != 0;
                    break;
                case 82:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    bb e = e(0);
                    if (e.o) {
                        return true;
                    }
                    b(e, keyEvent);
                    return true;
            }
            if (Build.VERSION.SDK_INT < 11) {
                a(keyCode, keyEvent);
            }
            return false;
        }
        switch (keyCode) {
            case 4:
                boolean z4 = this.G;
                this.G = false;
                bb e2 = e(0);
                if (e2 != null && e2.o) {
                    if (z4) {
                        return true;
                    }
                    a(e2, true);
                    return true;
                }
                if (this.q != null) {
                    this.q.c();
                    z = true;
                } else {
                    a a2 = a();
                    z = a2 != null && a2.h();
                }
                if (z) {
                    return true;
                }
                break;
            case 82:
                if (this.q != null) {
                    return true;
                }
                bb e3 = e(0);
                if (this.p != null && this.p.a() && !cq.b(ViewConfiguration.get(this.f476b))) {
                    if (!this.p.b()) {
                        if (!this.o && b(e3, keyEvent)) {
                            z2 = this.p.d();
                        }
                        z2 = false;
                    } else {
                        z2 = this.p.e();
                    }
                } else if (e3.o || e3.n) {
                    z2 = e3.o;
                    a(e3, true);
                } else {
                    if (e3.m) {
                        if (e3.r) {
                            e3.m = false;
                            z3 = b(e3, keyEvent);
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            a(e3, keyEvent);
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (!z2) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.f476b.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
        }
        return false;
    }

    @Override // android.support.v7.a.ag
    public final void i() {
        LayoutInflater from = LayoutInflater.from(this.f476b);
        if (from.getFactory() == null) {
            android.support.v4.view.ae.a(from, this);
        } else if (!(android.support.v4.view.ae.a(from) instanceof ap)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r9.equals("TextView") != false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    @Override // android.support.v4.view.an
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.a.ap.a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    View a(String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.d instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.d).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.support.v7.a.bb r11, android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.a.ap.a(android.support.v7.a.bb, android.view.KeyEvent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(android.support.v7.view.menu.i iVar) {
        if (!this.D) {
            this.D = true;
            this.p.g();
            Window.Callback callback = this.c.getCallback();
            if (callback != null && !this.o) {
                callback.onPanelClosed(108, iVar);
            }
            this.D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(bb bbVar, boolean z) {
        if (z && bbVar.f493a == 0 && this.p != null && this.p.b()) {
            b(bbVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f476b.getSystemService("window");
        if (windowManager != null && bbVar.o && bbVar.g != null) {
            windowManager.removeView(bbVar.g);
            if (z) {
                a(bbVar.f493a, bbVar, (Menu) null);
            }
        }
        bbVar.m = false;
        bbVar.n = false;
        bbVar.o = false;
        bbVar.h = null;
        bbVar.q = true;
        if (this.F == bbVar) {
            this.F = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, bb bbVar, Menu menu) {
        if (menu == null) {
            if (bbVar == null && i >= 0 && i < this.E.length) {
                bbVar = this.E[i];
            }
            if (bbVar != null) {
                menu = bbVar.j;
            }
        }
        if ((bbVar == null || bbVar.o) && !this.o) {
            this.d.onPanelClosed(i, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bb a(Menu menu) {
        bb[] bbVarArr = this.E;
        int length = bbVarArr != null ? bbVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            bb bbVar = bbVarArr[i];
            if (bbVar != null && bbVar.j == menu) {
                return bbVar;
            }
        }
        return null;
    }

    private bb e(int i) {
        bb[] bbVarArr = this.E;
        if (bbVarArr == null || bbVarArr.length <= i) {
            bb[] bbVarArr2 = new bb[i + 1];
            if (bbVarArr != null) {
                System.arraycopy(bbVarArr, 0, bbVarArr2, 0, bbVarArr.length);
            }
            this.E = bbVarArr2;
            bbVarArr = bbVarArr2;
        }
        bb bbVar = bbVarArr[i];
        if (bbVar != null) {
            return bbVar;
        }
        bb bbVar2 = new bb(i);
        bbVarArr[i] = bbVar2;
        return bbVar2;
    }

    private boolean a(bb bbVar, int i, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((bbVar.m || b(bbVar, keyEvent)) && bbVar.j != null) {
            return bbVar.j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private void f(int i) {
        this.I |= 1 << i;
        if (!this.H) {
            by.a(this.c.getDecorView(), this.J);
            this.H = true;
        }
    }

    private void o() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // android.support.v7.a.ag
    public final boolean b(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.m && i == 108) {
            return false;
        }
        if (this.i && i == 1) {
            this.i = false;
        }
        switch (i) {
            case 1:
                o();
                this.m = true;
                return true;
            case 2:
                o();
                this.B = true;
                return true;
            case 5:
                o();
                this.C = true;
                return true;
            case 10:
                o();
                this.k = true;
                return true;
            case 108:
                o();
                this.i = true;
                return true;
            case 109:
                o();
                this.j = true;
                return true;
            default:
                return this.c.requestFeature(i);
        }
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(android.support.v7.view.menu.i iVar, MenuItem menuItem) {
        bb a2;
        Window.Callback callback = this.c.getCallback();
        if (callback == null || this.o || (a2 = a((Menu) iVar.k())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(a2.f493a, menuItem);
    }

    @Override // android.support.v7.view.menu.j
    public final void a(android.support.v7.view.menu.i iVar) {
        if (this.p == null || !this.p.a() || (cq.b(ViewConfiguration.get(this.f476b)) && !this.p.c())) {
            bb e = e(0);
            e.q = true;
            a(e, false);
            a(e, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.c.getCallback();
        if (!this.p.b()) {
            if (callback != null && !this.o) {
                if (this.H && (this.I & 1) != 0) {
                    this.c.getDecorView().removeCallbacks(this.J);
                    this.J.run();
                }
                bb e2 = e(0);
                if (e2.j != null && !e2.r && callback.onPreparePanel(0, e2.i, e2.j)) {
                    callback.onMenuOpened(108, e2.j);
                    this.p.d();
                    return;
                }
                return;
            }
            return;
        }
        this.p.e();
        if (!this.o) {
            callback.onPanelClosed(108, e(0).j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(android.support.v7.a.bb r11, android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.a.ap.b(android.support.v7.a.bb, android.view.KeyEvent):boolean");
    }

    static /* synthetic */ void a(ap apVar, int i) {
        bb e;
        bb e2 = apVar.e(i);
        if (e2.j != null) {
            Bundle bundle = new Bundle();
            e2.j.a(bundle);
            if (bundle.size() > 0) {
                e2.s = bundle;
            }
            e2.j.d();
            e2.j.clear();
        }
        e2.r = true;
        e2.q = true;
        if ((i != 108 && i != 0) || apVar.p == null || (e = apVar.e(0)) == null) {
            return;
        }
        e.m = false;
        apVar.b(e, (KeyEvent) null);
    }

    static /* synthetic */ int b(ap apVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (apVar.r == null || !(apVar.r.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) apVar.r.getLayoutParams();
            if (apVar.r.isShown()) {
                if (apVar.L == null) {
                    apVar.L = new Rect();
                    apVar.M = new Rect();
                }
                Rect rect = apVar.L;
                Rect rect2 = apVar.M;
                rect.set(0, i, 0, 0);
                gm.a(apVar.v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (apVar.A == null) {
                        apVar.A = new View(apVar.f476b);
                        apVar.A.setBackgroundColor(apVar.f476b.getResources().getColor(android.support.v7.b.d.abc_input_method_navigation_guard));
                        apVar.v.addView(apVar.A, -1, new ViewGroup.LayoutParams(-1, i));
                        z3 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = apVar.A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            apVar.A.setLayoutParams(layoutParams);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                r3 = apVar.A != null;
                if (!apVar.k && r3) {
                    i = 0;
                }
                boolean z4 = z3;
                z2 = r3;
                r3 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                r3 = false;
                z2 = false;
            }
            if (r3) {
                apVar.r.setLayoutParams(marginLayoutParams);
            }
            z = z2;
        }
        if (apVar.A != null) {
            apVar.A.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    static /* synthetic */ void d(ap apVar) {
        if (apVar.p != null) {
            apVar.p.g();
        }
        if (apVar.s != null) {
            apVar.c.getDecorView().removeCallbacks(apVar.t);
            if (apVar.s.isShowing()) {
                try {
                    apVar.s.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            apVar.s = null;
        }
        apVar.m();
        bb e2 = apVar.e(0);
        if (e2 == null || e2.j == null) {
            return;
        }
        e2.j.close();
    }
}
