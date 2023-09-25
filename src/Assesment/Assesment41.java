package Assesment;

public class Assesment41 {
	public static void main(String[] args) {
		for(int i=999;i>=100;i--) {
			int ans=0;
			int poli=0;
			int j=0;
			int poliOriginal=0;
			for(j=999;j>=100;j--) {
				ans=i*j;
				poli=0;
				poliOriginal=ans;
				while(ans>0) {
					int rem=ans%10;
					poli=poli*10+rem;
					ans =ans/10;
				}
				if(poli==poliOriginal) {
					System.out.println(i+"*"+j);
					break;
				}
			}
			if(poli==poliOriginal) {
				break;
			}
		}
	}

}
