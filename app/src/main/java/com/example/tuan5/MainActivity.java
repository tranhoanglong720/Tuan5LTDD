package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ListView lvdonut;
    private List<Donut> listdonut;

    private List<Donut> listkhac=new ArrayList<>();
    private ImageButton btntim;
    private Button[] btn = new Button[3];
    private Button btn_unfocus;
    private int[] btn_id = {R.id.btn0, R.id.btn1, R.id.btn2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < btn.length; i++) {
            btn[i] = (Button) findViewById(btn_id[i]);
            btn[i].setBackgroundColor(Color.rgb(241, 186, 22));
            btn[i].setOnClickListener(this);
        }

        btn_unfocus = btn[0];

        //Tim

        btntim=(ImageButton) findViewById(R.id.btn4);
        btntim.setOnClickListener(this);


        lvdonut = (ListView) findViewById(R.id.idlistview);
        listdonut = new ArrayList<>();
        listdonut.add(new Donut(R.drawable.donut_yellow, "Tasty Donut", "Spicy tasty donut family", "$10.00"));
        listdonut.add(new Donut(R.drawable.tasty_donut, "Pink Donut", "Spicy tasty donut family", "$20.00"));
        listdonut.add(new Donut(R.drawable.green_donut, "Floating Donut", "Spicy tasty donut family", "$30.00"));
        listdonut.add(new Donut(R.drawable.donut_red, "Tasty Donut Py", "Spicy tasty donut family", "$10.00"));

        DonutAdapter adapter = new DonutAdapter(MainActivity.this, R.layout.itemlist, listdonut);
        lvdonut.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn0:
                setFocus(btn_unfocus, btn[0]);
                break;

            case R.id.btn1:
                setFocus(btn_unfocus, btn[1]);
                break;

            case R.id.btn2:
                setFocus(btn_unfocus, btn[2]);
                break;

        }
       if(v.getId()==R.id.btn4){
             EditText Tim = (EditText) this.findViewById(R.id.txttim);
             TimDonut(Tim.getText().toString());
            DonutAdapter adapter = new DonutAdapter(MainActivity.this, R.layout.itemlist, listkhac);
            lvdonut.setAdapter(adapter);
        }
    }

    private void setFocus(Button btn_unfocus, Button btn_focus) {
        btn_unfocus.setTextColor(Color.rgb(49, 50, 51));
        btn_unfocus.setBackgroundColor(Color.rgb(241, 186, 22));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(207, 207, 207));
        this.btn_unfocus = btn_focus;
    }


    private void TimDonut(String Tim){
        int a=0;
        for(int i=0;i<listdonut.size();i++)
        {
            if(listdonut.get(i).getName1().startsWith(Tim))
            {
                listkhac.add(new Donut(listdonut.get(i).getId(),listdonut.get(i).getName1(),listdonut.get(i).getName2(),listdonut.get(i).getName3()));
               a=a+1;
            }
        }
        if(a==0)
        {
            listkhac.addAll(listdonut);
        }
    }

}