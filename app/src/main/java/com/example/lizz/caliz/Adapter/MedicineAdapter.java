package com.example.lizz.caliz.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lizz.caliz.Modelo.Medicine;
import com.example.lizz.caliz.R;

import java.util.ArrayList;

/**
 * Created by Lizz on 13/05/2015.
 */
public class MedicineAdapter extends BaseAdapter {

    ArrayList<Medicine> item;
    LayoutInflater mInflater;

    public MedicineAdapter(Context context, ArrayList<Medicine> item) {
        // TODO Auto-generated constructor stub
        mInflater = LayoutInflater.from(context);
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder;
        if (row == null) {
            holder = new ViewHolder();
            row = mInflater.inflate(R.layout.item_medicina, null);
            holder.nombre = (TextView) row.findViewById(R.id.nombreMedicina);
            holder.dia = (TextView) row.findViewById(R.id.diaMedicina);
            holder.hora = (TextView) row.findViewById(R.id.horaMedicina);
            holder.imagen = (ImageView) row.findViewById(R.id.imagenMedicina);
            row.setTag(holder);
        } else {
            holder = (ViewHolder)row.getTag();
        }
        return row;
    }

    class ViewHolder {
        TextView nombre, dia, hora;
        ImageView imagen;
    }
}