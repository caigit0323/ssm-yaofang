package sss;

import java.util.Scanner;

public class Arr {
	public static void main (String[] args){
		
//		int[] shu=new int[5];
//		int zo=0;
//		int a=shu.length;
//		System.out.println("请输入五个数字");
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++){
//			shu[i]=sc.nextInt();
//		}
//		for(int j=0;j<a;j++){
//			zo +=shu[j];
//			
//		}
//		
//		
//		System.out.println("和为"+zo);
	//}
//		int intArray[] = new int[5];
//		long total = 0;
//		int len = intArray.length;
//		// 给数组元素赋值
//		System.out.print("请输入" + len + "个整数，以空格为分隔：");
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<len; i++){
//		intArray[i] = sc.nextInt();
//		}
//		// 计算数组元素的和
//		for(int i=0; i<len; i++){
//		total += intArray[i];
//		}
//		System.out.println("所有数组元素的和为：" + total);
//		}
		
		// 第一个矩阵（动态初始化一个二维数组）
		int a[][] = new int[2][3];
		// 第二个矩阵（静态初始化一个二维数组）
		int b[][] = { {1,5,2,8}, {5,9,10,-3}, {2,7,-5,-18} };
		// 结果矩阵
		int c[][] = new int[2][4];
		// 初始化第一个矩阵
		for(int i=0; i<2; i++)
		for(int j=0; j<3 ;j++)
		a[i][j] = (i+1) * (j+2);
		// 计算矩阵乘积
		for (int i=0; i<2; i++){
		for (int j=0; j<4; j++){
		c[i][j]=0;
		for(int k=0; k<3; k++)
		c[i][j] += a[i][k] * b[k][j];
		}
		}
		// 输出结算结果
		for(int i=0; i<2; i++){
		for (int j=0; j<4; j++)
		System.out.printf("%-5d", c[i][j]);
		//System.out.printlnwww.ymzxrj.com();
		}
	}
}
