package ro.isr.devschool.java8.lambdas;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterExample {

    public static void main(String[] args) {
        final FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        final FilenameFilter filterLambda = (File dir, String name) ->{
            return name.toLowerCase().endsWith(".txt");
        };

        final FilenameFilter filterLambda2 = (dir, name) ->{
            return name.toLowerCase().endsWith(".txt");
        };

        final FilenameFilter filterLambda3 = (dir, name) -> name.toLowerCase().endsWith(".txt");

        File homeDir = new File(System.getProperty("user.home"));
        String[] files = homeDir.list(filterLambda3);
        for(String file:files){
            System.out.println(file);
        }
    }
}
