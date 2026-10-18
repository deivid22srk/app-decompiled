package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ContentFilters;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class ContentFiltersActivity2 extends android.support.v7.a.ae implements View.OnClickListener, com.android.volley.s, gp, com.google.android.finsky.api.model.x {
    private FinskyApp A;
    private boolean B;
    private boolean C;
    private Bundle D;
    private Set<Integer> E;
    private View k;
    private TextView l;
    private SwitchCompat m;
    private View n;
    private View o;
    private ViewGroup p;
    private View q;
    private FifeImageView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private com.google.android.finsky.api.model.g v;
    private com.google.android.finsky.a.i w;
    private com.google.android.finsky.layout.play.ad x = new com.google.android.finsky.layout.play.ad(315);
    private com.google.android.finsky.c.b[] y;
    private String z;

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.content_filters_activity);
        this.k = findViewById(R.id.content_filter_on_off_wrapper);
        this.l = (TextView) findViewById(R.id.content_filter_on_off_text);
        this.m = (SwitchCompat) findViewById(R.id.content_filter_on_off_toggle);
        this.n = findViewById(R.id.content_filter_splash_info_wrapper);
        this.o = findViewById(R.id.content_filter_verticals_wrapper);
        this.s = (TextView) findViewById(R.id.top_info_title);
        this.t = (TextView) findViewById(R.id.top_info_text);
        this.u = (TextView) findViewById(R.id.more_info);
        this.r = (FifeImageView) findViewById(R.id.more_info_image);
        this.q = findViewById(R.id.download_ratings_progress);
        this.p = (ViewGroup) findViewById(R.id.filters_list);
        this.B = false;
        this.C = false;
        this.z = null;
        this.E = new HashSet();
        if (bundle != null) {
            a(bundle);
        } else {
            this.z = com.google.android.finsky.utils.bg.c.a();
        }
        this.A = FinskyApp.a();
        this.w = this.A.h();
        if (bundle == null) {
            this.w.a(0L, (com.google.android.finsky.layout.play.cy) this.x);
        }
        boolean z = (com.google.android.finsky.utils.bg.c.a().isEmpty() && !this.C && TextUtils.isEmpty(com.google.android.finsky.utils.bg.g.a())) ? false : true;
        this.m.setChecked(z);
        b(z);
        setResult(0);
        this.v = new com.google.android.finsky.api.model.g(this.A.b((String) null), this);
        this.v.a((com.google.android.finsky.api.model.x) this);
        this.v.a((com.android.volley.s) this);
        com.google.android.finsky.api.model.g gVar = this.v;
        gVar.a(gVar, gVar, false);
        this.y = com.google.android.finsky.c.a.a(com.google.android.finsky.utils.bg.d);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.content_filters2_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.content_filters_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(com.google.android.finsky.c.d.A.b()));
        startActivity(intent);
        return true;
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onPause() {
        if (((com.google.android.finsky.api.model.a) this.v).f1966b != 0) {
            d(this.m.isChecked());
        }
        super.onPause();
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        if (((com.google.android.finsky.api.model.a) this.v).f1966b != 0) {
            setResult(-1, com.google.android.finsky.c.a.a(((ContentFilters.ContentFilterSettingsResponse) ((com.google.android.finsky.api.model.a) this.v).f1966b).f3574a, this.y));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        a(bundle);
    }

    private void a(Bundle bundle) {
        this.B = bundle.getBoolean("ContentFiltersActivity2.hasCompletedPin");
        this.C = bundle.getBoolean("ContentFiltersActivity2.temporaryToggleState");
        this.z = bundle.getString("ContentFiltersActivity2.oldContentFilterPref");
        this.E.clear();
        this.E.addAll(bundle.getIntegerArrayList("ContentFiltersActivity2.shownConfirmationDialogsIndices"));
    }

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("ContentFiltersActivity2.hasCompletedPin", this.B);
        bundle.putBoolean("ContentFiltersActivity2.temporaryToggleState", this.m.isChecked());
        bundle.putString("ContentFiltersActivity2.oldContentFilterPref", this.z);
        bundle.putIntegerArrayList("ContentFiltersActivity2.shownConfirmationDialogsIndices", com.google.android.finsky.utils.cz.a(this.E));
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t
    public final void i_() {
        super.i_();
        if (this.D != null) {
            switch (this.D.getInt("ContentFiltersActivity2.onPinSuccess")) {
                case 1:
                    c(true);
                    break;
                case 2:
                    c(false);
                    break;
                case 3:
                    byte[] byteArray = this.D.getByteArray("ContentFiltersActivity2.filterRange");
                    try {
                        a(com.google.android.finsky.protos.ew.a(byteArray), this.D.getInt("ContentFiltersActivity2.filterRangeIndex"));
                        break;
                    } catch (InvalidProtocolBufferNanoException e) {
                        FinskyLog.b(e, "Cannot parse FilterRange proto from byte[] in arguments.", new Object[0]);
                        break;
                    }
            }
            this.D = null;
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 4 || i == 3) {
                String stringExtra = intent.getStringExtra("PinEntryDialog.resultPin");
                if (TextUtils.isEmpty(stringExtra)) {
                    FinskyLog.c("Create / confirm PIN result OK but no PIN sent back.", new Object[0]);
                    return;
                }
                com.google.android.finsky.utils.bg.g.a((com.google.android.finsky.c.o<String>) stringExtra);
                this.B = true;
                this.D = intent.getBundleExtra("PinEntryDialog.extraParams");
                return;
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    private void b(boolean z) {
        this.m.setChecked(z);
        if (z) {
            this.l.setText(getString(R.string.enable_content_filters));
            this.n.setVisibility(8);
            this.o.setVisibility(0);
        } else {
            this.l.setText(getString(R.string.disable_content_filters));
            this.n.setVisibility(0);
            this.o.setVisibility(8);
        }
    }

    private void c(boolean z) {
        b(z);
        d(z);
        if (!z) {
            com.google.android.finsky.utils.bg.g.c();
        }
        this.B = z;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        boolean z;
        this.q.setVisibility(8);
        ContentFilters.ContentFilterSettingsResponse contentFilterSettingsResponse = (ContentFilters.ContentFilterSettingsResponse) ((com.google.android.finsky.api.model.a) this.v).f1966b;
        com.google.android.finsky.protos.ds dsVar = contentFilterSettingsResponse.d;
        if (dsVar != null) {
            this.r.a(dsVar.f, dsVar.l, this.A.d);
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
        if (contentFilterSettingsResponse.c) {
            this.u.setText(Html.fromHtml(contentFilterSettingsResponse.f3575b));
            this.u.setMovementMethod(LinkMovementMethod.getInstance());
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
        if (contentFilterSettingsResponse.f && contentFilterSettingsResponse.h) {
            this.s.setText(Html.fromHtml(contentFilterSettingsResponse.e));
            this.t.setText(Html.fromHtml(contentFilterSettingsResponse.g));
            this.s.setVisibility(0);
            this.t.setVisibility(0);
        } else {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        }
        this.k.setOnClickListener(this);
        this.p.removeAllViews();
        com.google.android.play.image.e eVar = this.A.d;
        for (int i = 0; i < contentFilterSettingsResponse.f3574a.length; i++) {
            com.google.android.finsky.protos.ew ewVar = contentFilterSettingsResponse.f3574a[i];
            if (ewVar.c && ewVar.d != null) {
                View inflate = getLayoutInflater().inflate(R.layout.content_filters_line, this.p, false);
                inflate.setOnClickListener(new ba(this, ewVar, i));
                String str = ewVar.p;
                int i2 = ewVar.r;
                if (TextUtils.isEmpty(str)) {
                    z = true;
                } else {
                    int h = this.A.v.h(str);
                    z = h == -1 || h >= i2;
                }
                if (!z) {
                    inflate.setVisibility(8);
                } else {
                    inflate.setVisibility(0);
                }
                ((TextView) inflate.findViewById(R.id.vertical_name)).setText(ewVar.e);
                FifeImageView fifeImageView = (FifeImageView) inflate.findViewById(R.id.vertical_icon);
                if (ewVar.g != null) {
                    fifeImageView.a(ewVar.g.f, ewVar.g.l, eVar);
                    fifeImageView.setVisibility(0);
                } else {
                    fifeImageView.setVisibility(4);
                }
                com.google.android.finsky.protos.ev b2 = com.google.android.finsky.c.a.b(ewVar, this.y);
                if (b2 != null) {
                    ((TextView) inflate.findViewById(R.id.selected_filter_label)).setText(b2.j);
                }
                CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.vertical_checkbox);
                if (ewVar.n) {
                    com.google.android.finsky.protos.ev evVar = ewVar.d[1];
                    if (b2 != null && evVar.f3803b) {
                        checkBox.setChecked(b2.f3802a == evVar.f3802a);
                    } else {
                        checkBox.setChecked(evVar.h);
                    }
                    checkBox.setVisibility(0);
                } else {
                    checkBox.setVisibility(8);
                }
                this.p.addView(inflate);
                if (com.google.android.finsky.c.a.a(ewVar, this.y) == -1 && b2 != null) {
                    this.y = com.google.android.finsky.c.a.a(this.y, ewVar, b2);
                }
            }
        }
        com.google.android.finsky.utils.bg.e.a((com.google.android.finsky.c.o<Boolean>) true);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.q.setVisibility(8);
        String a2 = com.google.android.finsky.utils.aw.a(this, volleyError);
        gn gnVar = new gn();
        gnVar.a(a2).d(R.string.ok);
        gnVar.b().a(d(), "ContentFiltersActivity2.errorDialog");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.k) {
            if (this.B) {
                c(this.m.isChecked() ? false : true);
                return;
            }
            Bundle bundle = new Bundle();
            if (this.m.isChecked()) {
                bundle.putInt("ContentFiltersActivity2.onPinSuccess", 2);
                a(bundle, false);
            } else {
                bundle.putInt("ContentFiltersActivity2.onPinSuccess", 1);
                a(bundle, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle, boolean z) {
        String a2 = com.google.android.finsky.utils.bg.g.a();
        if (TextUtils.isEmpty(a2) || z) {
            startActivityForResult(PinEntryDialog.a(this, bundle), 3);
        } else {
            startActivityForResult(PinEntryDialog.a(this, R.string.pin_entry_label, R.string.pin_entry_summary, a2, bundle), 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.google.android.finsky.protos.ew ewVar, int i) {
        View childAt = this.p.getChildAt(i);
        if (ewVar.n) {
            int i2 = ((CheckBox) childAt.findViewById(R.id.vertical_checkbox)).isChecked() ? 0 : 1;
            if (!a(ewVar, i2, i)) {
                a(ewVar.d[i2], ewVar, childAt);
                return;
            }
            return;
        }
        byte[] a2 = com.google.protobuf.nano.c.a(ewVar);
        Bundle bundle = new Bundle();
        bundle.putByteArray("ContentFiltersActivity2.filterRange", a2);
        bundle.putInt("ContentFiltersActivity2.filterRangeIndex", i);
        gn gnVar = new gn();
        gnVar.b(R.layout.content_filters_dialog_view).a(null, 2, bundle);
        if (ewVar.i) {
            gnVar.c(ewVar.h);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("ContentFiltersDialogView.contentFilterSelections", com.google.android.finsky.c.a.a(this.y));
        bundle2.putByteArray("ContentFiltersDialogView.encodedFilterRange", a2);
        gnVar.a(bundle2);
        bd bdVar = new bd();
        gnVar.a(bdVar);
        bdVar.a(d(), "ContentFiltersActivity2.selectionDialog");
    }

    private void a(com.google.android.finsky.protos.ev evVar, com.google.android.finsky.protos.ew ewVar, View view) {
        if (evVar.k) {
            ((TextView) view.findViewById(R.id.selected_filter_label)).setText(evVar.j);
        }
        if (ewVar.n) {
            ((CheckBox) view.findViewById(R.id.vertical_checkbox)).performClick();
        }
        this.y = com.google.android.finsky.c.a.a(this.y, ewVar, evVar);
        d(this.m.isChecked());
    }

    private void d(boolean z) {
        com.google.android.finsky.c.a.a(z, (ContentFilters.ContentFilterSettingsResponse) ((com.google.android.finsky.api.model.a) this.v).f1966b, this.y, com.google.android.finsky.utils.bg.d, com.google.android.finsky.utils.bg.c);
        String a2 = com.google.android.finsky.utils.bg.c.a();
        Integer valueOf = Integer.valueOf(com.google.android.finsky.c.c.a(this).a());
        Iterator<Account> it = this.A.y.a().iterator();
        while (it.hasNext()) {
            this.A.b(it.next().name).a().a(valueOf.intValue(), a2);
        }
        sendBroadcast(new Intent("com.google.android.finsky.action.CONTENT_FILTERS_CHANGED"));
        this.A.b((String) null).f(new bb(this), new bc(this));
    }

    private boolean a(com.google.android.finsky.protos.ew ewVar, int i, int i2) {
        if ((ewVar.j.isEmpty() && ewVar.l.isEmpty()) || this.E.contains(Integer.valueOf(i2))) {
            return false;
        }
        gn gnVar = new gn();
        if (!TextUtils.isEmpty(ewVar.j)) {
            gnVar.c(ewVar.j);
        }
        if (!TextUtils.isEmpty(ewVar.l)) {
            gnVar.a(ewVar.l);
        }
        gnVar.a(322, null, -1, -1, null);
        gnVar.d(R.string.ok).a(true);
        Bundle bundle = new Bundle();
        bundle.putInt("ContentFiltersActivity2.selectedChoiceIndex", i);
        bundle.putByteArray("ContentFiltersActivity2.filterRange", com.google.protobuf.nano.c.a(ewVar));
        bundle.putInt("ContentFiltersActivity2.filterRangeIndex", i2);
        gnVar.a(null, 1, bundle);
        gnVar.b().a(d(), "ContentFiltersActivity2.confirmationDialog");
        return true;
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 1) {
            int i2 = bundle.getInt("ContentFiltersActivity2.selectedChoiceIndex");
            byte[] byteArray = bundle.getByteArray("ContentFiltersActivity2.filterRange");
            int i3 = bundle.getInt("ContentFiltersActivity2.filterRangeIndex");
            this.E.add(Integer.valueOf(i3));
            try {
                com.google.android.finsky.protos.ew a2 = com.google.android.finsky.protos.ew.a(byteArray);
                a(a2.d[i2], a2, this.p.getChildAt(i3));
                return;
            } catch (InvalidProtocolBufferNanoException e) {
                FinskyLog.b(e, "Cannot parse FilterRange proto from byte[] in arguments.", new Object[0]);
                return;
            }
        }
        if (i == 2) {
            int i4 = bundle.getInt("ContentFiltersDialogView.selectedChoiceIndex");
            byte[] byteArray2 = bundle.getByteArray("ContentFiltersActivity2.filterRange");
            int i5 = bundle.getInt("ContentFiltersActivity2.filterRangeIndex");
            try {
                com.google.android.finsky.protos.ew a3 = com.google.android.finsky.protos.ew.a(byteArray2);
                if (!a(a3, i4, i5)) {
                    a(a3.d[i4], a3, this.p.getChildAt(i5));
                }
            } catch (InvalidProtocolBufferNanoException e2) {
                FinskyLog.a(e2, "Cannot parse FilterRange proto from byte[] in arguments.", new Object[0]);
            }
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }
}
