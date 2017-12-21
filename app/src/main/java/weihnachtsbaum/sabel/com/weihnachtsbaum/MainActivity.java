package weihnachtsbaum.sabel.com.weihnachtsbaum;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Button btn_zeichnen;
    private TextView tv_baumstamm, tv_zweige;
    private int hoehe;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_baumstamm = findViewById(R.id.tv_baumstamm);
        tv_zweige = findViewById(R.id.tv_zweige);
        btn_zeichnen = findViewById(R.id.btn_zeichnen);
        editText = findViewById(R.id.ed_hoeheEintragen);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hoehe = Integer.parseInt(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });





        btn_zeichnen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zweige = "*";
                String baumstamm = "|\n";
                for (int i = 0; i < hoehe; i++) {
                    tv_zweige.append(zweige);
                }
                for (int i = 0; i < hoehe/2; i++) {
                    tv_baumstamm.append(baumstamm);
                }

            }
        });
    }
}
