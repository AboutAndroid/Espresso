package io.github.marktony.espresso.companydetail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lizhaotailang on 2017/2/10.
 */

public class CompanyDetailFragment extends Fragment
        implements CompanyDetailContract.View {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public void setPresenter(CompanyDetailContract.Presenter presenter) {

    }

}