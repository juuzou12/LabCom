package com.example.labcomdemo;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatRoomFragment extends Fragment {
    /*TEXTVIEW*/
    TextView chatroom_back,make_call2,messo_btn;
    /*BUTTON*/
    Button send_btn,back_btn4,yap,nope;
    /*LAYOUT*/
    ConstraintLayout pick_layput,main_layout,confirm_layout,pick_a_caller;
    /*cardView*/
    CardView cardView;
    public ChatRoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat_room, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        naVIGATION();
    }

    /*NAVIGATION*/
    private void naVIGATION() {
        pick_layput=getView().findViewById(R.id.pick_layput);
        main_layout=getView().findViewById(R.id.main_layout);
        pick_a_caller=getView().findViewById(R.id.pick_a_caller);
        confirm_layout=getView().findViewById(R.id.confirm_layout);
        cardView=getView().findViewById(R.id.cardView);

        make_call2=getView().findViewById(R.id.make_call2);
        messo_btn=getView().findViewById(R.id.messo_btn);

        back_btn4=getView().findViewById(R.id.back_btn4);
        send_btn=getView().findViewById(R.id.send_btn);
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pick_layput.setVisibility(View.VISIBLE);
                main_layout.setVisibility(View.GONE);
            }
        });
        back_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pick_layput.setVisibility(View.GONE);
                main_layout.setVisibility(View.VISIBLE);
            }
        });
        make_call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pick_a_caller.setVisibility(View.GONE);
                back_btn4.setVisibility(View.GONE);
                confirm_layout.setVisibility(View.VISIBLE);
            }
        });
        chatroom_back=getView().findViewById(R.id.chatroom_back);
        chatroom_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DashboardActivity fragment=new DashboardActivity();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        yap=getView().findViewById(R.id.yap);
        yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DashboardActivity fragment=new DashboardActivity();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        messo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MessageFragment fragment=new MessageFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container,fragment);
                transaction.commit();
            }
        });
        nope=getView().findViewById(R.id.nope);
        nope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardView.setVisibility(View.GONE);
            }
        });
    }
}
