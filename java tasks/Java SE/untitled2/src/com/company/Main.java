package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

    }}
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("Blue");
//        treeSet.add("White");
//        treeSet.add("Xzx");
//        treeSet.add("Black");
//        treeSet.add("Red");
//        treeSet.add("Brown");
//
//        System.out.println(treeSet);
        ///get the first and last elements
//        Object first_element=treeSet.first();
//        System.out.println(first_element);
//        Object second_element=treeSet.last();
//        System.out.println(second_element);
//        Iterator it = treeSet.descendingIterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

//       TreeSet<String> treeSet1=new TreeSet<>();
//       treeSet1.add("Red");
//       treeSet1.add("Grey");
//       treeSet1.add("Green");
//       treeSet1.add("White");
//       treeSet1.addAll(treeSet);
//        System.out.println(treeSet1);

//        Set<String > hashSet=new HashSet<>();
//       hashSet.add("Blue");
//       hashSet.add("Black");
//       hashSet.add("White");
//       hashSet.add("Green");
//        hashSet.add("Grey");
//
//        HashSet<String>h_set2 = new HashSet<String>();
//        h_set2.add("Red");
//        h_set2.add("Pink");
//        h_set2.add("Black");
//        h_set2.add("Orange");
//        HashSet<String>result_set = new HashSet<String>();
//        for (String element : hashSet){
//            System.out.println(h_set2.contains(element) ? "Yes" : "No");
//        }
        ///   Stack<String> stack = new Stack<>();

//        stack.push("asd");
//        for(int i=0;i<stack.size()-1;i++){
//           Collections.reverse(stack)+stack.get(i);
//
//        }
//        LinkedList<String>linkedList=new LinkedList();
//        LinkedList<String>linkedList2=new LinkedList();
//        linkedList.add("Red");
//        linkedList.add("Blue");
//        linkedList.add("White");
//        linkedList.add("Black");
//       linkedList2.add("Green");
//       linkedList2.add("Grey");
//        LinkedList <String> a = new LinkedList <String> ();
//      a.clone(linkedList);
/// System.out.println(a);
//        Iterator it=linkedList.descendingIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        //ArrayList<Integer> arrayList2 = new ArrayList<>();
//        List <Integer>a1=new ArrayList<>();
//
//        arrayList.add(145);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(6);
//        arrayList.add(7);
//        arrayList.add(34);
//        arrayList.add(112);
//        arrayList.add(103);
//        arrayList.add(185);
//        arrayList.add(543);
//        arrayList.set(0,102);
//        System.out.println(arrayList);
//        int min = arrayList.get(0);
//        int max = arrayList.get(0);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
//        for (int n:arrayList) {
//            if(min>n){
//                min=n;
//            }
//
//
//        }
//        System.out.println(min);
//        System.out.println("After swap");
//        Collections.swap(arrayList,3,4);
//        System.out.println(arrayList);
//        arrayList2 = arrayList;
//        System.out.println(arrayList2);

//        Iterator<Integer> iter = arrayList.iterator();
//        while(iter.hasNext()){
//            if(min<arrayList.get(i)){
//
//            }


//        Integer max1 = Collections.max(arrayList);
//        System.out.println(max1);
//


//
////
//        for (int i = 0; i < arrayList.size(); i++) {
//
//                if(arrayList.get(i)>max){
//                    max=arrayList.get(i);
//
//
//                }
//
//
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(arrayList.get(i)<min){
//                min=arrayList.get(i);
//            }
//        }
//        System.out.println("Maximum value equal : ");
//        System.out.println(max);
//        System.out.println("Minimum value of : ");
//        System.out.println(min);


//        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
//        System.out.println(count);


//        char[] array = str.toCharArray();
//        String result = " ";
//        for (int i=array.length-1;i>=0;i--) {
//            result = result + array[i];
//        }
//        System.out.println(result);

//  int ans = 0, num = 0;
//        for (int i = s.length()-1; i >= 0; i--) {
//            switch(s.charAt(i)) {
//                case 'I': num = 1; break;
//                case 'V': num = 5; break;
//                case 'X': num = 10; break;
//                case 'L': num = 50; break;
//                case 'C': num = 100; break;
//                case 'D': num = 500; break;
//                case 'M': num = 1000; break;
//            }
//            if (4 * num < ans) ans -= num;
//            else ans += num;
//        }
//        System.out.println(ans);


//        System.out.println("Input: " + str1);
//        System.out.println(
//                "Output: "
//                        + isValidIPAddress(str1));
//
//
//
//
//    }
//        public static boolean isValidIPAddress(String ip)
//        {
//
//            // Regex for digit from 0 to 255.
//            String zeroTo255
//                    = "(\\d{1,2}|(0|1)\\"
//                    + "d{2}|2[0-4]\\d|25[0-5])";
//
//            // Regex for a digit from 0 to 255 and
//            // followed by a dot, repeat 4 times.
//            // this is the regex to validate an IP address.
//            String regex
//                    = zeroTo255 + "\\."
//                    + zeroTo255 + "\\."
//                    + zeroTo255 + "\\."
//                    + zeroTo255;
//
//            // Compile the ReGex
//            Pattern p = Pattern.compile(regex);
//
//            // If the IP address is empty
//            // return false
//            if (ip == null) {
//                return false;
//            }
//
//            // Pattern class contains matcher() method
//            // to find matching between given IP address
//            // and regular expression.
//            Matcher m = p.matcher(ip);
//
//            // Return if the IP address
//            // matched the ReGex
//            return m.matches();

//    public static void check(int n) {
//        String dayValue = "";
//        switch (n) {
//            case 1:
//                dayValue = "Winter";
//                break;
//            case 2:
//                dayValue = "Summer";
//                break;
//            case 3:
//                dayValue = "Spring";
//                break;
//            case 4:
//                dayValue = "Summer";
//                break;
//            default:
//                System.out.println("No ");
//        }
//        System.out.println(dayValue);




      /*  //24-May-2017, change this to your desired Start Date
        LocalDate dateBefore = LocalDate.of(2000, Month.FEBRUARY, 27);
        LocalDate dateAfter = LocalDate.of(2021, Month.MARCH, 15);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);*/


//        double n = scanner.nextDouble();
//        double conv=convertor(n);
//        System.out.println(conv);


//    public static double convertor(double n){
//        double sum=0;
//        sum=(n-32)/1.8;
//
//        return sum;
//    }


//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int max = summa(a,b, c);
//        System.out.println(max);
//        int n = in.nextInt();
//        int arr[] = new int [n];
//        for(int i=0; i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        oddnumbers(arr);


//  task1
//    public static int summa(int a, int b, int c) {
//       int summa=0;
//        return summa=a+b+c;
//    }
//   task2
//    public static void oddnumbers(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2!=0){
//                System.out.println(arr[i]);
//            }
//
//        }




