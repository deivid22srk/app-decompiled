package com.google.android.wallet.ui.b;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.view.ao;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.e.g;
import com.google.android.wallet.e.h;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.FormHeaderView;
import com.google.android.wallet.ui.common.InfoMessageTextView;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.aq;
import com.google.android.wallet.ui.common.az;
import com.google.android.wallet.ui.common.bb;
import com.google.android.wallet.ui.common.bd;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.bq;
import com.google.android.wallet.ui.common.e;
import com.google.b.a.a.a.b.a.a.l;
import com.google.b.a.a.a.b.a.a.o;
import com.google.b.a.a.a.b.a.a.p;
import com.google.b.a.a.a.b.a.a.q;
import com.google.b.a.a.a.b.a.a.r;
import com.google.b.a.a.a.b.a.a.s;
import com.google.b.a.a.a.b.a.a.t;
import com.google.b.a.a.a.b.a.a.v;
import com.google.b.a.a.a.b.a.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a extends ah<q> implements bb, e {
    private int ai;
    private int ap;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f7403b;
    private final f aj = new f(1715);
    private final ArrayList<com.google.android.wallet.analytics.e> ak = new ArrayList<>();
    private final ArrayList<com.google.android.wallet.analytics.e> al = new ArrayList<>();
    private final ArrayList<ArrayList<com.google.android.wallet.analytics.e>> am = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<d> f7402a = new ArrayList<>();
    final ArrayList<View> c = new ArrayList<>();
    final ArrayList<com.google.android.wallet.ui.address.b> d = new ArrayList<>();
    final ArrayList<InfoMessageTextView> e = new ArrayList<>();
    final ArrayList<aq> f = new ArrayList<>();
    final ArrayList<RegionCodeView> g = new ArrayList<>();
    final ArrayList<int[]> h = new ArrayList<>();
    final ArrayList<View> i = new ArrayList<>();
    private final ArrayList<Integer> an = new ArrayList<>();
    private final ArrayList<Integer> ao = new ArrayList<>();

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            int i = 0;
            while (true) {
                String valueOf = String.valueOf("regionCodes_");
                int i2 = i + 1;
                int[] intArray = bundle.getIntArray(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
                if (intArray != null) {
                    this.h.add(intArray);
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.wallet.analytics.e, com.google.android.wallet.ui.common.aq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.android.wallet.analytics.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.wallet.ui.b.a, com.google.android.wallet.ui.common.bb, com.google.android.wallet.ui.common.d, com.google.android.wallet.ui.common.e] */
    private void a(ViewGroup viewGroup, o oVar, String str, int i, int i2) {
        int[] a2;
        int i3;
        View view;
        int i4;
        int i5;
        View view2;
        int a3 = O().a();
        String str2 = null;
        if (oVar.f7634a == null) {
            if (oVar.f7635b != null) {
                FrameLayout frameLayout = new FrameLayout(this.aJ);
                frameLayout.setId(a3);
                com.google.android.wallet.ui.address.b bVar = (com.google.android.wallet.ui.address.b) h().a(a3);
                ?? r0 = bVar;
                if (bVar == null) {
                    com.google.android.wallet.ui.address.b a4 = bj.a(oVar.f7635b, this.aI);
                    h().a().a(a3, a4).b();
                    r0 = a4;
                }
                int size = this.d.size();
                int i6 = oVar.f7635b.f7560b;
                this.d.add(r0);
                a(r0, i);
                view = frameLayout;
                i3 = 4;
                i4 = size;
                i5 = i6;
                view2 = r0;
            } else if (oVar.c != null) {
                InfoMessageTextView infoMessageTextView = (InfoMessageTextView) this.aK.inflate(this.ai, viewGroup, false);
                infoMessageTextView.setId(a3);
                infoMessageTextView.setInfoMessage(oVar.c);
                infoMessageTextView.setUrlClickListener(this);
                int size2 = this.e.size();
                int i7 = oVar.c.f7686a;
                this.e.add(infoMessageTextView);
                a(infoMessageTextView, i);
                i3 = 0;
                view = infoMessageTextView;
                i4 = size2;
                i5 = i7;
                view2 = infoMessageTextView;
            } else if (oVar.d != null) {
                FrameLayout frameLayout2 = new FrameLayout(this.aJ);
                frameLayout2.setId(a3);
                aq aqVar = (aq) h().a(a3);
                ?? r02 = aqVar;
                if (aqVar == null) {
                    aq a5 = a(oVar.d);
                    h().a().a(a3, a5).b();
                    r02 = a5;
                }
                r02.a(this.az, this.aA);
                int size3 = this.f.size();
                int i8 = oVar.d.f7630a.f7693b;
                this.f.add(r02);
                a(r02, i);
                view = frameLayout2;
                i3 = 2;
                i4 = size3;
                i5 = i8;
                view2 = r02;
            } else if (oVar.e != null) {
                RegionCodeView regionCodeView = (RegionCodeView) this.aK.inflate(h.view_region_code, viewGroup, false);
                regionCodeView.setId(a3);
                int size4 = this.g.size();
                if (this.h.size() > size4) {
                    a2 = this.h.get(size4);
                } else {
                    a2 = com.google.android.wallet.common.a.f.a(com.google.android.wallet.common.a.f.a(oVar.e.f7613b));
                    this.h.add(a2);
                }
                regionCodeView.setFormHeader(oVar.e.f7612a);
                regionCodeView.setRegionCodes(a2);
                regionCodeView.setSelectedRegionCode$2563266(com.google.android.wallet.common.a.o.a(oVar.e.c));
                int i9 = oVar.e.f7612a.f7629b;
                this.g.add(regionCodeView);
                bj.a(regionCodeView, i9, this.az, this.aA);
                str2 = oVar.e.c;
                i3 = 3;
                view = regionCodeView;
                i4 = size4;
                i5 = i9;
                view2 = regionCodeView;
            } else {
                throw new IllegalArgumentException("Empty or unknown field in SimpleForm.");
            }
        } else {
            bd bdVar = new bd(oVar.f7634a, this.aK, viewGroup);
            bdVar.f7506a = f();
            bdVar.f7507b = a3;
            bdVar.c = this;
            View a6 = bdVar.a();
            int size5 = this.c.size();
            int i10 = oVar.f7634a.f7693b;
            ?? a7 = bj.a(oVar.f7634a);
            this.c.add(a6);
            bj.a(a6, oVar.f7634a.f7693b, this.az, this.aA);
            i3 = 1;
            view = a6;
            i4 = size5;
            i5 = i10;
            view2 = a6;
            str2 = a7;
        }
        if (oVar.f) {
            int size6 = this.an.size();
            this.an.add(Integer.valueOf(this.f7403b.getChildCount()));
            this.ao.add(Integer.valueOf(i == -1 ? -1 : viewGroup.getChildCount()));
            if (size6 >= this.ap) {
                c cVar = new c(this, size6);
                View e = bj.e(view);
                if (e instanceof FormEditText) {
                    ((FormEditText) e).a(cVar);
                } else if (i3 == 2) {
                    this.f.get(i4).a(cVar);
                } else {
                    throw new IllegalStateException("Invalid field type for hideFieldsBelow");
                }
            }
        }
        view.setTag(g.field_type, Integer.valueOf(i3));
        viewGroup.addView(view);
        d dVar = new d(i5, view2, str2);
        dVar.d = i3;
        dVar.e = i4;
        dVar.f = str;
        dVar.g = i2;
        this.f7402a.add(dVar);
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("revealBelowTriggeredCount", this.ap);
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            String valueOf = String.valueOf("regionCodes_");
            bundle.putIntArray(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), this.h.get(i));
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        this.ak.clear();
        this.al.clear();
        this.am.clear();
        this.f7402a.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        super.d();
    }

    private void a(com.google.android.wallet.analytics.e eVar, int i) {
        if (i < 0) {
            this.ak.add(eVar);
        } else {
            eVar.setParentUiNode(this.al.get(i));
            this.am.get(i).add(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.c.size() + this.d.size() + this.e.size() + this.f.size() + this.i.size() == 0) {
            return;
        }
        boolean z = this.av;
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.c.get(i).setEnabled(z);
        }
        int size2 = this.d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.d.get(i2).b(z);
        }
        int size3 = this.e.size();
        for (int i3 = 0; i3 < size3; i3++) {
            this.e.get(i3).setEnabled(z);
        }
        int size4 = this.f.size();
        for (int i4 = 0; i4 < size4; i4++) {
            this.f.get(i4).a(z);
        }
        int size5 = this.g.size();
        for (int i5 = 0; i5 < size5; i5++) {
            this.g.get(i5).setEnabled(z);
        }
        int size6 = this.i.size();
        for (int i6 = 0; i6 < size6; i6++) {
            this.i.get(i6).setEnabled(z);
        }
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.get(i);
        }
        return this.ap >= this.an.size();
    }

    @Override // com.google.android.wallet.analytics.e
    public f getUiElement() {
        return this.aj;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<com.google.android.wallet.analytics.e> getChildren() {
        return this.ak;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<d> w() {
        return this.f7402a;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        int size = this.f7402a.size();
        for (int i = 0; i < size; i++) {
            d dVar = this.f7402a.get(i);
            if (jVar.f7704a.f7650a.equals(dVar.f) && jVar.f7704a.c == dVar.g) {
                if (dVar.d == 1) {
                    bj.a(this.c.get(dVar.e), jVar.f7705b);
                } else if (dVar.d == 2) {
                    this.f.get(dVar.e).setError(jVar.f7705b);
                } else {
                    throw new IllegalArgumentException(new StringBuilder(56).append("Could not apply FormFieldMessage to fieldId: ").append(jVar.f7704a.f7651b).toString());
                }
                return true;
            }
        }
        int size2 = this.d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (this.d.get(i2).a(jVar)) {
                return true;
            }
        }
        return false;
    }

    public final s c(Bundle bundle) {
        int i;
        s sVar = new s();
        sVar.f7642a = ((q) this.aw).f7638a.f7628a;
        sVar.f7643b = ((q) this.aw).f7638a.c;
        sVar.c = new t[((q) this.aw).f7639b.length];
        int length = ((q) this.aw).f7639b.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r rVar = ((q) this.aw).f7639b[i2];
            sVar.c[i2] = new t();
            if (rVar.f7640a != null) {
                v vVar = new v();
                vVar.f7648a = rVar.f7640a.f7646a.f7628a;
                vVar.f7649b = rVar.f7640a.f7646a.c;
                vVar.c = new p[rVar.f7640a.f7647b.length];
                int length2 = rVar.f7640a.f7647b.length;
                i = i3;
                int i4 = 0;
                while (i4 < length2) {
                    vVar.c[i4] = a(rVar.f7640a.f7647b[i4], i, bundle);
                    i4++;
                    i++;
                }
                if (rVar.f7640a.c != null) {
                    vVar.d = rVar.f7640a.c.c;
                }
                sVar.c[i2].f7644a = vVar;
            } else if (rVar.f7641b != null) {
                i = i3 + 1;
                sVar.c[i2].f7645b = a(rVar.f7641b, i3, bundle);
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        if (((q) this.aw).c != null) {
            sVar.d = ((q) this.aw).c.c;
        }
        return sVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private p a(o oVar, int i, Bundle bundle) {
        p pVar = new p();
        d dVar = this.f7402a.get(i);
        switch (dVar.d) {
            case 0:
                return pVar;
            case 1:
                pVar.f7636a = bj.a(this.c.get(dVar.e), oVar.f7634a);
                return pVar;
            case 2:
                pVar.c = this.f.get(dVar.e).c(bundle);
                return pVar;
            case 3:
                pVar.d = this.g.get(dVar.e).getFieldValue();
                return pVar;
            case 4:
                pVar.f7637b = this.d.get(dVar.e).L();
                return pVar;
            default:
                throw new IllegalStateException(new StringBuilder(45).append("Unknown field type ").append(dVar.d).append(" in SimpleForm.").toString());
        }
    }

    private void x() {
        if (this.ap != this.an.size()) {
            int intValue = this.an.get(this.ap).intValue();
            int intValue2 = this.ao.get(this.ap).intValue();
            int childCount = this.f7403b.getChildCount();
            for (int i = intValue + 1; i < childCount; i++) {
                this.f7403b.getChildAt(i).setVisibility(8);
            }
            if (intValue2 >= 0) {
                ViewGroup viewGroup = (ViewGroup) this.f7403b.getChildAt(intValue);
                int childCount2 = viewGroup.getChildCount();
                for (int i2 = intValue2 + 1; i2 < childCount2; i2++) {
                    viewGroup.getChildAt(i2).setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.internalUicInfoMessageLayout, com.google.android.wallet.e.c.internalUicLegalMessageLayout, com.google.android.wallet.e.c.internalUicFormNonEditableTextStartMargin, com.google.android.wallet.e.c.uicLegalMessageTopMargin});
        this.ai = obtainStyledAttributes.getResourceId(0, h.view_info_message_text);
        int resourceId = obtainStyledAttributes.getResourceId(1, h.view_legal_message_text);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        obtainStyledAttributes.recycle();
        this.f7403b = (LinearLayout) layoutInflater.inflate(h.fragment_simple, (ViewGroup) null);
        ((FormHeaderView) this.f7403b.findViewById(g.header)).a(((q) this.aw).f7638a, layoutInflater, this, this, this.ak);
        f fVar = new f(1716);
        int length = ((q) this.aw).f7639b.length;
        for (int i = 0; i < length; i++) {
            r rVar = ((q) this.aw).f7639b[i];
            if (rVar.f7640a != null) {
                int size = this.am.size();
                this.am.add(new ArrayList<>());
                b bVar = new b(this, fVar, size);
                this.ak.add(bVar);
                this.al.add(bVar);
                LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(h.view_subform, (ViewGroup) this.f7403b, false);
                ((FormHeaderView) linearLayout.findViewById(g.subform_header)).a(rVar.f7640a.f7646a, layoutInflater, this, bVar, this.am.get(size));
                int length2 = rVar.f7640a.f7647b.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    a(linearLayout, rVar.f7640a.f7647b[i2], rVar.f7640a.f7646a.f7628a, size, i2);
                }
                if (rVar.f7640a.c != null) {
                    View a2 = bj.a(this.aK, resourceId, rVar.f7640a.c, this, this);
                    a2.setId(O().a());
                    linearLayout.addView(a2);
                    this.i.add(a2);
                    this.am.get(size).add((com.google.android.wallet.analytics.e) a2);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
                    ao.a(marginLayoutParams, dimensionPixelSize);
                    marginLayoutParams.topMargin = dimensionPixelSize2;
                    marginLayoutParams.bottomMargin = dimensionPixelSize2;
                }
                this.f7403b.addView(linearLayout);
            } else if (rVar.f7641b != null) {
                a(this.f7403b, rVar.f7641b, ((q) this.aw).f7638a.f7628a, -1, i);
            } else {
                throw new IllegalArgumentException("Empty or unknown form field in SimpleForm.");
            }
        }
        if (((q) this.aw).c != null) {
            View a3 = bj.a(this.aK, resourceId, ((q) this.aw).c, this, this);
            a3.setId(O().a());
            this.f7403b.addView(a3);
            this.i.add(a3);
            this.ak.add((com.google.android.wallet.analytics.e) a3);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) a3.getLayoutParams();
            ao.a(marginLayoutParams2, dimensionPixelSize);
            marginLayoutParams2.topMargin = dimensionPixelSize2;
        }
        if (bundle != null) {
            this.ap = bundle.getInt("revealBelowTriggeredCount");
        }
        x();
        u();
        a(1, Bundle.EMPTY);
        return this.f7403b;
    }

    public aq a(l lVar) {
        return aq.b(lVar, this.aI);
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if (this.B.a("tagWebViewDialog") == null) {
            bq.a(str, this.aI).a(this.B, "tagWebViewDialog");
        }
    }

    @Override // com.google.android.wallet.ui.common.bb
    public final void a(com.google.b.a.a.a.b.a.b.t tVar) {
        if (this.B.a("tagTooltipDialog") == null) {
            az a2 = az.a(tVar, this.aI);
            a2.a(this, -1);
            a2.a(this.B, "tagTooltipDialog");
        }
    }

    static /* synthetic */ void a(a aVar, int i) {
        if (i < aVar.ap) {
            return;
        }
        int intValue = aVar.an.get(aVar.ap).intValue();
        int intValue2 = aVar.ao.get(aVar.ap).intValue();
        aVar.ap++;
        boolean z = aVar.ap < aVar.an.size();
        int intValue3 = z ? aVar.an.get(aVar.ap).intValue() : -1;
        int intValue4 = z ? aVar.ao.get(aVar.ap).intValue() : -1;
        if (intValue2 >= 0) {
            ViewGroup viewGroup = (ViewGroup) aVar.f7403b.getChildAt(intValue);
            int childCount = intValue3 == intValue ? intValue4 : viewGroup.getChildCount() - 1;
            for (int i2 = intValue2 + 1; i2 <= childCount; i2++) {
                bj.a(viewGroup.getChildAt(i2), 0);
            }
        }
        int childCount2 = z ? intValue3 : aVar.f7403b.getChildCount() - 1;
        for (int i3 = intValue + 1; i3 <= childCount2; i3++) {
            View childAt = aVar.f7403b.getChildAt(i3);
            bj.a(childAt, 0);
            if (i3 == intValue3 && intValue4 >= 0) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                int childCount3 = viewGroup2.getChildCount();
                for (int i4 = intValue4 + 1; i4 < childCount3; i4++) {
                    viewGroup2.getChildAt(i4).setVisibility(8);
                }
            }
        }
        aVar.a(1, Bundle.EMPTY);
    }
}
