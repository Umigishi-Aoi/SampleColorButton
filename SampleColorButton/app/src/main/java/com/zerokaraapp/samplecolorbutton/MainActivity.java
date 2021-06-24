package com.zerokaraapp.samplecolorbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンビューを3つ取得
        Button buttonRed = findViewById(R.id.button_red);
        Button buttonBlue = findViewById(R.id.button_blue);
        Button buttonYellow = findViewById(R.id.button_yellow);

        //ボタンを押されたときの動作を持つインスタンスを生成
        ButtonClickListener listener = new ButtonClickListener();

        //ボタンにButtonClickListenerインスタンスをセット
        buttonRed.setOnClickListener(listener);
        buttonBlue.setOnClickListener(listener);
        buttonYellow.setOnClickListener(listener);
    }

    //ボタンを押されたときの動作を定義するクラスを作成
    private class ButtonClickListener implements View.OnClickListener{

        //ボタンを押されたときの動作を定義
        @Override
        public void onClick(View view){

            //結果を出力するテキストビューを取得
            TextView color =findViewById(R.id.color_text);

            //押されたボタンのidを取得
            int id = view.getId();

            //押されたボタンのidによって条件分岐
            switch (id) {

                //赤色ボタンの時
                case R.id.button_red:
                    //テキスト『赤色』を表示
                    color.setText(R.string.red);
                    //テキストの色を赤色に変更
                    color.setTextColor(Color.RED);
                    break;
                //青色ボタンの時
                case R.id.button_blue:
                    //テキスト『青色』を表示
                    color.setText(R.string.blue);
                    //テキストの色を青色に変更
                    color.setTextColor(Color.BLUE);
                    break;
                //黄色ボタンの時
                case R.id.button_yellow:
                    //テキスト『黄色』を表示
                    color.setText(R.string.yellow);
                    //テキストの色を黄色に変更
                    color.setTextColor(Color.YELLOW);
                    break;
            }
        }
    }

}