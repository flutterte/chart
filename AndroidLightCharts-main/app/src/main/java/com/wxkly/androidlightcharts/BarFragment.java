package com.wxkly.androidlightcharts;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.wxkly.androidcharts.BarView;

import java.util.ArrayList;

/**
 * Created by wxkly on 10/23/20
 */
public class BarFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bar, container, false);
        final BarView barView = (BarView) rootView.findViewById(R.id.bar_view);
        Button button = (Button) rootView.findViewById(R.id.bar_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomSet(barView);
            }
        });
        randomSet(barView);
        return rootView;
    }

    private void randomSet(BarView barView) {
        int random = 5;
        ArrayList<String> test = new ArrayList<String>();
        test.add("Monday");
        test.add("Tuesday");
        test.add("Wednesday");
        test.add("Thursday");
        test.add("Friday");
        barView.setBottomTextList(test);

        ArrayList<Integer> barDataList = new ArrayList<Integer>();
        for (int i = 0; i < random; i++) {
            barDataList.add((int) (Math.random() * 100));
        }
        barView.setDataList(barDataList);
    }
}