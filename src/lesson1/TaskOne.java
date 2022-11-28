package lesson1;

public class TaskOne {
        public static void main(String[] args) {
            System.out.println("Gggggggg");
        }
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int c = m + n;
            m--;
            n--;
            while (m >= 0 && n >= 0) {
                c--;          
                if (nums1[m] > nums2[n]) {
                    nums1[c] = nums1[m];
                    m--;
                } else {              
                    nums1[c] = nums2[n];
                    n--;
                }
                
            }
            while (m >= 0) {
                c--;
                nums1[c] = nums1[m];
                m--;
            }
            while (n >= 0) {
                c--;
                nums1[c] = nums2[n];
                n--;
            }
        }
    
    }
