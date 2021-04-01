public class BubbleSort {
	public static void bubbleSort(int[]ar) {
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-1-i;j++) {//j 只看i后面～length-1
				if(ar[j]>ar[j+1]) {
					int temp =ar[j];
					ar[j]= ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}