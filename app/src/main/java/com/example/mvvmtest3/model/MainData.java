package com.example.mvvmtest3.model;

import java.util.ArrayList;

public class MainData {
    static MainData mainData;
    ArrayList<Raffle> raffleList = new ArrayList<Raffle>();
    String winner;
    DataListener dataListener;

    private MainData() {
        raffleList.add(new Raffle(0, "오킹"));
        raffleList.add(new Raffle(1, "금강연화"));
        raffleList.add(new Raffle(2, "홍사운드"));
        raffleList.add(new Raffle(3, "권혁"));
        raffleList.add(new Raffle(4, "황희찬"));
    }

    public static MainData getInstance() {
        if(mainData == null) {
            mainData = new MainData();
        }
        return mainData;
    }

    public void getData() {
        winner = raffleList.get((int)(Math.random()*5)).getName();
        notifyChange();
    }

    private void notifyChange() {
        if(dataListener != null) {
            dataListener.onChanged();
        }
    }

    public void setOnDatabaseListener(DataListener dataListener) {
        this.dataListener = dataListener;
    }

    public String getWinner(){
        return winner;
    }

    public interface DataListener {
        void onChanged();
    }
}
