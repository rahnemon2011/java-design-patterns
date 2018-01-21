package ir.hadi.generics;

public class GenericTest {
// determines the largest of three Comparable objects

    Student student1 = new Student(33L);
    Student student2 = myMethod();

    public Student myMethod() {
        return new Student(33L);
    }

    private <T extends Comparable<T>, B> T maximum(T x, T y, T z) {
        System.out.println("student.idddd = " + student1.idddd);
        T max = x;   // assume x is initially the largest
        if(y.compareTo(max) > 0) {
            max = y;   // y is the largest so far
        }
        if(z.compareTo(max) > 0) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }

    public static void main(String args[]) {
        GenericTest genericTest = new GenericTest();
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, genericTest.maximum( 3, 4, 5 ));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, genericTest.maximum( 6.6, 8.8, 7.7 ));

        System.out.printf("Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", genericTest.maximum("pear", "apple", "orange"));
    }
}

class Student implements Comparable<Student> , Cloneable{

    public Long idddd;

    public Student() {
    }

    public Student(Long idddd) {
        this.idddd = idddd;
    }

    @Override
    public int compareTo(Student o) {
        return 1;
    }
}