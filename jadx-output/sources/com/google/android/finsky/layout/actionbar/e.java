package com.google.android.finsky.layout.actionbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.support.v4.view.as;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.MenuItem;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.activities.hb;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.utils.jm;
import com.google.android.finsky.utils.r;
import com.google.android.play.search.PlaySearchNavigationButton;
import com.google.android.play.search.PlaySearchToolbar;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3114a;
    private static Map<Integer, SoftReference<Drawable>> n;
    private static boolean o;

    /* renamed from: b, reason: collision with root package name */
    public android.support.v7.a.a f3115b;
    public FinskySearchToolbar c;
    public int d;
    public com.google.android.finsky.navigationmanager.b e;
    public c f;
    public boolean g;
    public MenuItem h;
    public MenuItem i;
    public MenuItem j;
    public MenuItem k;
    public SearchView l;
    public hb m;
    private Activity p;
    private Stack<j> q;
    private CharSequence r;
    private boolean s;
    private final Drawable t;
    private Drawable u;
    private String v;
    private CharSequence w;
    private int x;
    private SoftReference<Bitmap> y;

    static /* synthetic */ boolean h() {
        o = true;
        return true;
    }

    static {
        f3114a = Build.VERSION.SDK_INT < 11;
        n = new HashMap();
        o = false;
    }

    public e(com.google.android.finsky.navigationmanager.b bVar, android.support.v7.a.e eVar) {
        this(bVar, null, eVar);
    }

    public e(com.google.android.finsky.navigationmanager.b bVar, c cVar, android.support.v7.a.e eVar) {
        this.v = "";
        this.x = -1;
        this.f3115b = eVar.f().a();
        this.c = (FinskySearchToolbar) eVar.findViewById(R.id.action_bar);
        this.p = eVar;
        this.e = bVar;
        this.f = cVar;
        this.q = new Stack<>();
        this.q.push(new j(0, null));
        this.d = 0;
        if (this.c != null) {
            this.c.setCurrentBackendId(this.d);
            this.c.setNavigationManager(this.e);
            this.c.setActionBarController(this.f);
            this.c.setVisibility(4);
        }
        if (this.f3115b != null) {
            this.f3115b.b(b(ai.a(this.p, 0)));
        }
        this.t = new ColorDrawable(0);
        bVar.a(new f(this));
    }

    public final void a(int i, boolean z) {
        this.d = i;
        this.s = z;
        if (this.c != null) {
            this.c.setCurrentBackendId(i);
        }
        a();
    }

    public final void a(String str) {
        this.q.get(0).f3120b = str;
        a();
    }

    public final void a(int i) {
        if (this.c != null) {
            this.c.setSearchBoxFixedWidth(i);
        }
    }

    public final void a(boolean z, int i) {
        if (this.c != null) {
            this.c.a(z, i);
            if (this.c.getVisibility() != 0) {
                this.c.setVisibility(0);
            }
        }
    }

    public final void a(boolean z) {
        if (this.c == null) {
            return;
        }
        PlaySearchNavigationButton playSearchNavigationButton = ((PlaySearchToolbar) this.c).p.f7008b.f7015a;
        if (playSearchNavigationButton.f7011a != 0) {
            return;
        }
        playSearchNavigationButton.a(playSearchNavigationButton.f7011a, z);
    }

    public final boolean a(Integer num) {
        return this.q.peek().f3119a == num.intValue();
    }

    public final void b(Integer num) {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            if (this.q.get(i).f3119a == num.intValue()) {
                this.q.remove(i);
                return;
            }
        }
    }

    public final void b() {
        if (this.j == null) {
            return;
        }
        DfeToc dfeToc = FinskyApp.a().g;
        if (dfeToc != null && dfeToc.f1961a.s) {
            com.google.android.play.image.j a2 = FinskyApp.a().d.a(dfeToc.f1961a.r, 0, 0, new g(this));
            if (a2.f6944a != null) {
                this.j.setIcon(new BitmapDrawable(this.p.getResources(), a2.f6944a));
                this.j.setVisible(true);
                return;
            }
            return;
        }
        this.j.setVisible(false);
    }

    private void a(CharSequence charSequence) {
        if (this.f3115b != null) {
            this.r = charSequence;
            this.f3115b.a(this.r);
        }
    }

    private static Drawable b(int i) {
        SoftReference<Drawable> softReference = n.get(Integer.valueOf(i));
        if (softReference == null || softReference.get() == null) {
            softReference = new SoftReference<>(new PaintDrawable(i));
            n.put(Integer.valueOf(i), softReference);
        }
        return softReference.get();
    }

    @SuppressLint({"NewApi"})
    public final void c() {
        if (this.l != null && this.l != null) {
            this.l.setQuery("", false);
            this.l.setIconified(true);
            if (as.d(this.k)) {
                as.c(this.k);
            }
        }
    }

    public final void b(String str) {
        this.v = str;
        if (this.c != null) {
            this.c.setQuery(this.v);
        }
    }

    public final void a(int i, CharSequence charSequence) {
        if (!a(Integer.valueOf(i))) {
            this.q.push(new j(i, charSequence));
        }
    }

    public final void d() {
        this.q.pop();
    }

    public final void e() {
        boolean a2 = a((Integer) 2);
        if (this.f3115b != null) {
            this.f3115b.a(!this.e.e());
        }
        if (this.g) {
            if (!a2) {
                f();
                if (this.k != null && !f3114a) {
                    this.k.setVisible(this.e.d());
                    return;
                }
                return;
            }
            if (!f3114a) {
                this.k.setVisible(false);
            }
            this.h.setVisible(false);
            this.j.setVisible(false);
            if (this.m != null) {
                this.i.setVisible(this.m.a());
                this.i.setTitle(this.m.b() ? R.string.revert_translation : R.string.translate);
            } else {
                this.i.setVisible(false);
            }
        }
    }

    public final void f() {
        boolean z;
        if (this.i != null) {
            this.i.setVisible(false);
        }
        boolean z2 = this.e.q() == 5;
        Document v = this.e.v();
        if (this.h != null) {
            if (v != null && v.f1963a.g == 3) {
                String str = v.f1963a.f3890a;
                com.google.android.finsky.g.h hVar = FinskyApp.a().p;
                com.google.android.finsky.b.a aVar = FinskyApp.a().s;
                com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
                if (str == null) {
                    z = false;
                } else if (com.google.android.finsky.b.l.a(str)) {
                    z = false;
                } else if (hVar.a(str).isEmpty()) {
                    z = false;
                } else {
                    com.google.android.finsky.b.b a2 = aVar.a(str);
                    if (a2 == null) {
                        z = false;
                    } else {
                        boolean z3 = a2.c != null;
                        z = (z3 || jm.a(fVar.i(str))) ? (z3 && a2.c.f) ? false : true : false;
                    }
                }
                if (z) {
                    boolean a3 = r.a(v.f1963a.f3890a);
                    this.h.setTitle(R.string.allow_auto_updating);
                    this.h.setCheckable(true);
                    this.h.setChecked(a3);
                    this.h.setVisible(z2);
                    return;
                }
            }
            this.h.setVisible(false);
        }
    }

    public final void a() {
        pt a2;
        Drawable b2;
        CharSequence charSequence = this.q.peek().f3120b;
        if (!TextUtils.isEmpty(charSequence)) {
            a(charSequence);
        } else {
            a((CharSequence) this.p.getString(R.string.launcher_name));
            DfeToc dfeToc = FinskyApp.a().g;
            if (this.d == 9) {
                a((CharSequence) this.p.getString(R.string.side_drawer_social_home));
            } else if (dfeToc != null && this.d != 0 && (a2 = dfeToc.a(this.d)) != null) {
                a((CharSequence) a2.c);
            }
        }
        b();
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.p instanceof MainActivity) {
                MainActivity mainActivity = (MainActivity) this.p;
                int a3 = ai.a(this.p, this.d);
                com.google.android.finsky.navigationmanager.b bVar = this.e;
                mainActivity.q.setStatusBarBackgroundColor(bVar.c.isEmpty() ? false : bVar.c.peek().f ? android.support.v4.c.a.b(a3, 0) : a3);
            } else {
                this.p.getWindow().setStatusBarColor(ai.g(this.p, this.d));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            CharSequence charSequence2 = this.r;
            if (TextUtils.isEmpty(charSequence2)) {
                charSequence2 = this.p.getTitle();
            }
            CharSequence string = TextUtils.isEmpty(charSequence2) ? this.p.getResources().getString(R.string.launcher_name) : charSequence2;
            boolean z = this.x == this.d;
            boolean z2 = this.w != null && this.w.equals(string);
            if (!z || !z2) {
                if (this.y == null || this.y.get() == null) {
                    this.y = new SoftReference<>(BitmapFactory.decodeResource(this.p.getResources(), R.mipmap.ic_launcher_play_store));
                }
                this.p.setTaskDescription(new ActivityManager.TaskDescription(string.toString(), this.y.get(), com.google.android.play.utils.h.b(this.p, this.d)));
                this.x = this.d;
                this.w = string;
            }
        }
        if (!a((Integer) 2)) {
            b2 = b(ai.a(this.p, this.d));
        } else {
            Activity activity = this.p;
            SoftReference<Drawable> softReference = n.get(Integer.valueOf(R.drawable.action_bar_bg_neutral));
            if (softReference == null || softReference.get() == null) {
                softReference = new SoftReference<>(new h(new Drawable[]{android.support.v4.b.g.a(activity, R.drawable.action_bar_bg_neutral)}));
                n.put(Integer.valueOf(R.drawable.action_bar_bg_neutral), softReference);
            }
            b2 = softReference.get();
        }
        this.u = b2;
        if (this.f3115b != null) {
            this.f3115b.b(this.s ? this.t : this.u);
        }
        e();
    }
}
