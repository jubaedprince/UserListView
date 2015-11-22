package com.example.jubaed.userlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<PersonItem>{

    public PersonAdapter(Context context, List <PersonItem> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        //inflate the xml
        final Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_person, null, false);

        //get the views
        TextView nameTextView = (TextView)view.findViewById(R.id.item_name);
        TextView nickTextView = (TextView)view.findViewById(R.id.item_nick);
        TextView department = (TextView)view.findViewById(R.id.item_department);
        ImageView imageView = (ImageView)view.findViewById(R.id.item_image);

        //get current person
        PersonItem personItem = getItem(position);

        //set values in the views using current person
        nameTextView.setText(personItem.name);
        nickTextView.setText(personItem.nickName);
        department.setText(personItem.department);
        imageView.setImageResource(personItem.imageResId);
        return view;
    }

}
