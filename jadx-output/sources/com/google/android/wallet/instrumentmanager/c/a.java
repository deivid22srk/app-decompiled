package com.google.android.wallet.instrumentmanager.c;

import android.R;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.wallet.common.a.o;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.common.util.m;
import com.google.android.wallet.instrumentmanager.e;
import com.google.android.wallet.instrumentmanager.f;
import com.google.android.wallet.instrumentmanager.ui.b.h;
import com.google.android.wallet.instrumentmanager.ui.redirect.PopupRedirectActivity;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.y;
import com.google.b.a.a.a.b.a.a.a.b;
import com.google.b.a.a.a.b.a.a.b.a.p;
import com.google.b.a.a.a.b.a.a.b.a.q;
import com.google.b.a.a.a.b.a.a.b.a.u;
import com.google.b.a.a.a.b.a.b.ae;
import com.google.b.a.a.a.b.a.b.r;
import com.google.b.a.a.a.b.b.c;
import com.google.b.a.a.a.b.b.d;
import com.google.b.a.a.a.b.b.g;
import com.google.b.a.a.a.b.b.k;
import com.google.b.a.a.a.b.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends com.google.android.wallet.common.pub.a<com.google.android.wallet.instrumentmanager.d.a> {
    protected boolean aH;
    private l aL;
    private d aM;
    private c aN;
    private boolean aO;
    private String aP;

    public static a a(Account account, byte[] bArr, byte[] bArr2, int i, Bundle bundle) {
        if (account == null) {
            throw new IllegalArgumentException("Account is a required parameter");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Common token is a required parameter");
        }
        if (bArr2.length == 0) {
            throw new IllegalArgumentException("Action token is a required parameter");
        }
        a aVar = new a();
        Bundle a2 = a(i, account, bundle);
        a2.putByteArray("commonToken", bArr);
        a2.putByteArray("actionToken", bArr2);
        aVar.f(a2);
        return aVar;
    }

    @Override // com.google.android.wallet.common.pub.a, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.aL = (l) m.a(this.r.getByteArray("commonToken"), l.class);
        if (bundle == null) {
            k kVar = (k) m.a(this.r.getByteArray("actionToken"), k.class);
            m.a(kVar, "actionToken=");
            this.aq = kVar.f7725b.f7709b;
            this.as = kVar.f7725b.c;
            this.aN = kVar.f7724a;
            switch (kVar.f7725b.f) {
                case 1:
                    this.aM = kVar.f7725b.d;
                    return;
                case 2:
                case 3:
                default:
                    throw new IllegalArgumentException(new StringBuilder(52).append("Unknown initializePage flow instruction: ").append(kVar.f7725b.f).toString());
                case 4:
                    this.aM = kVar.f7725b.d;
                    this.aO = true;
                    this.aP = kVar.f7725b.g;
                    if (i.a(e(), this.aM.f7713b) == null) {
                        a(this.aP, !K());
                        return;
                    }
                    return;
            }
        }
        this.aM = (d) ParcelableProto.a(bundle, "page");
        this.aN = (c) ParcelableProto.a(bundle, "instrumentManagerParameters");
        this.aH = bundle.getBoolean("hasAutoSubmittedForPage");
        this.aO = bundle.getBoolean("queuedIsFlowComplete");
        this.aP = bundle.getString("queuedInstrumentId");
    }

    @Override // com.google.android.wallet.common.pub.a, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        if (this.aO && i.a(e(), this.aM.f7713b) == null) {
            a(this.aP, !K());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final ah E() {
        ah aVar;
        if (com.google.android.wallet.instrumentmanager.b.a.a.a(this.aM.l) && Build.VERSION.SDK_INT < 14) {
            throw new IllegalStateException("Redirect form is not supported on API < 14.");
        }
        if (com.google.android.wallet.instrumentmanager.b.a.a.a(this.aM.l) && this.aM.l.f.f == 2) {
            if (!this.an) {
                throw new IllegalStateException("Server requested popup redirect form, but popup UI is not supported.");
            }
            b(PopupRedirectActivity.a(f(), this.aM.l.f, this.aM.f7712a, this.am, this.aI, this.aq.c), 501);
            aVar = com.google.android.wallet.instrumentmanager.ui.redirect.a.a(this.aM.l.f, this.aI);
        } else if (this.aM.l != null) {
            aVar = com.google.android.wallet.instrumentmanager.b.a.a.a(this.aM.l, this.aI);
        } else if (this.aM.m != null) {
            p pVar = this.aM.m;
            int i = this.aI;
            aVar = new h();
            aVar.f(h.a(i, pVar));
        } else if (this.aM.k != null) {
            b bVar = this.aM.k;
            int i2 = this.aI;
            if (bVar.f7556b != null && bVar.c != null && !com.google.android.wallet.common.util.b.a(bVar.c.n, 1)) {
                throw new IllegalArgumentException("Customer form with both a legal country selector and a legal address form containing a country selector is not supported");
            }
            aVar = new com.google.android.wallet.instrumentmanager.ui.c.a();
            aVar.f(com.google.android.wallet.instrumentmanager.ui.c.a.a(i2, bVar));
        } else {
            throw new IllegalStateException("No top level form specified");
        }
        h().a().b(e.sub_form_holder, aVar).b();
        return aVar;
    }

    @Override // com.google.android.wallet.common.pub.a, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("page", ParcelableProto.a(this.aM));
        bundle.putParcelable("instrumentManagerParameters", ParcelableProto.a(this.aN));
        bundle.putBoolean("hasAutoSubmittedForPage", this.aH);
        bundle.putBoolean("queuedIsFlowComplete", this.aO);
        bundle.putString("queuedInstrumentId", this.aP);
    }

    @Override // com.google.android.wallet.common.pub.a, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.aO || view.getId() != e.positive_btn || this.aA != null) {
            super.onClick(view);
        } else {
            com.google.android.wallet.common.b.a.a.a(this.f, -1, 1621);
            a(this.aP, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void H() {
        com.google.b.a.a.a.b.b.i iVar = ((com.google.android.wallet.instrumentmanager.d.a) this.ap).ai;
        g gVar = ((com.google.android.wallet.instrumentmanager.d.a) this.ap).aj;
        if (iVar != null) {
            switch (iVar.e) {
                case 1:
                    this.aH = false;
                    this.aM = iVar.g;
                    u();
                    v();
                    return;
                case 2:
                    a(4, Bundle.EMPTY);
                    return;
                case 3:
                    a(iVar.f, false);
                    return;
                default:
                    throw new IllegalArgumentException(new StringBuilder(46).append("Unknown savePage flow instruction: ").append(iVar.e).toString());
            }
        }
        if (gVar != null) {
            switch (gVar.d) {
                case 1:
                    this.aH = false;
                    this.aM = gVar.e;
                    u();
                    v();
                    return;
                default:
                    throw new IllegalArgumentException(new StringBuilder(49).append("Unknown refreshPage flow instruction: ").append(gVar.d).toString());
            }
        }
        throw new IllegalStateException("Sidecar successful but no response was found");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final boolean I() {
        com.google.b.a.a.a.b.a.k kVar;
        com.google.b.a.a.a.b.b.i iVar = ((com.google.android.wallet.instrumentmanager.d.a) this.ap).ai;
        switch (((com.google.android.wallet.instrumentmanager.d.a) this.ap).g) {
            case 4:
                a(iVar.f7722a.c);
                return true;
            case 5:
                if (iVar != null) {
                    kVar = iVar.f7722a;
                } else {
                    kVar = ((com.google.android.wallet.instrumentmanager.d.a) this.ap).aj.f7718a;
                }
                String f_ = f_(R.string.ok);
                if (this.aM.i && kVar.f7707b == 1) {
                    f_ = f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_retry);
                    this.aH = false;
                }
                c(com.google.android.wallet.common.util.e.a(new Bundle(), kVar.f7707b, f_(com.google.android.wallet.instrumentmanager.g.wallet_im_error_title), kVar.f7706a, null, kVar.d, f_));
                return true;
            case 1000:
                c(com.google.android.wallet.common.util.e.a(new Bundle(), 500, f_(com.google.android.wallet.instrumentmanager.g.wallet_im_error_title), f_(com.google.android.wallet.instrumentmanager.g.wallet_im_send_sms_for_dcb_error), null, null, f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_retry)));
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void J() {
        com.google.b.a.a.a.b.b.i iVar = ((com.google.android.wallet.instrumentmanager.d.a) this.ap).ai;
        g gVar = ((com.google.android.wallet.instrumentmanager.d.a) this.ap).aj;
        if (iVar != null) {
            this.aq = iVar.f7723b;
            this.as = iVar.c;
        } else if (gVar != null) {
            this.aq = gVar.f7719b;
            this.as = gVar.c;
        }
    }

    @Override // com.google.android.wallet.common.pub.a, com.google.android.wallet.ui.common.ag
    public final void a(int i, Bundle bundle) {
        switch (i) {
            case 3:
                if (((com.google.android.wallet.instrumentmanager.d.a) this.ap).f != 1) {
                    String string = bundle.getString("FormEventListener.EXTRA_FORM_ID");
                    int i2 = bundle.getInt("FormEventListener.EXTRA_FIELD_ID");
                    for (com.google.b.a.a.a.b.a.b bVar : this.aM.h) {
                        if (i2 == bVar.f7651b && com.google.android.wallet.common.util.g.a(string, bVar.f7650a)) {
                            a(bundle, (byte[]) null, bVar);
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                super.a(i, bundle);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void a(boolean z) {
        if (this.al != f.fragment_instrument_manager_full_screen) {
            super.a(z);
            return;
        }
        boolean z2 = (this.d.getVisibility() == 0 || this.h.getVisibility() == 0) ? false : true;
        if (z) {
            if (z2) {
                this.h.setVisibility(0);
            } else if (!this.aD) {
                bj.b(this.d, 0);
                bj.a(this.h, 0);
            }
            this.aD = true;
        } else {
            if (z2) {
                this.d.setVisibility(0);
            } else if (this.aD) {
                bj.a(this.d, 0);
                bj.b(this.h, 0);
            }
            this.aD = false;
        }
        if (z && !TextUtils.isEmpty(this.aB)) {
            this.g.a(this.aB, null, null);
            if (z2) {
                this.g.setVisibility(0);
            } else if (!this.aE) {
                bj.b(this.c, 0);
                bj.a(this.g, 0);
            }
            this.aE = true;
        } else {
            this.aB = null;
            if (z2) {
                this.c.setVisibility(0);
            } else if (this.aE) {
                bj.a(this.c, 0);
                bj.b(this.g, 0);
            }
            this.aE = false;
        }
        if (z && !TextUtils.isEmpty(this.aC)) {
            this.i.setText(this.aC);
            if (z2) {
                this.i.setVisibility(0);
            } else if (!this.aF) {
                bj.b(this.f7284a, 0);
                bj.a(this.i, 0);
            }
            this.aF = true;
            return;
        }
        this.aC = null;
        if (z2) {
            this.f7284a.setVisibility(0);
        } else if (this.aF) {
            bj.a(this.f7284a, 0);
            bj.a(this.i, 0, 0);
        }
        this.aF = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void a(int[] iArr, Bundle bundle, byte[] bArr) {
        if (!this.f.b(iArr)) {
            com.google.android.wallet.common.b.a.a.a(this.f, 1623);
            this.f.c();
            return;
        }
        this.au = bundle;
        this.av = bArr;
        com.google.b.a.a.a.b.b.h hVar = new com.google.b.a.a.a.b.b.h();
        hVar.f7721b = this.aN;
        hVar.c = a(bundle, bArr);
        a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void a(Bundle bundle, byte[] bArr, com.google.b.a.a.a.b.a.b bVar) {
        this.au = bundle;
        this.av = bArr;
        com.google.b.a.a.a.b.b.f fVar = new com.google.b.a.a.a.b.b.f();
        fVar.f7717b = a(bundle, bArr);
        if (bVar != null) {
            fVar.c = (com.google.b.a.a.a.b.a.b) m.a(bVar);
        }
        a(fVar);
    }

    private com.google.b.a.a.a.b.b.e a(Bundle bundle, byte[] bArr) {
        com.google.b.a.a.a.b.b.e eVar = new com.google.b.a.a.a.b.b.e();
        if (this.f instanceof h) {
            h hVar = (h) this.f;
            String a2 = i.a(hVar.d.getText().toString());
            q qVar = new q();
            qVar.f7589a = hVar.c.getExpMonth();
            qVar.f7590b = hVar.c.getExpYear();
            qVar.c = a2;
            eVar.c = qVar;
        } else if (this.f instanceof com.google.android.wallet.instrumentmanager.ui.c.a) {
            com.google.android.wallet.instrumentmanager.ui.c.a aVar = (com.google.android.wallet.instrumentmanager.ui.c.a) this.f;
            com.google.b.a.a.a.b.a.a.a.c cVar = new com.google.b.a.a.a.b.a.a.a.c();
            if (aVar.c != null) {
                cVar.d = o.a(aVar.c.getSelectedRegionCode());
            }
            if (aVar.f7339a != null) {
                cVar.c = aVar.f7339a.c;
            }
            int size = aVar.d.size();
            for (int i = 0; i < size; i++) {
                y yVar = aVar.d.get(i).f7482b;
                if (yVar instanceof com.google.android.wallet.ui.c.a) {
                    com.google.android.wallet.ui.c.a aVar2 = (com.google.android.wallet.ui.c.a) yVar;
                    com.google.b.a.a.a.b.a.a.e.b bVar = (com.google.b.a.a.a.b.a.a.e.b) aVar2.ax.get(aVar2.ay);
                    int length = bVar.c.length;
                    com.google.b.a.a.a.b.a.a.e.c cVar2 = new com.google.b.a.a.a.b.a.a.e.c();
                    cVar2.f7622a = bVar.f7620a;
                    cVar2.f7623b = new ae[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        cVar2.f7623b[i2] = bj.a(aVar2.b(i2), bVar.c[i2]);
                    }
                    cVar.e = cVar2;
                } else if (yVar instanceof com.google.android.wallet.ui.address.b) {
                    cVar.f7558b = ((com.google.android.wallet.ui.address.b) yVar).L();
                } else {
                    cVar.f7557a = com.google.android.wallet.instrumentmanager.b.a.a.a(yVar, bundle);
                }
            }
            eVar.f7714a = cVar;
        } else {
            eVar.f7715b = com.google.android.wallet.instrumentmanager.b.a.a.a(this.f, bundle);
        }
        if (bArr != null) {
            eVar.d = bArr;
        }
        return eVar;
    }

    @Override // com.google.android.wallet.analytics.e
    public final com.google.android.wallet.analytics.f getUiElement() {
        return new com.google.android.wallet.analytics.f(1620, this.aq.c);
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<com.google.android.wallet.analytics.e> getChildren() {
        ArrayList arrayList = new ArrayList();
        if (this.aM.d != null) {
            arrayList.add(this.ai);
        }
        arrayList.add(this.f);
        return arrayList;
    }

    private void a(com.google.b.a.a.a.b.b.h hVar) {
        PendingIntent pendingIntent;
        this.ao = hVar;
        Map<String, String> a2 = i.a(this.as.f7702a);
        if (this.aM.l != null && this.aM.l.f7601b != null) {
            u uVar = this.aM.l.f7601b;
            com.google.android.wallet.instrumentmanager.d.a aVar = (com.google.android.wallet.instrumentmanager.d.a) this.ap;
            String str = uVar.f7593a;
            String str2 = uVar.f7594b;
            com.google.b.a.a.a.b.a.f fVar = this.aq;
            com.google.android.wallet.common.util.p pVar = new com.google.android.wallet.common.util.p(aVar.f().getApplicationContext(), new com.google.android.wallet.instrumentmanager.d.b(aVar, fVar.c));
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("SMS destination address must be provided");
            }
            if (!com.google.android.wallet.common.util.l.a(pVar.f7304a, "android.permission.SEND_SMS")) {
                Log.d("SmsSender", "Sending an SMS text requires the SEND_SMS permission.");
                pVar.a(5);
            } else {
                if (pVar.f7305b != null) {
                    pendingIntent = PendingIntent.getBroadcast(pVar.f7304a, 0, new Intent("com.google.android.wallet.SMS_SENT_ACTION"), 0);
                    pVar.f7304a.registerReceiver(new com.google.android.wallet.common.util.q(pVar), new IntentFilter("com.google.android.wallet.SMS_SENT_ACTION"));
                } else {
                    pendingIntent = null;
                }
                SmsManager.getDefault().sendTextMessage(str, null, str2, pendingIntent, null);
            }
            aVar.a(hVar, fVar, a2, new com.google.android.wallet.instrumentmanager.d.f(aVar, pVar), new com.google.android.wallet.instrumentmanager.d.e(aVar, fVar.c, pVar), com.google.android.wallet.instrumentmanager.d.a.i);
            aVar.ak = true;
            return;
        }
        com.google.android.wallet.instrumentmanager.d.a aVar2 = (com.google.android.wallet.instrumentmanager.d.a) this.ap;
        com.google.b.a.a.a.b.a.f fVar2 = this.aq;
        aVar2.a(hVar, fVar2, a2, new com.google.android.wallet.instrumentmanager.d.d(aVar2), new com.google.android.wallet.common.d.c(aVar2, fVar2.c), null);
    }

    private void a(com.google.b.a.a.a.b.b.f fVar) {
        this.ao = fVar;
        Map<String, String> a2 = i.a(this.as.f7703b);
        com.google.android.wallet.instrumentmanager.d.a aVar = (com.google.android.wallet.instrumentmanager.d.a) this.ap;
        com.google.b.a.a.a.b.a.f fVar2 = this.aq;
        if (fVar.f7716a != null) {
            throw new IllegalArgumentException("RefreshPageRequest's RequestContext should not be set by the caller");
        }
        com.google.android.wallet.common.d.c cVar = new com.google.android.wallet.common.d.c(aVar, fVar2.c);
        com.google.android.wallet.instrumentmanager.a.a.a aVar2 = new com.google.android.wallet.instrumentmanager.a.a.a(aVar.d, fVar, a2, fVar2.f7701b, new com.google.android.wallet.instrumentmanager.d.c(aVar), cVar);
        cVar.f7275a = aVar2;
        aVar.a((com.android.volley.l<?>) aVar2, true);
        com.google.android.wallet.common.b.a.a.a(722, 1, fVar2.c);
        aVar.ak = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void G() {
        if (this.ao instanceof com.google.b.a.a.a.b.b.h) {
            com.google.b.a.a.a.b.b.h hVar = (com.google.b.a.a.a.b.b.h) this.ao;
            hVar.c = a(this.au, this.av);
            a(hVar);
        } else if (this.ao instanceof com.google.b.a.a.a.b.b.f) {
            com.google.b.a.a.a.b.b.f fVar = (com.google.b.a.a.a.b.b.f) this.ao;
            fVar.f7717b = a(this.au, this.av);
            a(fVar);
        } else {
            String name = this.ao != null ? this.ao.getClass().getName() : null;
            String valueOf = String.valueOf("retryLastRequest() called with invalid last request. Unexpected request class: ");
            String valueOf2 = String.valueOf(name);
            throw new IllegalStateException(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final String w() {
        return this.aM.f7712a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final com.google.b.a.a.a.b.a.b.p x() {
        return this.aM.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final String y() {
        return this.aM.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final String z() {
        return this.aM.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final com.google.b.a.a.a.b.a.b.e A() {
        return this.aM.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final com.google.d.b.a.a.b.b B() {
        return this.aM.f7713b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final com.google.b.a.a.a.b.a.a.h C() {
        return this.aM.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final r D() {
        return this.aM.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final boolean K() {
        return this.aM.i && !this.aH;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void L() {
        if (!this.aO && this.aG && K() && this.f.v()) {
            this.aB = this.aM.g;
            this.aC = this.aM.f;
            this.aH = true;
            a((int[]) null, Bundle.EMPTY, (byte[]) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void M() {
        if (this.aO) {
            a(this.aP, !K());
        }
    }

    private void a(String str, boolean z) {
        Bundle bundle;
        if (!TextUtils.isEmpty(str)) {
            bundle = new Bundle();
            bundle.putString("com.google.android.wallet.instrumentmanager.INSTRUMENT_ID", str);
        } else {
            bundle = Bundle.EMPTY;
        }
        a(50, bundle, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final /* synthetic */ com.google.android.wallet.instrumentmanager.d.a F() {
        return com.google.android.wallet.instrumentmanager.d.a.b(this.ax, this.aL.f7727b);
    }
}
