package com.google.android.finsky.billing;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.lightpurchase.b.a;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.UrlSpanUtils;

/* loaded from: classes.dex */
public abstract class at<T extends com.google.android.finsky.billing.lightpurchase.b.a> extends com.google.android.finsky.billing.lightpurchase.b.f<T> implements com.google.android.play.utils.k {

    /* renamed from: a, reason: collision with root package name */
    public String f2168a;

    /* renamed from: b, reason: collision with root package name */
    public String f2169b;
    public String c;
    public com.google.android.finsky.protos.l d;
    public View e;
    private final Runnable g = new au(this);
    private final Handler h = new Handler();
    protected int f = -1;

    public abstract void P_();

    public static int a(com.google.android.finsky.protos.k kVar) {
        if (kVar.f4022b != null || kVar.c != null) {
            return R.layout.message_only_success_step;
        }
        if (kVar.e != null) {
            return R.layout.complex_success_step;
        }
        if (kVar.d != null) {
            return R.layout.titled_success_step;
        }
        if (kVar.f != null) {
            return R.layout.setup_wizard_redeem_success_step;
        }
        if (kVar.g != null) {
            return R.layout.two_icon_messages_success_step;
        }
        return 0;
    }

    public static Bundle a(com.google.android.finsky.protos.k kVar, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Cannot create a SuccessStep with layoutId of 0.");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("SuccessStep.post_acquisition_prompt", ParcelableProto.a(kVar));
        bundle.putInt("SuccessStep.layout_id", i);
        return bundle;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.a(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.r;
        com.google.android.finsky.protos.k kVar = (com.google.android.finsky.protos.k) ParcelableProto.a(bundle2, "SuccessStep.post_acquisition_prompt");
        this.e = layoutInflater.inflate(bundle2.getInt("SuccessStep.layout_id"), viewGroup, false);
        if (kVar.f4022b != null) {
            com.google.android.finsky.protos.d dVar = kVar.f4022b;
            if (TextUtils.isEmpty(dVar.f3711a)) {
                throw new IllegalArgumentException("Auto-dismiss template must have a message.");
            }
            if (dVar.c <= 0) {
                throw new IllegalArgumentException(String.format("Invalid dismiss ms for auto-dismiss template: %d", Integer.valueOf(dVar.c)));
            }
            Spanned fromHtml = Html.fromHtml(dVar.f3711a);
            a(fromHtml, R.id.message);
            this.f2168a = fromHtml.toString();
            this.f = dVar.c;
        } else if (kVar.c != null) {
            com.google.android.finsky.protos.o oVar = kVar.c;
            if (TextUtils.isEmpty(oVar.f4195a)) {
                throw new IllegalArgumentException("Simple message template must have a message.");
            }
            if (TextUtils.isEmpty(oVar.c)) {
                throw new IllegalArgumentException("Simple message template must have a button label.");
            }
            Spanned fromHtml2 = Html.fromHtml(oVar.f4195a);
            a(fromHtml2, R.id.message);
            this.f2168a = fromHtml2.toString();
            this.f2169b = oVar.c;
        } else if (kVar.d != null) {
            com.google.android.finsky.protos.q qVar = kVar.d;
            if (TextUtils.isEmpty(qVar.f4281a)) {
                throw new IllegalArgumentException("Titled template must have a title.");
            }
            if (TextUtils.isEmpty(qVar.c)) {
                throw new IllegalArgumentException("Titled template must have a message.");
            }
            if (TextUtils.isEmpty(qVar.e)) {
                throw new IllegalArgumentException("Titled template must have a button label.");
            }
            ((TextView) this.e.findViewById(R.id.title)).setText(qVar.f4281a);
            a(Html.fromHtml(qVar.c), R.id.message);
            this.f2168a = qVar.f4281a;
            this.f2169b = qVar.e;
        } else if (kVar.e != null) {
            com.google.android.finsky.protos.e eVar = kVar.e;
            if (TextUtils.isEmpty(eVar.f3761a)) {
                throw new IllegalArgumentException("Complex template must have a title.");
            }
            if (TextUtils.isEmpty(eVar.j)) {
                throw new IllegalArgumentException("Complex template must have a button label.");
            }
            ((TextView) this.e.findViewById(R.id.title)).setText(eVar.f3761a);
            if (!TextUtils.isEmpty(eVar.c)) {
                ((TextView) this.e.findViewById(R.id.title_byline)).setText(eVar.c);
            }
            a(Html.fromHtml(eVar.e), R.id.message);
            if (eVar.g) {
                this.e.findViewById(R.id.check_mark).setVisibility(0);
            }
            a(eVar.i, R.id.thumbnail_image);
            this.f2168a = eVar.f3761a;
            this.f2169b = eVar.j;
        } else if (kVar.f != null) {
            a(kVar.f);
        } else if (kVar.g != null) {
            a(kVar.g);
        }
        ((com.google.android.finsky.billing.lightpurchase.b.a) this.E).C();
        return this.e;
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        if (this.f > 0) {
            this.h.postDelayed(this.g, this.f);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        if (this.f2168a == null) {
            throw new IllegalArgumentException("No text was specified for a11y announcements.");
        }
        ik.a(this.e.getContext(), this.f2168a, this.e);
    }

    @Override // android.support.v4.app.Fragment
    public final void q() {
        this.h.removeCallbacks(this.g);
        super.q();
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return this.f2169b;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String v() {
        return this.c;
    }

    public void a(com.google.android.finsky.protos.n nVar) {
        throw new UnsupportedOperationException("Setup Wizard template is not supported outside of the Setup Wizard.");
    }

    public void a(com.google.android.finsky.protos.r rVar) {
        if (rVar.f4321a == null) {
            throw new IllegalArgumentException("Two icon messages template must have at least one message.");
        }
        if (TextUtils.isEmpty(rVar.e)) {
            throw new IllegalArgumentException("Two icon messages template must have a button label.");
        }
        Spanned fromHtml = Html.fromHtml(rVar.f4321a.f3809b);
        a(fromHtml, R.id.message_1);
        a(rVar.f4321a.f3808a, R.id.icon_1);
        if (rVar.f4322b != null) {
            a(Html.fromHtml(rVar.f4322b.f3809b), R.id.message_2);
            a(rVar.f4322b.f3808a, R.id.icon_2);
            this.e.findViewById(R.id.icon_message_2).setVisibility(0);
            UrlSpanUtils.a(((TextView) this.e.findViewById(R.id.message_2)).getText(), null, this);
        }
        if (!TextUtils.isEmpty(rVar.c)) {
            a(Html.fromHtml(rVar.c), R.id.footer_html);
            this.e.findViewById(R.id.footer_html).setVisibility(0);
        }
        this.f2168a = fromHtml.toString();
        this.f2169b = rVar.e;
        this.c = rVar.g;
        this.d = rVar.i;
    }

    public final void a(CharSequence charSequence, int i) {
        TextView textView = (TextView) this.e.findViewById(i);
        textView.setText(charSequence);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(textView.getTextColors());
    }

    private void a(ds dsVar, int i) {
        FifeImageView fifeImageView = (FifeImageView) this.e.findViewById(i);
        if (dsVar != null) {
            fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
            fifeImageView.setVisibility(0);
        }
    }

    @Override // com.google.android.play.utils.k
    public final void a(View view, String str) {
        Context context = view.getContext();
        Intent data = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.DEFAULT").setPackage(context.getPackageName()).setData(Uri.parse(str));
        if (context.getPackageManager().resolveActivity(data, 65536) == null) {
            data.setPackage(null);
        }
        a(data);
        ((com.google.android.finsky.billing.lightpurchase.b.a) this.E).f().finish();
    }
}
