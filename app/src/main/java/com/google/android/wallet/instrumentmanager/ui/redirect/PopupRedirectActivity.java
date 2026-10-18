package com.google.android.wallet.instrumentmanager.ui.redirect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ae;
import android.view.MenuItem;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.ui.common.ag;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class PopupRedirectActivity extends ae implements e, ag {
    com.google.android.wallet.common.bpkg.a.b k;
    b l;
    private f m;
    private byte[] n;

    public static Intent a(Context context, com.google.b.a.a.a.b.a.apkg.dpkg.b bVar, String str, int i, int i2, byte[] bArr) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), PopupRedirectActivity.class.getName());
        intent.putExtra("formProto", ParcelableProto.a(bVar));
        intent.putExtra("title", str);
        intent.putExtra("activityThemeResId", i);
        intent.putExtra("formThemeResId", i2);
        intent.putExtra("logToken", bArr);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        setTheme(intent.getIntExtra("activityThemeResId", -1));
        super.onCreate(bundle);
        setTitle(intent.getStringExtra("title"));
        this.l = (b) d().a(R.id.content);
        if (this.l == null) {
            this.l = b.a((com.google.b.a.a.a.b.a.apkg.dpkg.b) ParcelableProto.a(intent, "formProto"), intent.getIntExtra("formThemeResId", -1));
            d().a().a(R.id.content, this.l).b();
        }
        this.n = intent.getByteArrayExtra("logToken");
        this.m = new f(1746, this.n);
        if (bundle != null) {
            this.k = new com.google.android.wallet.common.bpkg.a.b(bundle.getBoolean("impressionForPageTracked"));
        } else {
            this.k = new com.google.android.wallet.common.bpkg.a.b(false);
        }
        com.google.android.wallet.instrumentmanager.bpkg.a.a.a((Activity) this, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("impressionForPageTracked", this.k.f7265b);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        com.google.android.wallet.common.bpkg.a.a.a(this, -1, 1632);
        return true;
    }

    @Override // com.google.android.wallet.ui.common.ag
    public final void a(int i, Bundle bundle) {
        switch (i) {
            case 4:
                this.k.a(this);
                return;
            case 5:
                Intent intent = new Intent();
                intent.putExtra("errorDetails", bundle);
                setResult(1, intent);
                finish();
                return;
            case 6:
            case 9:
            default:
                throw new IllegalArgumentException(new StringBuilder(34).append("Unsupported formEvent: ").append(i).toString());
            case 7:
                int i2 = bundle.getInt("FormEventListener.EXTRA_BACKGROUND_EVENT_TYPE");
                switch (i2) {
                    case 772:
                        WebViewPageLoadEvent webViewPageLoadEvent = (WebViewPageLoadEvent) bundle.getParcelable("FormEventListener.EXTRA_BACKGROUND_EVENT_DATA");
                        if (webViewPageLoadEvent == null) {
                            throw new IllegalArgumentException("WebViewPageLoad background events must include a WebViewPageLoadEvent.");
                        }
                        int i3 = bundle.getInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                        if (i3 == -1) {
                            throw new IllegalArgumentException("WebViewPageLoad background events must include a resultCode");
                        }
                        com.google.android.wallet.common.bpkg.a.a.a(i3, webViewPageLoadEvent, this.n);
                        return;
                    case 776:
                        int i4 = bundle.getInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                        if (i4 == -1) {
                            throw new IllegalArgumentException("ProviderInstall background events must include a resultCode");
                        }
                        com.google.android.wallet.common.bpkg.a.a.b(776, i4, this.n);
                        return;
                    default:
                        throw new IllegalArgumentException(new StringBuilder(56).append("Unsupported analytics background event type: ").append(i2).toString());
                }
            case 8:
                if (this.l.v()) {
                    Intent intent2 = new Intent();
                    b bVar = this.l;
                    Bundle bundle2 = Bundle.EMPTY;
                    intent2.putExtra("formValue", ParcelableProto.a(bVar.x()));
                    setResult(-1, intent2);
                    finish();
                    return;
                }
                return;
            case 10:
                int i5 = bundle.getInt("FormEventListener.EXTRA_RESULT_CODE", -1);
                if (i5 == -1) {
                    throw new IllegalArgumentException("NotifyResultListener event must contain a result code.");
                }
                Bundle bundle3 = bundle.getBundle("FormEventListener.EXTRA_RESULT_DATA");
                if (bundle3 == null) {
                    bundle3 = Bundle.EMPTY;
                }
                Intent intent3 = new Intent();
                intent3.putExtra("resultCode", i5);
                intent3.putExtra("resultData", bundle3);
                setResult(2, intent3);
                finish();
                return;
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public e getParentUiNode() {
        return null;
    }

    @Override // com.google.android.wallet.analytics.e
    public f getUiElement() {
        return this.m;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<e> getChildren() {
        return Collections.singletonList(this.l);
    }

    @Override // com.google.android.wallet.analytics.e
    public void setParentUiNode(e eVar) {
        throw new UnsupportedOperationException("Top level UiNode doesn't support custom parents.");
    }
}
