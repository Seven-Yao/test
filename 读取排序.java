package demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortDemo {

	public static void main(String[] args) throws IOException {
			FileReader fis=new FileReader("test.txt");
			BufferedReader bis=new BufferedReader(fis);
			String line="";
			String str="";
			while((line=bis.readLine())!=null) {
				str+=line;
			}
			String[] strs=str.split(",");
			List<Double> list=new ArrayList<>();
			for(int i=0;i<strs.length;i++) {
				list.add(Double.valueOf(strs[i]));
			}
			Collections.sort(list);
			System.out.println(list);
			
			
	}

}