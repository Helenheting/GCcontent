import java.io.*;                                                              
public class countinggccontenttest2{
public static void main(String args[])throws IOException{
FileReader f=new FileReader("/home/administrator/下载/rosalind_gc.txt");
BufferedReader br=new BufferedReader(f);
String str=br.readLine();
String stmo="Rosalind";
int n=0,countn=0,m=0,countm=0,countnm=0;
double len=0;
while(str!=null){
        while(str.contains(stmo)){
        System.out.print(str +"\n");
        str=br.readLine();
        }
        while(!str.contains(stmo)){
        n=str.indexOf("G");
        m=str.indexOf("C");
        len=len+str.length();
                        while(n!=-1){
                        n=str.indexOf("G",n+1);
                        countn=countn+1;}       
                        while(m!=-1){
                        m=str.indexOf("C",m+1);
                        countm=countm+1;}   
        countnm=countn+countm;
        str=br.readLine();
        }
        System.out.print("The number of G is:" + countn +"\n"); 
        System.out.print("The number of C is:" + countm +"\n");
        System.out.print("The number of G&C is:" + countnm +"\n");
        System.out.print("The length of this sequence is:" + len +"\n"); 
        System.out.print("The GC content is:" + (countnm/len)*100+"\n");
        countn=0;
        countm=0;
        countnm=0;
        len=0;  
        }
}
}
