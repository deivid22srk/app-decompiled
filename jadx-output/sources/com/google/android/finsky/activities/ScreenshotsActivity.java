package com.google.android.finsky.activities;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ScreenshotView;
import java.util.List;

/* loaded from: classes.dex */
public class ScreenshotsActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private Document f1521a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager f1522b;

    public static void a(Context context, Document document, int i, int i2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ScreenshotsActivity.class);
        intent.putExtra("document", document);
        intent.putExtra("index", i);
        intent.putExtra("imageType", i2);
        intent.putExtra("enableTapToLoadScreenshots", z);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1521a = (Document) getIntent().getParcelableExtra("document");
        int intExtra = getIntent().getIntExtra("imageType", 1);
        boolean booleanExtra = getIntent().getBooleanExtra("enableTapToLoadScreenshots", false);
        List<com.google.android.finsky.protos.ds> b2 = this.f1521a.b(intExtra);
        if (booleanExtra) {
            setContentView(R.layout.screenshot);
            ((ScreenshotView) findViewById(R.id.screenshot_view)).a(b2.get(getIntent().getIntExtra("index", 0)), FinskyApp.a().d);
        } else {
            setContentView(R.layout.screenshots_frame);
            this.f1522b = (ViewPager) findViewById(R.id.pager);
            this.f1522b.setAdapter(new fq(b2, this, FinskyApp.a().d));
            if (bundle == null) {
                this.f1522b.setCurrentItem(getIntent().getIntExtra("index", 0));
            }
        }
        if (ActivityManager.isUserAMonkey()) {
            finish();
        }
    }
}
