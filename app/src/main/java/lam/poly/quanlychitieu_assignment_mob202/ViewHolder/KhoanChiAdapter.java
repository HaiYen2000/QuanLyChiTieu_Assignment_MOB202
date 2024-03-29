package lam.poly.quanlychitieu_assignment_mob202.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import lam.poly.quanlychitieu_assignment_mob202.Model.KhoangChi;
import lam.poly.quanlychitieu_assignment_mob202.R;

/**
 * Created by Develop on 5/6/2018.
 */
class KhoanChiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    public TextView txt_KhoangThu, txt_SoTien, txtNgay;
    public List<KhoangChi> list = new ArrayList<>();
    public Context context;

    public KhoanChiViewHolder(View itemView, Context context, List<KhoangChi> list) {
        super(itemView);
        this.list = list;
        this.context = context;
        txt_KhoangThu = itemView.findViewById(R.id.txtLoaiThu);
        txt_SoTien = itemView.findViewById(R.id.txtSoTien);
        txtNgay = itemView.findViewById(R.id.txtNgay);
        itemView.setOnClickListener(this);
        //itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}

public class KhoanChiAdapter extends RecyclerView.Adapter<KhoanChiViewHolder> {

    private List<KhoangChi> listData = new ArrayList<>();
    private Context context;

    public KhoanChiAdapter(List<KhoangChi> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }


    @Override
    public KhoanChiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_khoan_chi, parent, false);
        return new KhoanChiViewHolder(itemView, context, listData);
    }

    @Override
    public void onBindViewHolder(KhoanChiViewHolder holder, int position) {
        holder.txt_KhoangThu.setText(listData.get(position).getLoaiChi());

        holder.txt_SoTien.setText(listData.get(position).getSoTienChi() + " đ");

        holder.txtNgay.setText(listData.get(position).getNgayChi());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
