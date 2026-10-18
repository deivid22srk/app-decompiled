package com.google.android.wallet.ui.d;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.common.util.k;
import com.google.android.wallet.e.c;
import com.google.android.wallet.e.g;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.InfoMessageTextView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.bq;
import com.google.android.wallet.ui.common.e;
import com.google.b.a.a.a.b.a.a.b.a.x;
import com.google.b.a.a.a.b.a.a.b.a.y;
import com.google.b.a.a.a.b.a.b.ae;
import com.google.b.a.a.a.b.a.j;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public class a extends ah<x> implements TextWatcher, View.OnClickListener, e {

    /* renamed from: a, reason: collision with root package name */
    FormEditText f7540a;

    /* renamed from: b, reason: collision with root package name */
    FormEditText f7541b;
    TextView c;
    InfoMessageTextView d;
    public com.google.android.wallet.analytics.a f;
    ArrayList<ai<FormEditText>> e = new ArrayList<>();
    private final f g = new f(1680);

    @Override // android.support.v4.app.Fragment
    public final void g(Bundle bundle) {
        super.g(bundle);
        a(6, Bundle.EMPTY);
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        if (!jVar.f7704a.f7650a.equals(((x) this.aw).f7596a)) {
            return false;
        }
        switch (jVar.f7704a.f7651b) {
            case 1:
                this.f7540a.setError(jVar.f7705b);
                return true;
            case 2:
                this.f7541b.setError(jVar.f7705b);
                return true;
            default:
                throw new IllegalArgumentException(new StringBuilder(45).append("Unknown FormFieldMessage fieldId: ").append(jVar.f7704a.f7651b).toString());
        }
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.f7540a == null) {
            return;
        }
        boolean z = this.av;
        this.f7540a.setEnabled(z);
        this.f7541b.setEnabled(z);
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return (this.f7540a == null || TextUtils.isEmpty(this.f7540a.getText()) || this.f7541b == null || TextUtils.isEmpty(this.f7541b.getText())) ? false : true;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai<FormEditText>> w() {
        return this.e;
    }

    @Override // com.google.android.wallet.analytics.e
    public f getUiElement() {
        return this.g;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<com.google.android.wallet.analytics.e> getChildren() {
        if (((x) this.aw).i != null) {
            return Collections.singletonList(this.d);
        }
        return null;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final boolean z() {
        return (this.d.f7455a || this.d.f7456b) ? false : true;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void A() {
        this.d.a(true);
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final String B() {
        return this.d.getExpandLabel();
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if (view == this.d && this.B.a("tagTosWebViewDialog") == null) {
            bq.a(str, this.aI).a(this.B, "tagTosWebViewDialog");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.c && this.f != null) {
            this.f.a(this, 1681);
        }
    }

    public final y x() {
        byte[] bArr;
        y yVar = new y();
        yVar.f7598a = bj.a(this.f7540a, ((x) this.aw).f);
        yVar.f7599b = new ae();
        yVar.f7599b.f7660a = ((x) this.aw).g.f7692a;
        switch (((x) this.aw).c) {
            case 1:
                yVar.f7599b.f7661b = this.f7541b.getText().toString();
                break;
            case 2:
                k kVar = new k(f(), ((x) this.aw).e);
                try {
                    ae aeVar = yVar.f7599b;
                    byte[] bArr2 = ((x) this.aw).d;
                    String obj = this.f7541b.getText().toString();
                    String str = kVar.f7300a;
                    long currentTimeMillis = System.currentTimeMillis();
                    X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr2));
                    byte[] byteArray = x509Certificate.getSerialNumber().toByteArray();
                    if (byteArray.length < 8) {
                        bArr = new byte[8];
                        System.arraycopy(byteArray, 0, bArr, 8 - byteArray.length, byteArray.length);
                    } else if (byteArray.length == 8) {
                        bArr = byteArray;
                    } else {
                        bArr = new byte[8];
                        System.arraycopy(byteArray, byteArray.length - 8, bArr, 0, 8);
                    }
                    SecretKey a2 = k.a();
                    byte[] a3 = k.a(x509Certificate, a2);
                    byte[] a4 = k.a(a2, k.a(currentTimeMillis, str, obj));
                    int length = a3.length + a4.length;
                    if (length > 65535) {
                        throw new IllegalStateException(new StringBuilder(42).append("Encrypted message is too long: ").append(length).toString());
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 2 + 2 + length);
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    allocate.putShort((short) 5);
                    allocate.put(bArr);
                    allocate.putChar((char) length);
                    allocate.put(a3);
                    allocate.put(a4);
                    aeVar.f7661b = Base64.encodeToString(allocate.array(), 2);
                    yVar.c = kVar.f7300a;
                    break;
                } catch (CertificateException e) {
                    throw new IllegalStateException("Unable to encrypt user PayPal credentials", e);
                }
            default:
                throw new IllegalArgumentException(new StringBuilder(40).append("Unsupported encryption type: ").append(((x) this.aw).c).toString());
        }
        yVar.d = ((x) this.aw).c;
        if (((x) this.aw).i != null) {
            yVar.e = ((x) this.aw).i.c;
        }
        return yVar;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        a(1, Bundle.EMPTY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{c.internalUicUsernamePasswordRootLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            throw new IllegalArgumentException("Attribute internalUicUsernamePasswordRootLayout must be defined.");
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(resourceId, (ViewGroup) null, false);
        if (!TextUtils.isEmpty(((x) this.aw).f7597b)) {
            TextView textView = (TextView) viewGroup2.findViewById(g.username_password_title);
            textView.setText(((x) this.aw).f7597b);
            textView.setVisibility(0);
        }
        this.f7540a = (FormEditText) viewGroup2.findViewById(g.username);
        bj.a(((x) this.aw).f, this.f7540a);
        this.f7540a.addTextChangedListener(this);
        this.e.add(new ai<>(((x) this.aw).f.f7693b, this.f7540a, bj.a(((x) this.aw).f)));
        this.f7541b = (FormEditText) viewGroup2.findViewById(g.password);
        bj.a(((x) this.aw).g, this.f7541b);
        this.f7541b.addTextChangedListener(this);
        this.e.add(new ai<>(((x) this.aw).g.f7693b, this.f7541b, bj.a(((x) this.aw).g)));
        this.c = (TextView) viewGroup2.findViewById(g.login_help_text);
        if (TextUtils.isEmpty(((x) this.aw).h)) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(Html.fromHtml(((x) this.aw).h));
            this.c.setMovementMethod(LinkMovementMethod.getInstance());
            this.c.setOnClickListener(this);
        }
        this.d = (InfoMessageTextView) viewGroup2.findViewById(g.legal_message_text);
        this.d.setParentUiNode(this);
        this.d.setUrlClickListener(this);
        if (((x) this.aw).i != null) {
            this.d.setInfoMessage(((x) this.aw).i.f7606a);
        }
        u();
        a(1, Bundle.EMPTY);
        return viewGroup2;
    }
}
