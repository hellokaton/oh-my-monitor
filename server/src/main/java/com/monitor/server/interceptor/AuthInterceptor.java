package com.monitor.server.interceptor;

import com.blade.Blade;
import com.blade.kit.StringKit;
import com.blade.kit.base.Config;
import com.blade.kit.resource.BladeClassLoader;
import com.blade.mvc.annotation.Intercept;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;
import com.blade.mvc.interceptor.Interceptor;

import java.lang.annotation.Annotation;

/**
 * Created by biezhi on 2017/1/6.
 */
@Intercept
public class AuthInterceptor implements Interceptor{

    private String keepKey = Blade.$().config().get("server.keep_key");

    private String tipMsg = "{\"status\":403, \"message\":\"keep key is invalid.\"}";

    @Override
    public boolean before(Request request, Response response) {
        String uri = request.uri();
        if(uri.startsWith("/api")){
            String monitorKeepKey = request.header("monitor_keep_key");
            if(StringKit.isBlank(monitorKeepKey) || !monitorKeepKey.equals(keepKey)){
                response.json(tipMsg);
                response.status(403);
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean after(Request request, Response response) {
        return true;
    }
}
