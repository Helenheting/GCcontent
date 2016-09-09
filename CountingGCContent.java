import java.io.*;
public class countinggccontent{
public static void main(String args[])throws IOException{
FileReader f =new FileReader("/home/administrator/下载/rosalind_gc.txt");
BufferedReader br =new BufferedReader(f);
String str=br.readLine();
String stmo="Rosalind";
while(str!=null){
	if(str.contains(stmo)){
		System.out.print(str + "++++++++++++++++++++++");
		str=br.readLine();
		}
//System.out.print(str);
String strnextline=str.readLine();
	while(str!=null&&!strnextline.contains(stmo)){
	str=str+br.readLine();
//	double m=0;
//	double len=str.length();
//	for(int i=0;i<len;i++){
//		if(str.charAt(i)=='C'||str.charAt(i)=='G'){
//			m=m+1;
//		}
	}
System.out.print(str + "\n"+"***************");
str=br.readLine();
}
//	double temp=m/len;
//	System.out.print(temp + "\n");
}
}
