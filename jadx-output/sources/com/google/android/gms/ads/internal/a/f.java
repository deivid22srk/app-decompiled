package com.google.android.gms.ads.internal.a;

import android.content.Context;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.ig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@gw
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a<String> f5286a = a.a(0, "gads:sdk_core_experiment_id");

    /* renamed from: b, reason: collision with root package name */
    public static final a<String> f5287b = a.a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final a<Boolean> c = a.a(0, "gads:request_builder:singleton_webview", (Boolean) false);
    public static final a<String> d = a.a(0, "gads:request_builder:singleton_webview_experiment_id");
    public static final a<Boolean> e = a.a(0, "gads:sdk_use_dynamic_module", (Boolean) false);
    public static final a<String> f = a.a(0, "gads:sdk_use_dynamic_module_experiment_id");
    public static final a<Boolean> g = a.a(0, "gads:sdk_crash_report_enabled", (Boolean) false);
    public static final a<Boolean> h = a.a(0, "gads:sdk_crash_report_full_stacktrace", (Boolean) false);
    public static final a<Boolean> i = a.a(0, "gads:block_autoclicks", (Boolean) false);
    public static final a<String> j = a.a(0, "gads:block_autoclicks_experiment_id");
    public static final a<String> k = a.a("gads:prefetch:experiment_id");
    public static final a<String> l = a.a(0, "gads:spam_app_context:experiment_id");
    public static final a<Boolean> m = a.a(0, "gads:spam_app_context:enabled", (Boolean) false);
    public static final a<String> n = a.a(0, "gads:video_stream_cache:experiment_id");
    public static final a<Integer> o = a.a(0, "gads:video_stream_cache:limit_count", 5);
    public static final a<Integer> p = a.a(0, "gads:video_stream_cache:limit_space", 8388608);
    public static final a<Integer> q = a.a(0, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final a<Long> r = a.a("gads:video_stream_cache:limit_time_sec", 300);
    public static final a<Long> s = a.a("gads:video_stream_cache:notify_interval_millis", 1000);
    public static final a<Integer> t = a.a(0, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final a<Boolean> u = a.a(0, "gads:video:metric_reporting_enabled", (Boolean) false);
    public static final a<String> v = a.a(0, "gads:video:metric_frame_hash_times", "");
    public static final a<Long> w = a.a("gads:video:metric_frame_hash_time_leniency", 500);
    public static final a<String> x = a.a("gads:spam_ad_id_decorator:experiment_id");
    public static final a<Boolean> y = a.a(0, "gads:spam_ad_id_decorator:enabled", (Boolean) false);
    public static final a<String> z = a.a("gads:looper_for_gms_client:experiment_id");
    public static final a<Boolean> A = a.a(0, "gads:looper_for_gms_client:enabled", (Boolean) true);
    public static final a<Boolean> B = a.a(0, "gads:sw_ad_request_service:enabled", (Boolean) true);
    public static final a<Boolean> C = a.a(0, "gads:sw_dynamite:enabled", (Boolean) true);
    public static final a<String> D = a.a(0, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final a<String> E = a.a(0, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final a<String> F = a.a(0, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final a<Boolean> G = a.a(0, "gads:enabled_sdk_csi", (Boolean) false);
    public static final a<String> H = a.a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final a<Boolean> I = a.a(0, "gads:sdk_csi_write_to_file", (Boolean) false);
    public static final a<Boolean> J = a.a(0, "gads:enable_content_fetching", (Boolean) true);
    public static final a<Integer> K = a.a(0, "gads:content_length_weight", 1);
    public static final a<Integer> L = a.a(0, "gads:content_age_weight", 1);
    public static final a<Integer> M = a.a(0, "gads:min_content_len", 11);
    public static final a<Integer> N = a.a(0, "gads:fingerprint_number", 10);
    public static final a<Integer> O = a.a(0, "gads:sleep_sec", 10);
    public static final a<Boolean> P = a.a(0, "gad:app_index_enabled", (Boolean) true);
    public static final a<Boolean> Q = a.a(0, "gads:app_index:without_content_info_present:enabled", (Boolean) true);
    public static final a<Long> R = a.a("gads:app_index:timeout_ms", 1000);
    public static final a<String> S = a.a(0, "gads:app_index:experiment_id");
    public static final a<String> T = a.a(0, "gads:kitkat_interstitial_workaround:experiment_id");
    public static final a<Boolean> U = a.a(0, "gads:kitkat_interstitial_workaround:enabled", (Boolean) true);
    public static final a<Boolean> V = a.a(0, "gads:interstitial_follow_url", (Boolean) true);
    public static final a<Boolean> W = a.a(0, "gads:interstitial_follow_url:register_click", (Boolean) true);
    public static final a<String> X = a.a(0, "gads:interstitial_follow_url:experiment_id");
    public static final a<Boolean> Y = a.a(0, "gads:analytics_enabled", (Boolean) true);
    public static final a<Boolean> Z = a.a(0, "gads:ad_key_enabled", (Boolean) false);
    public static final a<Integer> aa = a.a(0, "gads:webview_cache_version", 0);
    public static final a<String> ab = a.a("gads:pan:experiment_id");
    public static final a<String> ac = a.a(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final a<Boolean> ad = a.a(0, "gads:ad_manager_creator:enabled", (Boolean) true);
    public static final a<Boolean> ae = a.a(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);
    public static final a<String> af = a.a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final a<Integer> ag = a.a(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final a<Integer> ah = a.a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final a<Integer> ai = a.a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final a<String> aj = a.a(1, "gads:interstitial_ad_pool:experiment_id");
    public static final a<Boolean> ak = a.a(0, "gads:log:verbose_enabled", (Boolean) false);
    public static final a<Boolean> al = a.a(0, "gads:device_info_caching:enabled", (Boolean) true);
    public static final a<Long> am = a.a("gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final a<Boolean> an = a.a(0, "gads:gen204_signals:enabled", (Boolean) false);
    public static final a<Boolean> ao = a.a(0, "gads:webview:error_reporting_enabled", (Boolean) false);
    public static final a<Boolean> ap = a.a(0, "gads:adid_reporting:enabled", (Boolean) false);
    public static final a<Boolean> aq = a.a(0, "gads:ad_settings_page_reporting:enabled", (Boolean) false);
    public static final a<Boolean> ar = a.a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", (Boolean) false);
    public static final a<Boolean> as = a.a(0, "gads:request_pkg:enabled", (Boolean) true);
    public static final a<Boolean> at = a.a(0, "gads:gmsg:disable_back_button:enabled", (Boolean) false);
    public static final a<Long> au = a.a("gads:network:cache_prediction_duration_s", 300);
    public static final a<Boolean> av = a.a(0, "gads:mediation:dynamite_first", (Boolean) true);
    public static final a<Long> aw = a.a("gads:ad_loader:timeout_ms", 60000);
    public static final a<Long> ax = a.a("gads:rendering:timeout_ms", 60000);
    public static final a<Boolean> ay = a.a(0, "gads:adshield:enable_adshield_instrumentation", (Boolean) false);
    public static final a<Boolean> az = a.a(0, "gass:enabled", (Boolean) false);
    public static final a<Boolean> aA = a.a(0, "gass:enable_int_signal", (Boolean) true);
    public static final a<Boolean> aB = a.a(0, "gads:adid_notification:first_party_check:enabled", (Boolean) true);
    public static final a<Boolean> aC = a.a(0, "gads:edu_device_helper:enabled", (Boolean) true);
    public static final a<Boolean> aD = a.a(0, "gads:support_screen_shot", (Boolean) true);
    public static final a<Long> aE = a.a("gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    public static void a(Context context) {
        ig.a(new g(context));
    }

    public static List<String> a() {
        h i2 = com.google.android.gms.ads.internal.d.i();
        ArrayList arrayList = new ArrayList();
        Iterator<a<String>> it = i2.f5290b.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.d.j().a(it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
