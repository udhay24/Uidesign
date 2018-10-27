package com.example.udhayakumar.uidesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecipeAdapter extends BaseAdapter {

    ArrayList<ArrayList> list = Util.getItem();
    private Context context;

    public RecipeAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView image1;
        ImageView image2;
        ImageView image3;
        TextView text1;
        TextView text2;


        if(convertView == null){
            View view = LayoutInflater.from(context).inflate(R.layout.recipe , null);
            convertView = view;
        }

        image1 = convertView.findViewById(R.id.imageView1);
        image2 = convertView.findViewById(R.id.imageView2);
        image3 = convertView.findViewById(R.id.imageView3);

        text1 = convertView.findViewById(R.id.recipe_name);
        text2 = convertView.findViewById(R.id.recipe_number);


        Picasso.get().load((int)list.get(position).get(0)).resize(150 ,150).centerCrop().into(image1);
        Picasso.get().load((int)list.get(position).get(1)).resize(70 , 75).centerCrop().into(image2);
        Picasso.get().load((int)list.get(position).get(2)).resize(70 , 75).centerCrop().into(image3);

        text1.setText((String)list.get(position).get(3));
        text2.setText((String)list.get(position).get(4));

        return convertView;
    }
}
