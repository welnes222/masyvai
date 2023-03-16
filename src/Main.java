public class Main {
    public static void main(String[] args) {


//        int[] mas1 = {1,7,2,9,4,6};
//        System.out.println(mas1[0]);
//        System.out.println(mas1[1]);
//        System.out.println(mas1[2]);
//        System.out.println(mas1[3]);
//        System.out.println(mas1[4]);
//        System.out.println(mas1[5]);
//
//
//         System.out.println("aaaaaaaaa");
//        int [][] mas2 = {
//                {1,6,9},
//                {3,4,7}
//        };
//        System.out.println(mas2[0][0]);
//        System.out.println(mas2[0][1]);
//        System.out.println(mas2[0][2]);
//        System.out.println(mas2[1][0]);
//        System.out.println(mas2[1][1]);
//        System.out.println(mas2[1][2]);
//        System.out.println(mas2[0][0]+ " " + mas2[0][1] + " " + mas2[0][2] + " " + mas2[1][0] + " " + mas2[1][1] + " " + mas2[1][2]);







//        for(int i = 0; i<10; i++){
//            System.out.println("labas");
//        }





//                for(int i = 0; i<10; i++){
//            System.out.println(i);
//        }





//        String[] augalumasyvas = {"dobilas", "levanda", "gvazdikas", "tulpe","zencenis","kalendra","egle","krumas","zole","berzas"};


////        for (int i = 0; i < augalumasyvas.length; i++) {
////            System.out.println(augalumasyvas[i]);
//        }


//        for (int i = augalumasyvas.length -1; i>=0; i--) {
//            System.out.println(augalumasyvas[i]);
//        }




//        for (int i = 10; i < 51;  i++) {
//            if (i % 2 == 0)
//            System.out.println(i);
//        }


//        for (int i = 10; i < 51; i++) {
//            if (i % 2 == 0) {
//                if (i % 10 == 0) {
//                    continue;
//                }
//                System.out.println(i);
//            }
//        }


//        int count = 0;
//        for (int i = 0; i < 20;  i++) {
//            if (i % 2 == 0)
//            {
//                count += 1;
//            }
//            }
//            System.out.println(count);


//        System.out.println("devyni");


        String[] augalumasyvas = {"dobilas", "levanda", "gvazdikas", "tulpe","zencenis","kalendra","egle","krumas","zole","berzas"};
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < augalumasyvas.length; i++) {
            if(augalumasyvas[i] > 5 ){
                count1++;
            }
        }
        System.out.println(count1);















































    }
}