package com.google.android.finsky.layout.play;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.po;
import com.google.android.finsky.protos.sy;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlayYoutubeCardContentView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private FifeImageView f3370a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f3371b;
    private TextView c;
    private TextView d;
    private Context e;

    public PlayYoutubeCardContentView(Context context) {
        this(context, null);
    }

    public PlayYoutubeCardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3370a = (FifeImageView) findViewById(R.id.promo_image);
        this.f3371b = (ImageView) findViewById(R.id.play_icon);
        this.c = (TextView) findViewById(R.id.video_title);
        this.d = (TextView) findViewById(R.id.video_subtitle);
    }

    public final void a(Document document, com.google.android.play.image.e eVar, cy cyVar) {
        ds dsVar = document.b(14).get(0);
        this.f3370a.a(dsVar.f, dsVar.l, eVar);
        po aJ = document.aJ();
        sy syVar = aJ == null ? null : aJ.P;
        this.c.setText(syVar.f4411a);
        this.d.setText(syVar.c);
        setOnClickListener(new cz(this, cyVar, com.google.android.finsky.utils.cr.a(this.e.getPackageManager(), Uri.parse(document.b(3).get(0).f), FinskyApp.a().j())));
    }
}
