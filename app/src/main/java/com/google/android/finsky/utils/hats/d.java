package com.google.android.finsky.utils.hats;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import java.util.List;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;

/* loaded from: classes.dex */
final class d extends AsyncTask<Void, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HappinessSurveyController f4939a;

    private d(HappinessSurveyController happinessSurveyController) {
        this.f4939a = happinessSurveyController;
    }

    /* synthetic */ d(HappinessSurveyController happinessSurveyController, byte b2) {
        this(happinessSurveyController);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ String doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            String unused = HappinessSurveyController.e = str2;
            this.f4939a.start();
        }
    }

    private static String a() {
        CookieSyncManager.createInstance(FinskyApp.a());
        String cookie = CookieManager.getInstance().getCookie("https://www.google.com");
        if (cookie != null) {
            for (String str : cookie.split(";")) {
                if (str.startsWith("NID=")) {
                    return cookie;
                }
            }
        }
        BasicCookieStore basicCookieStore = new BasicCookieStore();
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.cookie-store", basicCookieStore);
        try {
            defaultHttpClient.execute(new HttpGet("https://www.google.com"), basicHttpContext);
            List<Cookie> cookies = basicCookieStore.getCookies();
            int size = cookies.size();
            for (int i = 0; i < size; i++) {
                if ("NID".equals(cookies.get(i).getName())) {
                    return cookies.get(i).getValue();
                }
            }
        } catch (IOException e) {
            FinskyLog.c("Exception making HaTS Zwieback cookie HTTP request: %s", e.getMessage());
        }
        return null;
    }
}
