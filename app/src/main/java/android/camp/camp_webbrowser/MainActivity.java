package android.camp.camp_webbrowser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUrl = (EditText) findViewById(R.id.text_url);
        textUrl.setOnKeyListener(new OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() != KeyEvent.ACTION_DOWN) {
                    return false;
                }

                boolean processed = false;

                switch (keyCode) {
                    case KeyEvent.KEYCODE_ENTER:
                        Toast.makeText(
                                MainActivity.this,
                                textUrl.getText().toString() + ": "
                                        + event.getAction(), Toast.LENGTH_SHORT)
                                .show();

                        processed = true;

                        break;

                    default:

                        break;
                }

                return processed;
            }

        });
    }
}