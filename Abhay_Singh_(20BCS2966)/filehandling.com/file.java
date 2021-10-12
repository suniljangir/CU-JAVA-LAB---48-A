import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.security.spec.ECGenParameterSpec;
import java.io.FileReader; 

class Menu{
    Scanner input = new Scanner(System.in);
    public static int choice=0;
    Menu(){
        System.out.println( "1) Create File\n"+
                            "2) Write Operation\n"+
                            "3) Read Operation\n"+
                            "4) Create Folder/dir\n"+
                            "5) Delete File\n"+
                            "6) Copy File Content\n"+
                            "7) Delete Folder\n"+
                            "8) Exit\n");
        choice = input.nextInt();
    }
}
class FileCreation{
    Scanner input = new Scanner(System.in);
    Runtime runtime = Runtime.getRuntime();
        void createFile()
        {
            System.out.println("Drop File Name :");
            String s = input.next();
            try {
                File filename = new File(s+".txt");
                filename.createNewFile();
            } catch (Exception e) {
                System.out.println("Unabel To Create File ! \n");
                System.out.println(e);
            }
    }
        void writeFile()
        {
            System.out.println("Drop File Name Where You Want To Write:\n");
            String s = input.next();
            File check = new File(s+".txt");
            System.out.println(check.exists());
            if(!check.exists()){
                System.out.println("File Not Found In Folder");
                System.out.println("Creating A New File '"+s+".txt' In Default folder !");
            }
            try {
                FileWriter write = new FileWriter(s+".txt");
                System.out.println("Drop Your Text Here ! To Insert In File");
                s = input.next();
                write.write(s+"\n");
                write.close();
            } catch (Exception e) {
                System.out.println("Unabel To Write File...");
                System.out.println(e);
            }
    }
        void readFile()
        {
            System.out.println("Drop File Name Where You Want To Write:\n");
            String s = input.next();
            File file = new File(s+".txt");
            try {
                Scanner input1 = new Scanner(file);
                System.out.println("Data Of File Is :");
                while(input1.hasNextLine()){
                    s = input1.nextLine();
                    System.out.println(s);
                }
                System.out.println("");
            } catch (Exception e) {
                System.out.println("Unabel To Read File...");
            }
    }
        void folder(){
            System.out.println("Default Path (d) Or User Given Path (g):");
            char s = input.next().charAt(0);
            char d = 'd';
            char g = 'g';
            if(s == d){
                System.out.println("Drop Folder Name :");
                String foldername = input.next();
                File file = new File(foldername);
                file.mkdir();
            }
            else if(s == g){
                System.out.println("Drop Your Folder Path Here !");
                String path = input.next();
                System.out.println("Drop Folder Name :");
                String foldername = input.next();
                File file = new File(path + "/"+foldername);
                file.mkdir();
                System.out.println("Folder Created Sucessfully on path : { "+path+"/"+foldername+" }\n");
            }
            else{
                System.out.println("Unknown Input Value ! Use d or g to provide input");
                folder();
            }
        }
        void copyData(){
            System.out.print("Drop file name :");  
            String srcfile = input.next();      
            try {
                FileReader fin = new FileReader(srcfile);  
                FileWriter fout = new FileWriter(srcfile+"copy",true);
                int t;  
                while ((t = fin.read()) != -1) {  
                 fout.write(t);  
                }  
                System.out.println("Data has Copied to file "+srcfile+"copy.txt from file "+srcfile);  
                fin.close();  
                fout.close();
              }
              catch (Exception e) {
                System.out.println("error "+e);
            }

        }
        void folderDelete(){
            // working on it will be uploaded soon 
        }
}
public class file{
    public static void main(String[] args) {
        try {
            FileCreation object = new FileCreation();
        boolean x = true;
        while(x){
            Menu menu = new Menu();
            switch(Menu.choice){
                case 1:
                    object.createFile();
                    break;
                case 2:
                    object.writeFile();
                    break;
                case 3:
                    object.readFile();
                    break;
                case 4:
                    object.folder();
                    break;
                case 6:
                    object.copyData();
                    break;
                case 8: 
                        x=false;
                        System.out.println("Thanks For Using !");
                        break;
            }
        }
        } catch (Exception e) {
            System.out.println("ctrl + c exit code found ! Thanks For Using");
        }
}
}
