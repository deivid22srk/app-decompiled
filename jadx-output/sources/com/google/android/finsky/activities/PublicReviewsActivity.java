package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PublicReviewsActivity extends android.support.v7.a.ae {
    private boolean k = false;
    private ButtonBar l;

    static /* synthetic */ boolean b(PublicReviewsActivity publicReviewsActivity) {
        publicReviewsActivity.k = true;
        return true;
    }

    public static Intent a(Document document) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) PublicReviewsActivity.class);
        intent.putExtra("author", document);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.public_reviews_dialog);
        Document document = (Document) getIntent().getParcelableExtra("author");
        this.l = (ButtonBar) findViewById(R.id.public_reviews_container).findViewById(R.id.button_bar);
        this.l.setPositiveButtonTitle(R.string.ok);
        this.l.setNegativeButtonTitle(R.string.cancel);
        this.l.setClickListener(new ey(this));
        ((TextView) findViewById(R.id.review_by)).setText(document.f1963a.i);
        FifeImageView fifeImageView = (FifeImageView) findViewById(R.id.user_profile_image);
        com.google.android.finsky.protos.ds dsVar = document.b(4).get(0);
        fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        View decorView = getWindow().getDecorView();
        if (action == 0 && (x < 0 || x >= decorView.getWidth() || y < 0 || y >= decorView.getHeight())) {
            g();
            return true;
        }
        if (action == 4) {
            g();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void g() {
        setResult(0);
        finish();
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }
}
