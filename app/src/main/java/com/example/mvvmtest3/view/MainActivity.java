package com.example.mvvmtest3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvvmtest3.R;

/*
[MVVM 패턴]
-Model : 데이터의 전반적인 것을 처리함, ViewModel이 요청한 데이터를 반환함

-View : UI 요소를 표시하며 사용자가 발생한 이벤트를 받음, ViewModel의 데이터를 관찰해(Observe) UI를 갱신함
 -> 데이터의 변화를 알아차리고 자동으로 화면을 갱신할 수 있음

-ViewModel : UI 요소에 들어갈 데이터를 관리하고, Model과 View 사이의 다리 역할을 함(View가 요청한 데이터를
 Model로 요청해서 요청한 데이터를 받음)

장점
1. 여러 화면이 있더라도 비슷한 데이터를 가지고 있으면 같은 ViewModel을 공유할 수 있음
 -> MVP 패턴처럼 일대일이 아니고, ViewModel이 직접적으로 요소를 그리라고 View에게 요청하지 않기 때문임

단점
1. 간단한 프로젝트에 사용하기에는 과함
2. 비교적 구현 구조가 복잡하고 설계가 쉽지 않음

-View가 필요로 하는 데이터는 ViewModel이 가지고 있기 때문에 그 데이터를 관찰함(Observing)
-View가 DB에 직접 접근하는 것이 아닌 UI 갱신에만 집중하고, ViewModel을 관찰하고 있는 만큼 데이터 변화에 능동적임
-LiveData(Observable 패턴)을 이용해 DB를 관찰하고 자동으로 UI를 갱신함 -> 직접 View를 바꿔주는 번거로움을 없애고
 데이터와 불일치할 확률이 줄어듦
-생명주기로부터 안전하여 메모리 누출을 방지할 수 있음. ViewModel을 통해 데이터를 참조하기 때문에 액티비티/프래그먼트의
 생명주기를 따르지 않음
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}