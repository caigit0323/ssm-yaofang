package sss;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shuru{
	
	//字节输入流
	public void test() throws IOException{
	FileInputStream  file=new FileInputStream("F:/software/a.txt");	
	byte [] buff=new byte[1024];
	int len;
	while((len=file.read(buff))!=-1){
		System.out.println(new String(buff,0,len));
	}
	file.close();
	}
	//加强版的字节输入流  
	public void test2() throws IOException{
		FileInputStream file2=new FileInputStream("F:/software/a.txt");
		BufferedInputStream buff=new BufferedInputStream(file2);//表示为true时,表示在为本后面追加
		byte[] by=new byte[1024];
		int len ;
		while((len=buff.read(by))!=-1){
			System.out.println(new String(by,0,len));
		}
		file2.close();
		buff.close();
		
	}
	
	//InputStreamReader字符输入流//一个字一个字的读
	public void test3() throws IOException{
		InputStreamReader isr=new InputStreamReader(new FileInputStream("F:/software/a.txt"));
		int ch;
		while((ch=isr.read())!=-1){
			System.out.println((char)ch);
		}
		isr.close();
	}
	//FileRead()
	public void test4() throws IOException{
		FileReader reader=new FileReader("F:/software/a.txt");
		char[] cbu1f=new char[1024];
		int le;
		while((le=reader.read(cbu1f))!=-1){
			System.out.println(cbu1f);
		}
		
		reader.close();
	}
	//bufferReader()提高效率
		public void test5() throws IOException{
			FileReader reader=new FileReader("F:/software/a.txt");
			BufferedReader buff=new BufferedReader(reader); 
			char[] cbu1f=new char[1024];
			int le;
			while((le=buff.read(cbu1f))!=-1){
				System.out.println(cbu1f);
			}
			buff.close();
			reader.close();
		}
	
   public static void main(String[] args) throws IOException{
	  new Shuru().test3();
	
   }
}
