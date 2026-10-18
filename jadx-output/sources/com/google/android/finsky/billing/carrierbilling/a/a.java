package com.google.android.finsky.billing.carrierbilling.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.r;
import android.text.TextUtils;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.ao;
import com.google.android.finsky.billing.carrierbilling.b.f;
import com.google.android.finsky.billing.carrierbilling.b.g;
import com.google.android.finsky.billing.carrierbilling.b.h;
import com.google.android.finsky.billing.carrierbilling.b.i;
import com.google.android.finsky.billing.carrierbilling.b.o;
import com.google.android.finsky.billing.carrierbilling.b.p;
import com.google.android.finsky.billing.j;
import com.google.android.finsky.billing.k;
import com.google.android.finsky.protos.bv;
import com.google.android.finsky.protos.bw;
import com.google.android.finsky.protos.ca;
import com.google.android.finsky.protos.cc;
import com.google.android.finsky.protos.cd;
import com.google.android.finsky.protos.ce;
import com.google.android.finsky.protos.cf;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bh;
import java.io.File;
import org.json.JSONObject;
import org.keyczar.Encrypter;
import org.keyczar.SignedSessionEncrypter;
import org.keyczar.Signer;
import org.keyczar.util.Base64Coder;

/* loaded from: classes.dex */
public final class a extends ao implements s, t<ca>, g, i, p {
    private static final String c;
    private static final String d;
    private static final String e;
    private String A;
    private String B;
    private final com.google.android.finsky.billing.g f;
    private final com.google.android.finsky.a.i g;
    private final com.google.android.finsky.api.b h;
    private int i;
    private String j;
    private f k;
    private h l;
    private o m;
    private int n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private com.google.android.finsky.billing.carrierbilling.a.a.a s;
    private bw t;
    private boolean u;
    private boolean v;
    private String w;
    private String x;
    private io y;
    private String z;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ca caVar) {
        String string;
        ca caVar2 = caVar;
        j();
        if (caVar2.f3661a == 1) {
            this.r = false;
            this.q = true;
            if (caVar2.d != null && caVar2.d.c) {
                this.v = true;
                this.A = caVar2.d.f3669a.f3671a;
                this.B = caVar2.d.f3669a.c;
            }
            f();
            return;
        }
        if (caVar2.f3661a == 3) {
            string = FinskyApp.a().getString(R.string.associating_device_timeout_message);
        } else if (caVar2.f3661a == 2) {
            if (!TextUtils.isEmpty(caVar2.e)) {
                string = caVar2.e;
            } else {
                string = FinskyApp.a().getString(R.string.device_association_failed);
            }
        } else {
            string = FinskyApp.a().getString(R.string.generic_purchase_completion_error);
        }
        a(string);
    }

    static {
        bh.a();
        c = "keys" + File.separator + "dcb-pin-sign";
        d = "keys" + File.separator + "dcb-pin-encrypt-v1";
        e = "keys" + File.separator + "dcb-pin-encrypt-v2";
    }

    public a(com.google.android.finsky.billing.g gVar, com.google.android.finsky.api.b bVar, j jVar, com.google.android.finsky.a.i iVar, Bundle bundle) {
        super(gVar, jVar, bundle);
        this.n = 0;
        this.f = gVar;
        this.h = bVar;
        this.g = iVar;
        this.i = 0;
        this.y = (io) ParcelableProto.a(bundle, "dcb_instrument");
        if (this.y.n != null) {
            cd cdVar = this.y.n;
            this.u = cdVar.d;
            if (cdVar.f != null) {
                this.o = cdVar.f.f4050a;
                this.p = cdVar.f.c;
            }
            this.r = cdVar.f3668b;
            if (cdVar.k != null) {
                this.w = cdVar.k.c;
                this.x = cdVar.k.f3866a;
            }
            if (cdVar.f3667a != null) {
                this.v = cdVar.f3667a.c;
                if (this.v) {
                    this.A = cdVar.f3667a.f3669a.f3671a;
                    this.B = cdVar.f3667a.f3669a.c;
                }
            }
            if (cdVar.j) {
                this.z = cdVar.i;
            }
            if (this.v && TextUtils.isEmpty(this.z)) {
                FinskyLog.e("Carrier name is empty. Can't proceed with the flow.", new Object[0]);
                a(FinskyApp.a().getString(R.string.generic_purchase_completion_error));
            }
        }
    }

    @Override // com.google.android.finsky.billing.f
    public final void a() {
        f();
    }

    protected final void f() {
        while (this.i == 0) {
            if (!this.r) {
                this.i = 1;
            } else {
                this.m = o.a(this.h.c());
                this.m.ai = this;
                this.f.a((r) this.m, "verifying pin");
                this.s = new com.google.android.finsky.billing.carrierbilling.a.a.b(this.h, this.w, this.x, null, false);
                this.s.a(this, this);
                return;
            }
        }
        if (this.i == 1) {
            if (this.v) {
                this.l = h.a(this.h.c(), this.A, this.z);
                this.l.ai = this;
                this.f2204b.a((r) this.l, "TosDialog" + this.n);
                this.n++;
                return;
            }
            if (this.q) {
                this.i = 3;
                this.f.b(R.string.saving);
                cc ccVar = new cc();
                ccVar.f3665a = k.b();
                ccVar.f3666b = true;
                if (!TextUtils.isEmpty(this.B)) {
                    ce ceVar = new ce();
                    ceVar.f3669a = new cf();
                    ceVar.f3669a.c = this.B;
                    ceVar.f3669a.d = true;
                    ccVar.m = ceVar;
                }
                bv bvVar = new bv();
                bvVar.f3653a = this.y;
                bvVar.f3653a.m = ccVar;
                this.h.a(bvVar, new b(this), this);
                return;
            }
            if (this.u) {
                this.i = 2;
                i();
                return;
            } else {
                a(false, (Bundle) null);
                return;
            }
        }
        if (this.i == 3) {
            this.f.S_();
            if (this.t == null) {
                FinskyLog.c("Failed to get update instrument response.", new Object[0]);
                a(FinskyApp.a().getString(R.string.generic_purchase_completion_error));
                return;
            } else {
                if (this.t.f3655a == 0) {
                    if (this.u) {
                        this.i = 2;
                        i();
                        return;
                    } else {
                        a(false, (Bundle) null);
                        return;
                    }
                }
                FinskyLog.c("Updating DCB instrument failed.", new Object[0]);
                a(FinskyApp.a().getString(R.string.generic_purchase_completion_error));
                return;
            }
        }
        if (this.i == 2) {
            h();
            Bundle bundle = new Bundle();
            bundle.putString("encrypted_passphrase", this.j);
            super.a(false, bundle);
            return;
        }
        throw new IllegalStateException("Unexpected state: " + this.i);
    }

    private void h() {
        if (this.k == null) {
            return;
        }
        this.k.a(false);
        this.k = null;
    }

    @Override // com.google.android.finsky.billing.f
    public final void a(Bundle bundle) {
        if (this.i != 0) {
            throw new IllegalStateException();
        }
        this.i = bundle.getInt("state");
        if (this.i == 3) {
            if (this.u) {
                this.i = 2;
                i();
            } else {
                a(false, (Bundle) null);
            }
        }
        this.v = bundle.getBoolean("tos_required");
        if (bundle.containsKey("tos_version")) {
            this.B = bundle.getString("tos_version");
        }
        if (bundle.containsKey("tos_url")) {
            this.A = bundle.getString("tos_url");
        }
        if (bundle.containsKey("tos_fragment")) {
            this.l = (h) this.f.a(bundle, "tos_fragment");
            this.l.ai = this;
        }
        if (bundle.containsKey("password_fragment")) {
            this.k = (f) this.f.a(bundle, "password_fragment");
            this.k.ai = this;
        }
        if (bundle.containsKey("verify_association_dialog")) {
            this.m = (o) this.f.a(bundle, "verify_association_dialog");
            this.m.ai = this;
            this.s = new com.google.android.finsky.billing.carrierbilling.a.a.b(this.h, this.w, this.x, null, false);
            this.s.a(bundle, this, this);
        }
    }

    @Override // com.google.android.finsky.billing.f
    public final void b(Bundle bundle) {
        bundle.putInt("state", this.i);
        if (this.l != null) {
            this.f.a(bundle, "tos_fragment", this.l);
        }
        if (this.k != null) {
            this.f.a(bundle, "password_fragment", this.k);
        }
        if (this.m != null) {
            this.f.a(bundle, "verify_association_dialog", this.m);
            if (this.s != null) {
                this.s.a(bundle);
                this.s.a();
            }
        }
        bundle.putBoolean("tos_required", this.v);
        if (this.v) {
            bundle.putString("tos_version", this.B);
            bundle.putString("tos_url", this.A);
        }
    }

    private void i() {
        this.k = f.a(this.h.c(), this.o, this.p);
        this.k.ai = this;
        this.f2204b.a((r) this.k, "PasswordDialog");
    }

    private void j() {
        if (this.m == null) {
            return;
        }
        this.m.a(false);
        this.m = null;
    }

    @Override // com.google.android.finsky.billing.carrierbilling.b.g
    public final void a(int i, String str, Context context) {
        String str2;
        if (i != 0) {
            h();
        }
        switch (i) {
            case 0:
                try {
                    int intValue = com.google.android.finsky.c.d.ao.b().intValue();
                    switch (intValue) {
                        case 0:
                        default:
                            FinskyLog.a("Unrecognized passphrase key version %d, using default", Integer.valueOf(intValue));
                        case -1:
                        case 2:
                            str2 = e;
                            break;
                        case 1:
                            str2 = d;
                            break;
                    }
                    FinskyLog.a("Using passphrase key path: %s", str2);
                    Resources resources = context.getResources();
                    SignedSessionEncrypter signedSessionEncrypter = new SignedSessionEncrypter(new Encrypter(new com.google.android.finsky.api.a.a(resources, str2)), new Signer(new com.google.android.finsky.api.a.a(resources, c)));
                    String newSession = signedSessionEncrypter.newSession();
                    byte[] encrypt = signedSessionEncrypter.encrypt(str.getBytes());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("efeData", newSession);
                    jSONObject.put("fieldData", Base64Coder.encodeWebSafe(encrypt));
                    this.j = jSONObject.toString();
                } catch (Exception e2) {
                    FinskyLog.c("Exception thrown: %s", e2);
                }
                if (TextUtils.isEmpty(this.j)) {
                    a(FinskyApp.a().getString(R.string.generic_purchase_completion_error));
                }
                f();
                break;
            case 1:
                FinskyLog.a("Getting password info failed.", new Object[0]);
                a(FinskyApp.a().getString(R.string.generic_purchase_completion_error));
                break;
            case 2:
                c();
                break;
            default:
                FinskyLog.e("enum %d", Integer.valueOf(i));
                break;
        }
    }

    @Override // com.google.android.finsky.billing.carrierbilling.b.i
    public final void a(int i) {
        if (this.l != null) {
            this.l.a(false);
            this.l = null;
        }
        switch (i) {
            case 0:
                this.q = true;
                this.v = false;
                f();
                break;
            case 1:
                FinskyLog.a("Showing TOS to user failed.", new Object[0]);
                a(FinskyApp.a().getString(R.string.generic_purchase_completion_error));
                break;
            case 2:
                c();
                break;
            default:
                FinskyLog.e("enum %d", Integer.valueOf(i));
                break;
        }
    }

    @Override // com.google.android.finsky.billing.carrierbilling.b.p
    public final void g() {
        if (this.s != null) {
            this.s.a();
        }
        c();
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        h();
        if (this.s != null) {
            this.s.a();
        }
        j();
        a(FinskyApp.a().getString(R.string.generic_purchase_completion_error));
    }
}
