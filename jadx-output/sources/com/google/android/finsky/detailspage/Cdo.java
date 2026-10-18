package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.Arrays;

/* renamed from: com.google.android.finsky.detailspage.do, reason: invalid class name */
/* loaded from: classes.dex */
public class Cdo extends bd<dq> implements ds, dt {
    private int[] A;
    private int B;
    private int C = 0;
    private Boolean D;

    /* renamed from: a, reason: collision with root package name */
    private int f2621a;
    private com.google.android.finsky.protos.ds[] u;
    private com.google.android.play.image.j[] v;
    private com.google.android.finsky.protos.du[] w;
    private Drawable[] x;
    private dr y;
    private dr z;

    static /* synthetic */ int d(Cdo cdo) {
        int i = cdo.B + 1;
        cdo.B = i;
        return i;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.screenshots_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (bfVar != null) {
            h();
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0 && document.V()) {
            this.f2559b = new dq();
            ((dq) this.f2559b).f2624a = document;
            h();
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        boolean z = this.f2621a == 0;
        boolean z2 = this.f2621a == 3;
        ScreenshotsModuleLayout screenshotsModuleLayout = (ScreenshotsModuleLayout) view;
        com.google.android.finsky.protos.du[] duVarArr = this.w;
        Drawable[] drawableArr = this.x;
        int[] iArr = this.A;
        boolean a2 = a(this.c);
        screenshotsModuleLayout.d = this;
        screenshotsModuleLayout.e = this;
        if (z) {
            screenshotsModuleLayout.f2508a.a();
            return;
        }
        if (z2) {
            screenshotsModuleLayout.f2508a.a(screenshotsModuleLayout.getContext().getString(R.string.screenshots_not_loaded));
            return;
        }
        screenshotsModuleLayout.f2508a.b();
        if (screenshotsModuleLayout.c == null) {
            Drawable placeholderDrawable = screenshotsModuleLayout.getPlaceholderDrawable();
            int length = drawableArr.length;
            for (int i = 0; i < length; i++) {
                if (iArr[i] == 0) {
                    drawableArr[i] = placeholderDrawable;
                }
            }
            screenshotsModuleLayout.c = new com.google.android.finsky.adapters.ag(drawableArr.length, screenshotsModuleLayout);
            screenshotsModuleLayout.f2509b.setAppScreenshotStates(iArr);
            screenshotsModuleLayout.f2509b.setAdapter(screenshotsModuleLayout.c);
            if (!a2) {
                screenshotsModuleLayout.f2509b.setLoadAllScreenshotsListener(screenshotsModuleLayout);
            }
        }
        com.google.android.finsky.adapters.ag agVar = screenshotsModuleLayout.c;
        if (drawableArr.length != agVar.f1889a) {
            FinskyLog.e("Number of images don't match", new Object[0]);
            return;
        }
        for (int i2 = 0; i2 < agVar.f1889a; i2++) {
            agVar.f1890b[i2] = drawableArr[i2];
            agVar.c[i2] = duVarArr[i2];
        }
        agVar.d.notifyChanged();
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        g();
        if (this.v != null) {
            for (int i = 0; i < this.v.length; i++) {
                com.google.android.play.image.j jVar = this.v[i];
                if (jVar != null) {
                    jVar.a();
                }
            }
        }
        this.f2621a = 2;
    }

    private void g() {
        if (this.y != null) {
            this.y.cancel(true);
        }
        if (this.z != null) {
            this.z.cancel(true);
        }
        this.y = null;
        this.z = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        ((com.google.android.finsky.adapters.ap) view).ab_();
    }

    private void h() {
        this.f2621a = 0;
        this.u = (com.google.android.finsky.protos.ds[]) ((dq) this.f2559b).f2624a.b(1).toArray(new com.google.android.finsky.protos.ds[0]);
        int length = this.u.length;
        this.v = new com.google.android.play.image.j[length];
        this.w = new com.google.android.finsky.protos.du[length];
        for (int i = 0; i < length; i++) {
            this.w[i] = this.u[i].e;
        }
        this.x = new Drawable[length];
        this.B = 0;
        g();
        this.C = 0;
        int min = FinskyApp.a().e().a(12602981L) ? Math.min(ScreenshotsModuleLayout.a(this.c.getResources()) + 1, length) : length;
        this.A = new int[length];
        if (a(this.c)) {
            Arrays.fill(this.A, 0);
            this.f2621a = 1;
        } else {
            Arrays.fill(this.A, 2);
            a(new dr(this, 0, min - 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        if (this.D == null) {
            this.D = false;
            if (FinskyApp.a().e().a(12603286L)) {
                int a2 = com.google.android.play.utils.e.a(context);
                this.D = Boolean.valueOf(a2 == 1 || a2 == 2);
            }
        }
        return this.D.booleanValue();
    }

    private void a(dr drVar) {
        if (this.z != null) {
            FinskyLog.e("Tried to queue another LoadImageTask when another task was waiting.", new Object[0]);
            return;
        }
        this.z = drVar;
        if (this.y == null) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.y = this.z;
        this.z = null;
        if (this.y != null) {
            int i = this.C;
            dr drVar = this.y;
            this.C = i + (drVar.f2626b - drVar.f2625a) + 1;
            jm.a(this.y, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int length = this.u.length;
        com.google.android.finsky.protos.ds dsVar = this.u[i];
        if (dsVar != null) {
            com.google.android.play.image.j b2 = this.h.b(dsVar.f, 0, dsVar.l ? (int) this.c.getResources().getDimension(R.dimen.screenshots_height) : 0, new dp(this, i, length));
            Bitmap bitmap = b2.f6944a;
            if (bitmap != null) {
                this.A[i] = 2;
                this.f2621a = 1;
                this.x[i] = a(bitmap);
                this.d.a((bd) this, false);
                return;
            }
            this.v[i] = b2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TransitionDrawable a(Bitmap bitmap) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), new BitmapDrawable(this.c.getResources(), bitmap)});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(250);
        return transitionDrawable;
    }

    @Override // com.google.android.finsky.detailspage.ds
    public final void a(int i) {
        if (this.A[i] == 0) {
            this.A[i] = 1;
            this.d.a((bd) this, false);
            b(i);
            return;
        }
        this.i.a(((dq) this.f2559b).f2624a, i, a(this.c));
    }

    @Override // com.google.android.finsky.detailspage.ds
    public final void a() {
        h();
        this.d.a((bd) this, false);
    }

    @Override // com.google.android.finsky.detailspage.dt
    public final void e() {
        if (this.C < this.u.length && this.z == null) {
            a(new dr(this, this.C, this.u.length - 1));
        }
    }
}
