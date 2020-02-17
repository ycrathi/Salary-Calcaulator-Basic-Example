package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    EditText bpN;
    EditText hraN;
    EditText saN;
    EditText caN;
    EditText sdaN;

    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        bpN = findViewById(R.id.basicPayPer);

        btnsubmit = findViewById(R.id.btnaddDetails);


        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                againGotoMain();
            }
        });

        hraN = findViewById(R.id.hraPer);
        saN = findViewById(R.id.saPer);
        caN = findViewById(R.id.caPer);
        sdaN = findViewById(R.id.sdaPer);


    }

    public void againGotoMain() {

        Intent i = new Intent();
        //  Intent i = new Intent(this, HomeScreenActivity.class);
        String bp = bpN.getText().toString();
        String hra = hraN.getText().toString();
        String sa = saN.getText().toString();
        String ca = caN.getText().toString();
        String sda = sdaN.getText().toString();

        i.putExtra("bp1", bp);
        i.putExtra("hra1", hra);
        i.putExtra("sa1", sa);
        i.putExtra("ca1", ca);
        i.putExtra("sda1", sda);
        setResult(RESULT_OK, i);

        finish();
        // startActivity(i);

    }


    /*     tax = findViewById(R.id.tax);
         epf = findViewById(R.id.epf);
         netsalary = findViewById(R.id.netsalary);
         btn=findViewById(R.id.btnOfClickToHome);

    Intent intent = getIntent();
    salary1=intent.getExtras().getString("ctc");
    *//*tp=intent.getExtras().getString("taxPer1");
        ep=intent.getExtras().getString("epfPer1");
*//*
        tax = findViewById(R.id.tax);
        epf = findViewById(R.id.epf);
        netsalary = findViewById(R.id.netsalary);

        netSalaryCalculation();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoHome();
            }
        });




    }*/
    /*public void netSalaryCalculation()
    {
        double ctcSalary= Double.parseDouble(salary1);
         *//* double taxPer=Double.parseDouble(tp);
        double epfPer=Double.parseDouble(ep);*//*
        double netsalaryOfMonth;
        double  ctcTax;
        double  ctcEpf;

       *//* double  ctcTax=(ctcSalary*taxPer/100)/12;
        double  ctcEpf=(ctcSalary*epfPer/100)/12;*//*
     *//* if(isEmpty(tax) && isEmpty(epf))
        {
            Toast t=Toast.makeText(this, "You must Add details in Settings", Toast.LENGTH_SHORT);
            t.show();
        }
        else
        {
            ctcTax=(ctcSalary*taxPer/100)/12;
            ctcEpf=(ctcSalary*epfPer/100)/12;
        }*//*
       if(ctcSalary>=500000)
        {
            ctcTax=(ctcSalary*10/100)/12;
            ctcEpf=(ctcSalary*12/100)/12;

        }
        else if(ctcSalary>=300000)
        {
            ctcTax=(ctcSalary*5/100)/12;
            ctcEpf=(ctcSalary*12/100)/12;

        }
        else
        {
            ctcTax=0;
            ctcEpf=(ctcSalary*12/100)/12;
        }


        tax.setText(String.valueOf(ctcTax));
        epf.setText(String.valueOf(ctcEpf));

        netsalaryOfMonth=(ctcSalary/12)-(ctcTax+ctcEpf);
        netsalary.setText(String.valueOf(netsalaryOfMonth));

    }


    public void gotoHome()
    {
        Intent intent = new Intent(this, SplashScreenActivity.class);
        startActivity(intent);
    }

    }

*/

}