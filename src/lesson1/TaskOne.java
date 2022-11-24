package lesson1;

public class TaskOne {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = m + n;
        --m;
        --n;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                --c;
                nums1[c] = nums1[m];
                m--;
            } else {
                --c;
                nums1[c] = nums2[n];
                n--;
            }
        }
        while (m >= 0) {
            --c;
            nums1[c] = nums1[m];
            m--;
        }
        while (n >= 0) {
            --c;
            nums1[c] = nums2[n];
            n--;
        }
    }
}
