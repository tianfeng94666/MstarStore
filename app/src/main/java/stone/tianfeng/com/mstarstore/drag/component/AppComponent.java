package stone.tianfeng.com.mstarstore.drag.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import stone.tianfeng.com.mstarstore.base.BaseApp;
import stone.tianfeng.com.mstarstore.drag.module.AppModule;
import stone.tianfeng.com.mstarstore.http.APIService;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(BaseApp baseApp);

    Context getContext();

    Retrofit getRetrofit();

    OkHttpClient getOkHttpClient();

    APIService getAPIService();
}
