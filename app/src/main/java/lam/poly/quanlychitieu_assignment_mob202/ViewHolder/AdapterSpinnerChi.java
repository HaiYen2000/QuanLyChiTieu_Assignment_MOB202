package lam.poly.quanlychitieu_assignment_mob202.ViewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import lam.poly.quanlychitieu_assignment_mob202.Model.LoaiChi;
import lam.poly.quanlychitieu_assignment_mob202.R;


public class AdapterSpinnerChi extends ArrayAdapter<LoaiChi> {

    public List<LoaiChi> listData= new ArrayList<>();
    public Context context;
    public int resource;


    public AdapterSpinnerChi(@NonNull Context context, int resource, @NonNull List<LoaiChi> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.listData=objects;
    }
    class viewHolder{
        TextView txtLoaiThu;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        viewHolder view;
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.item_spinner_loaichi,parent,false);
            view=new viewHolder();

            view.txtLoaiThu=convertView.findViewById(R.id.txtLoaiThu);
            convertView.setTag(view);
        }
        else
        {
            view= (viewHolder) convertView.getTag();
        }
                view.txtLoaiThu.setText(listData.get(position).getTenLoaiChi());



        return convertView;
    }
}
