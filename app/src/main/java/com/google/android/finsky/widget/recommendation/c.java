package com.google.android.finsky.widget.recommendation;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.android.volley.apkg.ae;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.bpkg.x;
import com.google.android.finsky.gpkg.p;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.je;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelUtils;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cy;
import com.google.android.finsky.utils.jm;
import com.google.android.finsky.utils.t;
import com.google.android.play.image.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f5231a = Executors.newSingleThreadExecutor(new t());

    public static RecommendationList a(Context context, com.google.android.finsky.api.b bVar, int i, p pVar) {
        RecommendationList recommendationList = null;
        File b2 = b(context, i);
        if (b2.exists() && (recommendationList = (RecommendationList) ParcelUtils.a(b2)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Recommendation recommendation : recommendationList.f5228a) {
                if (recommendation.c < System.currentTimeMillis()) {
                    arrayList.add(recommendation);
                }
            }
            recommendationList.f5228a.removeAll(arrayList);
            arrayList.size();
        }
        if (recommendationList == null || recommendationList.isEmpty()) {
            ae a2 = ae.a();
            String a3 = a(i);
            if (TextUtils.isEmpty(a3)) {
                FinskyLog.d("No recs widget url provided in loadDocsFromNetwork().", new Object[0]);
                throw new IllegalStateException("No recs url provided");
            }
            bVar.b(a3, (qm) null, a2, a2);
            recommendationList = b((je) a2.get(com.google.android.finsky.cpkg.d.bZ.b().longValue(), TimeUnit.MILLISECONDS), i, pVar);
            try {
                ParcelUtils.a(b2, recommendationList);
            } catch (IOException e) {
                FinskyLog.a(e, "Unable to cache recs for %d", Integer.valueOf(i));
            }
        }
        return recommendationList;
    }

    public static void a(Context context, int i) {
        b(context, i).delete();
    }

    public static RecommendationList a(Context context, com.google.android.finsky.api.b bVar, int i, int i2, p pVar) {
        jm.b();
        RecommendationList recommendationList = null;
        try {
            try {
                try {
                    try {
                        recommendationList = a(context, bVar, i, pVar);
                    } catch (TimeoutException e) {
                        FinskyLog.a(e, "Error loading recs widget: %s", e.getMessage());
                        String string = context.getString(R.string.timeout_error);
                        if (string != null) {
                            RecommendedWidgetProvider.a(context, i2, string);
                        }
                    }
                } catch (ExecutionException e2) {
                    FinskyLog.a(e2, "Error loading recs widget: %s", e2.getCause().getMessage());
                    String string2 = context.getString(R.string.network_error);
                    if (string2 != null) {
                        RecommendedWidgetProvider.a(context, i2, string2);
                    }
                }
            } catch (IllegalStateException e3) {
                String string3 = context.getString(R.string.no_recs_found_error);
                if (string3 != null) {
                    RecommendedWidgetProvider.a(context, i2, string3);
                }
            }
        } catch (InterruptedException e4) {
            FinskyLog.a(e4, "Error loading recs widget: %s", e4.getMessage());
            String string4 = context.getString(R.string.network_error);
            if (string4 != null) {
                RecommendedWidgetProvider.a(context, i2, string4);
            }
        }
        return recommendationList;
    }

    public static String a(int i) {
        return bg.ah.a(i).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RecommendationList b(je jeVar, int i, p pVar) {
        boolean z;
        if (jeVar.f3991b.length == 0) {
            return null;
        }
        Document document = new Document(jeVar.f3991b[0]);
        RecommendationList recommendationList = new RecommendationList(document.f1963a.i, i);
        int a2 = document.a();
        x xVar = FinskyApp.a().v;
        for (int i2 = 0; i2 < a2; i2++) {
            Document a3 = document.a(i2);
            if (a3.f1963a.e == 1) {
                z = xVar.a(a3.E().w) != null;
            } else {
                z = false;
            }
            if (cy.a(a3, pVar) || z) {
                new Object[1][0] = a3.f1963a.f3890a;
            } else {
                recommendationList.add(new Recommendation(a3));
            }
        }
        return recommendationList;
    }

    public static File b(Context context, int i) {
        File file = new File(context.getCacheDir(), "recs");
        file.mkdirs();
        return new File(file, "RecommendationList_" + i + ".cache");
    }

    public static void a(com.google.android.finsky.api.b bVar, Context context, RecommendationList recommendationList, p pVar, int i) {
        String a2 = a(recommendationList.f5229b);
        if (TextUtils.isEmpty(a2)) {
            FinskyLog.d("No recs widget url provided in performBackFill()", new Object[0]);
        } else {
            bVar.b(a2, (qm) null, new d(recommendationList, pVar, context, i), new f());
        }
    }

    public static Bitmap a(com.google.android.play.image.e eVar, Recommendation recommendation, int i) {
        ds dsVar = recommendation.f5227b;
        if (dsVar == null) {
            return null;
        }
        if (!dsVar.l) {
            i = 0;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap[] bitmapArr = new Bitmap[1];
        j a2 = eVar.a(dsVar.f, 0, i, new g(bitmapArr, semaphore));
        if (a2.f6944a != null) {
            bitmapArr[0] = a2.f6944a;
        } else {
            try {
                if (!semaphore.tryAcquire(com.google.android.finsky.cpkg.d.bZ.b().longValue(), TimeUnit.MILLISECONDS)) {
                    FinskyLog.d("Timed out while fetching %s", dsVar.f);
                }
            } catch (InterruptedException e) {
                FinskyLog.d("Interrupted while fetching %s", dsVar.f);
            }
        }
        return bitmapArr[0];
    }
}
