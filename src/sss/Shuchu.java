package sss;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Shuchu {
	//字节流输出
	public void  Test() throws IOException{
		FileOutputStream f=new FileOutputStream("F:/software/a.txt");
		f.write("len  hao".getBytes());
		f.close();
	}
	//增强版的字节流
	public void Test2() throws IOException{
		FileOutputStream f2=new FileOutputStream("F:/software/a.txt");
		BufferedOutputStream buff=new BufferedOutputStream(f2);
		buff.write("ni hao ya ".getBytes());
		buff.close();
		f2.close();
	}
	
	//字符OutputStreamWriter流进行输出
	public void test3() throws IOException{
		OutputStream in=new FileOutputStream("F:/software/a.txt");
		OutputStreamWriter in2=new OutputStreamWriter(in);
		in2.write("我是猪猪");
		in2.close();
	}
	//字符FileWrite
	public void test4() throws IOException{
		FileWriter f=new FileWriter("F:/software/b.txt");
		f.write("我要吃饭");
		f.close();
	}
	
	//BufferWrite
	public void test5() throws IOException{
		FileWriter f=new FileWriter("F:/software/b.txt");
		//File ff=new File("F:/software/b.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write("梦露");
		b.close();
	}
	
	public static void main(String[] args) throws IOException{
		new Shuchu().test5();
	}
}
