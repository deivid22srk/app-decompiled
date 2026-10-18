package com.google.android.finsky.billing.apkg;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.layout.BillingAddress;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.aq;
import com.google.android.finsky.protos.cj;
import com.google.android.finsky.protos.cq;
import com.google.android.finsky.protos.cv;
import com.google.android.finsky.protos.db;
import com.google.android.finsky.protos.sa;
import com.google.android.finsky.protos.v;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends Fragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, gp, cy {

    /* renamed from: a, reason: collision with root package name */
    g f2142a;
    public String ai;
    public ai aj;
    public com.google.android.finsky.apkg.i ak;
    public Bundle al;

    /* renamed from: b, reason: collision with root package name */
    public aq f2143b;
    public Bundle c;
    public ViewGroup d;
    public Button e;
    public Button f;
    public BillingAddress g;
    public List<sa> h;
    public cj i;

    public static b a(String str, cj cjVar, byte[] bArr, Bundle bundle) {
        b bVar = new b();
        Bundle bundle2 = new Bundle();
        bundle2.putString("authAccount", str);
        bundle2.putParcelable("address_challenge", ParcelableProto.a(cjVar));
        bundle2.putByteArray("server_logs_cookie", bArr);
        bVar.f(bundle2);
        bVar.c = bundle;
        return bVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.ai = bundle2.getString("authAccount");
        this.i = (cj) ParcelableProto.a(bundle2, "address_challenge");
        byte[] byteArray = bundle2.getByteArray("server_logs_cookie");
        this.aj = com.google.android.finsky.apkg.i.a(1320);
        com.google.android.finsky.apkg.i.a(this.aj, byteArray);
        this.ak = FinskyApp.a().f(this.ai);
        if (bundle == null) {
            this.ak.a(0L, (cy) this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return null;
        }
        this.al = bundle;
        this.d = (ViewGroup) layoutInflater.inflate(R.layout.billing_addresschallenge_fragment, viewGroup, false);
        this.f2143b = new aq();
        int length = this.i.n.length;
        this.f2143b.c = new int[length];
        System.arraycopy(this.i.n, 0, this.f2143b.c, 0, length);
        if (!TextUtils.isEmpty(this.i.l) && bundle == null) {
            this.d.post(new c(this));
        }
        TextView textView = (TextView) this.d.findViewById(R.id.challenge_title);
        if (!TextUtils.isEmpty(this.i.e)) {
            textView.setText(this.i.e);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) this.d.findViewById(R.id.challenge_description);
        if (!TextUtils.isEmpty(this.i.g)) {
            textView2.setText(Html.fromHtml(this.i.g));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView2.setVisibility(8);
        }
        LayoutInflater from = LayoutInflater.from(f());
        ViewGroup viewGroup2 = (ViewGroup) this.d.findViewById(R.id.content);
        int indexOfChild = viewGroup2.indexOfChild(textView2) + 1;
        for (int i = 0; i < this.i.i.length; i++) {
            cv cvVar = this.i.i[i];
            CheckBox checkBox = (CheckBox) from.inflate(R.layout.billing_addresschallenge_checkbox, this.d, false);
            checkBox.setText(cvVar.f3701a);
            checkBox.setTag(cvVar);
            if (bundle == null && this.c == null) {
                checkBox.setChecked(cvVar.c);
            } else if (this.c != null) {
                checkBox.setChecked(this.c.getBoolean("checkbox_" + i));
            } else {
                checkBox.setChecked(bundle.getBoolean("checkbox_" + i));
            }
            checkBox.setOnCheckedChangeListener(this);
            viewGroup2.addView(checkBox, indexOfChild + i);
        }
        this.g = (BillingAddress) this.d.findViewById(R.id.billing_address);
        this.g.setBillingCountryChangeListener(new d(this));
        this.e = (Button) this.d.findViewById(R.id.positive_button);
        this.e.setOnClickListener(this);
        this.e.setEnabled(false);
        this.e.setText(R.string.continue_text);
        this.f = (Button) this.d.findViewById(R.id.negative_button);
        this.f.setOnClickListener(this);
        this.f.setText(R.string.cancel);
        if (this.i.o.length > 0) {
            u();
        } else {
            v();
        }
        return this.d;
    }

    public void u() {
        this.h = cz.a(this.i.o.length);
        for (cq cqVar : this.i.o) {
            sa saVar = new sa();
            saVar.f4367a = cqVar.f3691a;
            saVar.f4368b = true;
            saVar.c = cqVar.c;
            saVar.d = true;
            this.h.add(saVar);
        }
        w();
        i(this.al);
    }

    public void v() {
        if (this.f2142a != null) {
            this.f2142a.f();
        }
        new com.google.android.finsky.billing.ai().a(this.ai, new e(this));
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.i.i.length) {
                break;
            }
            bundle.putBoolean("checkbox_" + i2, ((CheckBox) this.d.findViewWithTag(this.i.i[i2])).isChecked());
            i = i2 + 1;
        }
        if (this.g != null) {
            this.g.a(bundle);
        }
    }

    public void i(Bundle bundle) {
        this.g.setBillingCountries(this.h);
        if (bundle != null) {
            this.g.b(bundle);
            return;
        }
        if (this.i.j != null && !TextUtils.isEmpty(this.i.j.q)) {
            this.g.a(u.a(this.i.j.q, this.h), this.f2143b, this.i.j);
        } else {
            this.g.a(u.a(u.a(f(), (String) null), this.h), this.f2143b, null);
        }
        new Handler(Looper.getMainLooper()).post(new f(this));
    }

    public void w() {
        boolean z = true;
        for (int i = 0; i < this.i.i.length; i++) {
            cv cvVar = this.i.i[i];
            z = z && (!cvVar.e || ((CheckBox) this.d.findViewWithTag(cvVar)).isChecked());
        }
        this.e.setEnabled(z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.negative_button /* 2131886371 */:
                this.ak.a(1322, (byte[]) null, this);
                this.f2142a.a(2, null, null);
                break;
            case R.id.positive_button /* 2131886372 */:
                List<db> addressValidationErrors = this.g.getAddressValidationErrors();
                this.g.a();
                ArrayList arrayList = new ArrayList();
                Iterator<db> it = addressValidationErrors.iterator();
                while (it.hasNext()) {
                    TextView a2 = this.g.a(it.next());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                TextView textView = (TextView) u.a(this.d, arrayList);
                if (textView != null) {
                    textView.requestFocus();
                }
                v address = addressValidationErrors.size() == 0 ? this.g.getAddress() : null;
                if (address != null) {
                    this.ak.a(1321, (byte[]) null, this);
                    g gVar = this.f2142a;
                    int length = this.i.i.length;
                    boolean[] zArr = new boolean[length];
                    for (int i = 0; i < length; i++) {
                        zArr[i] = ((CheckBox) this.d.findViewWithTag(this.i.i[i])).isChecked();
                    }
                    gVar.a(0, address, zArr);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        w();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        v();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        this.f2142a.a(2, null, null);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.aj;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    public static /* synthetic */ void e(b bVar) {
        if (bVar.q_()) {
            bVar.h = com.google.android.finsky.billing.k.f();
            if (bVar.h != null && bVar.h.size() > 0) {
                if (bVar.f2142a != null) {
                    bVar.f2142a.g();
                }
                bVar.w();
                bVar.i(bVar.al);
                return;
            }
            FinskyLog.a("BillingCountries not loaded.", new Object[0]);
            gn gnVar = new gn();
            gnVar.a(R.string.billing_countries_loading_failed).d(R.string.network_retry).e(R.string.cancel).a(bVar, 1, null);
            gnVar.b().a(bVar.B, "error");
        }
    }
}
