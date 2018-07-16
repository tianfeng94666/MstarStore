package stone.tianfeng.com.mstarstore.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.JsonObject;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import stone.tianfeng.com.mstarstore.R;
import stone.tianfeng.com.mstarstore.base.BaseActivity;
import stone.tianfeng.com.mstarstore.base.BaseApp;
import stone.tianfeng.com.mstarstore.drag.component.DaggerAppComponent;

public class MainActivity extends BaseActivity {


    @BindView(R.id.tv)
    TextView tv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getDate();
    }

    public void getDate() {
        getmAppComponent().getAPIService()
              .login("17688705930","123456789")
              .subscribeOn(Schedulers.io())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(new Observer<JsonObject>(){
                  @Override
                  public void onCompleted() {
                      Log.e("tag","completed");
                  }

                  @Override
                  public void onError(Throwable e) {
                      Log.e("tag",e.toString());
                  }

                  @Override
                  public void onNext(JsonObject jsonObject) {
                      Log.e("tag",jsonObject.toString());
                  }
              });
    }
}
