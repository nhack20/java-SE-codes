package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Nursultan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nadira", 'f', 23, 2, 6.1);
        Student st3 = new Student("Abai", 'f', 24, 1, 3.3);
        Student st4 = new Student("Daulet", 'f', 19, 4, 9.5);
        Student st5 = new Student("Sultan", 'm', 20, 5, 7.6);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        //фильтруем возраст больше 22 и оценка 7.2
      students =  students.stream().filter(element -> element.getAge()
                > 22 && element.getAvgGrade() < 7.2).collect(Collectors.toList());
        System.out.println(students);

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        myStream.filter(element -> element.getAge()
                > 22 && element.getAvgGrade() < 7.2).collect(Collectors.toList());
    }
}


//        ISum i = new ISum() {
//            @Override
//            public int sum(int a) {
//                if (a % 2 == 0)
//                    return 1;
//                else
//                    return 0;
//            }
//        };
//        ISum i2 = (a) -> {
//            if (a % 2 == 0)
//                return 1;
//            else
//                return 0;
//        };
//        System.out.println(i2.sum(4));
//    }
//
//
//    @FunctionalInterface
//    public interface ISum {
//        public int sum(int a);



//    ISqrt i1=new ISqrt() {
//        @Override
//        public double abcd(double a) {
//            double res=Math.pow(a,2);
//            return res;
//        }
//    };
//ISqrt s1=(a)->Math.pow(a,2);
//        System.out.println(s1.abcd(3));
//
//    }
//    @FunctionalInterface
//    public interface  ISqrt {
//        public double abcd(double a);


// write your code here
//            I i1=(a,b)->pow(a,b);
//        System.out.println(i1.sqr(2, 3));


//        int[] nums = {-4, -1, 0, 3, 10};
//        int[] nums2;
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums.length - 1);
//        }
//
//    }
//}
