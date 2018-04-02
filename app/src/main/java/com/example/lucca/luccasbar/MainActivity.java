package com.example.lucca.luccasbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText m1,m2,m3,v1,v2,v3;
    public int cont=0;
    public double c1,c2,c3;
    public double vm1,vv1,vm2,vv2,vm3,vv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         m1 =  findViewById(R.id.m1);
         m2 =  findViewById(R.id.m2);
         m3 =  findViewById(R.id.m3);
         v1 =  findViewById(R.id.v1);
         v2 =  findViewById(R.id.v2);
         v3 =  findViewById(R.id.v3);
         Button btnCalc = findViewById(R.id.btnCalcular);



            btnCalc.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    cont=0;
                    try {
                        vm1 = Double.parseDouble(m1.getText().toString());
                        vv1 = Double.parseDouble(v1.getText().toString());
                        c1 = vm1 / vv1;
                        cont++;

                    } catch (Exception e) {
                    }

                    try {
                        vm2 = Double.parseDouble(m2.getText().toString());
                        vv2 = Double.parseDouble(v2.getText().toString());
                        c2 = vm2 / vv2;
                        cont++;

                    } catch (Exception e) {

                    }


                    try {
                        vm3 = Double.parseDouble(m3.getText().toString());
                        vv3 = Double.parseDouble(v3.getText().toString());
                        c3 = vm3 / vv3;
                        cont++;

                    } catch (Exception e) {


                    }

                    if (cont >= 2) {
                            if (c1 > c2 && c1 > c3) {
                                Toast toast = Toast.makeText(getApplicationContext(), "Compre a primeira cerveja", Toast.LENGTH_SHORT);
                                toast.show();
                            } else if (c2 > c1 && c2 > c3) {
                                Toast toast = Toast.makeText(getApplicationContext(), "Compre a segunda cerveja", Toast.LENGTH_SHORT);
                                toast.show();
                            } else {
                                Toast toast = Toast.makeText(getApplicationContext(), "Compre a terceira cerveja", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Preencha ao menos duas cervejas", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });
    }
}
