package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.play.SingleLineContainer;

/* loaded from: classes.dex */
public class AuthChallengeDialogDocumentInfoLayout extends SingleLineContainer {

    /* renamed from: a, reason: collision with root package name */
    public TextView f2925a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2926b;

    public AuthChallengeDialogDocumentInfoLayout(Context context) {
        super(context);
    }

    public AuthChallengeDialogDocumentInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.SingleLineContainer, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2925a = (TextView) findViewById(R.id.item_title);
        this.f2926b = (TextView) findViewById(R.id.item_price);
    }
}
