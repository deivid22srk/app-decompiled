package com.google.android.finsky.billing.switchfamilyinstrument;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.b;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c;
import com.google.android.finsky.e.u;
import com.google.android.finsky.e.v;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.layout.r;
import com.google.android.finsky.protos.hj;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.ParcelableProtoArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SwitchFamilyInstrumentActivity extends c implements AdapterView.OnItemClickListener, gp, v, r {
    private a k;
    private ListView l;
    private View m;
    private View n;
    private ButtonBar o;
    private io[] r;

    public static Intent a(String str, io[] ioVarArr) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) SwitchFamilyInstrumentActivity.class);
        intent.putExtra("SwitchFamilyInstrumentActivity.instruments", ParcelableProtoArray.a(ioVarArr));
        c.a(intent, str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.billing_family_instrument_chooser);
        this.l = (ListView) findViewById(R.id.choices);
        this.m = findViewById(R.id.progress_bar);
        this.n = findViewById(R.id.chooser_content);
        this.o = (ButtonBar) findViewById(R.id.button_bar);
        this.o.setPositiveButtonTitle(R.string.ok);
        this.o.setNegativeButtonTitle(R.string.cancel);
        this.o.setClickListener(this);
        this.r = (io[]) ParcelableProtoArray.a(getIntent(), "SwitchFamilyInstrumentActivity.instruments");
        ArrayList arrayList = new ArrayList(this.r.length);
        int i = -1;
        for (int i2 = 0; i2 < this.r.length; i2++) {
            if (this.r[i2].B != null) {
                i = i2;
            }
            this.q.b(802, this.r[i2].z, this);
            arrayList.add(i2, this.r[i2].c);
        }
        this.l.setAdapter((ListAdapter) new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, arrayList));
        this.l.setItemsCanFocus(false);
        this.l.setChoiceMode(1);
        this.l.setOnItemClickListener(this);
        if (i != -1) {
            this.l.setItemChecked(i, true);
        }
        g();
        i();
        if (bundle == null) {
            this.k = a.a(this.p);
            d().a().a(this.k, "SwitchFamilyInstrumentActivity.sidecar").b();
        } else {
            this.k = (a) d().a("SwitchFamilyInstrumentActivity.sidecar");
        }
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
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        this.k.a((v) null);
        super.onStop();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        g();
    }

    private void b(int i) {
        setResult(i);
        finish();
    }

    private void g() {
        this.o.setPositiveButtonEnabled(this.l.getCheckedItemPosition() != -1);
    }

    private void i() {
        this.m.setVisibility(4);
        this.n.setVisibility(0);
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        io ioVar = this.r[this.l.getCheckedItemPosition()];
        this.q.a(5201, ioVar.z, this);
        if (ioVar.B == null) {
            a aVar = this.k;
            FinskyApp.a().f(aVar.f2440b.c()).b(new b(345).f1473a);
            hj hjVar = new hj();
            hjVar.f3911a = ioVar;
            aVar.f2440b.a(hjVar, aVar, aVar);
            aVar.a(1, 0);
            return;
        }
        b(0);
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        b(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public final int f() {
        return 5200;
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 0) {
            i();
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.e.v
    public final void a(u uVar) {
        int i = uVar.as;
        if (i == 2) {
            b(-1);
            return;
        }
        if (i != 1) {
            if (uVar.as != 3) {
                return;
            }
            String str = this.k.f2439a;
            gn gnVar = new gn();
            gnVar.a(str).d(R.string.ok).a(null, 0, null);
            gnVar.b().a(d(), "SwitchFamilyInstrumentActivity.error_dialog");
            return;
        }
        this.n.setVisibility(4);
        this.m.setVisibility(0);
    }
}
