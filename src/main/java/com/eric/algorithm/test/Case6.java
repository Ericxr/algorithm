package com.eric.algorithm.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Case6 {


   /* 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
    比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
    L   C   I   R
    E T O E S I I G
    E   D   H   N
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/zigzag-conversion
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

    public static void main(String[] args) {
        solution("LEETCODEISHIRING", 3);
    }


    static String solution(String s, int rowNums) {
        if (rowNums == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        for (int i = 0; i < rowNums; i++) {
            list.add(new StringBuilder());
        }
        int index = 0; // 0时加， 末尾时减
        boolean islast = true;
        for (char c : s.toCharArray()) {

            list.get(index).append(c);
            if (index == 0 || index == rowNums - 1) islast = !islast;
            index += islast ? -1 : 1;
        }
        log.info("list:-> {}", list);
        return " ";
    }

}
