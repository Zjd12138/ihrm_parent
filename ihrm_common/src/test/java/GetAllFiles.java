


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class GetAllFiles {

    public static void main(String[] args) {
        //路径   这里写一个路径进去
        String path="F:\\QQ文档";
        //调用方法
        getFiles(path);
    }

    /**

     * 递归获取某路径下的所有文件，文件夹，并输出

     */
    public static void getFiles(String path) {
        File file = new File(path);
        // 如果这个路径是文件夹
        if (file.isDirectory()) {
        // 获取路径下的所有文件
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
            // 如果还是文件夹 递归获取里面的文件 文件夹
                if (files[i].isDirectory()) {
                    System.out.println("目录：" + files[i].getPath());
                   // getFiles(files[i].getPath());
                } else {
                    System.out.println("文件：" + files[i].getPath());
                }
            }
        } else {
            System.out.println("文件：" + file.getPath());
        }
    }

    /**
     *
     * */
    public void getFiles(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        File f=new File("E:\\123\\img");
        //获取文件夹的所有文件
        Collection<File> allFile= FileUtils.listFiles(f, new String[]{ "JPG", "jpg" }, true);
        //排序前的文件
        for(File file:allFile){
            System.out.println(file.getName()+"   "+sdf.format(new Date(file.lastModified())));
        }
        //对文件进行排序（时间从近到远）
        Collections.sort((List<File>)allFile, new Comparator<File>() {
            public int compare(File file, File newFile) {
                if (file.lastModified() < newFile.lastModified()) {
                    return 1;
                } else if (file.lastModified() == newFile.lastModified()) {
                    return 0;
                } else {
                    return -1;
                }

            }
        });
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //排序后的文件
        for(File file:allFile){
            System.out.println(file.getName()+"   "+sdf.format(new Date(file.lastModified())));
        }
    }
}