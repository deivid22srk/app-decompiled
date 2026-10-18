package com.google.android.finsky.layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.go;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ex;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;

/* loaded from: classes.dex */
public class PreregistrationDialogView extends LinearLayout implements go {

    /* renamed from: a, reason: collision with root package name */
    private Document f3049a;

    public PreregistrationDialogView(Context context) {
        super(context);
    }

    public PreregistrationDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    public PreregistrationDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Document getDocument() {
        return this.f3049a;
    }

    @Override // com.google.android.finsky.activities.go
    public final void a(Bundle bundle) {
        this.f3049a = (Document) bundle.getParcelable("PreregistrationDialogView.document");
        if (this.f3049a == null) {
            FinskyLog.e("Preregistration dialog not passed a document", new Object[0]);
            return;
        }
        Context context = getContext();
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) findViewById(R.id.title_thumbnail_frame);
        playCardThumbnail.a(this.f3049a.f1963a.g);
        int i = this.f3049a.f1963a.e;
        ViewGroup.LayoutParams layoutParams = playCardThumbnail.getLayoutParams();
        layoutParams.width = com.google.android.finsky.utils.ai.d(context, i);
        layoutParams.height = com.google.android.finsky.utils.ai.e(context, i);
        ((DocImageView) playCardThumbnail.getImageView()).a(this.f3049a, FinskyApp.a().d, ex.f);
        PlayTextView playTextView = (PlayTextView) findViewById(R.id.title_title);
        playTextView.setText(this.f3049a.f1963a.i);
        playTextView.setSelected(true);
    }

    @Override // com.google.android.finsky.activities.go
    public Bundle getResult() {
        return null;
    }
}
