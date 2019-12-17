package Chapter_12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {


        try {
            File file;
            FileWriter writer = new FileWriter("Hello.text");
            writer.write("Hello!");

            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        //Liệt kê nội dung thư mục
        File dir = new File("src\\Chapter_10");
        dir.mkdirs();
        if(dir.isDirectory()){
            String[] dirContent = dir.list();
            for (int i = 0; i < dirContent.length ; i++) {
                System.out.println(dirContent[i]);
            }
        }


    }
}
