public class Main {
    public static void Main(String[]args){
        ScientificBook sc1=new ScientificBook("Gravation","123",1000,10000,"Newton");
        ScientificBook sc2=new ScientificBook("Physics","12",1200,100000,"Einshtein");
        ScientificBook sc3=new ScientificBook("Geography","101",1200,20000,"Kopernik");
     ScientificBook [] sc={sc1,sc2,sc3};
        LiteratureBook l1=new LiteratureBook("Abai zholy","201",3000,"Auezov",1941);
        LiteratureBook l2=new LiteratureBook("ads","202",231,"sddasads",2000);
        LiteratureBook l3=new LiteratureBook("Hamlet","203",20003,"Shekspir",2003);
         LiteratureBook [] l={l1,l2,l3};
        Book []b1={sc1,sc2,sc3,l1,l2,l3};
        Library lb1=new Library("National","Almaty","Kazakhstan",sc,3);
        Library lb2=new Library("National","Almaty","Kazakhstan",l,3);
        Library []lb={lb1,lb2};
        for(int i=0;i< lb.length;i++){
            System.out.println(lb[i]);
        }
        System.out.println();
        //Library l1=new Library("National","almaty","kazakhstan",)

    }
}
