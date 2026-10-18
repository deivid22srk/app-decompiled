package com.google.android.wallet.instrumentmanager.ui.b;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.by;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.common.apkg.o;
import com.google.android.wallet.instrumentmanager.ui.common.ImInfoMessageTextView;
import com.google.android.wallet.ui.address.p;
import com.google.android.wallet.ui.address.q;
import com.google.android.wallet.ui.address.t;
import com.google.android.wallet.ui.card.CardImagesView;
import com.google.android.wallet.ui.common.ExpDateEditText;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.InfoMessageTextView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.as;
import com.google.android.wallet.ui.common.bh;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.bq;
import com.google.android.wallet.ui.common.k;
import com.google.android.wallet.ui.creditcard.CreditCardNumberEditText;
import com.google.b.a.a.a.b.a.apkg.bpkg.apkg.m;
import com.google.b.a.a.a.b.a.apkg.bpkg.apkg.n;
import com.google.b.a.a.a.b.a.bpkg.x;
import com.google.b.a.a.a.b.a.bpkg.z;
import com.google.b.a.a.a.b.a.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ah<n> implements View.OnClickListener, View.OnFocusChangeListener, AdapterView.OnItemClickListener, com.google.android.wallet.analytics.e, com.google.android.wallet.nfc.b, com.google.android.wallet.nfc.c, p, q, t, as, com.google.android.wallet.ui.common.e, com.google.android.wallet.ui.creditcard.e {
    private Intent aB;
    private CreditCardEntryAction aD;
    private Drawable aL;
    private TextWatcher aM;
    private TextWatcher aN;
    TextView ai;
    View aj;
    public ExpDateEditText ak;
    public FormEditText al;
    ImageView am;
    View an;
    View ao;
    ImageView ap;
    View[] aq;
    ImInfoMessageTextView ar;
    public com.google.android.wallet.ui.address.b as;
    View at;

    /* renamed from: b, reason: collision with root package name */
    public g f7330b;
    public com.google.b.a.a.a.b.a.apkg.cpkg.b c;
    com.google.android.wallet.nfc.e e;
    boolean f;
    RelativeLayout g;
    CardImagesView h;
    public CreditCardNumberEditText i;

    /* renamed from: a, reason: collision with root package name */
    int f7329a = 0;
    private final com.google.android.wallet.analytics.f aC = new com.google.android.wallet.analytics.f(1650);
    int d = 0;
    private boolean aE = true;
    private int aF = 0;
    private int aG = 0;
    private boolean aH = true;
    final ArrayList<ai> au = new ArrayList<>();

    public static a a(n nVar, int i) {
        a aVar = new a();
        aVar.f(a(i, nVar));
        return aVar;
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.ak
    public final boolean b(int[] iArr) {
        boolean z;
        boolean b2 = super.b(iArr);
        if (this.aD.d || TextUtils.isEmpty(this.i.getError())) {
            z = false;
        } else {
            this.aD.d = true;
            z = true;
        }
        if (!this.aD.i && !TextUtils.isEmpty(this.ak.getError())) {
            this.aD.i = true;
            z = true;
        }
        if (z) {
            J();
        }
        if (Build.VERSION.SDK_INT >= 14 && !b2) {
            a(5, false);
        }
        return b2;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai> w() {
        return this.au;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        if (jVar.f7704a.f7650a.equals(((n) this.aw).f7583a)) {
            switch (jVar.f7704a.f7651b) {
                case 1:
                    this.i.setError(jVar.f7705b);
                    if (!this.aD.d) {
                        this.aD.d = true;
                        J();
                        break;
                    }
                    break;
                case 2:
                    this.al.setError(jVar.f7705b);
                    break;
                case 3:
                    this.ak.setError(jVar.f7705b);
                    if (!this.aD.i) {
                        this.aD.i = true;
                        J();
                        break;
                    }
                    break;
                case 4:
                    this.ak.setError(jVar.f7705b);
                    if (!this.aD.i) {
                        this.aD.i = true;
                        J();
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException(new StringBuilder(45).append("Unknown FormFieldMessage fieldId: ").append(jVar.f7704a.f7651b).toString());
            }
            if (Build.VERSION.SDK_INT >= 14) {
                a(5, false);
            }
            return true;
        }
        return this.as.a(jVar);
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.y
    public final boolean a(String str, int i) {
        return this.as.a(str, i);
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.i == null) {
            return;
        }
        boolean z = this.av;
        this.i.setEnabled(z);
        this.ak.setEnabled(z);
        this.al.setEnabled(z);
        this.an.setEnabled(z);
        this.as.b(z);
        this.am.setEnabled(z);
        this.ar.setEnabled(z);
        if (this.ao != null) {
            this.ao.setEnabled(z);
        }
        if (this.ap != null) {
            this.ap.setEnabled(z);
        }
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        if (this.as == null) {
            return false;
        }
        switch (this.f7329a) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int D() {
        return Build.VERSION.SDK_INT < 14 ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r8) {
        /*
            r7 = this;
            r6 = 1
            r1 = 0
            super.a(r8)
            if (r8 == 0) goto L25
            java.lang.String r0 = "selectedRegionCode"
            int r0 = r8.getInt(r0, r1)
            r7.d = r0
            int r0 = r7.d
            if (r0 == 0) goto L25
            T extends com.google.protobuf.nano.c r0 = r7.aw
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.n r0 = (com.google.b.a.a.a.b.a.apkg.bpkg.apkg.n) r0
            com.google.b.a.a.a.b.a.apkg.cpkg.e r0 = r0.g
            int r2 = r7.d
            java.lang.String r2 = com.google.android.wallet.common.apkg.o.a(r2)
            com.google.b.a.a.a.b.a.apkg.cpkg.b r0 = com.google.android.wallet.common.util.i.a(r0, r2)
            r7.c = r0
        L25:
            T extends com.google.protobuf.nano.c r0 = r7.aw
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.n r0 = (com.google.b.a.a.a.b.a.apkg.bpkg.apkg.n) r0
            int[] r3 = r0.m
            int r4 = r3.length
            r2 = r1
        L2d:
            if (r2 >= r4) goto L63
            r0 = r3[r2]
            r5 = 6
            if (r0 == r5) goto L36
            if (r0 != r6) goto Ld4
        L36:
            android.view.ContextThemeWrapper r2 = r7.aJ
            int[] r3 = new int[r6]
            int r4 = com.google.android.wallet.instrumentmanager.b.internalUicCcOcrTheme
            r3[r1] = r4
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3)
            int r3 = r2.getInt(r1, r1)
            r2.recycle()
            com.google.android.gms.ocr.a r2 = new com.google.android.gms.ocr.a
            android.support.v4.app.t r4 = r7.f()
            r2.<init>(r4)
            com.google.android.gms.ocr.a r2 = r2.a(r3)
            android.content.Intent r2 = r2.a()
            r7.aB = r2
            android.content.Intent r2 = r7.aB
            if (r2 != 0) goto L61
            r0 = r1
        L61:
            r7.aF = r0
        L63:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 10
            if (r0 < r2) goto L85
            android.support.v4.app.t r0 = r7.f()
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r0)
            if (r0 == 0) goto L85
            T extends com.google.protobuf.nano.c r0 = r7.aw
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.n r0 = (com.google.b.a.a.a.b.a.apkg.bpkg.apkg.n) r0
            int[] r0 = r0.n
            int r2 = r0.length
        L7a:
            if (r1 >= r2) goto L85
            r3 = r0[r1]
            if (r3 == r6) goto L83
            r4 = 2
            if (r3 != r4) goto Ld9
        L83:
            r7.aG = r3
        L85:
            boolean r0 = r7.G()
            if (r0 == 0) goto Ldc
            com.google.android.wallet.nfc.f r0 = new com.google.android.wallet.nfc.f
            android.support.v4.app.t r1 = r7.f()
            r0.<init>(r1, r7)
        L94:
            r7.e = r0
            if (r8 == 0) goto La2
            java.lang.String r0 = "creditCardEntryAction"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = (com.google.android.wallet.analytics.CreditCardEntryAction) r0
            r7.aD = r0
        La2:
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aD
            if (r0 != 0) goto Ld3
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = new com.google.android.wallet.analytics.CreditCardEntryAction
            r0.<init>()
            r7.aD = r0
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aD
            boolean r1 = r7.E()
            r0.f7232a = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aD
            boolean r1 = r7.G()
            r0.q = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aD
            com.google.android.wallet.nfc.e r1 = r7.e
            boolean r1 = r1.c()
            r0.r = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aD
            int r1 = r7.aF
            r0.x = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aD
            int r1 = r7.aG
            r0.y = r1
        Ld3:
            return
        Ld4:
            int r0 = r2 + 1
            r2 = r0
            goto L2d
        Ld9:
            int r1 = r1 + 1
            goto L7a
        Ldc:
            com.google.android.wallet.nfc.g r0 = new com.google.android.wallet.nfc.g
            r0.<init>()
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.instrumentmanager.ui.b.a.a(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.google.android.wallet.instrumentmanager.f.fragment_add_credit_card, (ViewGroup) null, false);
        this.g = (RelativeLayout) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.credit_card_root);
        if (!TextUtils.isEmpty(((n) this.aw).f7584b)) {
            TextView textView = (TextView) this.g.findViewById(com.google.android.wallet.instrumentmanager.e.add_credit_card_title);
            textView.setText(((n) this.aw).f7584b);
            textView.setVisibility(0);
        }
        int length = ((n) this.aw).c.length;
        com.google.b.a.a.a.b.a.bpkg.p[] pVarArr = new com.google.b.a.a.a.b.a.bpkg.p[length];
        for (int i = 0; i < length; i++) {
            pVarArr[i] = ((n) this.aw).c[i].f7582b;
        }
        this.h = (CardImagesView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.credit_card_images);
        this.h.a(pVarArr, com.google.b.a.a.a.b.a.bpkg.p.b(), false);
        this.ai = (TextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.card_number_concealed);
        this.i = (CreditCardNumberEditText) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.card_number);
        this.aj = inflate.findViewById(com.google.android.wallet.instrumentmanager.e.exp_date_and_cvc);
        this.ak = (ExpDateEditText) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.exp_date);
        this.al = (FormEditText) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.cvc);
        this.al.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.au.add(new ai(0, this.i, null));
        this.au.add(new ai(0, this.ak, null));
        this.am = (ImageView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.cvc_hint);
        this.am.setOnClickListener(this);
        if (this.aG == 1) {
            this.ap = (ImageView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.nfc_icon);
            this.ap.setOnClickListener(this);
            this.ap.setVisibility(0);
        } else if (this.aG == 2) {
            CreditCardNumberEditText creditCardNumberEditText = this.i;
            if (creditCardNumberEditText.f == null) {
                creditCardNumberEditText.f = new k(com.google.android.wallet.e.c.uicNfcDrawable, creditCardNumberEditText.getResources().getString(com.google.android.wallet.e.j.wallet_uic_nfc_popup_title), 2);
                creditCardNumberEditText.a(creditCardNumberEditText.f);
            }
            this.i.setOnItemClickListener(this);
        }
        if (this.aF == 1) {
            this.ao = inflate.findViewById(com.google.android.wallet.instrumentmanager.e.ocr_icon);
            this.ao.setOnClickListener(this);
            this.ao.setVisibility(0);
        } else if (this.aF == 6) {
            CreditCardNumberEditText creditCardNumberEditText2 = this.i;
            if (creditCardNumberEditText2.e == null) {
                creditCardNumberEditText2.e = new k(com.google.android.wallet.e.c.uicCameraDrawable, creditCardNumberEditText2.getResources().getString(com.google.android.wallet.e.j.wallet_uic_ocr_drop_down_button), 1);
                creditCardNumberEditText2.a(creditCardNumberEditText2.e);
            }
            this.i.setOnItemClickListener(this);
        }
        this.an = inflate.findViewById(com.google.android.wallet.instrumentmanager.e.expand_icon);
        this.an.setOnClickListener(this);
        this.ar = (ImInfoMessageTextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.add_card_legal_message_text);
        this.ar.setParentUiNode(this);
        this.ar.setUrlClickListener(this);
        com.google.android.wallet.ui.card.q qVar = new com.google.android.wallet.ui.card.q(this.al, this.i);
        this.al.a(qVar);
        this.au.add(new ai(0, this.al, null));
        x xVar = new x();
        xVar.d = false;
        xVar.f = f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_exp_date);
        xVar.n = new z();
        xVar.n.f7696a = 2;
        xVar.n.f7697b = new com.google.b.a.a.a.a.d();
        xVar.n.f7697b.f7554b = ((n) this.aw).h;
        xVar.n.f7697b.f7553a = ((n) this.aw).i;
        xVar.n.c = new com.google.b.a.a.a.a.d();
        xVar.n.c.f7554b = ((n) this.aw).j;
        xVar.n.c.f7553a = ((n) this.aw).k;
        bj.a(xVar, this.ak);
        this.al.a(qVar, this.al, true);
        this.i.a(this.i, this.i, false);
        this.al.a(new b(this));
        this.i.setOnCardNumberChangedListener(this);
        this.i.setAllowedCardTypes(((n) this.aw).c);
        this.i.setInvalidBins(((n) this.aw).d);
        this.at = inflate.findViewById(com.google.android.wallet.instrumentmanager.e.address_fragment_holder);
        this.as = (com.google.android.wallet.ui.address.b) h().a(com.google.android.wallet.instrumentmanager.e.address_fragment_holder);
        if (this.as == null) {
            this.as = bj.a(((n) this.aw).e, this.aI);
            h().a().a(com.google.android.wallet.instrumentmanager.e.address_fragment_holder, this.as).b();
        }
        this.au.add(new ai(0, this.as));
        this.as.an = this;
        this.as.as = this;
        this.as.ar = this;
        this.as.at = this;
        u();
        this.aq = new View[]{this.g, this.h, this.i, this.ai, this.an, this.ao, this.ap, this.aj, this.at, this.ar};
        a(bundle != null ? bundle.getInt("viewState", 3) : 1, false);
        this.aM = new c(this);
        this.aN = new d(this);
        return inflate;
    }

    @Override // com.google.android.wallet.ui.common.ah, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        this.e.a();
        boolean c = this.e.c();
        if (!this.e.d() && !this.aH && c) {
            a("tagNfcInfoDialog");
            F();
        }
        this.i.a();
        if (this.aD.r != c) {
            this.aD.r = c;
            J();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        super.p();
        this.e.b();
        this.aH = this.e.c();
    }

    @TargetApi(14)
    private void e(boolean z) {
        e eVar;
        if (!z) {
            this.at.setVisibility(0);
            this.ar.setVisibility(0);
            if (this.f7330b != null) {
                this.f7330b.a(true, false, 0, 0L);
            }
            if (Build.VERSION.SDK_INT >= 14) {
                this.an.setVisibility(0);
                this.i.setVisibility(8);
                if (this.ao != null) {
                    this.ao.setVisibility(8);
                }
                if (this.ap != null) {
                    this.ap.setVisibility(8);
                }
                this.ai.setVisibility(0);
                this.h.a();
                this.aj.setVisibility(8);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 14) {
            bj.a(this.at, 0);
            bj.a(this.ar, 0);
            if (this.f7330b != null) {
                this.f7330b.a(true, true, 0, 0L);
                return;
            }
            return;
        }
        a(150L);
        int a2 = bj.a(this.h);
        int a3 = bj.a(this.i);
        int a4 = bj.a(this.aj);
        this.h.a();
        bj.a(this.i, 0, -a2);
        if (this.ao != null && this.ao.getVisibility() == 0) {
            bj.a(this.ao, 0, -a2);
        }
        if (this.ap != null && this.ap.getVisibility() == 0) {
            bj.a(this.ap, 0, -a2);
        }
        bj.a(this.ai, a2);
        bj.a(this.an, a2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.aj.getLayoutParams();
        bj.a(layoutParams, bj.a(3), by.h(this.aj));
        layoutParams.addRule(bj.a(10));
        bj.a(this.aj, a2 + a3, 0);
        ((RelativeLayout.LayoutParams) this.at.getLayoutParams()).addRule(bj.a(3), this.h.getId());
        int i = a3 + a4;
        View findViewById = this.at.findViewById(com.google.android.wallet.instrumentmanager.e.address_field_recipient);
        if (!(findViewById instanceof FormEditText)) {
            eVar = null;
        } else {
            FormEditText formEditText = (FormEditText) findViewById;
            int threshold = formEditText.getThreshold();
            formEditText.setThreshold(Integer.MAX_VALUE);
            eVar = new e(this, formEditText, threshold);
        }
        bj.a(this.at, i, eVar);
        bj.a(this.ar, i);
        if (this.f7330b != null) {
            this.f7330b.a(true, true, i, 150L);
        }
        a(0L);
    }

    @TargetApi(14)
    private void f(boolean z) {
        if (Build.VERSION.SDK_INT < 14) {
            throw new IllegalStateException(new StringBuilder(62).append("Can not switch ui to expanded state for api level: ").append(Build.VERSION.SDK_INT).toString());
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams.leftMargin = g().getDimensionPixelSize(com.google.android.wallet.instrumentmanager.d.wallet_im_credit_card_number_collapsed_start_margin);
        layoutParams.addRule(bj.a(3), com.google.android.wallet.instrumentmanager.e.add_credit_card_title);
        this.i.setLayoutParams(layoutParams);
        if (this.ao != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ao.getLayoutParams();
            layoutParams2.addRule(bj.a(3), com.google.android.wallet.instrumentmanager.e.add_credit_card_title);
            this.ao.setLayoutParams(layoutParams2);
        }
        if (this.ap != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.ap.getLayoutParams();
            layoutParams3.addRule(bj.a(3), com.google.android.wallet.instrumentmanager.e.add_credit_card_title);
            this.ap.setLayoutParams(layoutParams3);
        }
        if (z) {
            a(150L);
            bj.a(this.ai, 0, 0);
            bj.a(this.an, 0, 0);
            bj.a(this.i, 0);
            if (this.ao != null) {
                bj.a(this.ao, 0);
            }
            if (this.ap != null) {
                bj.a(this.ap, 0);
            }
        } else {
            this.ai.setVisibility(8);
            this.an.setVisibility(8);
            this.i.setVisibility(0);
            this.i.setTranslationY(0.0f);
            this.i.setAlpha(1.0f);
            if (this.ao != null) {
                this.ao.setVisibility(0);
                this.ao.setTranslationY(0.0f);
                this.ao.setAlpha(1.0f);
            }
            if (this.ap != null) {
                this.ap.setVisibility(0);
                this.ap.setTranslationY(0.0f);
                this.ap.setAlpha(1.0f);
            }
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.aj.getLayoutParams();
        bj.a(layoutParams4, bj.a(10), by.h(this.aj));
        layoutParams4.addRule(bj.a(3), this.i.getId());
        int i = -bj.a(this.ai);
        if (z) {
            bj.a(this.aj, i);
        } else {
            this.aj.setVisibility(0);
            this.aj.setTranslationY(0.0f);
            this.aj.setAlpha(1.0f);
        }
        ((RelativeLayout.LayoutParams) this.at.getLayoutParams()).addRule(bj.a(3), this.aj.getId());
        if (z) {
            this.at.setTranslationY(i);
            this.at.animate().translationY(0.0f).start();
            this.ar.setTranslationY(i);
            this.ar.animate().translationY(0.0f).start();
            if (this.f7330b != null) {
                this.f7330b.a(i);
            }
            a(0L);
        }
    }

    @TargetApi(14)
    private void a(long j) {
        if (Build.VERSION.SDK_INT >= 14) {
            int length = this.aq.length;
            for (int i = 0; i < length; i++) {
                if (this.aq[i] != null) {
                    this.aq[i].animate().setStartDelay(j);
                }
            }
        }
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("viewState", this.f7329a);
        bundle.putInt("selectedRegionCode", this.d);
        bundle.putParcelable("creditCardEntryAction", this.aD);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == com.google.android.wallet.instrumentmanager.e.expand_icon) {
            a(5, true);
            return;
        }
        if (view.getId() == com.google.android.wallet.instrumentmanager.e.ocr_icon) {
            H();
            return;
        }
        if (view.getId() == com.google.android.wallet.instrumentmanager.e.nfc_icon) {
            I();
        } else if (view.getId() == com.google.android.wallet.instrumentmanager.e.cvc_hint && this.B.a("tagCvcInfoDialog") == null) {
            i.b(this.aI).a(this.B, "tagCvcInfoDialog");
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = ((k) this.i.getAdapter().getItem(i)).c;
        if (i2 == 1) {
            H();
        } else {
            if (i2 == 2) {
                I();
                return;
            }
            throw new IllegalArgumentException(new StringBuilder(44).append("Unknown DropDownItem event type: ").append(i2).toString());
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    @TargetApi(14)
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            a(3, true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        if (i != 500) {
            super.a(i, i2, intent);
            return;
        }
        b(true);
        CreditCardOcrResult a2 = CreditCardOcrResult.a(intent);
        if (intent != null) {
            this.aD.f = intent.getBooleanExtra("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED", false);
        }
        this.aD.t = bj.b(i2);
        if (a2 != null) {
            a(a2.f6391b, a2.c, a2.d, "", -1L, 2);
        } else {
            a("", 0, -1, "", -1L, 2);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void g(Bundle bundle) {
        super.g(bundle);
        a(6, Bundle.EMPTY);
        this.i.addTextChangedListener(this.aM);
        this.ak.addTextChangedListener(this.aN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    public void a(int i, boolean z) {
        if (i > this.f7329a) {
            if (this.f7329a == 0) {
                switch (i) {
                    case 1:
                        if (this.ao != null) {
                            this.ao.setVisibility(0);
                        }
                        if (this.ap != null) {
                            this.ap.setVisibility(0);
                        }
                        this.aj.setVisibility(4);
                        this.i.a(new f(this));
                        if (this.f7330b != null) {
                            this.f7330b.a(false, false, 0, 0L);
                            break;
                        }
                        break;
                    case 2:
                        if (this.ao != null) {
                            this.ao.setVisibility(0);
                        }
                        if (this.ap != null) {
                            this.ap.setVisibility(0);
                        }
                        this.al.setOnFocusChangeListener(this);
                        this.am.setVisibility(8);
                        if (this.f7330b != null) {
                            this.f7330b.a(false, false, 0, 0L);
                            break;
                        }
                        break;
                    case 3:
                        if (this.ao != null) {
                            this.ao.setVisibility(0);
                        }
                        if (this.ap != null) {
                            this.ap.setVisibility(0);
                        }
                        if (this.f7330b != null) {
                            this.f7330b.a(false, false, 0, 0L);
                            break;
                        }
                        break;
                    case 4:
                        if (Build.VERSION.SDK_INT < 14 && this.ao != null) {
                            this.ao.setVisibility(0);
                        }
                        if (Build.VERSION.SDK_INT < 14 && this.ap != null) {
                            this.ap.setVisibility(0);
                        }
                        e(false);
                        break;
                    case 5:
                        this.at.setVisibility(0);
                        this.ar.setVisibility(0);
                        f(false);
                        if (this.f7330b != null) {
                            this.f7330b.a(true, false, 0, 0L);
                            break;
                        }
                        break;
                }
            } else if (this.f7329a == 1 && (i == 3 || i == 2)) {
                if (i == 2) {
                    this.am.setVisibility(8);
                    this.al.setOnFocusChangeListener(this);
                }
                if (z) {
                    bj.a(this.aj, -this.i.getHeight());
                } else {
                    this.aj.setVisibility(0);
                }
            } else if (this.f7329a == 4) {
                if (i == 5) {
                    f(z);
                }
            } else if (i == 4) {
                this.ai.setText(this.i.getConcealedCardNumber());
                e(true);
            } else if (this.f7329a == 2 && i == 3 && this.am.getVisibility() != 0) {
                bj.a(this.am, 0);
            }
            this.f7329a = i;
            K();
            a(1, Bundle.EMPTY);
        }
    }

    private boolean E() {
        return this.aF != 0;
    }

    @Override // com.google.android.wallet.nfc.b
    public final void b(Intent intent) {
        if (G() && !this.e.d()) {
            com.google.android.wallet.ui.a.b bVar = (com.google.android.wallet.ui.a.b) this.B.a("tagNfcInfoDialog");
            b(false);
            if (bVar != null) {
                bVar.w();
            } else {
                a("tagNfcErrorDialog");
                if (this.ap != null && this.f7329a != 4) {
                    this.f = true;
                    TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{com.google.android.wallet.instrumentmanager.b.uicNfcInProgressDrawable, com.google.android.wallet.instrumentmanager.b.uicNfcDrawable});
                    Drawable drawable = obtainStyledAttributes.getDrawable(0);
                    this.aL = obtainStyledAttributes.getDrawable(1);
                    obtainStyledAttributes.recycle();
                    this.ap.setImageDrawable(drawable);
                }
            }
            this.e.a(intent);
        }
    }

    private boolean G() {
        return this.aG != 0;
    }

    @Override // com.google.android.wallet.nfc.c
    public final void a(int i, com.google.android.wallet.nfc.a aVar, long j) {
        a("tagNfcInfoDialog");
        b(true);
        if (this.f) {
            this.f = false;
            this.ap.setImageDrawable(this.aL);
        }
        switch (i) {
            case 1:
                this.aD.v = 1;
                this.aD.w = 0;
                break;
            case 2:
                this.aD.v = 3;
                this.aD.w = 0;
                break;
            case 3:
            case 4:
                b(f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_nfc_unsupported_error_message));
                this.aD.v = 4;
                this.aD.w = 1;
                break;
            case 5:
                b(f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_nfc_transceive_error_message));
                this.aD.v = 4;
                this.aD.w = 2;
                break;
            case 6:
                b(f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_nfc_timeout_error_message));
                this.aD.v = 2;
                this.aD.w = 3;
                break;
            default:
                throw new IllegalStateException(new StringBuilder(36).append("Unknown NFC result code: ").append(i).toString());
        }
        if (aVar != null) {
            a(aVar.f7352a, aVar.f7353b, aVar.c, aVar.d, j, 3);
        } else {
            a("", 0, -1, "", j, 3);
        }
    }

    @Override // com.google.android.wallet.ui.address.q
    public final void x() {
        if (this.aD.l != 1) {
            this.aD.l = 1;
            J();
        }
    }

    @Override // com.google.android.wallet.ui.address.q
    public final void y() {
        if (!this.aD.n) {
            this.aD.n = true;
            J();
        }
    }

    private void a(String str, int i, int i2, String str2, long j, int i3) {
        int i4 = -1;
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = i > 0 && i < 13 && i2 >= 0;
        boolean z3 = !TextUtils.isEmpty(str2);
        if (z) {
            if (this.ai.getVisibility() == 0) {
                a(5, false);
            }
            this.aD.f7233b = i3;
            if (this.f7329a == 1) {
                i4 = D();
            }
            if (z2) {
                i4 = 3;
            }
            a(i4, false);
            this.i.requestFocus();
            this.i.removeTextChangedListener(this.aM);
            this.i.setText(str);
            this.i.addTextChangedListener(this.aM);
            if (z2) {
                this.aD.g = i3;
                this.ak.removeTextChangedListener(this.aN);
                this.ak.requestFocus();
                this.ak.a(Integer.toString(i), Integer.toString(i2 % 100));
                this.ak.addTextChangedListener(this.aN);
            }
            if (z3) {
                this.aD.l = i3;
                this.as.at = null;
                this.as.a(str2);
                this.as.at = this;
            }
        }
        if (i3 == 2) {
            this.aD.s = this.aD.s >= 0 ? this.aD.s + 1 : 1;
            this.aD.c = z;
            this.aD.h = z2;
            this.aD.m = z3;
        } else if (i3 == 3) {
            this.aD.u = this.aD.u >= 0 ? this.aD.u + 1 : 1;
            this.aD.e = z;
            this.aD.j = z2;
            this.aD.o = z3;
            if (j >= 0) {
                this.aD.p = j;
            }
        } else {
            throw new IllegalArgumentException(new StringBuilder(31).append("Unknown entry type: ").append(i3).toString());
        }
        J();
    }

    @Override // com.google.android.wallet.ui.creditcard.e
    public final void a(m mVar) {
        this.h.setCardIcon(mVar != null ? mVar.f7582b : null);
        this.al.setFilters(new InputFilter[]{new InputFilter.LengthFilter(mVar != null ? mVar.c : 4)});
        if (!TextUtils.isEmpty(this.al.getText())) {
            this.al.af_();
        }
    }

    @Override // com.google.android.wallet.ui.common.as
    public final void a(int i, int i2, boolean z) {
        if (this.d != i) {
            this.d = i;
            this.c = com.google.android.wallet.common.util.i.a(((n) this.aw).g, o.a(i));
            this.ar.setInfoMessage(this.c == null ? null : this.c.f7606a);
            a(6, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.wallet.ui.address.t
    @TargetApi(11)
    public final void a(float f) {
        this.ar.setTranslationY(this.at.getTranslationY() + f);
    }

    @Override // com.google.android.wallet.analytics.e
    public final com.google.android.wallet.analytics.f getUiElement() {
        return this.aC;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<com.google.android.wallet.analytics.e> getChildren() {
        ArrayList arrayList = new ArrayList();
        if (E()) {
            arrayList.add(new com.google.android.wallet.analytics.d(1652, this));
        }
        if (G()) {
            arrayList.add(new com.google.android.wallet.analytics.d(1655, this));
        }
        if (((com.google.android.wallet.ui.a.b) this.B.a("tagNfcInfoDialog")) != null) {
            arrayList.add(new com.google.android.wallet.analytics.d(1656, this));
        }
        if (this.c != null) {
            arrayList.add(this.ar);
        }
        return arrayList;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final boolean z() {
        return (((InfoMessageTextView) this.ar).f7455a || ((InfoMessageTextView) this.ar).f7456b) ? false : true;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void A() {
        this.ar.a(true);
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final String B() {
        return this.ar.getExpandLabel();
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if (view == this.ar && this.B.a("tagTosWebViewDialog") == null) {
            bq.a(str, this.aI).a(this.B, "tagTosWebViewDialog");
        }
    }

    private void H() {
        b(this.aB, 500);
        b(false);
        com.google.android.wallet.common.bpkg.a.a.a(this, -1, 1652);
        com.google.android.wallet.common.bpkg.a.a.a(new com.google.android.wallet.analytics.d(1653, null), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        Bundle bundle = new Bundle();
        bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_TYPE", 770);
        bundle.putParcelable("FormEventListener.EXTRA_BACKGROUND_EVENT_DATA", this.aD);
        a(7, bundle);
    }

    @Override // com.google.android.wallet.ui.address.p
    public final void a(boolean z) {
        this.aE = z;
        K();
    }

    private void K() {
        int i = (this.f7329a < 4 || !this.aE) ? -1 : com.google.android.wallet.instrumentmanager.e.address_field_recipient;
        if (Build.VERSION.SDK_INT >= 14) {
            this.al.setNextFocusForwardId(i);
        } else {
            this.al.setNextFocusDownId(i);
        }
    }

    private void a(String str) {
        Fragment a2 = this.B.a(str);
        if (a2 != null) {
            this.B.a().a(a2).b();
        }
    }

    private void F() {
        com.google.android.wallet.ui.a.b a2 = com.google.android.wallet.ui.a.b.a(this.aI, this.e.c());
        a2.a(this, 0);
        a2.a(this.B, "tagNfcInfoDialog");
    }

    private void b(String str) {
        if (this.B.a("tagNfcErrorDialog") == null) {
            bh bhVar = new bh();
            bhVar.f7509b = f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_nfc_error_title);
            bhVar.c = str;
            bhVar.g = this.aI;
            bhVar.f = f_(R.string.ok);
            bhVar.a().a(this.B, "tagNfcErrorDialog");
        }
    }

    private void I() {
        if (this.B.a("tagNfcInfoDialog") == null) {
            F();
            com.google.android.wallet.common.bpkg.a.a.a(this, -1, 1655);
            com.google.android.wallet.common.bpkg.a.a.a(this, -1);
        }
    }
}
