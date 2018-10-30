package project3;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractList;

public class Pro3 {
	public static void main(String[] args) {
		System.out.println(getLCM(120,150));
		System.out.println(getLCM(7,14));
		System.out.println(getLCM(7,8));
		System.out.println(getLCM(1,2));
		System.out.println(getLCM(345,455));
	}
	
	public static int[][] getPrimeFactors(int number) {		
		ArrayList<Integer> h = new ArrayList<Integer>(); //����������
		ArrayList<Integer> j = new ArrayList<Integer>(); //����ִ���
		//һһ��Ӧ
		
		int temp = 0;
		int num;
		for(int i=2;i<number+1;i++){
			if(0==number%i) {
				num = 0;
				while(0==number%i){
					num++;
					number/=i;
				}	
				h.add(i);
				j.add(num);
				temp++;
			}
		}
		int[][] x = new int[temp][2];
		for(int i=0;i<temp;i++) {
			x[i][0]=h.get(i);
			x[i][1]=j.get(i);
		}
		return x;
	}
		
	public static void showL(int[][] x) {
		for(int i = 0;i<x.length;i++) {
			System.out.println(x[i][0]+" "+x[i][1]);
		}
	}
	
	public static int getLCM(int n1,int n2) {     //����С���������������������������Ӽ����ִ������㡣
		int[][] x = getPrimeFactors(n1);
		int[][] y = getPrimeFactors(n2);
		ArrayList<Integer> h = new ArrayList<Integer>(); //����������
		ArrayList<Integer> j = new ArrayList<Integer>(); //����ִ���
		
		for(int i=0;i<x.length;i++) {
			h.add(x[i][0]);
			j.add(x[i][1]);
		}    //����һ�������������Ӻʹ�����Ӧ����h��j
		
		boolean flag;  //�жϵ�ǰ�����Ƿ�ƥ��
		
		for(int i=0;i<y.length;i++) {
			flag = false;   //ÿ������һ��ʼ����ʼ��Ϊ��ƥ��
			for(int k=0;k<h.size();k++) {   //�����м�����������ֽ��бȶ�
				if(y[i][0]==h.get(k)) {     //��ƥ��
					if(y[i][1]>j.get(k)) {    //�Ƚϳ��ִ����������滻
						j.set(k, y[i][1]);
					}
					flag = true;          //˵����ǰ������ƥ��
				}
			}
			
			if(!flag) {               //��ƥ�䣬������µ��������Ӻʹ���
				h.add(y[i][0]);
				j.add(y[i][1]);
			}
		}
		int LCM = 1;
		int temp;
		for(int i=0;i<h.size();i++) {      //������������Ԫ�ظ��ݴ�����ˣ����ó����
			temp = h.get(i);
			for(int k=0;k<j.get(i)-1;k++) {
				temp*=h.get(i);
			}
			LCM*=temp;
		}
		return LCM;
	}
	
}

