package com.google.android.finsky.billing.storedvalue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ae;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.ah;
import com.google.android.finsky.e.u;
import com.google.android.finsky.e.v;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.layout.r;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.protos.py;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aw;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class StoredValueTopUpActivity extends ae implements AdapterView.OnItemClickListener, gp, v, r {
    private a k;
    private View l;
    private ListView m;
    private Document[] n;
    private ButtonBar o;
    private int p = 0;
    private String q;
    private String r;

    public static Intent a(String str, py pyVar) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) StoredValueTopUpActivity.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("list_url", pyVar.d);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.billing_topup_chooser);
        this.l = findViewById(R.id.loading_indicator);
        this.m = (ListView) findViewById(R.id.choices);
        this.o = (ButtonBar) findViewById(R.id.button_bar);
        this.o.setPositiveButtonTitle(R.string.ok);
        this.o.setNegativeButtonTitle(R.string.cancel);
        this.o.setClickListener(this);
        g();
        this.r = getIntent().getStringExtra("authAccount");
        if (bundle == null) {
            this.k = a.a(this.r, getIntent().getStringExtra("list_url"));
            d().a().a(this.k, "list_sidecar").b();
        } else {
            this.q = bundle.getString("selected_document_formatted_amount");
            this.p = bundle.getInt("last_shown_error");
            this.k = (a) d().a("list_sidecar");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("last_shown_error", this.p);
        bundle.putString("selected_document_formatted_amount", this.q);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        this.k.a((v) this);
        if (this.k.as == 0) {
            a aVar = this.k;
            aVar.f2437a.q();
            aVar.a(1, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        this.k.a((v) null);
        super.onStop();
    }

    @Override // com.google.android.finsky.e.v
    public final void a(u uVar) {
        String string;
        this.l.setVisibility(8);
        this.m.setVisibility(8);
        this.o.setVisibility(4);
        int i = uVar.as;
        if (i == 2) {
            this.n = ((d) this.k.f2437a).f1970a.b();
            ArrayList a2 = cz.a(this.n.length);
            for (Document document : this.n) {
                a2.add(document.f1963a.i);
            }
            this.m.setAdapter((ListAdapter) new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, a2));
            this.m.setItemsCanFocus(false);
            this.m.setChoiceMode(1);
            this.m.setOnItemClickListener(this);
            this.m.setVisibility(0);
            this.o.setVisibility(0);
            g();
            return;
        }
        if (i == 1) {
            this.l.setVisibility(0);
            return;
        }
        if (uVar.as == 3) {
            if (this.p == uVar.au) {
                FinskyLog.a("Already showed error %d, ignoring.", Integer.valueOf(this.p));
                return;
            }
            this.p = uVar.au;
            if (uVar.at == 0) {
                string = aw.a(FinskyApp.a(), this.k.f2438b);
            } else {
                string = uVar.at == 1 ? FinskyApp.a().getString(R.string.topup_not_available) : null;
            }
            if (string != null) {
                gn gnVar = new gn();
                gnVar.a(string).d(R.string.ok).a(null, 0, null);
                gnVar.b().a(d(), "error_dialog");
            } else {
                FinskyLog.c("Received error without error message.", new Object[0]);
                setResult(0);
                finish();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        g();
    }

    private void g() {
        this.o.setPositiveButtonEnabled(this.m.getCheckedItemPosition() != -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            Intent intent2 = new Intent();
            if (i2 == -1) {
                Toast.makeText(this, getString(R.string.topup_success, new Object[]{this.q}), 0).show();
            }
            setResult(i2, intent2);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        Document document = this.n[this.m.getCheckedItemPosition()];
        ea d = document.d(1);
        if (d == null) {
            FinskyLog.c("Document selected without PURCHASE offer. Ignoring.", new Object[0]);
            return;
        }
        this.q = d.h;
        ah a2 = PurchaseParams.a().a(document);
        a2.d = 1;
        startActivityForResult(PurchaseActivity.a(com.google.android.finsky.api.a.a(this.r, this), a2.a(), document.f1963a.R, (Bundle) null), 1);
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        setResult(0);
        finish();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 0) {
            setResult(0);
            finish();
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }
}
