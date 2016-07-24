package com.example.anilkaynar.mge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/*
BASİT SAYAÇ UYGULAMASI
 */
public class MainActivity extends AppCompatActivity {
int kar=0;
    int bir=1;
    private TextView t;
    private Button k;
    private Button k2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        Her şey Oncreate metodu içinde oldu bitti. Oncreate bir kere çalışır ama Listenerlar hep
        çalışır.
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= (TextView)findViewById(R.id.tviev);
        k= (Button)findViewById(R.id.button);
        k2=(Button)findViewById(R.id.button2);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kar++;
                t.setText("          Butona "+kar+"kez basıldı.");
            }
        });
k2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        kar=0;
        t.setText("          Başlamadınız");
    }
});



}
}