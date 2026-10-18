package com.google.android.finsky.setup;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.lm;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.services.VpaService;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.android.finsky.utils.SetupWizardUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class VpaSelectionActivity extends android.support.v4.app.t implements cy {
    private static final ai l = com.google.android.finsky.a.i.a(2520);
    protected ViewGroup k;
    private String m;
    private LinearLayout n;
    private View o;
    private boolean p;
    private boolean[] q;
    private boolean r;
    private SetupWizardUtils.SetupWizardParams s;
    private com.google.android.finsky.a.i t;
    private lm[] u;
    private VpaService v;
    private ServiceConnection w = new x(this);

    static /* synthetic */ void a(VpaSelectionActivity vpaSelectionActivity, boolean z) {
        for (int i = 0; i < vpaSelectionActivity.q.length; i++) {
            vpaSelectionActivity.q[i] = z || vpaSelectionActivity.u[i].i;
        }
    }

    public static Intent a(String str) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) VpaSelectionActivity.class);
        intent.putExtra("authAccount", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.s = new SetupWizardUtils.SetupWizardParams(intent);
        setTheme(this.s.c ? R.style.SetupWizardTheme_Light : R.style.SetupWizardTheme);
        this.m = intent.getStringExtra("authAccount");
        this.t = FinskyApp.a().f(this.m);
        if (bundle != null) {
            this.r = bundle.getBoolean("VpaSelectionActivity.preloads_loaded", false);
            this.q = bundle.getBooleanArray("VpaSelectionActivity.current_selected_preloads");
            this.u = (lm[]) ParcelableProtoArray.a(bundle, "VpaSelectionActivity.preloads");
        } else {
            this.t.a(0L, (cy) this);
        }
        bindService(new Intent(this, (Class<?>) VpaService.class), this.w, 1);
        if (this.p) {
            return;
        }
        this.p = true;
        LayoutInflater from = LayoutInflater.from(this);
        this.k = (ViewGroup) from.inflate(R.layout.setup_wizard_play_frame, (ViewGroup) null);
        setContentView(this.k);
        ((TextView) this.k.findViewById(R.id.title)).setText(R.string.setup_wizard_optional_preloads_header);
        ((ViewGroup) this.k.findViewById(R.id.content_frame)).addView(from.inflate(R.layout.setup_wizard_preloads_selection_view, this.k, false));
        SetupWizardUtils.a(this, this.s, 1, false, false, false);
        this.n = (LinearLayout) findViewById(R.id.setup_wizard_preloads_list);
        this.o = findViewById(R.id.setup_wizard_preloads_loading);
        f();
        SetupWizardNavBar a2 = SetupWizardUtils.a(this);
        a2.f4642a.setOnClickListener(new aa(this, a2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        if (this.v != null) {
            unbindService(this.w);
            this.v = null;
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBooleanArray("VpaSelectionActivity.current_selected_preloads", this.q);
        bundle.putBoolean("VpaSelectionActivity.preloads_loaded", this.r);
        bundle.putParcelable("VpaSelectionActivity.preloads", ParcelableProtoArray.a(this.u));
    }

    private void f() {
        if (!this.r) {
            this.n.setVisibility(8);
            this.o.setVisibility(0);
            return;
        }
        this.n.setVisibility(0);
        this.o.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(this);
        this.n.removeAllViews();
        for (int i = 0; i <= this.u.length; i++) {
            CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.restore_apps_row_entry, (ViewGroup) this.n, false);
            if (i > 0) {
                checkedTextView.setText(this.u[i - 1].d);
                checkedTextView.setEnabled(!this.u[i + (-1)].i);
            } else {
                checkedTextView.setText(getResources().getString(R.string.setup_wizard_all_apps));
            }
            checkedTextView.setTag(Integer.valueOf(i));
            checkedTextView.setOnClickListener(new z(this));
            this.n.addView(checkedTextView);
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        boolean z = true;
        for (int i = 1; i < this.n.getChildCount(); i++) {
            boolean z2 = this.q[i - 1];
            if (!z2) {
                z = false;
            }
            ((Checkable) this.n.getChildAt(i)).setChecked(z2);
        }
        ((Checkable) this.n.getChildAt(0)).setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (VpaService.e() || RestoreService.a()) {
            Intent a2 = SetupWizardFinalHoldActivity.a();
            a2.setFlags(a2.getFlags() | 33554432);
            startActivity(a2);
            finish();
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return l;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    static /* synthetic */ void c(VpaSelectionActivity vpaSelectionActivity) {
        if (vpaSelectionActivity.u.length == 0) {
            vpaSelectionActivity.h();
        }
        vpaSelectionActivity.q = new boolean[vpaSelectionActivity.u.length];
        for (int i = 0; i < vpaSelectionActivity.q.length; i++) {
            vpaSelectionActivity.q[i] = vpaSelectionActivity.u[i].k || vpaSelectionActivity.u[i].i;
        }
        vpaSelectionActivity.r = true;
        vpaSelectionActivity.f();
    }

    static /* synthetic */ void f(VpaSelectionActivity vpaSelectionActivity) {
        if (!vpaSelectionActivity.r) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vpaSelectionActivity.q.length; i++) {
            if (vpaSelectionActivity.q[i]) {
                arrayList.add(vpaSelectionActivity.u[i]);
            }
        }
        VpaService.a((lm[]) arrayList.toArray(new lm[arrayList.size()]));
    }
}
