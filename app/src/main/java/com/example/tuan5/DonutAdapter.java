package com.example.tuan5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class DonutAdapter extends BaseAdapter  {
    private Context context;

    public DonutAdapter(Context context, int idLayout, List<Donut> listDonut) {
        this.context = context;
        this.idLayout = idLayout;
        this.listDonut = listDonut;

    }

    private int idLayout;
    private List<Donut> listDonut;
    private int positionSelect = -1;



    @Override
    public int getCount() {
       return listDonut.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

          //anh xa
        TextView txt1=(TextView) view.findViewById(R.id.txt1);
        txt1.setText(listDonut.get(i).getName1());

        TextView txt2=(TextView) view.findViewById(R.id.txt2);
        txt2.setText(listDonut.get(i).getName2());

        TextView txt3=(TextView) view.findViewById(R.id.txt3);
        txt3.setText(listDonut.get(i).getName3());

        ImageView imganh=(ImageView) view.findViewById(R.id.imglogo);
        imganh.setImageResource(listDonut.get(i).getId());
       /* int idAnhDonut= listDonut.get(i).getId();

        switch (idAnhDonut) {
            case 1:
                imganh.setImageResource(R.drawable.donut_yellow);
                break;
            case 2:
                imganh.setImageResource(R.drawable.tasty_donut);
                break;
            case 3:
                imganh.setImageResource(R.drawable.green_donut);
                break;
            case 4:
                imganh.setImageResource(R.drawable.donut_red);
                break;
        }*/
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity2.class);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
