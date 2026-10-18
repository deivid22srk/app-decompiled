package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.receivers.PackageMonitorReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class bi extends cc implements com.google.android.finsky.installer.p, com.google.android.finsky.receivers.aq, com.google.android.finsky.utils.gk {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.finsky.receivers.f f1614a;
    private final PackageMonitorReceiver t;
    private final com.google.android.finsky.bpkg.a u;
    private final com.google.android.finsky.gpkg.h v;
    private boolean w;
    private boolean x;
    private boolean y;

    public bi(DfeToc dfeToc, Account account, PackageMonitorReceiver packageMonitorReceiver, com.google.android.finsky.receivers.f fVar, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.gpkg.h hVar) {
        super(dfeToc, account);
        this.t = packageMonitorReceiver;
        this.f1614a = fVar;
        this.u = aVar;
        this.v = hVar;
    }

    @Override // com.google.android.finsky.activities.cc
    public final void a(Context context, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, com.google.android.finsky.epkg.q qVar, boolean z, String str, String str2, boolean z2, com.google.android.finsky.layout.play.cy cyVar) {
        super.a(context, bVar, eVar, qVar, z, str, str2, z2, cyVar);
        this.w = z;
        h();
    }

    private void h() {
        if (this.w) {
            this.t.b(this);
            this.t.a(this);
            if (!this.x) {
                this.f1614a.a(this);
                FinskyApp.a().z.f4894b.add(this);
                this.x = true;
            }
        }
    }

    @Override // com.google.android.finsky.activities.cc
    public final void a(Document document, boolean z, View... viewArr) {
        super.a(document, z, viewArr);
        h();
    }

    @Override // com.google.android.finsky.activities.cc
    public final void a() {
        this.t.b(this);
        if (this.x) {
            this.f1614a.b(this);
            FinskyApp.a().z.f4894b.remove(this);
            this.x = false;
        }
        super.a();
    }

    @Override // com.google.android.finsky.activities.cc
    protected final void b() {
        if (this.g.f1963a.g != 3) {
            FinskyLog.e("Unexpected doc backend %s", Integer.valueOf(this.g.f1963a.g), this.g);
            super.b();
        }
        String str = this.g.E().w;
        if (!TextUtils.isEmpty(str)) {
            ViewGroup viewGroup = (ViewGroup) this.i.findViewById(R.id.download_progress_panel);
            com.google.android.finsky.receivers.g j = this.f1614a.j(str);
            switch (j.f4476a) {
                case 0:
                    viewGroup.setVisibility(4);
                    super.b();
                    break;
                case 1:
                case 2:
                default:
                    ((TextView) b(R.id.title_title)).setSelected(false);
                    if (a(j)) {
                        ViewGroup viewGroup2 = (ViewGroup) b(R.id.title_extra_labels);
                        viewGroup2.removeAllViews();
                        a(LayoutInflater.from(this.e), viewGroup2, this.e.getString(R.string.download_paused_wifi));
                        viewGroup2.setVisibility(0);
                        a(false);
                        viewGroup.setVisibility(4);
                        break;
                    } else {
                        a(true);
                        TextView textView = (TextView) viewGroup.findViewById(R.id.downloading_bytes);
                        TextView textView2 = (TextView) viewGroup.findViewById(R.id.downloading_percentage);
                        ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(R.id.progress_bar);
                        TextView textView3 = (TextView) b(R.id.title_app_size_rating_line);
                        com.google.android.finsky.adapters.y.a(this.e, j, textView, textView2, progressBar);
                        if (j.f4476a == 1) {
                            textView.setText(R.string.download_pending);
                        }
                        textView3.setVisibility(j.f4476a == 2 ? 8 : 0);
                        ((ImageView) viewGroup.findViewById(R.id.cancel_download)).setOnClickListener(new bj(this, str, viewGroup));
                        viewGroup.setVisibility(0);
                        break;
                    }
                case 3:
                    a(R.string.installing);
                    break;
                case 4:
                    a(R.string.uninstalling);
                    break;
            }
        }
    }

    @Override // com.google.android.finsky.activities.cc
    protected final void a(int i) {
        super.a(i);
        this.i.findViewById(R.id.download_progress_panel).setVisibility(4);
        a(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0104, code lost:
    
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.finsky.activities.cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void a(boolean r23) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.bi.a(boolean):void");
    }

    @Override // com.google.android.finsky.activities.cc
    protected final void c() {
        super.c();
        if (this.y) {
            ((PlayActionButton) b(R.id.preregister_button)).setActionStyle(2);
        }
    }

    private static boolean a(com.google.android.finsky.receivers.g gVar) {
        FinskyApp a2 = FinskyApp.a();
        return a2.e().a(12607073L) && gVar.d == 196 && a2.l.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, boolean z) {
        android.support.v4.app.ad adVar = this.d.B;
        if (adVar.a("refund_confirm") == null) {
            gn gnVar = new gn();
            gnVar.a(R.string.uninstall_refund_confirmation_body).d(R.string.yes).e(R.string.no);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            bundle.putString("account_name", str2);
            bundle.putBoolean("try_uninstall", z);
            gnVar.a(this.d, 4, bundle);
            gnVar.b().a(adVar, "refund_confirm");
        }
    }

    private void e(String str) {
        if (this.g != null && this.g.E() != null && this.g.E().w.equals(str)) {
            b();
        }
    }

    @Override // com.google.android.finsky.utils.gk
    public final void a(String str) {
        if (this.g != null && this.g.P() && this.g.f1963a.f3890a.equals(str)) {
            e();
        }
    }

    @Override // com.google.android.finsky.activities.cc
    public final void a(int i, Bundle bundle) {
        super.a(i, bundle);
        switch (i) {
            case 1:
                String string = bundle.getString("package_name");
                if (this.f1614a != null) {
                    this.f1614a.b(string, false);
                    e();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
            default:
                FinskyLog.e("Unexpected requestCode %d", Integer.valueOf(i));
                break;
            case 4:
                com.google.android.finsky.utils.j.a(this.d.B, bundle.getString("package_name"), bundle.getString("account_name"), bundle.getBoolean("try_uninstall"), new bl(this));
                break;
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
        e(str);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
        e(str);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        if (this.g == null || !str.equals(this.g.E().w) || !this.d.q_()) {
            return;
        }
        e();
    }

    static /* synthetic */ void a(bi biVar, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4) {
        int i;
        if (z) {
            biVar.a(str, str2, true);
            return;
        }
        com.google.android.finsky.epkg.q qVar = biVar.d;
        android.support.v4.app.ad adVar = qVar.B;
        if (adVar.a("uninstall_confirm") != null) {
            return;
        }
        char c = 0;
        int i2 = R.string.ok;
        int i3 = R.string.cancel;
        if (z3) {
            if (str.equals("com.google.android.play.games") && FinskyApp.a().e().a(12605418L)) {
                c = 1054;
                i = R.string.uninstall_unsafe_msg;
            } else if (z2) {
                i = R.string.uninstall_system_updates_msg;
            } else if (z4) {
                i = R.string.uninstall_app_msg_active_subscriptions;
                i2 = R.string.yes;
                i3 = R.string.no;
            } else {
                i = R.string.uninstall_app_msg;
            }
        } else {
            i = R.string.uninstall_non_owned_app_msg;
        }
        gn gnVar = new gn();
        if (c != 0) {
            gnVar.c(R.string.uninstall_unsafe_title);
        }
        gnVar.a(i).d(i2).e(i3);
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        gnVar.a(qVar, 1, bundle);
        gnVar.b().a(adVar, "uninstall_confirm");
    }
}
