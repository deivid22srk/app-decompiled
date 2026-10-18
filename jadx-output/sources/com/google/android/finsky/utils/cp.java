package com.google.android.finsky.utils;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.internal.ni;

/* loaded from: classes.dex */
public final class cp {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f4808a = Uri.parse(com.google.android.finsky.c.d.ap.b());

    public static void b(MainActivity mainActivity) {
        a(mainActivity, "mobile_parent_guide");
    }

    public static void a(Activity activity, String str) {
        GoogleHelp googleHelp = new GoogleHelp(str);
        googleHelp.c = FinskyApp.a().i();
        googleHelp.q = f4808a;
        com.google.android.gms.feedback.a aVar = new com.google.android.gms.feedback.a();
        aVar.f5806a = GoogleHelp.a(activity);
        googleHelp.w = ni.a(FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.c(FeedbackOptions.a(FeedbackOptions.b(FeedbackOptions.a(FeedbackOptions.a(new FeedbackOptions((byte) 0), aVar.f5806a), aVar.f5807b), aVar.d), aVar.c), aVar.e), aVar.f), aVar.g), aVar.h), aVar.i), activity.getCacheDir());
        googleHelp.w.Y = "GoogleHelp";
        new com.google.android.gms.googlehelp.a(activity).a(googleHelp.a());
    }

    public static void a(MainActivity mainActivity) {
        String str;
        com.google.android.finsky.navigationmanager.b bVar = mainActivity.o;
        if (FinskyApp.a().g != null) {
            String str2 = FinskyApp.a().g.f1961a.H;
            if (!TextUtils.isEmpty(str2)) {
                bVar.b(str2);
                return;
            }
        }
        switch (bVar.q()) {
            case 1:
                str = "mobile_home";
                break;
            case 2:
                com.google.android.finsky.e.q f = bVar.f();
                if (f instanceof com.google.android.finsky.activities.gv) {
                    switch (((com.google.android.finsky.activities.gv) f).f1785b) {
                        case 1:
                            str = "mobile_books";
                            break;
                        case 2:
                            str = "mobile_music";
                            break;
                        case 3:
                            str = "mobile_apps";
                            break;
                        case 4:
                        case 7:
                            str = "mobile_movies";
                            break;
                        case 6:
                            str = "mobile_newsstand";
                            break;
                    }
                }
                str = "mobile_store_default";
                break;
            case 3:
                str = "mobile_my_apps";
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            default:
                str = "mobile_store_default";
                break;
            case 5:
                Document v = bVar.v();
                if (v != null) {
                    switch (v.f1963a.g) {
                        case 1:
                            str = "mobile_books_object";
                            break;
                        case 2:
                            str = "mobile_music_object";
                            break;
                        case 3:
                            str = "mobile_apps_object";
                            break;
                        case 4:
                        case 7:
                            str = "mobile_movies_object";
                            break;
                        case 6:
                            str = "mobile_newsstand_object";
                            break;
                    }
                }
                str = "mobile_store_default";
                break;
            case 7:
                str = "mobile_search";
                break;
            case 10:
                str = "mobile_wishlist";
                break;
            case 12:
                str = "mobile_people";
                break;
        }
        a(mainActivity, str);
    }
}
