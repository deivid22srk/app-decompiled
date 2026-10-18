package com.google.android.finsky.activities;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ButtonBar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cr extends com.google.android.finsky.e.w implements dh, com.google.android.finsky.layout.r {

    /* renamed from: a, reason: collision with root package name */
    private Document f1663a;

    /* renamed from: b, reason: collision with root package name */
    private cc f1664b;
    private ViewGroup c;
    private com.google.android.finsky.api.model.h d;
    private String e;
    private int f;
    private RadioGroup g;
    private com.google.android.finsky.a.ai h = com.google.android.finsky.a.i.a(301);

    public static cr a(String str) {
        cr crVar = new cr();
        crVar.a(FinskyApp.a().g, str);
        return crVar;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.f1664b != null) {
            this.f1664b.a();
        }
        super.d();
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        da I = I();
        if (I != null) {
            if (!(I.f1676b != -1)) {
                H();
                return;
            }
            android.support.v4.app.ad adVar = this.B;
            if (adVar.a("flag_item_dialog") == null) {
                de b2 = de.b(I.f1676b);
                b2.a(this, 0);
                b2.a(adVar, "flag_item_dialog");
            }
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        this.ao.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.flag_item;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        View view = this.R;
        this.c = (ViewGroup) view.findViewById(R.id.item_details_panel);
        this.g = (RadioGroup) view.findViewById(R.id.flag_item_list);
        ButtonBar buttonBar = (ButtonBar) view.findViewById(R.id.button_bar);
        buttonBar.setPositiveButtonTitle(R.string.submit);
        buttonBar.setPositiveButtonEnabled(false);
        buttonBar.setClickListener(this);
        this.g.setOnCheckedChangeListener(new cs(this, buttonBar));
        if (bundle != null) {
            this.e = bundle.getString("flag_free_text_message");
            this.f = bundle.containsKey("flag_selected_button_id") ? bundle.getInt("flag_selected_button_id") : -1;
        }
        if (bundle != null && bundle.containsKey("doc")) {
            a((Document) bundle.getParcelable("doc"));
            return;
        }
        this.au.a();
        this.d = new com.google.android.finsky.api.model.h(this.aq, this.aA);
        this.d.a(new ct(this));
        this.d.a(new cu(this));
    }

    public final void a(Document document) {
        this.f1663a = document;
        com.google.android.finsky.a.i.a(this.h, this.f1663a.f1963a.R);
        if (this.f1664b == null) {
            this.f1664b = au.a(this.ax, this.f1663a.f1963a.g, this.aq.b());
            this.f1664b.d(false);
            this.f1664b.l = true;
            this.f1664b.a(this.ap, this.as, this.ar, this, false, null, null, false, this);
        }
        this.g.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.ap);
        for (da daVar : b(this.f1663a.f1963a.g)) {
            RadioButton radioButton = (RadioButton) from.inflate(R.layout.radio_button_row, (ViewGroup) this.g, false);
            radioButton.setText(daVar.f1675a);
            radioButton.setTag(daVar);
            this.g.addView(radioButton);
            if (this.f != -1 && this.f == daVar.f1675a) {
                this.g.check(radioButton.getId());
            }
        }
        m_();
    }

    @Override // com.google.android.finsky.e.q
    public final void u() {
        if (this.f1663a != null) {
            ((TextView) this.av.findViewById(R.id.flag_content_instruction)).setText(this.f1663a.f1963a.g == 3 ? R.string.flag_page_description : R.string.flag_page_description_non_app);
            if (this.f1663a.f1963a.g == 2) {
                TextView textView = (TextView) this.av.findViewById(R.id.flag_content_footer);
                textView.setText(Html.fromHtml(a(R.string.flag_page_footer_music, com.google.android.finsky.c.d.D.b())));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setVisibility(0);
            }
            this.f1664b.a(this.f1663a, false, this.c);
            this.av.findViewById(R.id.item_summary_trailing).setBackgroundColor(com.google.android.finsky.utils.ai.a(this.ap, this.f1663a.f1963a.g));
            o_();
        }
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(this.ap.getString(R.string.flagging_title));
        this.ao.a(this.f1663a.f1963a.g, false);
        this.ao.s_();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.f1663a != null) {
            bundle.putParcelable("doc", this.f1663a);
            bundle.putString("flag_free_text_message", this.e);
            if (I() != null) {
                bundle.putInt("flag_selected_button_id", I().f1675a);
            }
        }
    }

    @Override // com.google.android.finsky.activities.dh
    public final void b(String str) {
        this.e = str;
        H();
    }

    private void H() {
        this.ao.j();
        I().a(this.ap, this.f1663a, this.e);
    }

    private List<da> b(int i) {
        if (i != 3) {
            if (i != 2) {
                throw new IllegalStateException("unsupported backend type");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new db(5, R.string.flag_incorrect_metadata));
            arrayList.add(new db(1, R.string.flag_sexual_content));
            arrayList.add(new db(4, R.string.flag_hateful_content));
            arrayList.add(new db(6, R.string.flag_spam));
            arrayList.add(new db(2, R.string.flag_minor_abuse));
            arrayList.add(new db(8, R.string.flag_other_objection));
            return arrayList;
        }
        boolean z = !FinskyApp.a().p.a(this.f1663a.E().w).isEmpty();
        if (!cv.a(FinskyApp.a().y.a())) {
            boolean booleanValue = com.google.android.finsky.c.d.al.b().booleanValue();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new cv(1, R.string.flag_sexual_content, -1));
            arrayList2.add(new cv(2, R.string.flag_graphic_violence, -1));
            arrayList2.add(new cv(3, R.string.flag_hateful_content, -1));
            if (z) {
                arrayList2.add(new cv(4, R.string.flag_harmful_to_device, R.string.flag_harmful_prompt));
            }
            if (!booleanValue) {
                arrayList2.add(new cv(6, R.string.flag_improper_content_rating, -1));
            }
            arrayList2.add(new cv(R.string.flag_pharma_content, "PHARMA_VIOLATION"));
            arrayList2.add(new cv(R.string.flag_ip_infringement, "IP_INFRINGEMENT"));
            arrayList2.add(new cv(5, R.string.flag_other_objection, R.string.flag_other_concern_prompt));
            return arrayList2;
        }
        boolean booleanValue2 = com.google.android.finsky.c.d.al.b().booleanValue();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new cv(1, R.string.flag_sexual_content, -1));
        arrayList3.add(new cv(3, R.string.flag_graphic_violence, -1));
        arrayList3.add(new cv(4, R.string.flag_hateful_content, -1));
        if (z) {
            arrayList3.add(new cv(7, R.string.flag_harmful_to_device, R.string.flag_harmful_prompt));
        }
        if (!booleanValue2) {
            arrayList3.add(new cv(5, R.string.flag_improper_content_rating, -1));
        }
        arrayList3.add(new cv(11, R.string.flag_pharma_content, -1));
        arrayList3.add(new cv(12, R.string.flag_ip_infringement, -1));
        arrayList3.add(new cv(8, R.string.flag_other_objection, R.string.flag_other_concern_prompt));
        return arrayList3;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.h;
    }

    private da I() {
        if (this.R == null || this.g.getCheckedRadioButtonId() == -1) {
            return null;
        }
        int indexOfChild = this.g.indexOfChild(this.R.findViewById(this.g.getCheckedRadioButtonId()));
        List<da> b2 = b(this.f1663a.f1963a.g);
        if (indexOfChild < b2.size()) {
            return b2.get(indexOfChild);
        }
        return null;
    }
}
