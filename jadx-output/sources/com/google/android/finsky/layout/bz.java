package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.cl;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.CardLinearLayout;

/* loaded from: classes.dex */
public abstract class bz<V extends cl> extends CardLinearLayout implements View.OnClickListener, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    protected final com.google.android.finsky.a.ai f3176a;

    /* renamed from: b, reason: collision with root package name */
    protected final LayoutInflater f3177b;
    protected Account c;
    protected com.google.android.play.image.e d;
    protected DfeToc e;
    protected com.google.android.finsky.navigationmanager.b f;
    protected com.google.android.finsky.layout.play.cy g;
    protected com.google.android.finsky.activities.b.x h;
    protected int i;
    private final int j;
    private com.google.android.finsky.a.i k;
    private com.google.android.finsky.activities.b.af l;
    private TextView m;
    private View n;
    private ViewGroup o;
    private ViewGroup p;
    private View q;

    protected abstract V a(ViewGroup viewGroup);

    protected abstract void a(V v, Document document, boolean z);

    public static void setMarginsForCardView(View view) {
        int a2 = ik.a(view.getResources());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(a2, marginLayoutParams.topMargin, a2, marginLayoutParams.bottomMargin);
    }

    protected bz(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        this.f3176a = com.google.android.finsky.a.i.a(i);
        this.j = i2;
        this.f3177b = LayoutInflater.from(context);
        this.i = i3;
    }

    protected void a(TextView textView) {
    }

    private int getItemCount() {
        if (this.h.b(this.i) == null) {
            return 0;
        }
        return this.h.b(this.i).p();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.m = (TextView) findViewById(R.id.title);
        this.o = (ViewGroup) findViewById(R.id.my_account_card_holder);
        this.p = (ViewGroup) findViewById(R.id.more_footer);
        this.q = findViewById(R.id.loading_indicator);
        this.n = findViewById(R.id.error_indicator);
    }

    public final void a(com.google.android.finsky.activities.b.x xVar, Account account, DfeToc dfeToc, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.c = account;
        this.h = xVar;
        this.e = dfeToc;
        this.d = eVar;
        this.f = bVar;
        this.g = cyVar;
        this.k = FinskyApp.a().c(account);
        this.l = new com.google.android.finsky.activities.b.af(this.k);
        if (this.h != null) {
            if (!this.h.a(this.i)) {
                setVisibility(8);
                return;
            }
            com.google.android.finsky.activities.b.x xVar2 = this.h;
            int i = this.i;
            if (!(xVar2.f1601a.containsKey(Integer.valueOf(i)) && xVar2.b(i).a())) {
                com.google.android.finsky.activities.b.x xVar3 = this.h;
                int i2 = this.i;
                if (xVar3.f1601a.containsKey(Integer.valueOf(i2)) && xVar3.f1601a.get(Integer.valueOf(i2)).c) {
                    setVisibility(0);
                    setMarginsForCardView(this);
                    this.m.setText(this.h.c(this.i));
                    this.q.setVisibility(8);
                    this.o.setVisibility(8);
                    this.p.setVisibility(8);
                    this.n.setVisibility(0);
                    this.n.findViewById(R.id.retry_button).setOnClickListener(new ca(this));
                    return;
                }
                a();
                return;
            }
            setVisibility(0);
            setMarginsForCardView(this);
            this.m.setText(this.h.c(this.i));
            this.q.setVisibility(8);
            this.o.setVisibility(0);
            int itemCount = getItemCount();
            int min = Math.min(3, itemCount);
            this.o.removeAllViews();
            int i3 = 0;
            while (i3 < min) {
                V a2 = a(this.o);
                this.o.addView(a2);
                a(a2, this.h.b(this.i).c(i3), i3 == 0);
                this.l.a(a2, i3);
                if (i3 == 0) {
                    this.l.b(a2, i3);
                }
                i3++;
            }
            if (min == 0) {
                TextView textView = (TextView) this.f3177b.inflate(R.layout.my_account_no_row, this.o, false);
                if (textView != null) {
                    this.o.addView(textView);
                    a(textView);
                }
            }
            if (itemCount <= 3) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
                this.p.setOnClickListener(this);
            }
            this.g.a(this);
            com.google.android.finsky.a.i.a(this.f3176a, ((com.google.android.finsky.api.model.d) this.h.b(this.i)).f1970a.f1963a.R);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        setVisibility(0);
        setMarginsForCardView(this);
        this.q.setVisibility(0);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.n.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.p) {
            this.k.a(this.j, (byte[]) null, this);
            com.google.android.finsky.navigationmanager.b bVar = this.f;
            String str = this.h.b(this.i).d;
            String c = this.h.c(this.i);
            DfeToc dfeToc = this.e;
            int i = this.i;
            if (!bVar.k()) {
                return;
            }
            bVar.a(15, str, (Fragment) com.google.android.finsky.activities.b.u.a(str, c, dfeToc, i == 0), false, new View[0]);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f3176a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.g;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
