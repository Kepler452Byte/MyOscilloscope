package com.kepler452b.myoscilloscope;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Mr_wang on 2017/3/5.
 */

public class YAxisResolutionChanged implements View.OnClickListener {

    private TextView text_Y_axis_resolution;
    private Button btn_Y_add, btn_Y_reduce;
    //将被显示的Y轴的分辨率
    private String[] strings_Y_axis_resolution = {"5V/div", "2V/div", "1V/div", "500mV/div", "200mV/div", "100mV/div", "50mV/div", "20mV/div",
            "10mV/div"};
    //将Y轴的分辨率换算成 伏特（V）
    int[] value_Y_axis_resolution = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10};
    int clickTimes = 2; //点击次数

    public YAxisResolutionChanged(Button button_add, Button button_reduce, TextView textView){
        this.btn_Y_add = button_add;
        this.btn_Y_reduce = button_reduce;
        this.text_Y_axis_resolution = textView;
    }

    /**
     * 获得X轴的分辨率的字符串
     * @param i
     * @return
     */
    public String getText_YAxisResolution(int i){
        return strings_Y_axis_resolution[i];
    }

    /**
     * 获得X轴分辨率的值
     * @param i
     * @return
     */
    public int getValue_YAxisResolution(int i){
        return value_Y_axis_resolution[i];
    }

    @Override
    public void onClick(View view) {
        if(view == btn_Y_add){
            clickTimes--;
            if (clickTimes <= 0){
                clickTimes = 0;
            }else if(clickTimes >=8){
                clickTimes = 8;
            }else {}
            String s = getText_YAxisResolution(clickTimes);
            text_Y_axis_resolution.setText(s);
        }else if(view == btn_Y_reduce){
            clickTimes++;
            if (clickTimes <= 0){
                clickTimes = 0;
            }else if(clickTimes >=8){
                clickTimes = 8;
            }else {}
            String s = getText_YAxisResolution(clickTimes);
            text_Y_axis_resolution.setText(s);
        }
    }
}
