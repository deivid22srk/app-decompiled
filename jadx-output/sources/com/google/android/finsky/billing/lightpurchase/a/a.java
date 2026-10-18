package com.google.android.finsky.billing.lightpurchase.a;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.protos.ck;
import com.google.android.finsky.protos.cy;
import com.google.android.finsky.protos.db;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.aj;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import com.google.android.play.layout.PlayActionButton;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.e.m implements DatePickerDialog.OnDateSetListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f2285a;
    private RadioGroup ai;
    private RadioButton aj;
    private Spinner ak;
    private CheckBox al;
    private TextView am;
    private final CompoundButton.OnCheckedChangeListener an = new b(this);
    private final RadioGroup.OnCheckedChangeListener ao = new c(this);
    private final CompoundButton.OnCheckedChangeListener ap = new d(this);

    /* renamed from: b, reason: collision with root package name */
    private ck f2286b;
    private ViewGroup c;
    private PlayActionButton d;
    private EditText e;
    private EditText f;
    private Date g;
    private RadioGroup h;
    private EditText i;

    public static a a(String str, int i, ck ckVar) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putInt("AgeChallengeFragment.backend", i);
        bundle.putParcelable("AgeChallengeFragment.challenge", ParcelableProto.a(ckVar));
        a aVar = new a();
        aVar.f(bundle);
        return aVar;
    }

    @Override // com.google.android.finsky.e.m, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2285a = this.r.getInt("AgeChallengeFragment.backend");
        this.f2286b = (ck) ParcelableProto.a(this.r, "AgeChallengeFragment.challenge");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.c = (ViewGroup) layoutInflater.inflate(R.layout.age_verification_age_challenge, viewGroup, false);
        TextView textView = (TextView) this.c.findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f2286b.f3679a)) {
            textView.setText(this.f2286b.f3679a);
        } else {
            FinskyLog.e("Title is not returned.", new Object[0]);
        }
        ((TextView) this.c.findViewById(R.id.account_name)).setText(jm.a(this.r.getString("authAccount"), e()));
        TextView textView2 = (TextView) this.c.findViewById(R.id.description);
        if (!TextUtils.isEmpty(this.f2286b.c)) {
            textView2.setText(Html.fromHtml(this.f2286b.c));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setLinkTextColor(textView2.getTextColors());
        } else {
            textView2.setVisibility(8);
        }
        this.e = (EditText) this.c.findViewById(R.id.name_entry);
        if (this.f2286b.e != null) {
            if (!TextUtils.isEmpty(this.f2286b.e.c)) {
                this.e.setText(this.f2286b.e.c);
            }
            if (!TextUtils.isEmpty(this.f2286b.e.e)) {
                this.e.setHint(this.f2286b.e.e);
            }
        } else {
            this.e.setVisibility(8);
        }
        this.f = (EditText) this.c.findViewById(R.id.birthday);
        if (this.f2286b.f != null) {
            if (bundle != null) {
                this.g = (Date) bundle.getSerializable("AgeChallengeFragment.birthday_date");
            } else if (!TextUtils.isEmpty(this.f2286b.f.c)) {
                this.g = aj.a(this.f2286b.f.c, "yyyyMMdd");
            }
            if (this.g != null) {
                this.f.setText(aj.a(this.g));
            }
            if (!TextUtils.isEmpty(this.f2286b.f.e)) {
                this.f.setHint(this.f2286b.f.e);
            }
            this.f.setKeyListener(null);
            this.f.setOnClickListener(this);
        } else {
            this.f.setVisibility(8);
        }
        this.h = (RadioGroup) this.c.findViewById(R.id.genders);
        if (this.f2286b.h != null) {
            LayoutInflater from = LayoutInflater.from(f());
            cy[] cyVarArr = this.f2286b.h.f3709a;
            int i2 = 0;
            i = 1;
            while (i2 < cyVarArr.length) {
                cy cyVar = cyVarArr[i2];
                RadioButton radioButton = (RadioButton) from.inflate(R.layout.age_verification_radiobutton, this.c, false);
                radioButton.setText(cyVar.f3707a);
                radioButton.setId(i);
                radioButton.setChecked(cyVar.e);
                this.h.addView(radioButton, i2);
                i2++;
                i++;
            }
            if (this.h.getCheckedRadioButtonId() == -1) {
                this.h.check(1);
            }
        } else {
            this.h.setVisibility(8);
            i = 1;
        }
        this.i = (EditText) this.c.findViewById(R.id.phone_number);
        if (this.f2286b.g != null) {
            if (!TextUtils.isEmpty(this.f2286b.g.c)) {
                this.i.setText(this.f2286b.g.c);
            }
            if (!TextUtils.isEmpty(this.f2286b.g.e)) {
                this.i.setHint(this.f2286b.g.e);
            }
        } else {
            this.i.setVisibility(8);
        }
        this.ai = (RadioGroup) this.c.findViewById(R.id.carriers);
        if (this.f2286b.i != null) {
            LayoutInflater from2 = LayoutInflater.from(f());
            cy[] cyVarArr2 = this.f2286b.i.f3709a;
            int i3 = 0;
            int i4 = i;
            while (i3 < cyVarArr2.length) {
                cy cyVar2 = cyVarArr2[i3];
                RadioButton radioButton2 = (RadioButton) from2.inflate(R.layout.age_verification_radiobutton, this.c, false);
                radioButton2.setText(cyVar2.f3707a);
                radioButton2.setId(i4);
                radioButton2.setChecked(cyVar2.e);
                this.ai.addView(radioButton2, i3);
                i3++;
                i4++;
            }
            if (this.ai.getCheckedRadioButtonId() == -1) {
                this.ai.check(i);
            }
            if (this.f2286b.j != null && !TextUtils.isEmpty(this.f2286b.j.f3705a) && this.f2286b.j.c != null && this.f2286b.j.c.length > 0 && this.f2286b.j.c[0] != null && !TextUtils.isEmpty(this.f2286b.j.c[0].f3703a)) {
                View findViewById = this.c.findViewById(R.id.carriers_extension);
                findViewById.setVisibility(0);
                this.ai.setOnCheckedChangeListener(this.ao);
                this.aj = (RadioButton) findViewById.findViewById(R.id.carriers_extension_button);
                this.aj.setText(this.f2286b.j.f3705a);
                this.aj.setOnCheckedChangeListener(this.ap);
                this.ak = (Spinner) findViewById.findViewById(R.id.carriers_extension_spinner);
                this.ak.setEnabled(false);
                ArrayAdapter arrayAdapter = new ArrayAdapter(e(), android.R.layout.simple_spinner_item);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                for (int i5 = 0; i5 < this.f2286b.j.c.length; i5++) {
                    arrayAdapter.add(this.f2286b.j.c[i5].f3703a);
                }
                this.ak.setAdapter((SpinnerAdapter) arrayAdapter);
            }
        } else {
            this.ai.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f2286b.k)) {
            TextView textView3 = (TextView) this.c.findViewById(R.id.carriers_help);
            textView3.setVisibility(0);
            textView3.setText(Html.fromHtml(this.f2286b.k));
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.al = (CheckBox) this.c.findViewById(R.id.citizenship);
        if (this.f2286b.m != null) {
            this.al.setText(this.f2286b.m.f3701a);
            this.al.setChecked(this.f2286b.m.c);
            this.al.setOnCheckedChangeListener(this.an);
            this.am = (TextView) this.c.findViewById(R.id.citizenship_error);
        } else {
            this.al.setVisibility(8);
            this.am.setVisibility(8);
        }
        TextView textView4 = (TextView) this.c.findViewById(R.id.footer);
        if (!TextUtils.isEmpty(this.f2286b.n)) {
            textView4.setText(Html.fromHtml(this.f2286b.n));
        } else {
            textView4.setVisibility(8);
        }
        this.d = (PlayActionButton) this.c.findViewById(R.id.continue_button);
        if (this.f2286b.p != null && !TextUtils.isEmpty(this.f2286b.p.f3699a)) {
            this.d.a(this.f2285a, this.f2286b.p.f3699a, this);
        } else {
            FinskyLog.e("Submit button is not returned", new Object[0]);
        }
        return this.c;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.c.getContext(), this.f2286b.f3679a, this.c);
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putSerializable("AgeChallengeFragment.birthday_date", this.g);
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.g = new GregorianCalendar(i, i2, i3).getTime();
        this.f.setText(aj.a(this.g));
        this.f.setError(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar;
        String str;
        if (view == this.f) {
            if (this.B.a("AgeChallengeFragment.date_picker") == null) {
                Calendar calendar = Calendar.getInstance();
                if (this.g != null) {
                    calendar.setTime(this.g);
                }
                l a2 = l.a(calendar);
                a2.a(this, 0);
                a2.a(this.B, "AgeChallengeFragment.date_picker");
                return;
            }
            return;
        }
        if (view != this.d) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.e.getVisibility() == 0 && jm.a(this.e.getText())) {
            arrayList.add(u.a(1, f_(R.string.invalid_name)));
        }
        if (this.f.getVisibility() == 0 && this.g == null) {
            arrayList.add(u.a(2, f_(R.string.invalid_entry)));
        }
        if (this.i.getVisibility() == 0 && jm.a(this.i.getText())) {
            arrayList.add(u.a(4, f_(R.string.invalid_phone)));
        }
        if (this.al.getVisibility() == 0 && !this.al.isChecked() && this.f2286b.m.e) {
            arrayList.add(u.a(6, f_(R.string.invalid_entry)));
        }
        this.e.setError(null);
        this.f.setError(null);
        this.i.setError(null);
        this.am.setError(null);
        if (!arrayList.isEmpty()) {
            new e(this, arrayList).run();
        }
        if (arrayList.isEmpty()) {
            b(1402);
            ik.a(f(), this.c);
            HashMap hashMap = new HashMap();
            if (this.e.getVisibility() == 0) {
                hashMap.put(this.f2286b.e.i, this.e.getText().toString());
            }
            if (this.f.getVisibility() == 0) {
                hashMap.put(this.f2286b.f.i, aj.a(this.g, "yyyyMMdd"));
            }
            if (this.h.getVisibility() == 0) {
                hashMap.put(this.f2286b.h.f3710b, this.f2286b.h.f3709a[this.h.indexOfChild(this.h.findViewById(this.h.getCheckedRadioButtonId()))].c);
            }
            if (this.i.getVisibility() == 0) {
                hashMap.put(this.f2286b.g.i, this.i.getText().toString());
            }
            if (this.ai.getVisibility() == 0) {
                int checkedRadioButtonId = this.ai.getCheckedRadioButtonId();
                if (checkedRadioButtonId != -1) {
                    str = this.f2286b.i.f3709a[this.ai.indexOfChild(this.ai.findViewById(checkedRadioButtonId))].c;
                } else {
                    str = this.f2286b.j.c[this.ak.getSelectedItemPosition()].c;
                }
                hashMap.put(this.f2286b.i.f3710b, str);
            }
            if (this.al.getVisibility() == 0 && this.al.isChecked()) {
                hashMap.put(this.f2286b.m.i, this.f2286b.m.g);
            }
            if (this.s instanceof f) {
                fVar = (f) this.s;
            } else if (this.E instanceof f) {
                fVar = (f) this.E;
            } else if (f() instanceof f) {
                fVar = (f) f();
            } else {
                throw new IllegalStateException("No listener registered.");
            }
            fVar.a(this.f2286b.p.c, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.m
    public final int u() {
        return 1401;
    }

    static /* synthetic */ TextView a(a aVar, db dbVar) {
        TextView textView;
        String str = null;
        switch (dbVar.f3715a) {
            case 1:
                textView = aVar.e;
                str = textView.getHint().toString();
                break;
            case 2:
                textView = aVar.f;
                str = textView.getHint().toString();
                break;
            case 3:
            case 5:
            default:
                textView = null;
                break;
            case 4:
                textView = aVar.i;
                str = textView.getHint().toString();
                break;
            case 6:
                textView = aVar.am;
                str = aVar.al.getText().toString();
                break;
        }
        if (textView != null) {
            ik.a(textView, str, dbVar.c);
        }
        return textView;
    }
}
