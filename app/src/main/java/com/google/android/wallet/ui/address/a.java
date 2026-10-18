package com.google.android.wallet.ui.address;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.wallet.ui.common.SummaryTextLayout;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

@TargetApi(14)
/* loaded from: classes.dex */
public final class a extends b implements TextView.OnEditorActionListener, com.google.android.wallet.ui.expander.c {

    /* renamed from: a, reason: collision with root package name */
    SummaryExpanderWrapper f7376a;
    private final ArrayList<View> aB = new ArrayList<>();
    private final com.google.android.wallet.ui.expander.a aC = new com.google.android.wallet.ui.expander.a();
    private EditText aD;
    private boolean aE;
    private ViewGroup au;

    /* renamed from: b, reason: collision with root package name */
    SummaryTextLayout f7377b;

    public static a a(com.google.b.a.a.a.b.a.apkg.b bVar, int i) {
        a aVar = new a();
        Bundle a2 = b.a(i, bVar);
        a2.putBoolean("isInsideTree", false);
        aVar.f(a2);
        return aVar;
    }

    @Override // com.google.android.wallet.ui.address.b, com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.aE = this.r.getBoolean("isInsideTree");
        this.aC.f = this.aE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.address.b, com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View c = super.c(layoutInflater, viewGroup, bundle);
        this.f7376a = (SummaryExpanderWrapper) c.findViewById(com.google.android.wallet.e.g.address_wrapper);
        SummaryExpanderWrapper summaryExpanderWrapper = this.f7376a;
        int i = com.google.android.wallet.e.g.address_summary_image;
        int i2 = com.google.android.wallet.e.g.address_summary_text;
        summaryExpanderWrapper.setSummaryImage(i);
        summaryExpanderWrapper.setSummaryView(i2);
        summaryExpanderWrapper.setFormValidatable(this);
        summaryExpanderWrapper.setExpanderVisibilityListener(this);
        getExpandable().a(summaryExpanderWrapper);
        this.f7377b = (SummaryTextLayout) c.findViewById(com.google.android.wallet.e.g.address_summary_text);
        this.au = (ViewGroup) c.findViewById(com.google.android.wallet.e.g.container);
        if (this.f7377b != null) {
            if (!TextUtils.isEmpty(((com.google.b.a.a.a.b.a.apkg.b) this.aw).r)) {
                this.f7377b.setHint(((com.google.b.a.a.a.b.a.apkg.b) this.aw).r);
            } else if (!TextUtils.isEmpty(((com.google.b.a.a.a.b.a.apkg.b) this.aw).d)) {
                this.f7377b.setHint(((com.google.b.a.a.a.b.a.apkg.b) this.aw).d);
                this.au.findViewById(com.google.android.wallet.e.g.address_title).setVisibility(8);
            }
        }
        if (((com.google.b.a.a.a.b.a.apkg.b) this.aw).p == 4 && bundle == null) {
            this.f7377b.setEditMode(2);
        }
        this.f7377b.setOnFocusChangeListener(this);
        return c;
    }

    @Override // com.google.android.wallet.ui.common.ah, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        Q();
        if (!this.aE) {
            this.aC.b();
        }
    }

    @Override // com.google.android.wallet.ui.address.b, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (((com.google.b.a.a.a.b.a.apkg.b) this.aw).p == 4) {
            D();
        }
        P();
    }

    @Override // com.google.android.wallet.ui.expander.c
    public final void x() {
        this.au.requestFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.wallet.ui.expander.c
    public final boolean y() {
        List<ai<View>> w = w();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            View view = w.get(i).f7482b;
            if (view instanceof com.google.android.wallet.ui.common.t) {
                com.google.android.wallet.ui.common.t tVar = (com.google.android.wallet.ui.common.t) view;
                if (!tVar.ag_() || !TextUtils.isEmpty(tVar.getError())) {
                    bj.b(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.ak
    public final boolean b(int[] iArr) {
        boolean b2 = super.b(iArr);
        if (!b2 && !this.aE) {
            this.aC.b(false);
        }
        return b2;
    }

    @Override // com.google.android.wallet.ui.address.b, com.google.android.wallet.ui.common.y
    public final boolean a(com.google.b.a.a.a.b.a.j jVar) {
        boolean a2 = super.a(jVar);
        if (a2 && !this.aE) {
            this.aC.b(false);
        }
        return a2;
    }

    @Override // com.google.android.wallet.ui.expander.c
    public final void C() {
        String str = "";
        if (a((int[]) null, false) && !M()) {
            Bundle bundle = Bundle.EMPTY;
            str = a(L());
        }
        this.f7377b.setText(str);
    }

    @Override // com.google.android.wallet.ui.address.b
    protected final boolean D() {
        boolean D = super.D();
        if (D) {
            P();
            R();
        }
        return D;
    }

    private void P() {
        this.f7376a.getExpandable().a(M() || this.am);
    }

    @Override // com.google.android.wallet.ui.expander.c
    public final void b(int i) {
        if (this.au != null && this.aB != null) {
            int size = this.aB.size();
            for (int i2 = 0; i2 < size; i2++) {
                a(this.aB.get(i2), i);
            }
        }
    }

    @Override // com.google.android.wallet.ui.expander.c
    public final void E() {
        N();
    }

    @Override // com.google.android.wallet.ui.expander.c
    public final ArrayList<View> F() {
        return this.aB;
    }

    @Override // com.google.android.wallet.ui.expander.c
    public final void G() {
        Q();
    }

    @Override // com.google.android.wallet.ui.expander.c
    public final void H() {
        if (this.au != null) {
            if (!this.aC.f7545b) {
                this.au.setVisibility(8);
                return;
            }
            this.au.setVisibility(0);
            int size = this.aB.size();
            for (int i = 0; i < size; i++) {
                this.aB.get(i).setTag(com.google.android.wallet.e.g.summary_expander_transition_name, null);
            }
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView != this.aD) {
            return false;
        }
        if (i == 6 || i == 5) {
            this.aC.c();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.address.b, com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.f7376a != null) {
            super.u();
            this.f7376a.setEnabled(this.av);
        }
    }

    @Override // com.google.android.wallet.ui.address.b
    protected final void I() {
        super.I();
        if (this.aE) {
            if (this.aD != null) {
                this.aD.setOnEditorActionListener(null);
                this.aD = null;
            }
            List<ai<View>> w = w();
            int size = w.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                View view = w.get(size).f7482b;
                if (view instanceof EditText) {
                    this.aD = (EditText) view;
                    this.aD.setOnEditorActionListener(this);
                    break;
                }
                size--;
            }
        }
        R();
    }

    @Override // com.google.android.wallet.ui.address.b, android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        super.onCheckedChanged(compoundButton, z);
        P();
        this.f7376a.setSummaryImageVisible(!M());
    }

    @Override // com.google.android.wallet.ui.address.b, android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (view == this.f7377b) {
            if (z && !this.aC.f7545b) {
                this.f7376a.getExpandable().b(true);
                return;
            }
            return;
        }
        super.onFocusChange(view, z);
    }

    @Override // com.google.android.wallet.ui.address.b
    protected final void J() {
        if (!this.aE && !d((int[]) null) && a((int[]) null, false)) {
            this.aC.c();
        }
    }

    private void Q() {
        if (this.au != null) {
            this.aB.clear();
            a(this.au);
            this.au.setVisibility(0);
            R();
        }
    }

    private void a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                if (!((childAt instanceof com.google.android.wallet.ui.common.s) || (childAt instanceof AdapterView))) {
                    if (childAt.getVisibility() == 0) {
                        a((ViewGroup) childAt);
                    }
                }
            }
            if (!(childAt instanceof ProgressBar)) {
                if (this.aC.f7545b) {
                    childAt.setTag(com.google.android.wallet.e.g.summary_expander_transition_name, null);
                    if (c(childAt) == 0) {
                        this.aB.add(childAt);
                    }
                } else if (childAt.getTag(com.google.android.wallet.e.g.summary_expander_transition_name) != null || c(childAt) == 0) {
                    if (childAt.getTag(com.google.android.wallet.e.g.summary_expander_transition_name) == null) {
                        childAt.setTag(com.google.android.wallet.e.g.summary_expander_transition_name, "animatingViewTransitionName");
                    }
                    a(childAt, 8);
                    this.aB.add(childAt);
                }
            }
        }
    }

    private void R() {
        this.f7376a.setAlignToView(b(this.au));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View b(ViewGroup viewGroup) {
        View view;
        View view2 = null;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.google.android.wallet.ui.common.s) {
                View innerFieldView = ((com.google.android.wallet.ui.common.s) childAt).getInnerFieldView();
                if (innerFieldView != null && b(innerFieldView)) {
                    return innerFieldView;
                }
                view = view2;
            } else if (!b(childAt)) {
                if (a(childAt) && (childAt instanceof ViewGroup)) {
                    view = b((ViewGroup) childAt);
                    if (view != null) {
                        return view;
                    }
                } else {
                    view = view2;
                }
            } else {
                return childAt;
            }
            i++;
            view2 = view;
        }
        return view2;
    }

    private static boolean a(View view) {
        return ((view.getParent() instanceof com.google.android.wallet.ui.common.s) && ((View) view.getParent()).getTag(com.google.android.wallet.e.g.summary_expander_transition_name) != null) || view.getVisibility() == 0 || view.getTag(com.google.android.wallet.e.g.summary_expander_transition_name) != null;
    }

    private static boolean b(View view) {
        return view.getId() != com.google.android.wallet.e.g.address_title && a(view) && ((view instanceof TextView) || (view.getParent() instanceof com.google.android.wallet.ui.common.s));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(View view, int i) {
        View innerFieldView;
        view.setVisibility(i);
        if ((view instanceof com.google.android.wallet.ui.common.s) && (innerFieldView = ((com.google.android.wallet.ui.common.s) view).getInnerFieldView()) != null) {
            innerFieldView.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int c(View view) {
        View innerFieldView;
        return (!(view instanceof com.google.android.wallet.ui.common.s) || (innerFieldView = ((com.google.android.wallet.ui.common.s) view).getInnerFieldView()) == null) ? view.getVisibility() : innerFieldView.getVisibility();
    }

    @Override // com.google.android.wallet.ui.address.b
    protected final int K() {
        return com.google.android.wallet.e.h.fragment_address_expander;
    }

    @Override // com.google.android.wallet.ui.common.d, com.google.android.wallet.ui.common.r
    public final /* bridge */ /* synthetic */ com.google.android.wallet.ui.common.q getExpandable() {
        return this.aC;
    }
}
