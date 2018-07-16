package stone.tianfeng.com.mstarstore.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import stone.tianfeng.com.mstarstore.drag.component.AppComponent;

public class BaseActivity extends Activity {
    private BaseApp app;
    private AppComponent mAppComponent;

    public AppComponent getmAppComponent() {
        return app.getAppCommponent();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = (BaseApp) getApplication();
    }


}
