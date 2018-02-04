package id.iamnubs.studycase1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by iamnubs on 04/02/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContent());
        ButterKnife.bind(this);
    }

    public abstract int getContent();
}
