package com.example.labcomdemo;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class RepairFragment extends Fragment {

    /*TextView*/
    TextView repair_txt,order_txt,delivey_txt;
    /*TEXTVIEW*/
    TextView delivey_txt2;

    /*BUTTON*/
    Button add_new_btn;
    /*IMAGEVIEW*/
    ImageView chats_icon,search_icon,menu_icon;

    public RepairFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_repair, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        naVIGATION();
    }

    private void naVIGATION() {

        /*TextView*/
        repair_txt=getView().findViewById(R.id.textView11);
        order_txt=getView().findViewById(R.id.order_txt2);
        delivey_txt=getView().findViewById(R.id.delivey_txt3);
        add_new_btn=getView().findViewById(R.id.add_new_btn);

        chats_icon=getView().findViewById(R.id.chats_icon);
        search_icon=getView().findViewById(R.id.search_icon);

        /*CLICKS ON THE TEXTVIEW*/
        repair_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DashboardActivity fragment=new DashboardActivity();
                FragmentTransaction transaction= Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.repair_contain,fragment);
                transaction.commit();
            }
        });
        order_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComingOrderFragment fragment=new ComingOrderFragment();
                FragmentTransaction transaction= Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.repair_contain,fragment);
                transaction.commit();
            }
        });
        delivey_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeliveryFragment fragment=new DeliveryFragment();
                FragmentTransaction transaction= Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.repair_contain,fragment);
                transaction.commit();
            }
        });
        add_new_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewUnrepairableFragment fragment=new NewUnrepairableFragment();
                FragmentTransaction transaction= Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.repair_contain,fragment);
                transaction.commit();
            }
        });

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
        delivey_txt2=getView().findViewById(R.id.delivey_txt3);
        delivey_txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeliveryFragment fragment=new DeliveryFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.repair_contain,fragment);
                transaction.commit();
            }
        });
    }
}
