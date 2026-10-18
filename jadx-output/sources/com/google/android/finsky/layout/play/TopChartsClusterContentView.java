package com.google.android.finsky.layout.play;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.px;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class TopChartsClusterContentView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private FifeImageView f3378a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f3379b;
    private TextView c;
    private TextView d;

    public TopChartsClusterContentView(Context context) {
        this(context, null);
    }

    public TopChartsClusterContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3378a = (FifeImageView) findViewById(R.id.promo_image);
        this.f3379b = (TextView) findViewById(R.id.top_charts_content_title);
        this.c = (TextView) findViewById(R.id.top_charts_content_sub_title);
        this.d = (TextView) findViewById(R.id.action_button);
    }

    public final void a(Document document, com.google.android.play.image.e eVar, com.google.android.finsky.api.b bVar, DfeToc dfeToc, com.google.android.finsky.navigationmanager.b bVar2, cy cyVar) {
        px pxVar = document.aB() ? document.aJ().O : null;
        ds dsVar = document.b(14).get(0);
        this.f3378a.a(dsVar.f, dsVar.l, eVar);
        this.f3379b.setText(document.a(0).f1963a.i);
        this.c.setText(pxVar.f4275a);
        String str = pxVar.c.c;
        TextView textView = this.d;
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R.string.top_charts_cluster_action_button).toUpperCase();
        }
        textView.setText(str);
        setOnClickListener(new df(this, cyVar, bVar2, pxVar, bVar, dfeToc));
    }
}
