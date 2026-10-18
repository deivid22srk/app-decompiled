package com.google.android.finsky.services;

import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class DismissRecommendationService extends IntentService {
    public DismissRecommendationService() {
        super("DismissRecommendationService");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[Catch: InterruptedException -> 0x00ca, ExecutionException -> 0x0164, TimeoutException -> 0x0172, TryCatch #6 {InterruptedException -> 0x00ca, ExecutionException -> 0x0164, TimeoutException -> 0x0172, blocks: (B:20:0x008b, B:22:0x009e, B:26:0x00b3, B:28:0x00bd), top: B:19:0x008b }] */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onHandleIntent(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.services.DismissRecommendationService.onHandleIntent(android.content.Intent):void");
    }

    public static PendingIntent a(Context context, int i, Document document, int i2, int i3) {
        if (!document.aH()) {
            return null;
        }
        String str = document.aI().f3872a;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority("dismiss");
        builder.appendPath(String.valueOf(i));
        builder.appendPath(String.valueOf(i3));
        builder.appendPath(str);
        Intent intent = new Intent(context, (Class<?>) DismissRecommendationService.class);
        intent.setData(builder.build());
        intent.putExtra("appWidgetId", i);
        intent.putExtra("documentId", document.f1963a.f3890a);
        intent.putExtra("dismissalUrl", str);
        intent.putExtra("backendId", i2);
        return PendingIntent.getService(context, 0, intent, 0);
    }
}
