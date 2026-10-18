package com.google.android.wallet.ui.card;

import android.R;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ao;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.ui.common.ExpDateEditText;
import com.google.android.wallet.ui.common.FormHeaderView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.ap;
import com.google.android.wallet.ui.common.aq;
import com.google.android.wallet.ui.common.az;
import com.google.android.wallet.ui.common.bb;
import com.google.android.wallet.ui.common.bd;
import com.google.android.wallet.ui.common.bh;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.bq;
import com.google.b.a.a.a.b.a.b.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class a extends ah<com.google.b.a.a.a.b.a.a.b.a.d> implements View.OnClickListener, AdapterView.OnItemClickListener, com.google.android.wallet.nfc.b, com.google.android.wallet.nfc.c, com.google.android.wallet.ui.address.q, p, ap, bb, com.google.android.wallet.ui.common.e {
    private int[] aF;
    private boolean aG;
    private com.google.b.a.a.a.b.a.a.b.a.i aH;
    private Intent aM;
    private Drawable aQ;
    private CreditCardEntryAction aR;
    private TextWatcher aS;
    private TextWatcher aT;
    private TextWatcher aU;
    int[] ao;
    com.google.android.wallet.ui.common.b ap;
    com.google.android.wallet.nfc.e ar;
    boolean as;
    public com.google.android.wallet.analytics.a at;
    public com.google.android.wallet.analytics.b au;

    /* renamed from: b, reason: collision with root package name */
    RelativeLayout f7417b;
    CardImagesView c;
    public CardNumberEditText d;
    TextView e;
    View f;
    public View g;
    public ImageView h;
    CardLogoGridView i;
    private final com.google.android.wallet.analytics.f aB = new com.google.android.wallet.analytics.f(1654);
    private final ArrayList<com.google.android.wallet.analytics.e> aC = new ArrayList<>();
    private final ArrayList<com.google.android.wallet.analytics.e> aD = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<ArrayList<h>> f7416a = new ArrayList<>();
    final ArrayList<ViewGroup> ai = new ArrayList<>();
    public final ArrayList<View> aj = new ArrayList<>();
    public final ArrayList<com.google.android.wallet.ui.address.b> ak = new ArrayList<>();
    public final ArrayList<aq> al = new ArrayList<>();
    final ArrayList<View> am = new ArrayList<>();
    final ArrayList<com.google.android.wallet.ui.common.b> an = new ArrayList<>();
    private final ArrayList<ArrayList<Integer>> aE = new ArrayList<>();
    private final ArrayList<View> aL = new ArrayList<>();
    int aq = 1;
    private int aN = 0;
    private int aO = 0;
    private boolean aP = true;

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
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
            T extends com.google.protobuf.nano.c r0 = r7.aw
            com.google.b.a.a.a.b.a.a.b.a.d r0 = (com.google.b.a.a.a.b.a.a.b.a.d) r0
            int[] r3 = r0.g
            int r4 = r3.length
            r2 = r1
        Ld:
            if (r2 >= r4) goto L43
            r0 = r3[r2]
            r5 = 6
            if (r0 == r5) goto L16
            if (r0 != r6) goto Lb4
        L16:
            android.view.ContextThemeWrapper r2 = r7.aJ
            int[] r3 = new int[r6]
            int r4 = com.google.android.wallet.e.c.internalUicCcOcrTheme
            r3[r1] = r4
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3)
            int r3 = r2.getInt(r1, r1)
            r2.recycle()
            com.google.android.gms.ocr.a r2 = new com.google.android.gms.ocr.a
            android.support.v4.app.t r4 = r7.f()
            r2.<init>(r4)
            com.google.android.gms.ocr.a r2 = r2.a(r3)
            android.content.Intent r2 = r2.a()
            r7.aM = r2
            android.content.Intent r2 = r7.aM
            if (r2 != 0) goto L41
            r0 = r1
        L41:
            r7.aN = r0
        L43:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 10
            if (r0 < r2) goto L65
            android.support.v4.app.t r0 = r7.f()
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r0)
            if (r0 == 0) goto L65
            T extends com.google.protobuf.nano.c r0 = r7.aw
            com.google.b.a.a.a.b.a.a.b.a.d r0 = (com.google.b.a.a.a.b.a.a.b.a.d) r0
            int[] r0 = r0.h
            int r2 = r0.length
        L5a:
            if (r1 >= r2) goto L65
            r3 = r0[r1]
            if (r3 == r6) goto L63
            r4 = 2
            if (r3 != r4) goto Lb9
        L63:
            r7.aO = r3
        L65:
            boolean r0 = r7.I()
            if (r0 == 0) goto Lbc
            com.google.android.wallet.nfc.f r0 = new com.google.android.wallet.nfc.f
            android.support.v4.app.t r1 = r7.f()
            r0.<init>(r1, r7)
        L74:
            r7.ar = r0
            if (r8 == 0) goto L82
            java.lang.String r0 = "creditCardEntryAction"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = (com.google.android.wallet.analytics.CreditCardEntryAction) r0
            r7.aR = r0
        L82:
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aR
            if (r0 != 0) goto Lb3
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = new com.google.android.wallet.analytics.CreditCardEntryAction
            r0.<init>()
            r7.aR = r0
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aR
            boolean r1 = r7.H()
            r0.f7232a = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aR
            boolean r1 = r7.I()
            r0.q = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aR
            com.google.android.wallet.nfc.e r1 = r7.ar
            boolean r1 = r1.c()
            r0.r = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aR
            int r1 = r7.aN
            r0.x = r1
            com.google.android.wallet.analytics.CreditCardEntryAction r0 = r7.aR
            int r1 = r7.aO
            r0.y = r1
        Lb3:
            return
        Lb4:
            int r0 = r2 + 1
            r2 = r0
            goto Ld
        Lb9:
            int r1 = r1 + 1
            goto L5a
        Lbc:
            com.google.android.wallet.nfc.g r0 = new com.google.android.wallet.nfc.g
            r0.<init>()
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.card.a.a(android.os.Bundle):void");
    }

    @Override // com.google.android.wallet.ui.common.ah, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        this.ar.a();
        boolean c = this.ar.c();
        if (!this.ar.d() && !this.aP && c) {
            b("tagNfcInfoDialog");
            G();
        }
        this.d.a();
        if (this.aR.r != c) {
            this.aR.r = c;
            J();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        super.p();
        this.ar.b();
        this.aP = this.ar.c();
    }

    @Override // android.support.v4.app.Fragment
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            a(bundle.getInt("viewState", 1), false);
        }
        this.d.addTextChangedListener(this.aS);
        ArrayList<View> d = d(3);
        int size = d.size();
        for (int i = 0; i < size; i++) {
            View view = d.get(i);
            if (view instanceof TextView) {
                ((TextView) view).addTextChangedListener(this.aT);
            }
        }
        ArrayList<View> d2 = d(1);
        int size2 = d2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            View view2 = d2.get(i2);
            if (view2 instanceof TextView) {
                ((TextView) view2).addTextChangedListener(this.aU);
            }
        }
    }

    private com.google.android.wallet.ui.common.b a(int i, int i2) {
        h hVar = this.f7416a.get(i).get(i2);
        if (hVar.f7426a == 1) {
            KeyEvent.Callback e = bj.e(this.aj.get(hVar.f7427b));
            if (e instanceof com.google.android.wallet.ui.common.b) {
                return (com.google.android.wallet.ui.common.b) e;
            }
        } else if (hVar.f7426a == 2) {
            return this.al.get(hVar.f7427b);
        }
        throw new IllegalStateException(String.format(Locale.US, "Field (subform %s, field %s, type %s) is not an AutoAdvancer", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(hVar.f7426a)));
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("viewState", this.aq);
        bundle.putIntArray("revealBelowTriggeredCount", this.aF);
        bundle.putParcelable("creditCardEntryAction", this.aR);
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        this.aD.clear();
        this.f7416a.clear();
        this.ai.clear();
        this.aj.clear();
        this.ak.clear();
        this.al.clear();
        this.am.clear();
        super.d();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f) {
            a(3, true);
        } else if (view == this.g) {
            E();
        } else if (view == this.h) {
            F();
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
            this.aR.f = intent.getBooleanExtra("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED", false);
        }
        this.aR.t = bj.b(i2);
        if (a2 != null) {
            a(a2.f6391b, a2.c, a2.d, "", -1L, 2);
        } else {
            a("", 0, -1, "", -1L, 2);
        }
    }

    @Override // com.google.android.wallet.ui.common.ap
    public final void a(View view) {
        if (this.aq == 1) {
            a(2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.d == null) {
            return;
        }
        boolean z = this.av;
        this.d.setEnabled(z);
        int size = this.aj.size();
        for (int i = 0; i < size; i++) {
            this.aj.get(i).setEnabled(z);
        }
        int size2 = this.ak.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.ak.get(i2).b(z);
        }
        int size3 = this.al.size();
        for (int i3 = 0; i3 < size3; i3++) {
            this.al.get(i3).a(z);
        }
        int size4 = this.am.size();
        for (int i4 = 0; i4 < size4; i4++) {
            this.am.get(i4).setEnabled(z);
        }
        if (this.g != null) {
            this.g.setEnabled(z);
        }
        if (this.h != null) {
            this.h.setEnabled(z);
        }
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        com.google.b.a.a.a.b.a.a.b.a.i panCategory;
        if (this.d != null && (panCategory = this.d.getPanCategory()) != null) {
            for (int i : panCategory.h) {
                ArrayList<h> arrayList = this.f7416a.get(i);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar = arrayList.get(i2);
                    if (hVar.f7426a == 4) {
                        this.ak.get(hVar.f7427b);
                    }
                }
                if (!this.aE.get(i).isEmpty()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.f getUiElement() {
        return this.aB;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<com.google.android.wallet.analytics.e> getChildren() {
        if (this.d == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.aC);
        if (H()) {
            arrayList.add(new com.google.android.wallet.analytics.d(1652, this));
        }
        if (I()) {
            arrayList.add(new com.google.android.wallet.analytics.d(1655, this));
        }
        if (((com.google.android.wallet.ui.a.b) this.B.a("tagNfcInfoDialog")) != null) {
            arrayList.add(new com.google.android.wallet.analytics.d(1656, this));
        }
        com.google.b.a.a.a.b.a.a.b.a.i panCategory = this.d.getPanCategory();
        if (panCategory == null) {
            return arrayList;
        }
        int[] iArr = panCategory.h;
        for (int i : iArr) {
            arrayList.add(this.aD.get(i));
        }
        return arrayList;
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.ak
    public final boolean b(int[] iArr) {
        boolean b2 = super.b(iArr);
        boolean z = false;
        if (!this.aR.d && !TextUtils.isEmpty(this.d.getError())) {
            this.aR.d = true;
            z = true;
        }
        View b3 = b(3);
        if (!this.aR.i && b3 != null && !TextUtils.isEmpty(bj.d(b3))) {
            this.aR.i = true;
            z = true;
        }
        View b4 = b(1);
        if (!this.aR.n && b4 != null && !TextUtils.isEmpty(bj.d(b4))) {
            this.aR.n = true;
            z = true;
        }
        if (z) {
            J();
        }
        if (!b2) {
            C();
        }
        return b2;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai> w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ai(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).i, this.d, null));
        com.google.b.a.a.a.b.a.a.b.a.i panCategory = this.d.getPanCategory();
        if (panCategory == null) {
            return arrayList;
        }
        for (int i : panCategory.h) {
            ArrayList<h> arrayList2 = this.f7416a.get(i);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = arrayList2.get(i2);
                com.google.b.a.a.a.b.a.a.b.a.b bVar = ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).c[i].c[i2];
                switch (hVar.f7426a) {
                    case 1:
                        arrayList.add(new ai(hVar.c, this.aj.get(hVar.f7427b), bj.a(bVar.f7561a)));
                        break;
                    case 2:
                        arrayList.add(new ai(hVar.c, this.al.get(hVar.f7427b), null));
                        break;
                    case 3:
                    default:
                        throw new IllegalStateException(new StringBuilder(46).append("Unknown field type ").append(hVar.f7426a).append(" in CardSubform.").toString());
                    case 4:
                        arrayList.add(new ai(hVar.c, this.ak.get(hVar.f7427b)));
                        break;
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(com.google.b.a.a.a.b.a.j jVar) {
        if (jVar.f7704a.f7650a.equals(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).f7565a.f7628a)) {
            if (jVar.f7704a.f7651b == 1) {
                this.d.setError(jVar.f7705b);
                if (!this.aR.d) {
                    this.aR.d = true;
                    J();
                }
                C();
                return true;
            }
            throw new IllegalArgumentException(new StringBuilder(45).append("Unknown FormFieldMessage fieldId: ").append(jVar.f7704a.f7651b).toString());
        }
        com.google.b.a.a.a.b.a.a.b.a.i panCategory = this.d.getPanCategory();
        if (panCategory == null) {
            return false;
        }
        for (int i : panCategory.h) {
            ArrayList<h> arrayList = this.f7416a.get(i);
            if (jVar.f7704a.f7650a.equals(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).c[i].f7569a.f7628a)) {
                h hVar = arrayList.get(jVar.f7704a.c);
                if (hVar.f7426a == 1) {
                    bj.a(this.aj.get(hVar.f7427b), jVar.f7705b);
                    if (hVar.d == 3 && !this.aR.i) {
                        this.aR.i = true;
                        J();
                    }
                    if (hVar.d == 1 && !this.aR.n) {
                        this.aR.n = true;
                        J();
                    }
                } else if (hVar.f7426a == 2) {
                    this.al.get(hVar.f7427b).setError(jVar.f7705b);
                } else {
                    throw new IllegalArgumentException(new StringBuilder(56).append("Could not apply FormFieldMessage to fieldId: ").append(jVar.f7704a.f7651b).toString());
                }
                C();
                return true;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar2 = arrayList.get(i2);
                if (hVar2.f7426a == 4 && this.ak.get(hVar2.f7427b).a(jVar)) {
                    C();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.wallet.ui.card.p
    public final void a(com.google.b.a.a.a.b.a.a.b.a.i iVar) {
        boolean z;
        boolean z2 = (this.aH != null) ^ (iVar != null);
        this.aH = iVar;
        boolean z3 = z2 && ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).f == 3;
        int size = this.ai.size();
        for (int i = 0; i < size; i++) {
            ViewGroup viewGroup = this.ai.get(i);
            if (viewGroup.getVisibility() == 0) {
                if (z2) {
                    bj.a(viewGroup, 0, 0);
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
        if (this.ap != null) {
            this.ap.b(this);
            this.ap = null;
        }
        if (iVar == null) {
            this.c.setCardIcon(null);
            if (this.i != null) {
                bj.a(this.i, z3);
            }
        } else {
            this.c.setCardIcon(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).d[iVar.g]);
            if (this.i != null) {
                bj.b(this.i, z3);
            }
            int id = this.d.getId();
            int[] iArr = iVar.h;
            int length = iArr.length;
            int i2 = 0;
            boolean z4 = false;
            int i3 = id;
            while (i2 < length) {
                int i4 = iArr[i2];
                if (i4 == iVar.h[0] && this.an.get(i4) != null && Build.VERSION.SDK_INT >= 14) {
                    this.ap = this.an.get(i4);
                    this.ap.a(this);
                }
                ViewGroup viewGroup2 = this.ai.get(i4);
                ((RelativeLayout.LayoutParams) viewGroup2.getLayoutParams()).addRule(bj.a(3), i3);
                i3 = viewGroup2.getId();
                if (!z4) {
                    if (z2) {
                        bj.a(viewGroup2, 0);
                    } else {
                        viewGroup2.setVisibility(0);
                    }
                    if (!this.aE.get(i4).isEmpty()) {
                        z = true;
                        i2++;
                        z4 = z;
                    }
                }
                z = z4;
                i2++;
                z4 = z;
            }
        }
        a(1, Bundle.EMPTY);
        if (this.au != null) {
            this.au.a(this);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = ((com.google.android.wallet.ui.common.k) this.d.getAdapter().getItem(i)).c;
        if (i2 == 1) {
            E();
        } else {
            if (i2 == 2) {
                F();
                return;
            }
            throw new IllegalArgumentException(new StringBuilder(44).append("Unknown DropDownItem event type: ").append(i2).toString());
        }
    }

    @Override // com.google.android.wallet.nfc.c
    public final void a(int i, com.google.android.wallet.nfc.a aVar, long j) {
        b("tagNfcInfoDialog");
        b(true);
        if (this.as) {
            this.as = false;
            this.h.setImageDrawable(this.aQ);
        }
        switch (i) {
            case 1:
                this.aR.v = 1;
                this.aR.w = 0;
                break;
            case 2:
                this.aR.v = 3;
                this.aR.w = 0;
                break;
            case 3:
            case 4:
                a(f_(com.google.android.wallet.e.j.wallet_uic_nfc_unsupported_error_message));
                this.aR.v = 4;
                this.aR.w = 1;
                break;
            case 5:
                a(f_(com.google.android.wallet.e.j.wallet_uic_nfc_transceive_error_message));
                this.aR.v = 4;
                this.aR.w = 2;
                break;
            case 6:
                a(f_(com.google.android.wallet.e.j.wallet_uic_nfc_timeout_error_message));
                this.aR.v = 2;
                this.aR.w = 3;
                break;
            default:
                throw new IllegalStateException(new StringBuilder(36).append("Unknown NFC result code: ").append(i).toString());
        }
        if (i == 1 && aVar != null) {
            a(aVar.f7352a, aVar.f7353b, aVar.c, aVar.d, j, 3);
        } else {
            a("", 0, -1, "", j, 3);
        }
    }

    @Override // com.google.android.wallet.nfc.b
    public final void b(Intent intent) {
        if (I() && !this.ar.d()) {
            com.google.android.wallet.ui.a.b bVar = (com.google.android.wallet.ui.a.b) this.B.a("tagNfcInfoDialog");
            b(false);
            if (bVar != null) {
                bVar.w();
            } else {
                b("tagNfcErrorDialog");
                if (this.h != null && this.aq != 2) {
                    this.as = true;
                    TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicNfcInProgressDrawable, com.google.android.wallet.e.c.uicNfcDrawable});
                    Drawable drawable = obtainStyledAttributes.getDrawable(0);
                    this.aQ = obtainStyledAttributes.getDrawable(1);
                    obtainStyledAttributes.recycle();
                    this.h.setImageDrawable(drawable);
                }
            }
            this.ar.a(intent);
        }
    }

    @Override // com.google.android.wallet.ui.address.q
    public final void x() {
        if (this.aR.l != 1) {
            this.aR.l = 1;
            J();
        }
    }

    @Override // com.google.android.wallet.ui.address.q
    public final void y() {
        if (!this.aR.n) {
            this.aR.n = true;
            J();
        }
    }

    private void C() {
        if (this.aq == 2) {
            a(3, false);
        }
    }

    private void a(int i, boolean z) {
        if (i != this.aq) {
            if (i < this.aq) {
                throw new IllegalArgumentException("Cannot transition to an earlier state");
            }
            if (Build.VERSION.SDK_INT < 14) {
                throw new IllegalStateException(new StringBuilder(64).append("State transitions are not implemented for API level: ").append(Build.VERSION.SDK_INT).toString());
            }
            if (this.aq == 1 && i == 2) {
                a(z);
            } else if (this.aq == 2 && i == 3) {
                e(z);
            } else {
                if (this.aq != 1 || i != 3) {
                    throw new IllegalArgumentException(new StringBuilder(58).append("Unimplemented state transition: ").append(this.aq).append(" to ").append(i).toString());
                }
                if (z) {
                    throw new IllegalArgumentException("Cannot animate transition from STATE_INITIAL to STATE_EXPANDED");
                }
                if (!this.aG) {
                    D();
                }
            }
            this.aq = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    @android.annotation.TargetApi(14)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.card.a.a(boolean):void");
    }

    @TargetApi(14)
    private void e(boolean z) {
        int i;
        com.google.b.a.a.a.b.a.a.b.a.i panCategory = this.d.getPanCategory();
        if (panCategory == null || panCategory.h.length == 0) {
            throw new IllegalStateException("State transitions should not be triggered when no subforms are visible.");
        }
        if (!this.aG) {
            D();
        }
        if (z) {
            bj.b(this.e, 0);
            bj.b(this.f, 0);
            bj.a(this.d, 0);
            if (this.g != null) {
                bj.a(this.g, 0);
            }
            if (this.h != null) {
                bj.a(this.h, 0);
            }
        } else {
            this.e.setVisibility(4);
            this.f.setVisibility(4);
            this.d.setVisibility(0);
            if (this.g != null) {
                this.g.setVisibility(0);
            }
            if (this.h != null) {
                this.h.setVisibility(0);
            }
        }
        ViewGroup viewGroup = this.ai.get(panCategory.h[0]);
        int a2 = bj.a(this.e);
        int size = this.aL.size() - 1;
        int i2 = 0;
        while (size >= 0) {
            View view = this.aL.get(size);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) view.getLayoutParams());
            this.f7417b.removeView(view);
            viewGroup.addView(view, 0, layoutParams);
            if (view.getVisibility() != 8) {
                if (z) {
                    int a3 = bj.a(view) + i2;
                    bj.a(view, a3 - a2);
                    i = a3;
                    size--;
                    i2 = i;
                } else {
                    view.setVisibility(0);
                }
            }
            i = i2;
            size--;
            i2 = i;
        }
        if (z) {
            for (int i3 : panCategory.h) {
                ViewGroup viewGroup2 = this.ai.get(i3);
                viewGroup2.setTranslationY(-i2);
                viewGroup2.animate().translationY(0.0f).start();
            }
        }
        this.aL.clear();
    }

    private void D() {
        this.c.a();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.addRule(bj.a(3), com.google.android.wallet.e.g.header);
        layoutParams.leftMargin = ((RelativeLayout.LayoutParams) this.e.getLayoutParams()).leftMargin;
        this.d.setLayoutParams(layoutParams);
        this.aG = true;
    }

    private void a(String str, int i, int i2, String str2, long j, int i3) {
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = i > 0 && i < 13 && i2 >= 0;
        boolean z3 = !TextUtils.isEmpty(str2);
        if (z) {
            if (this.e.getVisibility() == 0) {
                a(3, false);
            }
            this.aR.f7233b = i3;
            this.d.removeTextChangedListener(this.aS);
            this.d.requestFocus();
            this.d.setText(str);
            this.d.addTextChangedListener(this.aS);
            if (this.d.ag_()) {
                if (z2) {
                    View b2 = b(3);
                    if (b2 instanceof ExpDateEditText) {
                        ExpDateEditText expDateEditText = (ExpDateEditText) b2;
                        this.aR.g = i3;
                        expDateEditText.removeTextChangedListener(this.aT);
                        expDateEditText.requestFocus();
                        expDateEditText.a(Integer.toString(i), Integer.toString(i2 % 100));
                        expDateEditText.addTextChangedListener(this.aT);
                    }
                }
                if (z3) {
                    View b3 = b(1);
                    if (b3 instanceof TextView) {
                        TextView textView = (TextView) b3;
                        this.aR.l = i3;
                        textView.removeTextChangedListener(this.aU);
                        textView.requestFocus();
                        textView.setText(str2);
                        textView.addTextChangedListener(this.aU);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (this.d.getPanCategory() != null) {
                        for (int i4 : this.d.getPanCategory().h) {
                            ArrayList<h> arrayList2 = this.f7416a.get(i4);
                            int size = arrayList2.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                h hVar = arrayList2.get(i5);
                                if (hVar.f7426a == 4) {
                                    arrayList.add(this.ak.get(hVar.f7427b));
                                }
                            }
                        }
                    }
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        this.aR.l = i3;
                        com.google.android.wallet.ui.address.b bVar = (com.google.android.wallet.ui.address.b) arrayList.get(i6);
                        bVar.at = null;
                        bVar.a(str2);
                        bVar.at = this;
                    }
                }
            }
        }
        if (i3 == 2) {
            this.aR.s = this.aR.s < 0 ? 1 : this.aR.s + 1;
            this.aR.c = z;
            this.aR.h = z2;
            this.aR.m = z3;
        } else if (i3 == 3) {
            this.aR.u = this.aR.u < 0 ? 1 : this.aR.u + 1;
            this.aR.e = z;
            this.aR.j = z2;
            this.aR.o = z3;
            if (j >= 0) {
                this.aR.p = j;
            }
        } else {
            throw new IllegalArgumentException(new StringBuilder(31).append("Unknown entry type: ").append(i3).toString());
        }
        J();
    }

    private View b(int i) {
        if (this.d.getPanCategory() == null) {
            return null;
        }
        for (int i2 : this.d.getPanCategory().h) {
            ArrayList<h> arrayList = this.f7416a.get(i2);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = arrayList.get(i3);
                if (hVar.f7426a == 1 && hVar.d == i) {
                    return this.aj.get(hVar.f7427b);
                }
            }
        }
        return null;
    }

    private ArrayList<View> d(int i) {
        ArrayList<View> arrayList = new ArrayList<>();
        int size = this.f7416a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<h> arrayList2 = this.f7416a.get(i2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                h hVar = arrayList2.get(i3);
                if (hVar.f7426a == 1 && hVar.d == i) {
                    arrayList.add(this.aj.get(hVar.f7427b));
                }
            }
        }
        return arrayList;
    }

    private void E() {
        b(this.aM, 500);
        b(false);
        if (this.at != null) {
            this.at.a(this, 1652);
        }
        if (this.au != null) {
            this.au.a(new com.google.android.wallet.analytics.d(1653, null));
        }
    }

    private boolean H() {
        return this.aN != 0;
    }

    private boolean I() {
        return this.aO != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        Bundle bundle = new Bundle();
        bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_TYPE", 770);
        bundle.putParcelable("FormEventListener.EXTRA_BACKGROUND_EVENT_DATA", this.aR);
        a(7, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v105, types: [android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r3v182, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v64, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    @Override // com.google.android.wallet.ui.common.d
    @TargetApi(11)
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.google.b.a.a.a.b.a.b.p[] b2;
        com.google.b.a.a.a.b.a.b.p[] pVarArr;
        FrameLayout frameLayout;
        TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.internalUicLegalMessageLayout, com.google.android.wallet.e.c.internalUicFormNonEditableTextStartMargin});
        int resourceId = obtainStyledAttributes.getResourceId(0, com.google.android.wallet.e.h.view_legal_message_text);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        int dimension = (int) this.aJ.getResources().getDimension(com.google.android.wallet.e.f.wallet_uic_legal_message_top_margin);
        this.f7417b = (RelativeLayout) layoutInflater.inflate(com.google.android.wallet.e.h.fragment_card, (ViewGroup) null);
        ((FormHeaderView) this.f7417b.findViewById(com.google.android.wallet.e.g.header)).a(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).f7565a, layoutInflater, this, this, this.aC);
        boolean z = ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).f == 2 || ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).f == 3;
        this.c = (CardImagesView) this.f7417b.findViewById(com.google.android.wallet.e.g.card_images);
        if (((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).e >= 0) {
            com.google.b.a.a.a.b.a.b.p[] pVarArr2 = (com.google.b.a.a.a.b.a.b.p[]) Arrays.copyOfRange(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).d, 0, ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).e);
            b2 = (com.google.b.a.a.a.b.a.b.p[]) Arrays.copyOfRange(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).d, ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).e, ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).d.length);
            pVarArr = pVarArr2;
        } else {
            com.google.b.a.a.a.b.a.b.p[] pVarArr3 = ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).d;
            b2 = com.google.b.a.a.a.b.a.b.p.b();
            pVarArr = pVarArr3;
        }
        this.c.a(pVarArr, b2, z);
        this.d = (CardNumberEditText) this.f7417b.findViewById(com.google.android.wallet.e.g.card_number);
        this.d.a(this.d, this.d, false);
        this.d.setAllowedPanCategories(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).j);
        this.d.setExcludedPanCategories(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).m);
        this.d.setNoMatchPanMessage(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).k);
        this.d.setInvalidPanMessage(((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).l);
        this.d.setOnPanCategoryChangedListener(this);
        bj.a(this.d, ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).i, this.az, this.aA);
        this.e = (TextView) this.f7417b.findViewById(com.google.android.wallet.e.g.card_number_concealed);
        this.e.setPadding(this.d.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), this.d.getPaddingBottom());
        if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT < 21) {
            this.e.addOnLayoutChangeListener(new b(this));
        }
        this.f = this.f7417b.findViewById(com.google.android.wallet.e.g.expand_icon);
        this.f.setOnClickListener(this);
        if (this.aO == 1) {
            this.h = (ImageView) this.f7417b.findViewById(com.google.android.wallet.e.g.nfc_icon);
            this.h.setOnClickListener(this);
            this.h.setVisibility(0);
        } else if (this.aO == 2) {
            CardNumberEditText cardNumberEditText = this.d;
            if (cardNumberEditText.h == null) {
                cardNumberEditText.h = new com.google.android.wallet.ui.common.k(com.google.android.wallet.e.c.uicNfcDrawable, cardNumberEditText.getResources().getString(com.google.android.wallet.e.j.wallet_uic_nfc_popup_title), 2);
                cardNumberEditText.a(cardNumberEditText.h);
            }
            this.d.setOnItemClickListener(this);
        }
        if (this.aN == 1) {
            this.g = this.f7417b.findViewById(com.google.android.wallet.e.g.ocr_icon);
            this.g.setOnClickListener(this);
            this.g.setVisibility(0);
        } else if (this.aN == 6) {
            CardNumberEditText cardNumberEditText2 = this.d;
            if (cardNumberEditText2.g == null) {
                cardNumberEditText2.g = new com.google.android.wallet.ui.common.k(com.google.android.wallet.e.c.uicCameraDrawable, cardNumberEditText2.getResources().getString(com.google.android.wallet.e.j.wallet_uic_ocr_drop_down_button), 1);
                cardNumberEditText2.a(cardNumberEditText2.g);
            }
            this.d.setOnItemClickListener(this);
        }
        if (((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).f == 3) {
            this.i = (CardLogoGridView) this.f7417b.findViewById(com.google.android.wallet.e.g.card_logo_grid_view);
            this.i.setLogos(pVarArr);
            this.i.setVisibility(0);
        }
        com.google.android.wallet.analytics.f fVar = new com.google.android.wallet.analytics.f(1716);
        int length = ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).c.length;
        this.ao = new int[length];
        if (bundle != null) {
            this.aF = bundle.getIntArray("revealBelowTriggeredCount");
        } else {
            this.aF = new int[length];
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < length) {
                com.google.b.a.a.a.b.a.a.b.a.f fVar2 = ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).c[i2];
                ?? r9 = (LinearLayout) layoutInflater.inflate(com.google.android.wallet.e.h.view_subform, (ViewGroup) this.f7417b, false);
                r9.setId(O().a());
                c cVar = new c(this, fVar);
                this.ai.add(r9);
                this.aD.add(cVar);
                this.f7416a.add(new ArrayList<>());
                ((FormHeaderView) r9.findViewById(com.google.android.wallet.e.g.subform_header)).a(fVar2.f7569a, layoutInflater, this, cVar, cVar.getChildren());
                int length2 = fVar2.c.length;
                ArrayList arrayList = new ArrayList(fVar2.c.length);
                for (int i3 = 0; i3 < length2; i3++) {
                    com.google.b.a.a.a.b.a.a.b.a.b bVar = ((com.google.b.a.a.a.b.a.a.b.a.d) this.aw).c[i2].c[i3];
                    int a2 = O().a();
                    h hVar = new h((byte) 0);
                    if (bVar.f7561a != null) {
                        bd bdVar = new bd(bVar.f7561a, this.aK, r9);
                        bdVar.f7506a = f();
                        bdVar.f7507b = a2;
                        bdVar.c = this;
                        ?? a3 = bdVar.a();
                        hVar.f7426a = 1;
                        hVar.f7427b = this.aj.size();
                        hVar.c = bVar.f7561a.f7693b;
                        hVar.d = bVar.f7561a.j;
                        this.aj.add(a3);
                        bj.a((Object) a3, bVar.f7561a.f7693b, this.az, this.aA);
                        frameLayout = a3;
                    } else if (bVar.f7562b != null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.aJ);
                        frameLayout2.setId(a2);
                        com.google.android.wallet.ui.address.b bVar2 = (com.google.android.wallet.ui.address.b) h().a(a2);
                        if (bVar2 == null) {
                            bVar2 = bj.a(bVar.f7562b, this.aI);
                            h().a().a(a2, bVar2).b();
                        }
                        com.google.android.wallet.ui.address.b bVar3 = bVar2;
                        bVar3.at = this;
                        hVar.f7426a = 4;
                        hVar.f7427b = this.ak.size();
                        hVar.c = bVar.f7562b.f7560b;
                        this.ak.add(bVar3);
                        bVar3.setParentUiNode(this.aD.get(i2));
                        this.aD.get(i2).getChildren().add(bVar3);
                        frameLayout = frameLayout2;
                    } else if (bVar.c != null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.aJ);
                        frameLayout3.setId(a2);
                        aq aqVar = (aq) h().a(a2);
                        if (aqVar == null) {
                            aqVar = a(bVar.c);
                            h().a().a(a2, aqVar).b();
                        }
                        aq aqVar2 = aqVar;
                        aqVar2.a(this.az, this.aA);
                        hVar.f7426a = 2;
                        hVar.f7427b = this.al.size();
                        hVar.c = bVar.c.f7630a.f7693b;
                        this.al.add(aqVar2);
                        aqVar2.setParentUiNode(this.aD.get(i2));
                        this.aD.get(i2).getChildren().add(aqVar2);
                        frameLayout = frameLayout3;
                    } else {
                        throw new IllegalArgumentException("Empty or unknown field in CardSubform.");
                    }
                    this.f7416a.get(i2).add(hVar);
                    frameLayout.setTag(com.google.android.wallet.e.g.field_type, Integer.valueOf(hVar.f7426a));
                    arrayList.add(frameLayout);
                }
                int[] a4 = bj.a(this.aJ, arrayList, fVar2.d, (ViewGroup) r9);
                if (fVar2.f != null) {
                    ?? a5 = bj.a(this.aK, resourceId, fVar2.f, this, this);
                    a5.setId(O().a());
                    r9.addView(a5);
                    this.am.add(a5);
                    cVar.getChildren().add((com.google.android.wallet.analytics.e) a5);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a5.getLayoutParams();
                    ao.a(marginLayoutParams, dimensionPixelSize);
                    marginLayoutParams.topMargin = dimension;
                    marginLayoutParams.bottomMargin = dimension;
                }
                if (fVar2.e >= 0) {
                    this.ao[i2] = a4[fVar2.e];
                    if (this.ao[i2] == -1) {
                        throw new IllegalStateException("Invalid collapsibleFieldsEndIndex");
                    }
                    this.an.add(a(i2, fVar2.e));
                } else {
                    this.ao[i2] = -1;
                    this.an.add(null);
                }
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                int i4 = this.aF[i2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (fVar2.c[i5].d) {
                        if (i4 > 0) {
                            i4--;
                        } else {
                            int i6 = a4[i5];
                            if (i6 == -1) {
                                throw new IllegalStateException("Invalid hideFieldsBelow field");
                            }
                            a(i2, i5).a(new d(this, i2, i6));
                            if (arrayList2.isEmpty()) {
                                int childCount = r9.getChildCount();
                                for (int i7 = i6 + 1; i7 < childCount; i7++) {
                                    r9.getChildAt(i7).setVisibility(8);
                                }
                            }
                            arrayList2.add(Integer.valueOf(i6));
                        }
                    }
                }
                this.aE.add(arrayList2);
                r9.setVisibility(8);
                this.f7417b.addView(r9);
                i = i2 + 1;
            } else {
                if (z) {
                    D();
                }
                u();
                a(1, Bundle.EMPTY);
                this.aS = new e(this);
                this.aT = new f(this);
                this.aU = new g(this);
                return this.f7417b;
            }
        }
    }

    public aq a(com.google.b.a.a.a.b.a.a.l lVar) {
        return aq.b(lVar, this.aI);
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if (this.B.a("tagWebViewDialog") == null) {
            bq.a(str, this.aI).a(this.B, "tagWebViewDialog");
        }
    }

    @Override // com.google.android.wallet.ui.common.bb
    public final void a(t tVar) {
        if (this.B.a("tagTooltipDialog") == null) {
            az a2 = az.a(tVar, this.aI);
            a2.a(this, -1);
            a2.a(this.B, "tagTooltipDialog");
        }
    }

    private void a(String str) {
        if (this.B.a("tagNfcErrorDialog") == null) {
            bh bhVar = new bh();
            bhVar.f7509b = f_(com.google.android.wallet.e.j.wallet_uic_nfc_error_title);
            bhVar.c = str;
            bhVar.g = this.aI;
            bhVar.f = f_(R.string.ok);
            bhVar.a().a(this.B, "tagNfcErrorDialog");
        }
    }

    private void F() {
        if (this.B.a("tagNfcInfoDialog") == null) {
            G();
            if (this.at != null) {
                this.at.a(this, 1655);
            }
            if (this.au != null) {
                this.au.a(this);
            }
        }
    }

    private void G() {
        com.google.android.wallet.ui.a.b a2 = com.google.android.wallet.ui.a.b.a(this.aI, this.ar.c());
        a2.a(this, 0);
        a2.a(this.B, "tagNfcInfoDialog");
    }

    private void b(String str) {
        Fragment a2 = this.B.a(str);
        if (a2 != null) {
            this.B.a().a(a2).b();
        }
    }

    static /* synthetic */ void a(a aVar, int i, int i2) {
        boolean z;
        int intValue;
        com.google.b.a.a.a.b.a.a.b.a.i panCategory = aVar.d.getPanCategory();
        if (panCategory == null || panCategory.h.length == 0) {
            throw new IllegalStateException("Reveal transitions should not be triggered when no subforms are visible.");
        }
        int[] iArr = panCategory.h;
        int length = iArr.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            int i4 = iArr[i3];
            if (i4 == i) {
                ArrayList<Integer> arrayList = aVar.aE.get(i4);
                if (!arrayList.contains(Integer.valueOf(i2))) {
                    return;
                }
                arrayList.remove(Integer.valueOf(i2));
                int[] iArr2 = aVar.aF;
                iArr2[i4] = iArr2[i4] + 1;
                int size = i4 == panCategory.h[0] ? aVar.aL.size() : 0;
                ViewGroup viewGroup = aVar.ai.get(i4);
                if (arrayList.isEmpty()) {
                    intValue = (viewGroup.getChildCount() + size) - 1;
                    z = true;
                } else {
                    intValue = arrayList.get(0).intValue();
                    z = false;
                }
                if (i2 + 1 < size) {
                    throw new IllegalStateException("Cannot reveal a collapsed view");
                }
                for (int i5 = i2 + 1; i5 <= intValue; i5++) {
                    bj.a(viewGroup.getChildAt(i5 - size), 0);
                }
                if (!z) {
                    break;
                }
                i3++;
                z2 = z;
            } else {
                if (z2) {
                    bj.a(aVar.ai.get(i4), 0);
                    if (!aVar.aE.get(i4).isEmpty()) {
                        break;
                    }
                }
                z = z2;
                i3++;
                z2 = z;
            }
        }
        aVar.a(1, Bundle.EMPTY);
    }
}
