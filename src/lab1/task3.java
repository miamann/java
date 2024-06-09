package lab1;
import java.util.*;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> nums2 = Arrays.asList(0, 2, 1, 9, 7);
        List<Integer> nums3 = nums1.stream()
                .filter(e -> !nums2.contains(e))
                .collect(Collectors.toList());
        System.out.println(nums3);
    }
}
