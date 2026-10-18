package com.google.android.wallet.common.pub;

import com.deivid22srk.store.R;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ap;
import android.support.v4.view.by;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.common.d.e;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.instrumentmanager.ui.common.ButtonBar;
import com.google.android.wallet.instrumentmanager.ui.common.ImInfoMessageTextView;
import com.google.android.wallet.instrumentmanager.ui.common.TopBarView;
import com.google.android.wallet.ui.common.FifeNetworkImageView;
import com.google.android.wallet.ui.common.InfoMessageTextView;
import com.google.android.wallet.ui.common.ag;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.bg;
import com.google.android.wallet.ui.common.bh;
import com.google.android.wallet.ui.common.bi;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.bq;
import com.google.b.a.a.a.b.a.bpkg.p;
import com.google.b.a.a.a.b.a.bpkg.r;
import com.google.b.a.a.a.b.a.h;
import com.google.b.a.a.a.b.a.j;

/* loaded from: classes.dex */
public abstract class a<T extends com.google.android.wallet.common.d.e> extends com.google.android.wallet.ui.common.d implements View.OnClickListener, View.OnFocusChangeListener, com.google.android.wallet.analytics.e, com.google.android.wallet.b.c, com.google.android.wallet.common.b, com.google.android.wallet.common.d.f, com.google.android.wallet.nfc.b, ag, bi, com.google.android.wallet.ui.common.e {

    /* renamed from: a, reason: collision with root package name */
    public ScrollView f7284a;
    public Bundle aA;
    public String aB;
    public String aC;
    public boolean aD;
    public boolean aE;
    public boolean aF;
    public boolean aG;
    private boolean aH;
    private boolean aL;
    private d aM;
    private boolean aN;
    private int aO;
    private Bundle aP;
    private Bundle aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private boolean aU;
    public ImInfoMessageTextView ai;
    public InfoMessageTextView aj;
    public TextView ak;
    public int al;
    public int am;
    public boolean an;
    public com.google.protobuf.nano.c ao;
    public T ap;
    public com.google.b.a.a.a.b.a.f aq;
    protected com.google.android.wallet.b.a ar;
    public h as;
    protected final com.google.android.wallet.common.a at = new com.google.android.wallet.common.a();
    public Bundle au;
    public byte[] av;
    protected com.google.android.wallet.common.bpkg.a.b aw;
    public Account ax;
    protected boolean ay;
    protected boolean az;

    /* renamed from: b, reason: collision with root package name */
    public FifeNetworkImageView f7285b;
    public TopBarView c;
    public View d;
    public ButtonBar e;
    public ah f;
    public TopBarView g;
    public ProgressBar h;
    public TextView i;

    public abstract com.google.b.a.a.a.b.a.bpkg.e A();

    public abstract com.google.d.b.a.a.bpkg.b B();

    public abstract com.google.b.a.a.a.b.a.apkg.h C();

    public abstract r D();

    public abstract ah E();

    public abstract T F();

    public abstract void G();

    public abstract void H();

    public abstract boolean I();

    public abstract void J();

    public abstract boolean K();

    public abstract void L();

    public abstract void M();

    public abstract void a(Bundle bundle, byte[] bArr, com.google.b.a.a.a.b.a.b bVar);

    public abstract void a(int[] iArr, Bundle bundle, byte[] bArr);

    public abstract String w();

    public abstract p x();

    public abstract String y();

    public abstract String z();

    public static Bundle a(int i, Account account, Bundle bundle) {
        Bundle c = c(i);
        c.putParcelable("account", account);
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        c.putParcelable("additionalArgs", bundle);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.al, viewGroup, false);
        this.f7284a = (ScrollView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.main_content);
        this.f7285b = (FifeNetworkImageView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.title_image);
        this.c = (TopBarView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.top_bar);
        this.d = inflate.findViewById(com.google.android.wallet.instrumentmanager.e.title_separator);
        this.e = (ButtonBar) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.button_bar);
        this.e.setPositiveButtonOnClickListener(this);
        this.e.setNegativeButtonOnClickListener(this);
        this.e.setExpandButtonOnClickListener(this);
        String string = this.r.getBundle("additionalArgs").getString("com.google.android.wallet.orchestration.TITLE_IMAGE_FIFE_URL");
        if (!TextUtils.isEmpty(string)) {
            this.f7285b.setOnLoadedListener(new b(this));
            this.f7285b.setVisibility(0);
            this.f7285b.setFadeIn(false);
            this.f7285b.a(string, i.b(f().getApplicationContext()), com.google.android.wallet.a.d.f7228a.b().booleanValue());
        }
        this.ai = (ImInfoMessageTextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.top_info_text);
        this.ai.setParentUiNode(this);
        this.ai.setUrlClickListener(this);
        this.g = (TopBarView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.progress_top_bar);
        this.h = (ProgressBar) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.progress_bar);
        this.i = (TextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.progress_text);
        this.aj = (InfoMessageTextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.info_message);
        this.aj.setUrlClickListener(this);
        this.ak = (TextView) inflate.findViewById(com.google.android.wallet.instrumentmanager.e.details);
        u();
        this.f = (ah) h().a(com.google.android.wallet.instrumentmanager.e.sub_form_holder);
        if (this.f == null) {
            v();
        } else {
            N();
        }
        if (bundle != null && this.aA != null) {
            P();
        }
        inflate.findViewById(com.google.android.wallet.instrumentmanager.e.steal_focus_and_hide_keyboard).setOnFocusChangeListener(this);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void o() {
        super.o();
        this.ap.a(this);
        if (this.aN) {
            this.aM.a(this.aO, this.aP);
            this.aN = false;
        }
        if (this.aQ != null) {
            a(false, false);
            a(5, this.aQ);
            this.aQ = null;
        }
    }

    @Override // android.support.v4.app.Fragment
    @TargetApi(11)
    public final void p() {
        super.p();
        if (Build.VERSION.SDK_INT >= 11) {
            f().setFinishOnTouchOutside(this.aH);
        }
        this.ap.a(null);
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("responseContext", ParcelableProto.a(this.aq));
        bundle.putParcelable("secureHeader", ParcelableProto.a(this.as));
        bundle.putBoolean("impressionForPageTracked", this.aw.f7265b);
        bundle.putString("progressTitle", this.aB);
        bundle.putString("progressMessage", this.aC);
        bundle.putBundle("inlineErrorMessageDetails", this.aA);
        if (this.ao != null) {
            bundle.putParcelable("lastRequest", ParcelableProto.a(this.ao));
        }
        if (this.au != null) {
            bundle.putBundle("lastFormEventDetailsForPageValue", this.au);
        }
        if (this.av != null) {
            bundle.putByteArray("lastDependencyGraphRequestTokenForPageValue", this.av);
        }
        bundle.putBoolean("sidecarInitialized", this.aG);
        bundle.putBoolean("beforePermissionsRequestedMessageShown", this.aR);
        bundle.putBoolean("permissionsRequested", this.aS);
        bundle.putBoolean("permissionsGranted", this.aT);
        bundle.putBoolean("permissionsFlowCompleted", this.aU);
    }

    @Override // com.google.android.wallet.common.d.f
    public final void a(com.google.android.wallet.common.d.e eVar) {
        if (eVar != this.ap) {
            throw new IllegalArgumentException("Unexpected sidecar");
        }
        switch (this.ap.f) {
            case 0:
                this.aG = true;
                if (this.aT) {
                    L();
                    return;
                }
                return;
            case 1:
                a(true, false);
                return;
            case 2:
                J();
                H();
                return;
            case 3:
                a(false, false);
                J();
                if (!I()) {
                    switch (this.ap.g) {
                        case 1:
                        case 3:
                            c(com.google.android.wallet.common.util.e.a(new Bundle(), 2, f_(com.google.android.wallet.instrumentmanager.g.wallet_im_error_title), f_(com.google.android.wallet.instrumentmanager.g.wallet_im_unknown_error), null, null, f_(R.string.ok)));
                            return;
                        case 2:
                            c(com.google.android.wallet.common.util.e.a(new Bundle(), 500, f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_network_error_title), f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_network_error_message), null, null, f_(com.google.android.wallet.instrumentmanager.g.wallet_uic_retry)));
                            return;
                        default:
                            throw new IllegalArgumentException(new StringBuilder(37).append("Unknown sidecar substate: ").append(this.ap.g).toString());
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void a(j[] jVarArr) {
        for (j jVar : jVarArr) {
            if (!this.f.a(jVar)) {
                String valueOf = String.valueOf(jVar.f7704a.f7650a);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "FormFieldMessage form not found: ".concat(valueOf) : new String("FormFieldMessage form not found: "));
            }
        }
        com.google.android.wallet.common.bpkg.a.a.a(this.f, 1623);
        this.f.c();
    }

    private void N() {
        this.ar = new com.google.android.wallet.b.a(A());
        ah ahVar = this.f;
        com.google.android.wallet.b.a aVar = this.ar;
        com.google.android.wallet.b.a aVar2 = this.ar;
        ahVar.az = aVar;
        ahVar.aA = aVar2;
        bj.a(this, 1, this.ar, this.ar);
    }

    public final void u() {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (this.aA == null) {
            str = w();
            p x = x();
            if (x != null) {
                str5 = x.f7684a;
                str4 = x.d;
            } else {
                str4 = null;
                str5 = null;
            }
            com.google.b.a.a.a.b.a.apkg.h C = C();
            boolean z2 = C != null;
            if (z2) {
                str6 = C.c;
                if (TextUtils.isEmpty(str6)) {
                    throw new IllegalStateException("SubmitButton is missing text.");
                }
            }
            this.ai.setInfoMessage(D());
            ButtonBar buttonBar = this.e;
            buttonBar.a(buttonBar.e);
            boolean z3 = z2;
            str3 = str5;
            str2 = str4;
            z = z3;
        } else {
            String string = this.aA.getString("ErrorUtils.KEY_TITLE");
            String string2 = this.aA.getString("ErrorUtils.KEY_ERROR_BUTTON_TEXT");
            if (TextUtils.isEmpty(string2)) {
                throw new IllegalStateException("InlineErrorMessageDetails is missing button text.");
            }
            this.e.a(false);
            str = string;
            str2 = null;
            z = true;
            str3 = null;
            str6 = string2;
        }
        this.c.a(str, str3, str2);
        f().setTitle(str);
        this.e.f7341a.setVisibility(z ? 0 : 8);
        if (z) {
            this.e.setPositiveButtonText(str6);
        }
        Q();
    }

    public final void v() {
        this.ai.a(false);
        this.ay = true;
        this.az = false;
        this.aw.f7265b = false;
        this.f = E();
        if (i.a(e(), B()) == null) {
            this.aT = true;
            this.aU = true;
        }
        this.c.post(new c(this));
        N();
    }

    @TargetApi(11)
    private void a(boolean z, boolean z2) {
        this.f.b(!z);
        this.e.setPositiveButtonEnabled(!z && this.f.v());
        this.ai.setEnabled(!z);
        this.e.setExpandButtonEnabled(z ? false : true);
        if (z) {
            bj.b(f(), this.f7284a);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            if (z && (this.f instanceof com.google.android.wallet.instrumentmanager.ui.d.a)) {
                f().setFinishOnTouchOutside(false);
            } else {
                f().setFinishOnTouchOutside(this.aH);
            }
        }
        if (!z2 && z) {
            com.google.android.wallet.common.bpkg.a.a.a(this.f, 1625);
        }
        a(z);
    }

    public void a(boolean z) {
        boolean z2 = (this.f7284a.getVisibility() == 0 || this.h.getVisibility() == 0) ? false : true;
        if (z) {
            if (TextUtils.isEmpty(this.aC)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
                bj.a(layoutParams, bj.a(20), by.h(this.h));
                layoutParams.addRule(bj.a(14));
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
                bj.a(layoutParams2, bj.a(14), by.h(this.h));
                layoutParams2.addRule(bj.a(20));
            }
            if (z2) {
                this.h.setVisibility(0);
            } else if (!this.aD) {
                bj.b(this.c, 0);
                bj.b(this.d, 0);
                bj.b(this.f7284a, 0);
                bj.b(this.e, 0);
                bj.a(this.h, 0);
            }
            this.aD = true;
        } else {
            if (z2) {
                this.c.setVisibility(0);
                this.d.setVisibility(0);
                this.f7284a.setVisibility(0);
                this.e.setVisibility(0);
            } else if (this.aD) {
                bj.a(this.c, 0);
                bj.a(this.d, 0);
                bj.a(this.f7284a, 0);
                bj.a(this.e, 0);
                bj.a(this.h, 0, 0);
            }
            this.aD = false;
        }
        if (z && !TextUtils.isEmpty(this.aB)) {
            this.g.a(this.aB, null, null);
            if (z2) {
                this.g.setVisibility(0);
            } else if (!this.aE) {
                bj.a(this.g, 0);
            }
            this.aE = true;
        } else {
            this.aB = null;
            if (!z2 && this.aE) {
                bj.b(this.g, 0);
            }
            this.aE = false;
        }
        if (z && !TextUtils.isEmpty(this.aC)) {
            this.i.setText(this.aC);
            if (z2) {
                this.i.setVisibility(0);
            } else if (!this.aF) {
                bj.a(this.i, 0);
            }
            this.aF = true;
            return;
        }
        this.aC = null;
        if (!z2 && this.aF) {
            bj.a(this.i, 0, 0);
        }
        this.aF = false;
    }

    private void P() {
        if (this.aA == null) {
            this.ai.setVisibility(0);
            h().a().c(this.f).b();
            this.aj.setVisibility(8);
            this.ak.setVisibility(8);
            this.aj.setInfoMessage(null);
            this.ak.setText((CharSequence) null);
            this.e.setPositiveButtonEnabled(this.f.v());
            return;
        }
        this.aj.setInfoMessage((r) ParcelableProto.a(this.aA, "ErrorUtils.KEY_ERROR_INFO_MESSAGE"));
        String string = this.aA.getString("ErrorUtils.KEY_ERROR_CODE");
        if (!TextUtils.isEmpty(string)) {
            this.ak.setText(string);
        }
        this.ai.setVisibility(8);
        h().a().b(this.f).b();
        this.aj.setVisibility(0);
        this.ak.setVisibility(0);
        this.e.setPositiveButtonEnabled(true);
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        if (i == 501) {
            switch (i2) {
                case -1:
                    if (!(this.f instanceof com.google.android.wallet.instrumentmanager.ui.redirect.a)) {
                        String valueOf = String.valueOf(this.f.getClass().getSimpleName());
                        throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected subform type: ".concat(valueOf) : new String("Unexpected subform type: "));
                    }
                    ((com.google.android.wallet.instrumentmanager.ui.redirect.a) this.f).f7347a = (com.google.b.a.a.a.b.a.apkg.dpkg.c) ParcelableProto.a(intent, "formValue");
                    a(8, Bundle.EMPTY);
                    return;
                case 0:
                    a(51, Bundle.EMPTY, false);
                    return;
                case 1:
                    Bundle bundleExtra = intent.getBundleExtra("errorDetails");
                    if (bundleExtra == null) {
                        throw new IllegalArgumentException("Error result must provide error details.");
                    }
                    a(false, false);
                    a(5, bundleExtra);
                    return;
                case 2:
                    a(intent.getIntExtra("resultCode", 51), intent.getBundleExtra("resultData"), false);
                    return;
                default:
                    throw new RuntimeException(new StringBuilder(52).append("Unknown result code from popup redirect: ").append(i2).toString());
            }
        }
        Fragment a2 = h().a(com.google.android.wallet.instrumentmanager.e.sub_form_holder);
        if (a2 != null) {
            a2.a(i, i2, intent);
        }
    }

    public final void c(Bundle bundle) {
        if (!j()) {
            this.aQ = bundle;
            return;
        }
        if (this.aL) {
            android.support.v4.app.r rVar = (android.support.v4.app.r) this.B.a("BaseOrchestrationFragmeserverErrorDialog");
            if (rVar != null) {
                rVar.a(false);
            }
            bh bhVar = new bh();
            bhVar.f7508a = bundle.getInt("ErrorUtils.KEY_TYPE");
            bhVar.f7509b = bundle.getString("ErrorUtils.KEY_TITLE");
            bhVar.d = (r) ParcelableProto.a(bundle, "ErrorUtils.KEY_ERROR_INFO_MESSAGE");
            bhVar.e = bundle.getString("ErrorUtils.KEY_ERROR_CODE");
            bhVar.f = bundle.getString("ErrorUtils.KEY_ERROR_BUTTON_TEXT");
            bhVar.g = this.aI;
            bg a2 = bhVar.a();
            a2.a(this, 0);
            a2.a(this.B, "BaseOrchestrationFragmeserverErrorDialog");
        } else {
            this.aA = bundle;
            u();
            P();
            bj.b(f(), this.f7284a);
            bj.a(this.aj, this.aj.getText());
        }
        com.google.android.wallet.common.bpkg.a.a.a(this.f, 1626);
    }

    private void Q() {
        if (this.aA != null || this.f == null || !this.f.z()) {
            this.e.b(false);
        } else {
            this.e.b(true);
            this.e.setExpandButtonText(this.f.B());
        }
    }

    @Override // com.google.android.wallet.ui.common.bi
    public final void a(int i, int i2) {
        switch (i2) {
            case 1:
                if (i == -1) {
                    if (this.aT) {
                        L();
                        return;
                    }
                    return;
                } else {
                    if (K()) {
                        this.aM.a(51, Bundle.EMPTY);
                        return;
                    }
                    return;
                }
            case 2:
                this.aM.a(52, Bundle.EMPTY);
                return;
            case 500:
                if (i == -2) {
                    this.aM.a(51, Bundle.EMPTY);
                    return;
                } else {
                    G();
                    return;
                }
            case 501:
                if (i == -1) {
                    v();
                    return;
                } else {
                    this.aM.a(51, Bundle.EMPTY);
                    return;
                }
            case 600:
                a(true, false);
                this.aS = true;
                a_(i.a(e(), B()));
                return;
            case 601:
                a(51, Bundle.EMPTY, false);
                return;
            default:
                throw new IllegalArgumentException(new StringBuilder(30).append("Unknown errorType: ").append(i2).toString());
        }
    }

    public void onClick(View view) {
        if (view.getId() == com.google.android.wallet.instrumentmanager.e.positive_btn) {
            if (this.aA == null) {
                this.aB = y();
                this.aC = z();
                com.google.android.wallet.common.bpkg.a.a.a(this.f, -1, 1621);
                a((int[]) null, Bundle.EMPTY, (byte[]) null);
                return;
            }
            String string = this.aA.getString("FormEventListener.EXTRA_FORM_ID");
            int i = this.aA.getInt("ErrorUtils.KEY_TYPE");
            this.aA = null;
            P();
            u();
            if (string != null) {
                if (!this.f.a(string, i)) {
                    String valueOf = String.valueOf(string);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Form to handle error message not found: ".concat(valueOf) : new String("Form to handle error message not found: "));
                }
                return;
            }
            a(-1, i);
            return;
        }
        if (view.getId() == com.google.android.wallet.instrumentmanager.e.expand_btn) {
            this.e.b(false);
            this.f.A();
        } else if (view.getId() == com.google.android.wallet.instrumentmanager.e.negative_btn) {
            com.google.android.wallet.common.bpkg.a.a.a(this.f);
            this.aM.a(51, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.wallet.ui.common.ag
    public void a(int i, Bundle bundle) {
        switch (i) {
            case 1:
                this.e.setPositiveButtonEnabled(this.f.v());
                if (this.aT) {
                    L();
                    return;
                }
                return;
            case 2:
            case 3:
            case 9:
            default:
                throw new IllegalArgumentException(new StringBuilder(30).append("Unknown formEvent: ").append(i).toString());
            case 4:
                this.aw.a(this);
                if (!this.aT && !this.aU) {
                    com.google.d.b.a.a.bpkg.b B = B();
                    String[] a2 = i.a(e(), B);
                    if ((B.f7740b != null && i.a(f(), a2)) && !this.aR) {
                        this.aR = true;
                        a(false, false);
                        c(com.google.android.wallet.common.util.e.a(new Bundle(), 600, f_(android.R.string.dialog_alert_title), null, B.f7740b, null, f_(R.string.ok)));
                        return;
                    } else if (!this.aR && !this.aS) {
                        a(true, false);
                        this.aS = true;
                        a_(a2);
                        return;
                    } else {
                        if (this.aS) {
                            a(true, false);
                            return;
                        }
                        return;
                    }
                }
                if (this.ap.f != 1 && !K()) {
                    a(false, false);
                    if (this.ay && !this.az && bj.c(this.f7284a) != null) {
                        this.az = true;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.ap.f != 1) {
                    c(bundle);
                    return;
                }
                return;
            case 6:
                Q();
                return;
            case 7:
                int i2 = bundle.getInt("FormEventListener.EXTRA_BACKGROUND_EVENT_TYPE");
                switch (i2) {
                    case 770:
                        CreditCardEntryAction creditCardEntryAction = (CreditCardEntryAction) bundle.getParcelable("FormEventListener.EXTRA_BACKGROUND_EVENT_DATA");
                        if (creditCardEntryAction == null) {
                            throw new IllegalArgumentException("CreditCardEntryAction background events must include a CreditCardEntryAction");
                        }
                        com.google.android.wallet.common.pub.apkg.apkg.a(new com.google.android.wallet.analytics.apkg.a(creditCardEntryAction, this.aq.c));
                        return;
                    case 771:
                    case 774:
                    case 775:
                    default:
                        throw new IllegalArgumentException(new StringBuilder(52).append("Unknown analytics background event type: ").append(i2).toString());
                    case 772:
                        WebViewPageLoadEvent webViewPageLoadEvent = (WebViewPageLoadEvent) bundle.getParcelable("FormEventListener.EXTRA_BACKGROUND_EVENT_DATA");
                        if (webViewPageLoadEvent == null) {
                            throw new IllegalArgumentException("WebViewPageLoad background events must include a WebViewPageLoadEvent.");
                        }
                        int i3 = bundle.getInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                        if (i3 == -1) {
                            throw new IllegalArgumentException("WebViewPageLoad background events must include a resultCode");
                        }
                        com.google.android.wallet.common.bpkg.a.a.a(i3, webViewPageLoadEvent, this.aq.c);
                        return;
                    case 773:
                        int i4 = bundle.getInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                        if (i4 == -1) {
                            throw new IllegalArgumentException("OTP autofill background event must include a resultCode");
                        }
                        com.google.android.wallet.common.bpkg.a.a.b(i2, i4, this.aq.c);
                        return;
                    case 776:
                        int i5 = bundle.getInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                        if (i5 == -1) {
                            throw new IllegalArgumentException("ProviderInstall background events must include a resultCode");
                        }
                        com.google.android.wallet.common.bpkg.a.a.b(776, i5, this.aq.c);
                        return;
                }
            case 8:
                if (this.f.v()) {
                    a((int[]) null, Bundle.EMPTY, (byte[]) null);
                    return;
                }
                return;
            case 10:
                int i6 = bundle.getInt("FormEventListener.EXTRA_RESULT_CODE", -1);
                if (i6 == -1) {
                    throw new IllegalArgumentException("NotifyResultListener event must contain a result code.");
                }
                Bundle bundle2 = bundle.getBundle("FormEventListener.EXTRA_RESULT_DATA");
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                a(i6, bundle2, false);
                return;
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int[] iArr) {
        this.aU = true;
        a(false, false);
        for (int i : iArr) {
            if (i == -1) {
                com.google.d.b.a.a.bpkg.b B = B();
                if (B.c != null) {
                    c(com.google.android.wallet.common.util.e.a(new Bundle(), 601, f_(android.R.string.dialog_alert_title), null, B.c, null, f_(R.string.ok)));
                    return;
                } else {
                    a(51, Bundle.EMPTY, false);
                    return;
                }
            }
        }
        this.aT = true;
        M();
        L();
    }

    @Override // com.google.android.wallet.b.c
    public final void a(com.google.b.a.a.a.b.a.bpkg.f fVar, com.google.b.a.a.a.b.a.bpkg.i[] iVarArr) {
        switch (fVar.f7670a) {
            case 3:
            case 4:
                byte[] bArr = fVar.d.c;
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("FormEventListener.EXTRA_TRIGGER_VALUE_REFERENCES", ParcelableProto.a(iVarArr));
                if (fVar.f7670a == 3) {
                    a(fVar.d.f7673b ? null : fVar.d.f7672a, bundle, bArr);
                    return;
                } else {
                    a(bundle, bArr, (com.google.b.a.a.a.b.a.b) null);
                    return;
                }
            default:
                throw new IllegalArgumentException(new StringBuilder(46).append("Unsupported resulting action type: ").append(fVar.f7670a).toString());
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.ap = (T) f().d().a("BaseOrchestrationFragmesidecar");
        if (this.ap == null || bundle == null) {
            ap a2 = f().d().a();
            if (this.ap != null) {
                a2.a(this.ap);
            }
            this.ap = F();
            a2.a(this.ap, "BaseOrchestrationFragmesidecar").b();
        }
        if (bundle != null) {
            a(this.ap.f == 1, true);
        }
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if (view == this.aj) {
            Context e = e();
            Intent b2 = bj.b(e, str);
            try {
                e.startActivity(b2);
                return;
            } catch (ActivityNotFoundException e2) {
                String valueOf = String.valueOf(b2.toString());
                Log.w("BaseOrchestrationFragme", valueOf.length() != 0 ? "Actvity was not found for intent, ".concat(valueOf) : new String("Actvity was not found for intent, "));
                return;
            }
        }
        if (view == this.ai && this.B.a("BaseOrchestrationFragmewebViewDialog") == null) {
            bq.a(str, this.aI).a(this.B, "BaseOrchestrationFragmewebViewDialog");
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (view.getId() == com.google.android.wallet.instrumentmanager.e.steal_focus_and_hide_keyboard && z) {
            bj.b(f(), view);
        }
    }

    @Override // com.google.android.wallet.nfc.b
    public final void b(Intent intent) {
        if (this.f instanceof com.google.android.wallet.nfc.b) {
            ((com.google.android.wallet.nfc.b) this.f).b(intent);
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.e getParentUiNode() {
        return null;
    }

    @Override // com.google.android.wallet.analytics.e
    public void setParentUiNode(com.google.android.wallet.analytics.e eVar) {
        throw new UnsupportedOperationException("Top level UiNode doesn't support custom parents.");
    }

    @Override // com.google.android.wallet.common.b
    public final com.google.android.wallet.common.a b() {
        return this.at;
    }

    public final void a(int i, Bundle bundle, boolean z) {
        if (z) {
            this.aM.b(i, bundle);
        } else {
            if (j()) {
                this.aM.a(i, bundle);
                return;
            }
            this.aN = true;
            this.aO = i;
            this.aP = bundle;
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void E_() {
        if (this.w) {
            f().d().a().a(this.ap).b();
            this.ap = null;
            com.google.android.wallet.instrumentmanager.bpkg.a.a.a((Activity) f(), true);
        }
        super.E_();
        this.aM = null;
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        ComponentCallbacks componentCallbacks = this.E;
        if (componentCallbacks instanceof d) {
            this.aM = (d) componentCallbacks;
        } else {
            this.aM = (d) f();
        }
        com.google.android.a.g.a(f().getApplicationContext());
        super.a(bundle);
        TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside, com.google.android.wallet.instrumentmanager.b.imShowErrorMessagesInDialog, com.google.android.wallet.instrumentmanager.b.imRootLayout, com.google.android.wallet.instrumentmanager.b.imPopupRedirectActivitySupported, com.google.android.wallet.instrumentmanager.b.imPopupRedirectActivityTheme});
        this.aH = obtainStyledAttributes.getBoolean(0, false);
        this.aL = obtainStyledAttributes.getBoolean(1, false);
        this.al = obtainStyledAttributes.getResourceId(2, 0);
        this.an = obtainStyledAttributes.getBoolean(3, false);
        this.am = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.recycle();
        this.ax = (Account) this.r.getParcelable("account");
        if (bundle != null) {
            this.aq = (com.google.b.a.a.a.b.a.f) ParcelableProto.a(bundle, "responseContext");
            this.as = (h) ParcelableProto.a(bundle, "secureHeader");
            this.au = bundle.getBundle("lastFormEventDetailsForPageValue");
            this.av = bundle.getByteArray("lastDependencyGraphRequestTokenForPageValue");
            this.aw = new com.google.android.wallet.common.bpkg.a.b(bundle.getBoolean("impressionForPageTracked"));
            this.aB = bundle.getString("progressTitle");
            this.aC = bundle.getString("progressMessage");
            this.aA = bundle.getBundle("inlineErrorMessageDetails");
            this.ao = ParcelableProto.a(bundle, "lastRequest");
            this.aG = bundle.getBoolean("sidecarInitialized");
            this.aR = bundle.getBoolean("beforePermissionsRequestedMessageShown");
            this.aS = bundle.getBoolean("permissionsRequested");
            this.aT = bundle.getBoolean("permissionsGranted");
            this.aU = bundle.getBoolean("permissionsFlowCompleted");
        } else {
            this.aw = new com.google.android.wallet.common.bpkg.a.b(false);
        }
        com.google.android.wallet.instrumentmanager.bpkg.a.a.a((Activity) f(), false);
    }
}
