package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.AccessibleLinearLayout;
import com.google.android.finsky.protos.gc;
import com.google.android.finsky.protos.gd;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public abstract class a extends AccessibleLinearLayout implements View.OnClickListener, cy {

    /* renamed from: a, reason: collision with root package name */
    protected FifeImageView f3386a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f3387b;
    protected int c;
    protected int d;
    protected com.google.android.finsky.apkg.ai e;
    private gc f;
    private com.google.android.finsky.navigationmanager.b g;
    private DfeToc h;
    private PackageManager i;
    private Document j;
    private cy k;

    protected abstract int getPlayStoreUiElementType();

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.discovery_badge_radius);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3386a = (FifeImageView) findViewById(R.id.icon);
        this.f3387b = (TextView) findViewById(R.id.title);
    }

    public void a(gc gcVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, DfeToc dfeToc, PackageManager packageManager, cy cyVar) {
        this.f = gcVar;
        this.g = bVar;
        this.h = dfeToc;
        this.i = packageManager;
        this.j = document;
        this.k = cyVar;
        if (gcVar.g) {
            this.c = gcVar.f;
        } else {
            this.c = com.google.android.finsky.utils.ai.a(getContext(), document.f1963a.g);
        }
        a(gcVar, eVar);
        this.f3387b.setText(gcVar.f3859a);
        gd gdVar = this.f.h;
        if (gdVar != null && (gdVar.c || gdVar.e || gdVar.f3861a != null)) {
            setOnClickListener(this);
        }
        this.e = com.google.android.finsky.apkg.i.a(getPlayStoreUiElementType());
        com.google.android.finsky.apkg.i.a(this.e, gcVar.i);
        this.f3387b.setContentDescription(null);
        if (TextUtils.isEmpty(gcVar.c)) {
            setContentDescription(this.f3387b.getText());
        } else {
            setContentDescription(gcVar.c);
        }
        this.k.a(this);
    }

    protected void a(gc gcVar, com.google.android.play.image.e eVar) {
        if (gcVar.e != null && this.f3386a != null) {
            a();
            this.f3386a.a(gcVar.e.f, gcVar.e.l, eVar);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        gd gdVar = this.f.h;
        if (gdVar.c) {
            this.g.a(this.j, gdVar.f3862b, false);
        } else if (gdVar.e) {
            this.g.a(this.j, gdVar.d, true);
        } else if (gdVar.f3861a != null) {
            this.g.a(gdVar.f3861a, this.f.f3859a, this.h, this.i);
        }
        FinskyApp.a().h().a((cy) this);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.e;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }

    protected void a() {
    }
}
