package stone.tianfeng.com.mstarstore.base;

import android.app.Application;

import stone.tianfeng.com.mstarstore.drag.component.AppComponent;
import stone.tianfeng.com.mstarstore.drag.component.DaggerAppComponent;
import stone.tianfeng.com.mstarstore.drag.module.AppModule;

public class BaseApp extends Application {
    AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();

       mAppComponent= DaggerAppComponent.builder().appModule(new AppModule(getBaseContext(),Constants.BASE_URL)).build();
    }
    public AppComponent getAppCommponent(){
        return mAppComponent;
    }
}
