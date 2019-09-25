package tests;
/**
 * 用二分法和递归写个算法,从已知数组中查寻元素
 * @author ASUS
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		int num=45;
		int[] arr= {1,2,34,45,67,78,67,89,99};
		int result=findByValue(num, arr);
		System.out.println("寻找的数的数组下标为:"+result);
	}
	private static int findByValue(int num,int[] arr) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(num<arr[mid]) {//45
				right=mid-1;
			}else if(num>arr[mid]) {
				left=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}