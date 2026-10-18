package com.google.android.finsky.layout.play;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.protos.ol;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.et;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.ip;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PlayCardRateAndSuggestClusterView extends PlayCardClusterView implements com.android.volley.s, com.google.android.finsky.api.model.x, az {
    private static final boolean e;
    private Document f;
    private int g;
    private ip h;
    private PlayCardRateAndSuggestContentScroller i;
    private TextView k;
    private int l;
    private com.google.android.finsky.api.model.i m;
    private boolean n;
    private az o;

    static {
        e = Build.VERSION.SDK_INT >= 16;
    }

    public PlayCardRateAndSuggestClusterView(Context context) {
        this(context, null);
    }

    public PlayCardRateAndSuggestClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 0;
        this.g = 0;
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 413;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.i = (PlayCardRateAndSuggestContentScroller) findViewById(R.id.content_scroller);
        this.k = (TextView) findViewById(R.id.empty_sadface);
    }

    public void setClusterFadeOutListener(ip ipVar) {
        this.h = ipVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        this.l = i;
        PlayCardRateAndSuggestClusterViewContent playCardRateAndSuggestClusterViewContent = (PlayCardRateAndSuggestClusterViewContent) this.f3308a;
        playCardRateAndSuggestClusterViewContent.f3331a = this.l;
        playCardRateAndSuggestClusterViewContent.b(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.n = !z;
        int a2 = this.f.a();
        while (this.g < a2) {
            Document a3 = this.f.a(this.g);
            if (a3 == null) {
                FinskyLog.e("Got a null document at index " + this.g, new Object[0]);
                this.g++;
            } else {
                String str = a3.f1963a.f3890a;
                if (this.f3309b.c(str)) {
                    this.g++;
                } else {
                    ny a4 = this.f3309b.a(str, (ny) null);
                    if (a4 != null) {
                        if (a4.d < com.google.android.finsky.c.d.dD.b().intValue()) {
                            this.g++;
                        } else {
                            ol p = a3.p();
                            if (!((p == null || TextUtils.isEmpty(p.e)) ? false : true)) {
                                this.g++;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (getCardChildCount() != 0) {
            int i = this.l;
            if (this.g >= this.f.a()) {
                a(3, z);
                if (i != this.l) {
                    if (!(!z)) {
                        this.i.setVisibility(8);
                        this.k.setVisibility(0);
                        return;
                    }
                    this.i.startAnimation(et.b(getContext(), 250L, new bn(this)));
                    Animation a2 = et.a(getContext(), 250L, (Animation.AnimationListener) null);
                    this.k.setVisibility(0);
                    ik.a(getContext(), this.k.getText(), (View) this.k, true);
                    this.k.startAnimation(a2);
                    return;
                }
                return;
            }
            Document a3 = this.f.a(this.g);
            if (this.f3309b.a(a3.f1963a.f3890a, (ny) null) != null) {
                a(2, z);
                ol p = this.f.a(this.g).p();
                if (z) {
                    this.i.b();
                    this.j.a(p.f4213a, com.google.android.finsky.utils.bc.a(p.c));
                }
                i();
                this.m = new com.google.android.finsky.api.model.i(this.c, p.e, false);
                this.m.a((com.google.android.finsky.api.model.x) this);
                this.m.a((com.android.volley.s) this);
                this.m.q();
                return;
            }
            a(0, z);
            this.f3308a.a(com.google.android.finsky.utils.cz.a(this.f.a(this.g)), this.f.f1963a.f3890a);
            PlayCardViewRate playCardViewRate = (PlayCardViewRate) a(0);
            float b2 = as.b(a3.f1963a.e);
            if (!z) {
                playCardViewRate.startAnimation(et.b(getContext(), 150L, new bi(this, playCardViewRate, b2)));
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.az
    public final void a(Document document, com.google.android.play.layout.a aVar) {
        if (aVar.getCardType() == 13) {
            this.f3309b.d(document.f1963a.f3890a);
            a(false);
            b(false);
            return;
        }
        this.o.a(document, aVar);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView
    public final PlayCardClusterView a(Document document) {
        this.f = document;
        this.f3308a.setClusterLoggingDocument(this.f);
        return this;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView
    public final PlayCardClusterView a(List<Document> list, String str) {
        throw new UnsupportedOperationException("This cluster does not support loose data");
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView
    public final void a(as asVar, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, az azVar, bc bcVar, cy cyVar) {
        this.f3309b = acVar;
        a(true);
        ArrayList arrayList = new ArrayList();
        if (this.g < this.f.a()) {
            arrayList.add(this.f.a(this.g));
        }
        this.f3308a.a(arrayList, this.f.f1963a.f3890a);
        this.o = azVar;
        super.a(asVar, acVar, bVar, bVar2, eVar, this, bcVar, cyVar);
        b(true);
        PlayCardViewRate playCardViewRate = (PlayCardViewRate) a(0);
        playCardViewRate.setRateListener(new bk(this));
        playCardViewRate.setSkipListener(new bl(this, playCardViewRate));
        playCardViewRate.setState(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (c()) {
            ((PlayCardViewRate) a(0)).setRateListener(null);
        }
        i();
        super.onDetachedFromWindow();
    }

    private void i() {
        if (this.m != null) {
            this.m.b((com.google.android.finsky.api.model.x) this);
            this.m.b((com.android.volley.s) this);
            this.m = null;
        }
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j != null && this.j.getVisibility() != 8) {
            this.j.measure(i, 0);
            paddingTop += this.j.getMeasuredHeight();
        }
        this.i.measure(i, 0);
        int measuredHeight = paddingTop + this.i.getMeasuredHeight();
        this.k.measure(View.MeasureSpec.makeMeasureSpec(this.i.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.i.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterView, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.j != null && this.j.getVisibility() != 8) {
            this.j.layout(0, paddingTop, width, this.j.getMeasuredHeight() + paddingTop);
            paddingTop += this.j.getMeasuredHeight();
        }
        int measuredHeight = this.i.getMeasuredHeight();
        this.i.layout(0, paddingTop, width, paddingTop + measuredHeight);
        int measuredHeight2 = paddingTop + ((measuredHeight - this.k.getMeasuredHeight()) / 2);
        this.k.layout(0, measuredHeight2, width, this.k.getMeasuredHeight() + measuredHeight2);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        j();
    }

    private void j() {
        Document a2 = this.f.a(this.g);
        if (a2 != null && !TextUtils.isEmpty(a2.f1963a.f3890a)) {
            this.f3309b.d(a2.f1963a.f3890a);
        }
        a(false);
        b(false);
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        int p = this.m.p();
        if (p == 0) {
            j();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f.a(this.g));
        int min = Math.min(getCardChildCount() - 1, p);
        for (int i = 0; i < min; i++) {
            arrayList.add(this.m.c(i));
        }
        this.f3308a.a(arrayList, this.f.f1963a.f3890a);
        for (int i2 = 1; i2 <= min; i2++) {
            this.f3308a.a(i2, i2, this);
        }
        for (int i3 = min + 1; i3 < getCardChildCount(); i3++) {
            this.f3308a.d(i3);
        }
        ol p2 = this.f.a(this.g).p();
        if (this.n) {
            if (this.f3308a.g.f3411a <= 2) {
                this.i.a();
                this.j.a(p2.f4213a, com.google.android.finsky.utils.bc.a(p2.c));
            } else {
                new Handler(Looper.myLooper()).postDelayed(new bm(this, p2), 750L);
            }
        } else {
            this.i.b();
            this.j.a(p2.f4213a, com.google.android.finsky.utils.bc.a(p2.c));
        }
        a(2, false);
    }
}
