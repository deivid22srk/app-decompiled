package com.google.android.play.utils;

import android.content.Context;
import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f7081a = false;

    public static ColorStateList a(Context context, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = com.google.android.play.h.play_books_primary_text;
                break;
            case 2:
                i2 = com.google.android.play.h.play_music_primary_text;
                break;
            case 3:
                if (!f7081a) {
                    i2 = com.google.android.play.h.play_apps_primary_text;
                    break;
                } else {
                    i2 = com.google.android.play.h.play_apps_ent_primary_text;
                    break;
                }
            case 4:
                i2 = com.google.android.play.h.play_movies_primary_text;
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                if (!f7081a) {
                    i2 = com.google.android.play.h.play_multi_primary_text;
                    break;
                } else {
                    i2 = com.google.android.play.h.play_apps_ent_primary_text;
                    break;
                }
            case 6:
                i2 = com.google.android.play.h.play_newsstand_primary_text;
                break;
            case 10:
                i2 = com.google.android.play.h.play_commerce_primary_text;
                break;
        }
        return context.getResources().getColorStateList(i2);
    }

    public static int a(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (!f7081a) {
                    break;
                } else {
                    break;
                }
            case 4:
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                if (!f7081a) {
                    break;
                } else {
                    break;
                }
            case 6:
                break;
            case 10:
                break;
        }
        return com.google.android.play.j.play_action_button_apps_ent_base;
    }

    public static int b(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (!f7081a) {
                    break;
                } else {
                    break;
                }
            case 4:
                break;
            case 5:
            default:
                if (!f7081a) {
                    break;
                } else {
                    break;
                }
            case 6:
                break;
        }
        return com.google.android.play.j.play_action_button_apps_ent_secondary;
    }

    public static int b(Context context, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = com.google.android.play.h.play_books_recents;
                break;
            case 2:
                i2 = com.google.android.play.h.play_music_recents;
                break;
            case 3:
                if (!f7081a) {
                    i2 = com.google.android.play.h.play_apps_recents;
                    break;
                } else {
                    i2 = com.google.android.play.h.play_apps_ent_recents;
                    break;
                }
            case 4:
                i2 = com.google.android.play.h.play_movies_recents;
                break;
            case 5:
            default:
                if (!f7081a) {
                    i2 = com.google.android.play.h.play_multi_recents;
                    break;
                } else {
                    i2 = com.google.android.play.h.play_apps_ent_recents;
                    break;
                }
            case 6:
                i2 = com.google.android.play.h.play_newsstand_recents;
                break;
        }
        return context.getResources().getColor(i2);
    }

    public static void a(boolean z) {
        f7081a = z;
    }
}
