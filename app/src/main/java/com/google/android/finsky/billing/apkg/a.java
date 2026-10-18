package com.google.android.finsky.billing.apkg;

import android.os.Bundle;
import android.util.Base64;
import com.deivid22srk.store.R;
import com.google.android.finsky.protos.cj;
import com.google.android.finsky.protos.v;
import com.google.android.finsky.utils.ParcelableProto;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.billing.f implements g {
    public cj c;
    public b d;
    public boolean e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.google.android.finsky.billing.g gVar, com.google.android.finsky.billing.j jVar, cj cjVar, Bundle bundle) {
        super(gVar, jVar, bundle);
        boolean z = false;
        this.f = 0;
        this.c = cjVar;
        if (bundle != null && bundle.getBoolean("AddressChallengeFlow.finishOnSwitchCountry")) {
            z = true;
        }
        this.e = z;
        if (bundle != null && bundle.containsKey("AddressChallengeFlow.resultFormat")) {
            this.f = bundle.getInt("AddressChallengeFlow.resultFormat");
        }
    }

    @Override // com.google.android.finsky.billing.f
    public final void a() {
        this.d = b.a(this.f2203a.getString("authAccount"), this.c, this.f2203a.getByteArray("server_logs_cookie"), this.f2203a.getBundle("AddressChallengeFlow.previousState"));
        this.d.f2142a = this;
        this.f2204b.a(this.d, (String) null);
    }

    @Override // com.google.android.finsky.billing.f
    public final void a(Bundle bundle) {
        if (bundle.containsKey("address_widget")) {
            this.d = (b) this.f2204b.a(bundle, "address_widget");
            if (this.d == null) {
                return;
            }
            this.d.f2142a = this;
        }
    }

    @Override // com.google.android.finsky.billing.f
    public final void b(Bundle bundle) {
        if (this.d != null) {
            this.f2204b.a(bundle, "address_widget", this.d);
        }
    }

    @Override // com.google.android.finsky.billing.apkg.g
    public final void a(int i, v vVar, boolean[] zArr) {
        if (i == 2) {
            c();
            return;
        }
        if (i == 0) {
            Bundle bundle = new Bundle();
            if (this.f == 0) {
                bundle.putString(this.c.f3677a, Base64.encodeToString(com.google.protobuf.nano.c.a(vVar), 8));
            } else if (this.f == 1) {
                bundle.putParcelable("AddressChallengeFlow.address", ParcelableProto.a(vVar));
            }
            StringBuilder sb = new StringBuilder();
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < zArr.length; i2++) {
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append(String.valueOf(zArr[i2]));
                if (zArr[i2]) {
                    arrayList.add(this.c.i[i2].g);
                }
            }
            if (this.f == 0) {
                bundle.putString(this.c.c, sb.toString());
            } else {
                bundle.putStringArrayList("AddressChallengeFlow.checkedCheckboxes", arrayList);
            }
            super.a(false, bundle);
            return;
        }
        if (i == 1) {
            a((String) null);
        }
    }

    @Override // com.google.android.finsky.billing.apkg.g
    public final void a(String str, Bundle bundle) {
        if (this.e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("AddressChallengeFlow.switchCountry", str);
            bundle2.putBundle("AddressChallengeFlow.currentState", bundle);
            super.a(false, bundle2);
        }
    }

    @Override // com.google.android.finsky.billing.apkg.g
    public final void f() {
        this.f2204b.b(R.string.loading);
    }

    @Override // com.google.android.finsky.billing.apkg.g
    public final void g() {
        this.f2204b.S_();
    }
}
