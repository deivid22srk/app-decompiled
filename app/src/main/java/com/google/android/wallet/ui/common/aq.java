package com.google.android.wallet.ui.common;

import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.common.util.ParcelableProto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class aq extends d implements View.OnClickListener, com.google.android.wallet.analytics.e, com.google.android.wallet.common.util.o, ap, b, t {

    /* renamed from: a, reason: collision with root package name */
    public FormEditText f7487a;
    private com.google.android.wallet.common.util.n ai;
    private com.google.android.wallet.b.a aj;
    private com.google.android.wallet.b.e ak;
    private com.google.android.wallet.analytics.e am;

    /* renamed from: b, reason: collision with root package name */
    CountdownButton f7488b;
    public com.google.android.wallet.analytics.a e;
    private com.google.b.a.a.a.b.a.apkg.l g;
    private Pattern h;
    private Pattern i;
    private final com.google.android.wallet.analytics.f f = new com.google.android.wallet.analytics.f(1635);
    long c = -1;
    long d = System.currentTimeMillis();
    private final List<ap> al = new ArrayList();

    public static aq b(com.google.b.a.a.a.b.a.apkg.l lVar, int i) {
        aq aqVar = new aq();
        aqVar.f(c(lVar, i));
        return aqVar;
    }

    public static Bundle c(com.google.b.a.a.a.b.a.apkg.l lVar, int i) {
        Bundle c = c(i);
        c.putParcelable("fieldProto", ParcelableProto.a(lVar));
        return c;
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.g = (com.google.b.a.a.a.b.a.apkg.l) ParcelableProto.a(this.r, "fieldProto");
        if (com.google.android.wallet.common.util.l.a((Context) f(), "android.permission.READ_SMS") && !TextUtils.isEmpty(this.g.d)) {
            this.h = Pattern.compile(this.g.d);
            if (this.h.matcher("").groupCount() != 1) {
                String valueOf = String.valueOf(this.h.pattern());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 59).append("OTP Regex: ").append(valueOf).append(" should only contain a single group for matching").toString());
            }
        }
        if (!TextUtils.isEmpty(this.g.c)) {
            this.i = Pattern.compile(this.g.c);
        }
        if (bundle != null) {
            this.c = bundle.getLong("lastMatchingSmsReceivedMs");
            this.d = bundle.getLong("lastSmsScanForOtpsMs");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.google.android.wallet.e.h.fragment_otp_field, (ViewGroup) null, false);
        this.f7487a = (FormEditText) inflate.findViewById(com.google.android.wallet.e.g.otp_field);
        bj.a(this.g.f7630a, this.f7487a);
        this.f7487a.setMaxLines(Integer.MAX_VALUE);
        this.f7487a.setHorizontallyScrolling(false);
        this.f7487a.a(this);
        bj.a(this.f7487a, this.g.f7630a.f7693b, this.aj, this.ak);
        this.f7488b = (CountdownButton) inflate.findViewById(com.google.android.wallet.e.g.otp_button);
        this.f7488b.setUiSpecification(this.g.f7631b);
        bj.a(this.f7488b, this.g.f7631b.f7626a, this.aj, this.ak);
        this.f7488b.setOnClickListener(this);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        if (this.h != null) {
            if (this.ai == null) {
                this.ai = new com.google.android.wallet.common.util.n();
            }
            this.ai.f7303a = this;
            com.google.android.wallet.common.util.n nVar = this.ai;
            android.support.v4.app.t f = f();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            intentFilter.addAction("android.provider.Telephony.SMS_REJECTED");
            f.registerReceiver(nVar, intentFilter);
            ArrayList<ContentValues> a2 = com.google.android.wallet.common.util.t.a(f(), Math.max(this.c, this.d), this.i);
            this.d = System.currentTimeMillis();
            int size = a2.size();
            for (int i = 0; i < size && !a(a2.get(i)); i++) {
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void h_() {
        super.h_();
        if (this.ai != null) {
            f().unregisterReceiver(this.ai);
        }
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putLong("lastMatchingSmsReceivedMs", this.c);
        bundle.putLong("lastSmsScanForOtpsMs", this.d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.e != null) {
            this.e.a(this, 1634);
        }
    }

    public final void a(boolean z) {
        if (this.f7487a != null) {
            this.f7487a.setEnabled(z);
            this.f7488b.setEnabled(z);
        }
    }

    @Override // com.google.android.wallet.ui.common.t
    public void setError(CharSequence charSequence) {
        this.f7487a.setError(charSequence);
    }

    @Override // com.google.android.wallet.ui.common.t
    public CharSequence getError() {
        return this.f7487a.getError();
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean af_() {
        return this.f7487a.af_();
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean ag_() {
        return this.f7487a.ag_();
    }

    public final com.google.b.a.a.a.b.a.apkg.m c(Bundle bundle) {
        boolean z;
        com.google.b.a.a.a.b.a.apkg.m mVar = new com.google.b.a.a.a.b.a.apkg.m();
        mVar.f7632a = bj.a(this.f7487a, this.g.f7630a);
        CountdownButton countdownButton = this.f7488b;
        if (bundle.containsKey("FormEventListener.EXTRA_TRIGGER_VALUE_REFERENCES")) {
            ArrayList b2 = ParcelableProto.b(bundle, "FormEventListener.EXTRA_TRIGGER_VALUE_REFERENCES");
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                com.google.b.a.a.a.b.a.bpkg.i iVar = (com.google.b.a.a.a.b.a.bpkg.i) b2.get(i);
                if (iVar.f7675a == countdownButton.f7438a.f7626a) {
                    if (iVar.f7676b != 2) {
                        throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
                    }
                    z = true;
                    mVar.f7633b = z;
                    return mVar;
                }
            }
        }
        z = false;
        mVar.f7633b = z;
        return mVar;
    }

    private boolean a(ContentValues contentValues) {
        String asString = contentValues.getAsString("address");
        String asString2 = contentValues.getAsString("body");
        long longValue = contentValues.getAsLong("date").longValue();
        boolean z = this.i != null;
        if (z && !TextUtils.isEmpty(asString) && !this.i.matcher(asString).matches()) {
            b(21);
            return false;
        }
        if (this.c > longValue) {
            Log.d("OtpFieldFragment", String.format(Locale.US, "SMS received with time (%d) prior to last matching SMS OTP (%d). Ignoring.", Long.valueOf(longValue), Long.valueOf(this.c)));
            return false;
        }
        if (!TextUtils.isEmpty(asString2)) {
            Matcher matcher = this.h.matcher(asString2);
            if (matcher.find()) {
                String group = matcher.group(1);
                if (!TextUtils.isEmpty(group)) {
                    this.c = System.currentTimeMillis();
                    this.f7487a.requestFocus();
                    this.f7487a.a((CharSequence) group, true);
                    b(0);
                    return true;
                }
            }
            if (z) {
                b(20);
                return false;
            }
            b(22);
            return false;
        }
        Log.d("OtpFieldFragment", "SMS received without a message body");
        return false;
    }

    private void b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_TYPE", 773);
        bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i);
        (this.E != null ? (ag) this.E : (ag) f()).a(7, bundle);
    }

    @Override // com.google.android.wallet.analytics.e
    public void setParentUiNode(com.google.android.wallet.analytics.e eVar) {
        this.am = eVar;
    }

    public final void a(com.google.android.wallet.b.a aVar, com.google.android.wallet.b.e eVar) {
        this.aj = aVar;
        this.ak = eVar;
    }

    @Override // com.google.android.wallet.ui.common.b
    public final void a(ap apVar) {
        this.al.add(apVar);
    }

    @Override // com.google.android.wallet.ui.common.b
    public final void b(ap apVar) {
        this.al.remove(apVar);
    }

    @Override // com.google.android.wallet.ui.common.ap
    public final void a(View view) {
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            this.al.get(i).a(view);
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.e getParentUiNode() {
        if (this.am != null) {
            return this.am;
        }
        if (this.E != null) {
            return (com.google.android.wallet.analytics.e) this.E;
        }
        return (com.google.android.wallet.analytics.e) f();
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.f getUiElement() {
        return this.f;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<com.google.android.wallet.analytics.e> getChildren() {
        return Collections.singletonList(new com.google.android.wallet.analytics.d(1634, this));
    }

    @Override // com.google.android.wallet.common.util.o
    public final void a(SmsMessage[] smsMessageArr) {
        SmsMessage smsMessage = smsMessageArr[0];
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("address", smsMessage.getDisplayOriginatingAddress());
        contentValues.put("date", Long.valueOf(smsMessage.getTimestampMillis()));
        contentValues.put("body", com.google.android.wallet.common.util.t.a(smsMessageArr));
        a(contentValues);
    }
}
