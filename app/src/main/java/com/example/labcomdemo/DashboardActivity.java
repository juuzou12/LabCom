package com.example.labcomdemo;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardActivity extends Fragment {
    /*layout*/
    ConstraintLayout repair_layout,coming_order_Layout,delivery_layout,pending_layout,summaryreports_layout,main_layput,menu_layout;

    /*TextView*/
    TextView repair_txt,order_txt,delivey_txt,talks_txt,tracom_engineers;

    /*IMAGEVIEW*/
    ImageView chats_icon,search_icon,menu_icon;

    /*BUTTON*/
    Button menu_back2;
    public DashboardActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        naviGATION();
    }
    /*NAVIGATION*/
    private void naviGATION() {
        /*layout*/
        repair_layout=getView().findViewById(R.id.repair_layout);
        coming_order_Layout=getView().findViewById(R.id.coming_order_Layout);
        delivery_layout=getView().findViewById(R.id.delivery_layout);
        pending_layout=getView().findViewById(R.id.pending_layout);
        summaryreports_layout=getView().findViewById(R.id.summaryreports_layout);
        main_layput=getView().findViewById(R.id.main_layput);
        menu_layout=getView().findViewById(R.id.menu_layout);

        /*TextView*/
        repair_txt=getView().findViewById(R.id.repair_txt);
        order_txt=getView().findViewById(R.id.order_txt);
        delivey_txt=getView().findViewById(R.id.delivey_txt);
        talks_txt=getView().findViewById(R.id.talks_txt);
        tracom_engineers=getView().findViewById(R.id.tracom_engineers);

        /*IMAGEVIEW*/
        chats_icon=getView().findViewById(R.id.chats_icon);
        search_icon=getView().findViewById(R.id.search_icon);
        menu_icon=getView().findViewById(R.id.menu_icon);

        /*BUTTON*/
        menu_back2=getView().findViewById(R.id.menu_back2);

            /*CLICKS ON THE LAYOUT*/
        repair_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RepairFragment fragment=new RepairFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        coming_order_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComingOrderFragment fragment=new ComingOrderFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        delivery_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeliveryFragment fragment=new DeliveryFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        pending_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PendingandCompleteFragment fragment=new PendingandCompleteFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        summaryreports_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SummaryReportFragment fragment=new SummaryReportFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        tracom_engineers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EngineerFragment fragment=new EngineerFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });

        /*CLICKS ON THE TEXTVIEW*/
        repair_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RepairFragment fragment=new RepairFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        order_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComingOrderFragment fragment=new ComingOrderFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        delivey_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeliveryFragment fragment=new DeliveryFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });

        /*CLICKS ON IMAGEVIEWs*/
        chats_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChatRoomFragment fragment=new ChatRoomFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        search_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SearchFragment fragment=new SearchFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_layput.setVisibility(View.GONE);
                menu_layout.setVisibility(View.VISIBLE);
            }
        });
        talks_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChatRoomFragment fragment=new ChatRoomFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        menu_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_layput.setVisibility(View.VISIBLE);
                menu_layout.setVisibility(View.GONE);
            }
        });
    }
}
