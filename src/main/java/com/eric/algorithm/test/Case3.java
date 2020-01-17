package com.eric.algorithm.test;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Case3 {

    public static void main(String[] args) {

        log.info("result : {} ", lengthOfLongestSubstring("abcabcbb"));


    }

    /*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。*/
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int index = 0, longest = 0, startIndex = 0; // 循环下标， 最大长度，起始位置
        while (index < len) {// 当没有到末位,继续滑动
            char c = s.charAt(index);  //获取当前的字符
            if (map.containsKey(c)) { //如果已经存在
                startIndex = Math.max(startIndex, map.get(c)); // 取startIndex最大值，设置为滑动的起始位置
            }
            longest = Math.max(longest, index - startIndex + 1); //  取最大长度
            map.put(c, index + 1); // 存放值，  转译下标
            index++;
        }
        return longest;
    }
}
