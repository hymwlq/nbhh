package com.nbhh.app.openproject.business;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.nbhh.app.openproject.R;

/**
 * @author Wlq
 * @description 数据结构
 * @date 2018/3/2 下午6:01
 */
public class DataStructureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_data_structure);

        String[] strs = {"abcfdefxa","abcdfdefa","abcdef","abcdefw","abcgdef","aebdefca"};
        String str1 = longestCommonPrefix(strs);
        Log.i("DataStructureActivity", "data1:" + str1);
    }

    /**
     * 编写一个函数来查找字符串数组中最长的公共前缀字符串
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) return "";
        String preStr = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(preStr) != 0) {
                preStr = preStr.substring(0, preStr.length() - 1);
            }
            i ++;
        }
        return preStr;
    }
}
