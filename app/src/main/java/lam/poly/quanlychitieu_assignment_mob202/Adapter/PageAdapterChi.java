package lam.poly.quanlychitieu_assignment_mob202.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import lam.poly.quanlychitieu_assignment_mob202.TabPage.KhoanChiFragment;
import lam.poly.quanlychitieu_assignment_mob202.TabPage.LoaiChiFragment;


public class PageAdapterChi extends FragmentStatePagerAdapter {


    public PageAdapterChi(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag= new KhoanChiFragment();

                break;
            case 1:
                frag=new LoaiChiFragment();

                break;


        }

        return frag;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String title = "";
        switch (position){
            case 0:
                title = "Khoảng Chi";
                break;
            case 1:
                title = "Loại Chi";
                break;
        }
        return title;
    }
}
