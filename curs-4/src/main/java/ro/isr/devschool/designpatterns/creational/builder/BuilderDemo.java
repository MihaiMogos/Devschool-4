package ro.isr.devschool.designpatterns.creational.builder;

/**
 * Created by Mucefix on 05/04/18.
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Student radu = Student.builder()
                                .cnp("1232412837198273912")
                                .nume("Radu")
                                .varsta(12)
                                .build();
        System.out.println(radu);
    }
}
