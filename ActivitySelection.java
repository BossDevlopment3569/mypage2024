package activityV2_prac;
import java.util.Scanner;
public class ActivitySelection {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num,ss,ee,count = 0;
		num = scan.nextInt();
		int start[] = new int[num];
		int end[] = new int[num];
		if(num >= 1 && num <= 50) {
			
			for(int i = 0 ; i < num ; i++) {
				ss = scan.nextInt();
				ee = scan.nextInt();
				if(ss >= 0 && ss < ee) {
					start[i] = ss;
					//System.out.println(start[i]);
					if(ee > ss && ee <= 23) {
					end[i] = ee;
					//System.out.println(end[i]);
					}
				}
			}
			
			for(int i = 0 ; i < num ; i++) {
				for(int j = 1 ; j < num ; j++) {
					if(end[j] <= start[i] || start[j] >= end[i]) {
						count++;
					}else {
						continue;
					}
				}
				break;
			}
			
			System.out.println(count + 1);
		}
	}

}
