package com.google.android.finsky.setup;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.nu;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.android.finsky.utils.SetupWizardUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class SetupWizardRestoreAppsActivity extends android.support.v4.app.t implements gp, com.google.android.finsky.e.v, cy {
    private static final ai k = com.google.android.finsky.a.i.a(2500);
    private final View.OnClickListener l = new t(this);
    private final View.OnClickListener m = new s(this);
    private String n;
    private i o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean[] s;
    private boolean t;
    private SetupWizardUtils.SetupWizardParams u;
    private nu[] v;
    private ParcelableProtoArray<nu> w;
    private SetupWizardRestoreAppsSelector x;
    private SetupWizardRestoreAppsSelector y;
    private com.google.android.finsky.a.i z;

    static /* synthetic */ boolean i(SetupWizardRestoreAppsActivity setupWizardRestoreAppsActivity) {
        setupWizardRestoreAppsActivity.t = false;
        return false;
    }

    static /* synthetic */ boolean j(SetupWizardRestoreAppsActivity setupWizardRestoreAppsActivity) {
        setupWizardRestoreAppsActivity.q = true;
        return true;
    }

    public static Intent a(String str, nu[] nuVarArr) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) SetupWizardRestoreAppsActivity.class);
        intent.putExtra("authAccount", str);
        ParcelableProtoArray a2 = ParcelableProtoArray.a(nuVarArr);
        Bundle bundle = new Bundle();
        bundle.putParcelable("SetupWizardRestoreAppsActivity.backup_device_infos", a2);
        intent.putExtra("SetupWizardRestoreAppsActivity.backup_device_infos_bundle", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.u = new SetupWizardUtils.SetupWizardParams(intent);
        setTheme(this.u.c ? R.style.SetupWizardTheme_Light : R.style.SetupWizardTheme);
        this.n = intent.getStringExtra("authAccount");
        this.z = FinskyApp.a().f(this.n);
        this.w = (ParcelableProtoArray) intent.getBundleExtra("SetupWizardRestoreAppsActivity.backup_device_infos_bundle").getParcelable("SetupWizardRestoreAppsActivity.backup_device_infos");
        this.v = this.w.f4713a;
        if (bundle != null) {
            this.r = bundle.getInt("SetupWizardRestoreAppsActivity.current_device", 0);
            this.t = bundle.getBoolean("SetupWizardRestoreAppsActivity.backup_docs_loaded", false);
            this.s = bundle.getBooleanArray("SetupWizardRestoreAppsActivity.current_selected_backup_docs");
        } else {
            this.z.a(0L, (cy) this);
        }
        this.o = (i) d().a("SetupWizardRestoreAppsActivity.sidecar");
        if (this.o == null) {
            this.o = i.a(this.n);
            d().a().a(this.o, "SetupWizardRestoreAppsActivity.sidecar").b();
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SetupWizardRestoreAppsActivity.current_device", this.r);
        bundle.putBooleanArray("SetupWizardRestoreAppsActivity.current_selected_backup_docs", this.s);
        bundle.putBoolean("SetupWizardRestoreAppsActivity.backup_docs_loaded", this.t);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        this.o.a((com.google.android.finsky.e.v) this);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onStop() {
        this.o.a((com.google.android.finsky.e.v) null);
        super.onStop();
    }

    private void f() {
        if (!this.p) {
            this.p = true;
            LayoutInflater from = LayoutInflater.from(this);
            ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.setup_wizard_play_frame, (ViewGroup) null);
            setContentView(viewGroup);
            ((TextView) viewGroup.findViewById(R.id.title)).setText(R.string.setup_wizard_restore_apps_header);
            ((ViewGroup) viewGroup.findViewById(R.id.content_frame)).addView(from.inflate(R.layout.setup_wizard_restore_apps_view, viewGroup, false));
            SetupWizardUtils.a(this, this.u, 1, false, false, false);
            this.x = (SetupWizardRestoreAppsSelector) findViewById(R.id.setup_wizard_device_list_selector);
            j();
            b(true);
            this.y = (SetupWizardRestoreAppsSelector) findViewById(R.id.setup_wizard_apps_list_selector);
            k();
            c(true);
            SetupWizardNavBar a2 = SetupWizardUtils.a(this);
            a2.f4642a.setOnClickListener(new r(this, a2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!i()) {
            gn gnVar = new gn();
            gnVar.b(R.layout.setup_wizard_restore_app_list_dialog).d(R.string.done).e(R.string.cancel).a(2505, null, 2506, 2507, FinskyApp.a().i()).a(null, 2, null);
            ParcelableProtoArray a2 = ParcelableProtoArray.a(this.o.f4662a);
            Bundle bundle = new Bundle();
            bundle.putParcelable("SetupWizardAppListDialog.backupDocs", a2);
            bundle.putBooleanArray("SetupWizardAppListDialog.selectedBackupDocs", this.s);
            gnVar.a(bundle);
            gnVar.b().a(d(), "SetupWizardRestoreAppsActivity.backupAppsDialog");
        }
    }

    private int h() {
        int i = 0;
        for (boolean z : this.s) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return this.r == -1;
    }

    private void j() {
        if (i()) {
            this.x.setTexts(getResources().getString(R.string.setup_wizard_setup_as_new_option));
        } else {
            long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - this.v[this.r].g);
            this.x.a(this.v[this.r].c, days == 0 ? getResources().getString(R.string.setup_wizard_device_last_used_today_message) : getResources().getQuantityString(R.plurals.setup_wizard_device_last_used_message, (int) days, Long.valueOf(days)));
        }
    }

    private void k() {
        if (this.y != null) {
            TextView textView = (TextView) findViewById(R.id.setup_wizard_apps_selection_title);
            Resources resources = getResources();
            if (i()) {
                this.y.setVisibility(8);
                textView.setVisibility(8);
                return;
            }
            this.y.setVisibility(0);
            textView.setVisibility(0);
            switch (this.o.as) {
                case 4:
                    this.y.setTexts(resources.getString(R.string.loading));
                    break;
                case 5:
                    int h = h();
                    if (h == this.o.f4662a.length) {
                        this.y.a(resources.getString(R.string.setup_wizard_all_apps), Integer.toString(h));
                        break;
                    } else if (h == 0) {
                        this.y.setTexts(resources.getString(R.string.setup_wizard_no_apps_selected));
                        break;
                    } else {
                        this.y.a(resources.getQuantityString(R.plurals.setup_wizard_selected_apps, h), Integer.toString(h));
                        break;
                    }
                case 6:
                    this.y.setTexts(resources.getQuantityString(R.plurals.setup_wizard_apps_loading_error_menu_title, this.v.length));
                    break;
            }
        }
    }

    private void b(boolean z) {
        if (this.x != null) {
            this.x.setOnClickListener(z ? this.l : null);
        }
    }

    private void c(boolean z) {
        if (this.y != null) {
            this.y.setOnClickListener(z ? this.m : null);
        }
    }

    @Override // com.google.android.finsky.e.v
    public final void a(com.google.android.finsky.e.u uVar) {
        if (uVar != this.o) {
            FinskyLog.e("Received state change for unknown fragment: %s", uVar);
        }
        switch (this.o.as) {
            case 0:
                this.o.a(this.v[this.r].f4185a);
                f();
                break;
            case 4:
                f();
                b(false);
                c(false);
                k();
                break;
            case 5:
                f();
                b(true);
                c(true);
                nv[] nvVarArr = this.o.f4662a;
                if (!this.t) {
                    this.s = new boolean[nvVarArr.length];
                    for (int i = 0; i < nvVarArr.length; i++) {
                        this.s[i] = true;
                    }
                    this.t = true;
                }
                k();
                if (this.q) {
                    g();
                    this.q = false;
                    break;
                }
                break;
            case 6:
                f();
                b(true);
                c(false);
                k();
                break;
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        switch (i) {
            case 1:
                int i2 = bundle.getInt("SetupWizardRestoreDeviceDialogView.selectedDevicePosition");
                if (i2 != this.r) {
                    this.r = i2;
                    if (i()) {
                        this.z.a(2502, (byte[]) null, getParentNode());
                        this.t = true;
                    } else {
                        b(false);
                        this.t = false;
                        this.o.a(this.v[i2].f4185a);
                    }
                    j();
                    k();
                    break;
                }
                break;
            case 2:
                boolean[] booleanArray = bundle.getBooleanArray("SetupWizardAppListDialog.selectedBackupDocs");
                if (booleanArray.length != this.s.length) {
                    FinskyLog.e("Length mismatched, can't update", new Object[0]);
                    break;
                } else {
                    this.s = booleanArray;
                    k();
                    break;
                }
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    static /* synthetic */ void b(SetupWizardRestoreAppsActivity setupWizardRestoreAppsActivity) {
        setupWizardRestoreAppsActivity.setResult(-1);
        setupWizardRestoreAppsActivity.finish();
    }

    static /* synthetic */ void c(SetupWizardRestoreAppsActivity setupWizardRestoreAppsActivity) {
        int i = 0;
        if (setupWizardRestoreAppsActivity.o.as != 5) {
            return;
        }
        nv[] nvVarArr = setupWizardRestoreAppsActivity.o.f4662a;
        nv[] nvVarArr2 = new nv[setupWizardRestoreAppsActivity.h()];
        for (int i2 = 0; i2 < nvVarArr.length; i2++) {
            if (setupWizardRestoreAppsActivity.s[i2]) {
                nvVarArr2[i] = nvVarArr[i2];
                i++;
            }
        }
        RestoreService.a(setupWizardRestoreAppsActivity.getApplicationContext(), setupWizardRestoreAppsActivity.n, nvVarArr2);
    }
}
