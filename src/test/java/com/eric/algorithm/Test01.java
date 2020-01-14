package com.eric.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

/**
 * Test01
 */
@SpringBootTest
@Slf4j
public class Test01 {


    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    @Test
    public void test01() {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);
        log.info("两数之和：target: {} , index: {}", target, result);
    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] resultArr = null;
        for (int i = 0; i < nums.length; i++) {
            Integer index = i;
            Integer firstNum = nums[i];
            int otherNum = target - firstNum;
            if (map.containsKey(otherNum)) {
                //有值，已经找到对应的数据
                resultArr = new int[]{map.get(otherNum), index};
                break;
            } else {
                map.put(firstNum, index);
            }
        }
        return resultArr;
    }
}