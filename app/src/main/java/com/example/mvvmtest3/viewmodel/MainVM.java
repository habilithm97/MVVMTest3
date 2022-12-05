package com.example.mvvmtest3.viewmodel;

import androidx.databinding.BaseObservable;

import com.example.mvvmtest3.model.MainData;
import com.example.mvvmtest3.model.Raffle;

import java.util.ArrayList;
import java.util.List;

/*
*BaseObservable
-Binding 하려는 객체에 android.databinding.Observable 인터페이스를 구현하면
 해당 객체에 단일 리스너를 연결하여 그 객체에 모든 속성의 변경사항을 수신할 수 있게됨 -> 편의를 위해 BaseObservable 클래스를 제공함
 */
public class MainVM extends BaseObservable {
    MainData mainData;
    String winner;

    public MainVM(MainData mainData) {
        this.mainData = mainData;
        this.mainData.setOnDatabaseListener(new MainData.DataListener() {
            @Override
            public void onChanged() {
                winner = null;
                winner = mainData.getWinner();
                notifyChange();
            }
        });
    }

    public void getData() {
        mainData.getData();
    }

    public String getWinner() {
        return winner;
    }
}
