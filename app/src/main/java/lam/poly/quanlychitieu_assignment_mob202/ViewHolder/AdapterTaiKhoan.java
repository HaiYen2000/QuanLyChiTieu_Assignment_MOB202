package lam.poly.quanlychitieu_assignment_mob202.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import lam.poly.quanlychitieu_assignment_mob202.Model.TaiKhoan;
import lam.poly.quanlychitieu_assignment_mob202.R;

/**
 * Created by Develop on 5/6/2018.
 */

class TaiKhoanViewHolder extends RecyclerView.ViewHolder {

    public TextView txtTenTaiKhoan,txtSoTienTaiKhoan;


    public TaiKhoanViewHolder(View itemView) {
        super(itemView);
        txtTenTaiKhoan=itemView.findViewById(R.id.txtTenTaiKhoan);
        txtSoTienTaiKhoan=itemView.findViewById(R.id.txtSoTientaikhoan);
    }
}

public class AdapterTaiKhoan extends RecyclerView.Adapter<TaiKhoanViewHolder>{

    private List<TaiKhoan> listdata=new ArrayList<>();
    private Context context;

    public AdapterTaiKhoan(List<TaiKhoan> listdata, Context context) {
        this.listdata = listdata;
        this.context = context;
    }

    @Override
    public TaiKhoanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);
        View itemView=inflater.inflate(R.layout.item_tai_khoan,parent,false);
        return new TaiKhoanViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(TaiKhoanViewHolder holder, int position) {

        holder.txtTenTaiKhoan.setText(listdata.get(position).getTenTaiKhoan());
        holder.txtSoTienTaiKhoan.setText(listdata.get(position).getSoTienTaiKhoan() + " VND");

    }
    @Override
    public int getItemCount() {
        return listdata.size();
    }
}
