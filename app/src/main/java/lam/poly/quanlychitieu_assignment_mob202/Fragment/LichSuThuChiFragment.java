package lam.poly.quanlychitieu_assignment_mob202.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lam.poly.quanlychitieu_assignment_mob202.R;


public class LichSuThuChiFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_lich_su_thu_chi,container,false);

        return view;
    }
}
