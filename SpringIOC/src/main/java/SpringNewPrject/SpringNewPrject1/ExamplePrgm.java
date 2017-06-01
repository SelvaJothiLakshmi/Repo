package SpringNewPrject.SpringNewPrject1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamplePrgm {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5,6,7};
		int addResult =0;
		int input = 7;
		ArrayList list=new ArrayList();
		for(int i=0;i<a.length;i++){
			addResult =0;
			boolean flag=true;
			for(int j=i+1;j<a.length;j++){
				if(flag){
					flag = false;
					addResult = a[i] + a[j]; //3			
					list.add(a[i]);
					list.add(a[j]);
					
				}
				else if(flag == false ){
					int addResult1 = 0;
					addResult1 = a[i] + a[j];
					if(addResult1==input){
						list=new ArrayList();
						list.add(a[i]);
						list.add(a[j]);
						System.out.println("list=###="+list);
						break;
					}
					else{
					 addResult =  a[j] + addResult; //3+3
					 if( addResult!=input){
						addResult =  addResult - a[j] ; //3
					 }
					 else{
						 list.add(a[j]);
						// System.out.println("list=="+list);
					 }
					}
				 }
				if(addResult==input){	
				System.out.println("list"+list);
				}
			}
			list=new ArrayList();
		}
	}

}
