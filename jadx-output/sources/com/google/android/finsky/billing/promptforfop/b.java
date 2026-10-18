package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.by;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.billing.giftcard.RedeemCodeResult;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.RedeemCodeActivity;
import com.google.android.finsky.billing.m;
import com.google.android.finsky.layout.SeparatorLinearLayout;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.SetupWizardUtils;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayActionButton;
import java.util.List;

/* loaded from: classes.dex */
public class b extends m implements View.OnClickListener {
    private ViewGroup ai;
    private View aj;
    private List<com.google.android.finsky.billing.lightpurchase.billingprofile.g> ak;
    private ViewGroup am;
    private boolean an;
    private TextView ao;
    private ai h;
    private int i;
    private int al = -1;
    private final View.OnClickListener ap = new c(this);

    public static Fragment a(Account account, byte[] bArr) {
        Bundle b2 = b(account, bArr);
        b bVar = new b();
        bVar.f(b2);
        return bVar;
    }

    protected static Bundle b(Account account, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BillingProfileFragment.account", account);
        bundle.putByteArray("PromptForFopFragment.server_logs_cookie", bArr);
        return bundle;
    }

    @Override // com.google.android.finsky.billing.m, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.i = J();
        this.h = i.a(I());
        i.a(this.h, this.r.getByteArray("PromptForFopFragment.server_logs_cookie"));
        if (bundle != null) {
            this.an = bundle.getBoolean("PromptForFopFragment.has_logged_screen");
        }
    }

    protected int I() {
        return 1002;
    }

    protected int J() {
        return 1;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.am = (ViewGroup) layoutInflater.inflate(K(), viewGroup, false);
        View findViewById = this.am.findViewById(R.id.actions_container);
        this.ai = (ViewGroup) findViewById.findViewById(R.id.actions);
        TextView textView = (TextView) this.am.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(R.string.setup_account_title);
        }
        TextView textView2 = (TextView) this.am.findViewById(R.id.account);
        if (textView2 != null) {
            textView2.setText(this.c.name);
            textView2.setVisibility(0);
        }
        ((TextView) this.am.findViewById(R.id.primer)).setText(Html.fromHtml(f_(L())));
        this.f = this.am.findViewById(R.id.loading_indicator);
        this.e = this.am.findViewById(R.id.profile);
        SetupWizardNavBar a2 = SetupWizardUtils.a(f());
        if (a2 != null) {
            this.aj = a2.f4642a;
        } else {
            this.aj = this.am.findViewById(R.id.continue_button);
        }
        a(this.aj);
        this.aj.setEnabled(false);
        if (!(this.aj instanceof PlayActionButton)) {
            this.aj.setOnClickListener(this);
        }
        switch (this.i) {
            case 1:
                this.ao = (TextView) this.am.findViewById(R.id.not_now_button);
                this.ao.setOnClickListener(this.ap);
                break;
            default:
                View findViewById2 = this.am.findViewById(R.id.continue_button_bar);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                by.a(findViewById, 0, 0, 0, g().getDimensionPixelSize(R.dimen.prompt_for_fop_bottom_padding));
                break;
        }
        return this.am;
    }

    protected int K() {
        return R.layout.prompt_for_fop_fragment;
    }

    protected void a(View view) {
        if (view instanceof PlayActionButton) {
            ((PlayActionButton) view).a(3, R.string.continue_text, this);
        } else {
            FinskyLog.e("Unexpected continue button type: %s", view.getClass().getSimpleName());
        }
    }

    protected int L() {
        return R.string.setup_account_primer;
    }

    @Override // com.google.android.finsky.billing.m, android.support.v4.app.Fragment
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle != null) {
            this.al = bundle.getInt("PromptForFopFragment.selected_index", this.al);
        }
        if (this.al >= 0) {
            b(this.al);
        }
    }

    @Override // com.google.android.finsky.billing.m, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("PromptForFopFragment.selected_index", this.al);
        bundle.putBoolean("PromptForFopFragment.has_logged_screen", this.an);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(List<com.google.android.finsky.billing.lightpurchase.billingprofile.g> list) {
        this.ak = list;
        this.ai.removeAllViews();
        if (this.i == 1) {
            this.ao.setVisibility(0);
            this.ao.setText(this.f2411b.h.toUpperCase());
        }
        if (this.i == 2) {
            list.add(new com.google.android.finsky.billing.lightpurchase.billingprofile.g(this.f2411b.h, null, this.f2411b.g, null, null, this.ap, null, 1008));
        }
        ViewGroup viewGroup = this.ai;
        int size = list.size();
        int i = 0;
        while (i < size) {
            boolean z = i == size + (-1);
            com.google.android.finsky.billing.lightpurchase.billingprofile.g gVar = list.get(i);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(M(), viewGroup, false);
            ((TextView) inflate.findViewById(R.id.title)).setText(gVar.f2334a);
            FifeImageView fifeImageView = (FifeImageView) inflate.findViewById(R.id.image_icon);
            ds dsVar = gVar.c;
            if (dsVar == null) {
                fifeImageView.setVisibility(8);
            } else {
                fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
            }
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radio);
            radioButton.setId(i);
            radioButton.setClickable(false);
            radioButton.setVisibility(0);
            inflate.setOnClickListener(new d(this, i));
            if (z && (inflate instanceof SeparatorLinearLayout)) {
                ((SeparatorLinearLayout) inflate).b();
            }
            viewGroup.addView(inflate);
            i++;
        }
        if (this.i == 2) {
            b(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final boolean a(io[] ioVarArr) {
        if (ioVarArr.length <= 0) {
            return true;
        }
        FinskyLog.c("Unexpected instruments found.", new Object[0]);
        e N = N();
        if (N == null) {
            return false;
        }
        N.q();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(io[] ioVarArr, byte[] bArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void c(String str) {
        O();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void d(String str) {
        FinskyLog.e("Unexpected instrument edit.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void e(String str) {
        O();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(RedeemCodeResult redeemCodeResult) {
        FinskyLog.e("Unexpected promo code redemption.", new Object[0]);
    }

    protected int M() {
        return R.layout.prompt_for_fop_row;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int i2 = 0;
        while (i2 < this.ak.size()) {
            ((RadioButton) this.am.findViewById(i2)).setChecked(i == i2);
            i2++;
        }
        this.al = i;
        this.aj.setEnabled(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.al >= 0) {
            this.ak.get(this.al).f.onClick(view);
        }
    }

    private e N() {
        if (f() instanceof e) {
            return (e) f();
        }
        FinskyLog.e("No listener registered.", new Object[0]);
        return null;
    }

    private void O() {
        e N = N();
        if (N != null) {
            N.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final Intent z() {
        return RedeemCodeActivity.a(this.c.name, 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public int A() {
        return 350;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public int B() {
        return 351;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public int C() {
        return 352;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public int D() {
        return 353;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public int F() {
        return 357;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public int H() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void u() {
        this.d.b(213, null, (cy) f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void w() {
        if (!this.an) {
            this.an = true;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.ak.size()) {
                    break;
                }
                com.google.android.finsky.billing.lightpurchase.billingprofile.g gVar = this.ak.get(i2);
                this.d.b(gVar.h, gVar.g, this);
                i = i2 + 1;
            }
            if (this.i == 2) {
                return;
            }
            this.d.b(1008, null, this);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return (cy) f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(String str) {
        e N = N();
        if (N == null) {
            return;
        }
        N.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final byte[] G() {
        return this.r.getByteArray("PromptForFopFragment.server_logs_cookie");
    }

    static /* synthetic */ void b(b bVar) {
        e N = bVar.N();
        if (N == null) {
            return;
        }
        N.o();
    }
}
