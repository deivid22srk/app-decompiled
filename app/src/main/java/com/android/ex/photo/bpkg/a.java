package com.android.ex.photo.bpkg;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ax;
import android.support.v4.app.ay;
import android.support.v4.b.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ex.photo.apkg.d;
import com.android.ex.photo.ad;
import com.android.ex.photo.af;
import com.android.ex.photo.cpkg.c;
import com.android.ex.photo.h;
import com.android.ex.photo.i;
import com.android.ex.photo.j;
import com.android.ex.photo.t;
import com.android.ex.photo.views.PhotoView;
import com.android.ex.photo.views.f;

/* loaded from: classes.dex */
public class a extends Fragment implements ay<c>, View.OnClickListener, i, j {

    /* renamed from: a, reason: collision with root package name */
    public String f1141a;
    public ImageView ai;
    public f aj;
    public int ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao = true;
    public View ap;
    public boolean aq;
    public boolean ar;
    public boolean as;

    /* renamed from: b, reason: collision with root package name */
    public String f1142b;
    public Intent c;
    public h d;
    public d e;
    public BroadcastReceiver f;
    public PhotoView g;
    public ImageView h;
    public TextView i;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // android.support.v4.app.ay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(android.support.v4.b.n<com.android.ex.photo.cpkg.c> r8, com.android.ex.photo.cpkg.c r9) {
        /*
            r7 = this;
            r6 = 8
            r1 = 1
            r2 = 0
            com.android.ex.photo.cpkg.c r9 = (com.android.ex.photo.cpkg.c) r9
            android.view.View r0 = r7.R
            if (r0 == 0) goto L10
            boolean r0 = r7.q_()
            if (r0 != 0) goto L11
        L10:
            return
        L11:
            android.content.res.Resources r0 = r7.g()
            android.graphics.drawable.Drawable r0 = r9.a(r0)
            int r3 = r8.n
            switch(r3) {
                case 2: goto L2b;
                case 3: goto L64;
                default: goto L1e;
            }
        L1e:
            boolean r0 = r7.ao
            if (r0 != 0) goto L27
            com.android.ex.photo.views.f r0 = r7.aj
            r0.a(r6)
        L27:
            r7.x()
            goto L10
        L2b:
            boolean r3 = r7.as
            if (r3 != 0) goto L64
            boolean r3 = r7.v()
            if (r3 != 0) goto L10
            if (r0 != 0) goto L5c
            android.widget.ImageView r0 = r7.h
            int r1 = com.android.ex.photo.ac.default_image
            r0.setImageResource(r1)
            r7.aq = r2
        L40:
            android.widget.ImageView r0 = r7.h
            r0.setVisibility(r2)
            android.content.res.Resources r0 = r7.g()
            int r1 = com.android.ex.photo.z.force_thumbnail_no_scaling
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L58
            android.widget.ImageView r0 = r7.h
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
        L58:
            r7.a(r2)
            goto L1e
        L5c:
            android.widget.ImageView r3 = r7.h
            r3.setImageDrawable(r0)
            r7.aq = r1
            goto L40
        L64:
            int r0 = r9.c
            if (r0 != r1) goto L7c
            r7.ao = r2
            android.widget.TextView r0 = r7.i
            int r1 = com.android.ex.photo.ag.failed
            r0.setText(r1)
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r2)
            com.android.ex.photo.h r0 = r7.d
            r0.a(r7, r2)
            goto L1e
        L7c:
            android.widget.TextView r0 = r7.i
            r0.setVisibility(r6)
            android.content.res.Resources r0 = r7.g()
            android.graphics.drawable.Drawable r0 = r9.a(r0)
            if (r0 == 0) goto Lbc
            com.android.ex.photo.views.PhotoView r3 = r7.g
            if (r3 == 0) goto Lb2
            com.android.ex.photo.views.PhotoView r3 = r7.g
            if (r0 == 0) goto Lc3
            android.graphics.drawable.Drawable r4 = r3.f1174a
            if (r0 == r4) goto Lc3
            android.graphics.drawable.Drawable r4 = r3.f1174a
            if (r4 == 0) goto La1
            android.graphics.drawable.Drawable r4 = r3.f1174a
            r5 = 0
            r4.setCallback(r5)
        La1:
            r3.f1174a = r0
            r0 = 0
            r3.i = r0
            android.graphics.drawable.Drawable r0 = r3.f1174a
            r0.setCallback(r3)
            r0 = r1
        Lac:
            r3.b(r0)
            r3.invalidate()
        Lb2:
            r7.a(r1)
            android.view.View r0 = r7.ap
            r0.setVisibility(r6)
            r7.ao = r2
        Lbc:
            com.android.ex.photo.h r0 = r7.d
            r0.a(r7, r1)
            goto L1e
        Lc3:
            r0 = r2
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.bpkg.a.a(android.support.v4.b.n, java.lang.Object):void");
    }

    public static a a(Intent intent, int i, boolean z) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", z);
        aVar.f(bundle);
        return aVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.d = ((t) f()).h();
        if (this.d == null) {
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        }
        this.e = this.d.c();
        if (this.e == null) {
            throw new IllegalStateException("Callback reported null adapter");
        }
        x();
    }

    @Override // android.support.v4.app.Fragment
    public final void E_() {
        this.d = null;
        super.E_();
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        Bundle bundle3 = this.r;
        if (bundle3 != null) {
            this.c = (Intent) bundle3.getParcelable("arg-intent");
            this.as = this.c.getBooleanExtra("display_thumbs_fullscreen", false);
            this.ak = bundle3.getInt("arg-position");
            this.an = bundle3.getBoolean("arg-show-spinner");
            this.ao = true;
            if (bundle != null && (bundle2 = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT")) != null) {
                this.c = new Intent().putExtras(bundle2);
            }
            if (this.c != null) {
                this.f1141a = this.c.getStringExtra("resolved_photo_uri");
                this.f1142b = this.c.getStringExtra("thumbnail_uri");
                this.am = this.c.getBooleanExtra("watch_network", false);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(af.photo_fragment_view, viewGroup, false);
        this.g = (PhotoView) inflate.findViewById(ad.photo_view);
        this.g.setMaxInitialScale(this.c.getFloatExtra("max_scale", 1.0f));
        this.g.setOnClickListener(this);
        PhotoView photoView = this.g;
        boolean z = this.al;
        if (z != photoView.c) {
            photoView.c = z;
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.g.a(false);
        this.ap = inflate.findViewById(ad.photo_preview);
        this.h = (ImageView) inflate.findViewById(ad.photo_preview_image);
        this.aq = false;
        this.aj = new f((ProgressBar) inflate.findViewById(ad.determinate_progress), (ProgressBar) inflate.findViewById(ad.indeterminate_progress));
        this.i = (TextView) inflate.findViewById(ad.empty_text);
        this.ai = (ImageView) inflate.findViewById(ad.retry_button);
        x();
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        this.d.a(this.ak, this);
        this.d.a((i) this);
        if (this.am) {
            if (this.f == null) {
                this.f = new b(this, (byte) 0);
            }
            f().registerReceiver(this.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.ar = activeNetworkInfo.isConnected();
            } else {
                this.ar = false;
            }
        }
        if (!v()) {
            this.ao = true;
            this.ap.setVisibility(0);
            l().a(2, null, this);
            l().a(3, null, this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        if (this.am) {
            f().unregisterReceiver(this.f);
        }
        this.d.b((i) this);
        this.d.c(this.ak);
        if (this.g != null) {
            PhotoView photoView = this.g;
            boolean z = photoView.f1174a instanceof BitmapDrawable;
            boolean z2 = !z;
            if (photoView.f1174a != null && z) {
                if (((BitmapDrawable) photoView.f1174a).getBitmap() != null) {
                    photoView.i = 0.0f;
                    photoView.f1174a = null;
                    z2 = false;
                }
            }
            photoView.b(z2);
            photoView.invalidate();
        }
        super.p();
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        if (this.g != null) {
            PhotoView photoView = this.g;
            photoView.d = null;
            photoView.e = null;
            photoView.f1174a = null;
            photoView.h.a();
            photoView.h = null;
            photoView.j.a();
            photoView.j = null;
            photoView.k.a();
            photoView.k = null;
            photoView.l.a();
            photoView.l = null;
            photoView.setOnClickListener(null);
            photoView.f = null;
            photoView.p = false;
            this.g = null;
        }
        super.d();
    }

    public final String u() {
        return this.f1141a;
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.c != null) {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", this.c.getExtras());
        }
    }

    @Override // android.support.v4.app.ay
    public final n<c> a(int i, Bundle bundle) {
        String str = null;
        if (this.an) {
            return null;
        }
        switch (i) {
            case 2:
                str = this.f1142b;
                break;
            case 3:
                str = this.f1141a;
                break;
        }
        return this.d.a(i, str);
    }

    public void a(boolean z) {
        this.g.a(z);
    }

    @Override // android.support.v4.app.ay
    public final void b() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.d.a();
    }

    @Override // com.android.ex.photo.j
    public final void c() {
        x();
    }

    @Override // com.android.ex.photo.j
    public final void c_() {
        w();
    }

    @Override // com.android.ex.photo.j
    public final void d_() {
        if (!this.d.a((Fragment) this)) {
            w();
        } else if (!v()) {
            l().a(2, this);
        }
    }

    public void w() {
        if (this.g != null) {
            this.g.a();
        }
    }

    @Override // com.android.ex.photo.j
    public final boolean e_() {
        boolean z;
        boolean z2;
        if (!this.d.a((Fragment) this) || this.g == null) {
            return false;
        }
        PhotoView photoView = this.g;
        if (photoView.g) {
            z = photoView.j.g;
            if (!z) {
                photoView.f1175b.getValues(photoView.o);
                photoView.n.set(photoView.m);
                photoView.f1175b.mapRect(photoView.n);
                float width = photoView.getWidth();
                float f = photoView.o[2];
                float f2 = photoView.n.right - photoView.n.left;
                if (!photoView.g || f2 <= width) {
                    z2 = false;
                } else if (f == 0.0f) {
                    z2 = false;
                }
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    @Override // com.android.ex.photo.j
    public final boolean f_() {
        boolean z;
        boolean z2;
        if (!this.d.a((Fragment) this) || this.g == null) {
            return false;
        }
        PhotoView photoView = this.g;
        if (photoView.g) {
            z = photoView.j.g;
            if (!z) {
                photoView.f1175b.getValues(photoView.o);
                photoView.n.set(photoView.m);
                photoView.f1175b.mapRect(photoView.n);
                float width = photoView.getWidth();
                float f = photoView.o[2];
                float f2 = photoView.n.right - photoView.n.left;
                if (!photoView.g || f2 <= width) {
                    z2 = false;
                } else if (f != 0.0f && width >= f2 + f) {
                    z2 = false;
                }
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final boolean v() {
        if (this.g != null) {
            if (this.g.f1174a != null) {
                return true;
            }
        }
        return false;
    }

    public void x() {
        this.al = this.d == null ? false : this.d.b((Fragment) this);
    }

    @Override // com.android.ex.photo.i
    public final void a(Cursor cursor) {
        Object a2;
        if (this.e != null && cursor.moveToPosition(this.ak) && !v()) {
            ax l = l();
            Object a3 = l.a(3);
            if (a3 != null) {
                com.android.ex.photo.cpkg.b bVar = (com.android.ex.photo.cpkg.b) a3;
                this.f1141a = this.e.b(cursor);
                bVar.a(this.f1141a);
                bVar.k();
            }
            if (!this.aq && (a2 = l.a(2)) != null) {
                com.android.ex.photo.cpkg.b bVar2 = (com.android.ex.photo.cpkg.b) a2;
                this.f1142b = this.e.c(cursor);
                bVar2.a(this.f1142b);
                bVar2.k();
            }
        }
    }
}
