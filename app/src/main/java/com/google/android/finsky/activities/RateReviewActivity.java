package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class RateReviewActivity extends android.support.v7.a.ae implements com.google.android.finsky.layout.db, com.google.android.finsky.layout.play.cy {
    private String k;
    private int l;
    private String m;
    private String n;
    private int o;
    private Document p;
    private boolean q;
    private boolean r;
    private Bundle s;
    private com.google.android.finsky.apkg.i u;
    private long v;
    private ButtonBar x;
    private RateReviewEditor y;
    private com.google.android.finsky.apkg.ai t = com.google.android.finsky.apkg.i.a(1203);
    private boolean w = false;

    static /* synthetic */ boolean b(RateReviewActivity rateReviewActivity) {
        rateReviewActivity.w = true;
        return true;
    }

    public static Intent a(String str, Document document, Document document2, ny nyVar, int i, boolean z, boolean z2, Context context) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) RateReviewActivity.class);
        intent.putExtra("account_name", str);
        intent.putExtra("doc_id", document.f1963a.f3890a);
        intent.putExtra("doc_details_url", document.f1963a.D);
        intent.putExtra("doc_title", document.f1963a.i);
        intent.putExtra("author", document2);
        intent.putExtra("backend", document.f1963a.g);
        intent.putExtra("previous_rating", i);
        if (nyVar != null) {
            intent.putExtra("previous_title", nyVar.g);
            intent.putExtra("previous_comment", nyVar.i);
            if (nyVar.c != null) {
                intent.putExtra("previous_author", ParcelableProto.a(nyVar.c));
            }
        }
        intent.putExtra("server_logs_cookie", document.f1963a.R);
        intent.putExtra("impression_id", com.google.android.finsky.apkg.i.g());
        intent.putExtra("is_external_request", z);
        intent.putExtra("is_anonymous_rating", z2);
        if (z) {
            intent.putExtra("doc_creator", document.f1963a.m);
            com.google.android.finsky.protos.ds a2 = com.google.android.finsky.utils.apkg.a.a(document, 0, context.getResources().getDimensionPixelSize(R.dimen.base_row_height), new int[]{4, 0});
            if (a2 != null) {
                intent.putExtra("doc_thumbnail_url", a2.f);
            }
            intent.putExtra("doc_thumbnail_is_fife", a2.l);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        int intExtra;
        String stringExtra;
        String stringExtra2;
        this.s = bundle;
        super.onCreate(bundle);
        setContentView(R.layout.rate_review_dialog);
        Intent intent = getIntent();
        this.k = intent.getStringExtra("account_name");
        this.q = intent.getBooleanExtra("is_external_request", true);
        this.r = intent.getBooleanExtra("is_anonymous_rating", false);
        this.m = intent.getStringExtra("doc_id");
        this.n = intent.getStringExtra("doc_details_url");
        String stringExtra3 = intent.getStringExtra("doc_title");
        this.l = intent.getIntExtra("backend", 0);
        com.google.android.finsky.protos.gx gxVar = (com.google.android.finsky.protos.gx) ParcelableProto.a(intent, "previous_author");
        Document document = gxVar != null ? new Document(gxVar) : null;
        Document document2 = (Document) intent.getParcelableExtra("author");
        if (this.s != null) {
            intExtra = this.s.getInt("previous_rating");
            stringExtra = this.s.getString("previous_title");
            stringExtra2 = this.s.getString("previous_comment");
        } else {
            intExtra = intent.getIntExtra("previous_rating", 0);
            stringExtra = intent.getStringExtra("previous_title");
            stringExtra2 = intent.getStringExtra("previous_comment");
        }
        com.google.android.finsky.apkg.i.a(this.t, intent.getByteArrayExtra("server_logs_cookie"));
        this.u = FinskyApp.a().f(this.k);
        this.v = intent.getLongExtra("impression_id", 0L);
        if (bundle == null) {
            this.u.a(this.v, this);
        }
        this.o = (!com.google.android.finsky.cpkg.d.cE.b().booleanValue() || this.r) ? 1 : 2;
        View findViewById = findViewById(R.id.rate_review_container);
        this.y = (RateReviewEditor) findViewById(R.id.review_editor);
        this.y.a(this.o, this.l, stringExtra3, this.q, intExtra, stringExtra, stringExtra2);
        this.y.setReviewChangeListener(this);
        boolean z = gxVar != null || this.r;
        this.x = (ButtonBar) findViewById.findViewById(R.id.button_bar);
        this.x.setPositiveButtonEnabled(true);
        this.x.setPositiveButtonTitle(z ? R.string.save_review : R.string.submit_review);
        this.x.setNegativeButtonVisible(z);
        this.x.setNegativeButtonTitle(R.string.delete_review);
        this.x.setClickListener(new fa(this, z));
        if (document != null) {
            this.p = document;
        } else {
            this.p = document2;
        }
        TextView textView = (TextView) findViewById(R.id.review_by);
        FifeImageView fifeImageView = (FifeImageView) findViewById(R.id.user_profile_image);
        if (this.p != null) {
            textView.setText(getResources().getString(R.string.review_by, this.p.f1963a.i));
            FifeImageView fifeImageView2 = (FifeImageView) findViewById(R.id.user_profile_image);
            com.google.android.finsky.protos.ds dsVar = this.p.b(4).get(0);
            fifeImageView2.a(dsVar.f, dsVar.l, FinskyApp.a().d);
            return;
        }
        textView.setVisibility(8);
        fifeImageView.setVisibility(8);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        j();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        View decorView = getWindow().getDecorView();
        if (action == 0 && (x < 0 || x >= decorView.getWidth() || y < 0 || y >= decorView.getHeight())) {
            i();
            return true;
        }
        if (action == 4) {
            i();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void i() {
        this.u.a(1207, (byte[]) null, this);
        Intent intent = new Intent();
        intent.putExtra("doc_id", this.m);
        setResult(3, intent);
        finish();
    }

    private void j() {
        boolean z = true;
        boolean z2 = this.y.getUserRating() > 0;
        if (this.o == 3) {
            boolean z3 = !TextUtils.isEmpty(this.y.getUserTitle());
            boolean z4 = !TextUtils.isEmpty(this.y.getUserComment());
            if (!z3 || !z4 || !z2) {
                z = false;
            }
        } else {
            z = z2;
        }
        this.x.setPositiveButtonEnabled(z);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        this.u.a(1207, (byte[]) null, this);
        Intent intent = new Intent();
        intent.putExtra("doc_id", this.m);
        setResult(3, intent);
        super.onBackPressed();
    }

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("previous_rating", this.y.getUserRating());
        bundle.putString("previous_title", this.y.getUserTitle());
        bundle.putString("previous_comment", this.y.getUserComment());
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.t;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }

    @Override // com.google.android.finsky.layout.db
    public final void g() {
        j();
    }

    @Override // com.google.android.finsky.layout.db
    public final void h() {
        j();
    }
}
