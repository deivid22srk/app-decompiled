package com.google.android.finsky.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.pt;
import java.util.List;

/* loaded from: classes.dex */
public final class ai {
    public static int a(Context context, int i) {
        return context.getResources().getColor(a(i));
    }

    public static int b(Context context, int i) {
        return context.getResources().getColor(b(i));
    }

    public static int a(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (!a()) {
                }
                break;
            case 4:
                break;
            case 5:
            default:
                if (a()) {
                }
                break;
            case 6:
                break;
        }
        return R.color.play_apps_ent_primary;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
            case 13:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (!a()) {
                }
                break;
            case 4:
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                if (!a()) {
                    break;
                }
                break;
            case 6:
                break;
        }
        return R.color.play_apps_ent_secondary;
    }

    public static ColorStateList c(Context context, int i) {
        int i2 = R.color.play_apps_ent_secondary_text;
        switch (i) {
            case 1:
                i2 = R.color.play_books_secondary_text;
                break;
            case 2:
                i2 = R.color.play_music_secondary_text;
                break;
            case 3:
                if (!a()) {
                    i2 = R.color.play_apps_secondary_text;
                    break;
                }
                break;
            case 4:
                i2 = R.color.play_movies_secondary_text;
                break;
            case 5:
            default:
                if (!a()) {
                    i2 = R.color.play_multi_secondary_text;
                    break;
                }
                break;
            case 6:
                i2 = R.color.play_newsstand_secondary_text;
                break;
        }
        return context.getResources().getColorStateList(i2);
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                return R.string.content_description_app_title;
            case 2:
                return R.string.content_description_music_album_title;
            case 3:
                return R.string.content_description_music_artist_title;
            case 4:
                return R.string.content_description_music_track_title;
            case 5:
                return R.string.content_description_book_title;
            case 6:
                return R.string.content_description_movie_title;
            case 8:
                return R.string.content_description_developer_title;
            case 16:
            case 17:
            case 24:
            case 25:
                return R.string.content_description_publication_title;
            case 18:
                return R.string.content_description_tv_show_title;
            case 19:
                return R.string.content_description_tv_season_title;
            case 20:
                return R.string.content_description_tv_episode_title;
            case 28:
                return R.string.content_description_person_title;
            case 44:
                return R.string.content_description_book_series_title;
            default:
                return -1;
        }
    }

    public static String d(int i) {
        if (i == 0) {
            i = 3;
        }
        DfeToc dfeToc = FinskyApp.a().g;
        if (dfeToc == null) {
            return null;
        }
        for (pt ptVar : dfeToc.b()) {
            if (ptVar.f4269b && ptVar.f4268a == i && !TextUtils.isEmpty(ptVar.g)) {
                return ptVar.g;
            }
        }
        return null;
    }

    public static int e(int i) {
        switch (i) {
            case 1:
                return R.drawable.spinner_background_books;
            case 2:
                return R.drawable.spinner_background_music;
            case 3:
            case 5:
            default:
                return R.drawable.spinner_background_apps;
            case 4:
                return R.drawable.spinner_background_movies;
            case 6:
                return R.drawable.spinner_background_newsstand;
        }
    }

    public static int d(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return FinskyApp.a().e().a(12602392L) ? resources.getDimensionPixelSize(R.dimen.summary_thumbnail_app_size_three_lines) : resources.getDimensionPixelSize(R.dimen.summary_thumbnail_app_size);
            case 2:
            case 4:
            case 24:
            case 25:
                return resources.getDimensionPixelSize(R.dimen.summary_thumbnail_large_size);
            case 3:
            case 5:
            case 6:
            case 16:
            case 17:
            case 44:
                return resources.getDimensionPixelSize(R.dimen.summary_thumbnail_small_size);
            case 8:
            case 30:
                return resources.getDimensionPixelSize(R.dimen.play_profile_avatar_size);
            default:
                throw new IllegalArgumentException("Unsupported document type (" + i + ")");
        }
    }

    public static int e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return FinskyApp.a().e().a(12602392L) ? resources.getDimensionPixelSize(R.dimen.summary_thumbnail_app_size_three_lines) : resources.getDimensionPixelSize(R.dimen.summary_thumbnail_app_size);
            case 2:
            case 4:
            case 5:
            case 6:
            case 16:
            case 17:
            case 24:
            case 25:
                return resources.getDimensionPixelSize(R.dimen.summary_thumbnail_large_size);
            case 3:
                return resources.getDimensionPixelSize(R.dimen.summary_thumbnail_small_size) / 2;
            case 8:
            case 30:
                return resources.getDimensionPixelSize(R.dimen.play_profile_avatar_size);
            case 44:
                return resources.getDimensionPixelSize(R.dimen.summary_thumbnail_small_size);
            default:
                throw new IllegalArgumentException("Unsupported document type (" + i + ")");
        }
    }

    public static int f(int i) {
        switch (i) {
            case 1:
                return R.drawable.ic_checkshop_books;
            case 2:
                return R.drawable.ic_checkshop_music;
            case 3:
                return a() ? R.drawable.ic_checkshop_apps_ent : R.drawable.ic_checkshop_apps;
            case 4:
                return R.drawable.ic_checkshop_movies;
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
            case 6:
                return R.drawable.ic_checkshop_newsstand;
        }
    }

    public static String a(Resources resources, int i) {
        switch (i) {
            case 1:
                return resources.getString(R.string.rate_this_app);
            case 2:
                return resources.getString(R.string.rate_this_music_album);
            case 4:
                return resources.getString(R.string.rate_this_music_track);
            case 5:
                return resources.getString(R.string.rate_this_book);
            case 6:
                return resources.getString(R.string.rate_this_movie);
            case 16:
            case 17:
            case 24:
            case 25:
                return resources.getString(R.string.rate_this_publication);
            case 18:
                return resources.getString(R.string.rate_this_tv_show);
            case 19:
                return resources.getString(R.string.rate_this_tv_season);
            case 20:
                return resources.getString(R.string.rate_this_tv_episode);
            case 44:
                return resources.getString(R.string.rate_this_book_series);
            default:
                throw new IllegalArgumentException("Unsupported doc type (" + i + ")");
        }
    }

    public static int g(int i) {
        switch (i) {
            case 1:
                return R.drawable.ic_menu_wish_books_on;
            case 2:
                return R.drawable.ic_menu_wish_music_on;
            case 3:
                return a() ? R.drawable.ic_menu_wish_apps_on_ent : R.drawable.ic_menu_wish_apps_on;
            case 4:
                return R.drawable.ic_menu_wish_movies_on;
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
            case 6:
                return R.drawable.ic_menu_wish_newsstand_on;
        }
    }

    public static int h(int i) {
        switch (i) {
            case 1:
                return R.drawable.ic_warning_books;
            case 2:
                return R.drawable.ic_warning_music;
            case 3:
                return a() ? R.drawable.ic_warning_apps_ent : R.drawable.ic_warning_apps;
            case 4:
                return R.drawable.ic_warning_movies;
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
            case 6:
                return R.drawable.ic_warning_newsstand;
        }
    }

    public static int f(Context context, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = R.color.whatsnew_books;
                break;
            case 2:
                i2 = R.color.whatsnew_music;
                break;
            case 3:
                if (!a()) {
                    i2 = R.color.whatsnew_apps;
                    break;
                } else {
                    i2 = R.color.whatsnew_apps_ent;
                    break;
                }
            case 4:
                i2 = R.color.whatsnew_movies;
                break;
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
            case 6:
                i2 = R.color.whatsnew_newsstand;
                break;
        }
        return context.getResources().getColor(i2);
    }

    public static int g(Context context, int i) {
        int i2 = R.color.status_bar_apps_ent;
        switch (i) {
            case 1:
                i2 = R.color.status_bar_books;
                break;
            case 2:
                i2 = R.color.status_bar_music;
                break;
            case 3:
                if (!a()) {
                    i2 = R.color.status_bar_apps;
                    break;
                }
                break;
            case 4:
                i2 = R.color.status_bar_movies;
                break;
            case 5:
            default:
                if (!a()) {
                    i2 = R.color.status_bar_multi;
                    break;
                }
                break;
            case 6:
                i2 = R.color.status_bar_newsstand;
                break;
        }
        return context.getResources().getColor(i2);
    }

    public static int i(int i) {
        switch (i) {
            case 1:
                return R.raw.ic_books_24px;
            case 2:
                return R.raw.ic_music_24px;
            case 3:
                return R.raw.ic_apps_24px;
            case 4:
                return R.raw.ic_movies_24px;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return -1;
            case 6:
                return R.raw.ic_newsstand_24px;
            case 13:
                return R.raw.ic_entertainment_24px;
        }
    }

    public static int j(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (!a()) {
                }
                break;
            case 4:
                break;
            case 5:
            default:
                if (a()) {
                }
                break;
            case 6:
                break;
        }
        return R.drawable.ic_reward_apps_ent;
    }

    public static boolean a() {
        DfeToc dfeToc = FinskyApp.a().g;
        return dfeToc != null && dfeToc.f1961a.J == 1;
    }

    public static String a(Context context, DfeToc dfeToc) {
        List<pt> b2 = dfeToc.b();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 < b2.size(); i2++) {
            pt ptVar = b2.get(i2);
            if (ptVar.f4269b) {
                switch (ptVar.f4268a) {
                    case 1:
                        i++;
                        z2 = true;
                        break;
                    case 2:
                        i++;
                        z3 = true;
                        break;
                    case 4:
                        i++;
                        z4 = true;
                        break;
                    case 6:
                        i++;
                        z = true;
                        break;
                }
            }
        }
        Resources resources = context.getResources();
        if (i < 2) {
            return null;
        }
        if (i == 2) {
            if (z4 && z3) {
                return resources.getString(R.string.onboard_entertainment_movies_music);
            }
            if (z4 && z2) {
                return resources.getString(R.string.onboard_entertainment_movies_books);
            }
            if (z4 && z) {
                return resources.getString(R.string.onboard_entertainment_movies_magazines);
            }
            if (z3 && z2) {
                return resources.getString(R.string.onboard_entertainment_music_books);
            }
            if (z3 && z) {
                return resources.getString(R.string.onboard_entertainment_music_magazines);
            }
            if (z2 && z) {
                return resources.getString(R.string.onboard_entertainment_books_magazines);
            }
        } else if (i == 3) {
            if (z4 && z3 && z2) {
                return resources.getString(R.string.onboard_entertainment_movies_music_books);
            }
            if (z4 && z3 && z) {
                return resources.getString(R.string.onboard_entertainment_movies_music_magazines);
            }
            if (z4 && z2 && z) {
                return resources.getString(R.string.onboard_entertainment_movies_books_magazines);
            }
            if (z3 && z2 && z) {
                return resources.getString(R.string.onboard_entertainment_music_books_magazines);
            }
        } else if (z4 && z3 && z2 && z) {
            return resources.getString(R.string.onboard_entertainment_movies_music_books_more);
        }
        return null;
    }

    public static String a(Document document, Resources resources) {
        String str = document.f1963a.i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        switch (document.f1963a.e) {
            case 1:
                return resources.getString(R.string.content_description_thumbnail_application, str);
            case 2:
            case 4:
                return resources.getString(R.string.content_description_thumbnail_album, str);
            case 3:
                return resources.getString(R.string.content_description_thumbnail_artist, str);
            case 5:
                return resources.getString(R.string.content_description_thumbnail_book, str);
            case 6:
                return resources.getString(R.string.content_description_thumbnail_movie, str);
            case 8:
                return resources.getString(R.string.content_description_thumbnail_developer, str);
            case 16:
            case 17:
            case 24:
            case 25:
                return resources.getString(R.string.content_description_thumbnail_newsstand, str);
            case 18:
            case 19:
            case 20:
                return resources.getString(R.string.content_description_thumbnail_tvshow, str);
            case 44:
                return resources.getString(R.string.content_description_thumbnail_book_series, str);
            default:
                return null;
        }
    }
}
