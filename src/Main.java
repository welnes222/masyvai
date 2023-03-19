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


//        String[] augalumasyvas = {"dobilas", "levanda", "gvazdikas", "tulpe","zencenis","kalendra","egle","krumas","zole","berzas"};
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < augalumasyvas.length; i++) {
//            if(augalumasyvas[i].length() < 5 ){
//                count1++;
//            }
//        }
//        System.out.println("maziau nei penkios raides: " + count1);
//
//        for (int i = 0; i < augalumasyvas.length; i++) {
//            if(augalumasyvas[i].length() > 7 ){
//                count2++;
//            }
//        }
//        System.out.println("daugiau nei penkios raides: " + count2);



//        System.out.println("desimt");
//
//        String[] augalumasyvas = {"dobilas", "levanda", "gvazdikas", "tulpe","zencenis","kalendra","egle","krumas","zole","berzas"};
//
//        int count3 = 0;
//        for (int i = 0; i < augalumasyvas.length; i++) {
//            if(augalumasyvas[i].length() > 5 ) {
//                count3++;
//                if(augalumasyvas[i].length() >= 10)
//                    break;
//            }
//        }
//        System.out.println( count3 );


//        System.out.println("sunkesnis1");
//        int count = 0;
//        for (int i = 0; i < 300; i++) {
//            int rndm = (int) (Math.random() * 301);
//            if (rndm < 150) {
//                count++;
//            }
//        if (rndm > 275) {
//            System.out.print("[" + rndm +"], ");
//        }else{
//            System.out.print(rndm + ", ");
//        }
//        }
//
//
//        System.out.println();
//        System.out.println(count);


//        System.out.println("sunkesnis2");
//
//        String s2 = "";
//        for (int i = 1; i < 3000; i++) {
//            if( i % 77 == 0) {
//              s2 += i + ", ";
//            }
//        }
//        System.out.println(s2.substring(0, s2.length()-2));


//        System.out.println("sunkesnis3");
//
//
//
//        for (int i = 0; i < 25; i++) {
//            String x = "";
//            for (int a = 0; a < 25; a++) {
//                x +=  "*";
//            }
//                System.out.println(x);
//        }
//


//        System.out.println("sunkesnis5");

//        while(true) {
//        int moneta = (int) Math.round(Math.random());
//        if (moneta == 1) {
//            System.out.println("S");
//        }
//        if (moneta == 0) {
//            System.out.println("H");
//            break;
//        }
//
//        }




//        int count = 0;
//        while(true) {
//            int moneta = (int) Math.round(Math.random());
//            if (moneta == 0) {
//                System.out.println("h");
//                count++;
//            } else {
//                System.out.println("s");
//            }
//            if (count >= 3) {
//                break;
//            }
//
//        }


//        int count = 0;
//        while(true) {
//            int moneta = (int) Math.round(Math.random());
//            if (moneta == 0) {
//                System.out.println("h");
//                count++;
//            } else {
//                System.out.println("s");
//            }
//            if (count >= 3) {
//                break;
//            }
//
//        }




//        int count = 0;
//        while(true) {
//            int moneta = (int) Math.round(Math.random());
//            if (moneta == 0) {
//                System.out.println("h");
//                count++;
//            } else {
//                System.out.println("s");
//                count = 0;
//            }
//            if (count >= 3) {
//                break;
//            }
//
//        }




//            int pointspetras = 0;
//            int pointskazys = 0;
//            String winner1 = "petras";
//            String winner2 = "kazys";
//            while(true){
//                int petras = 10+(int) Math.round(Math.random()*10);
//                pointspetras += petras;
//                int kazys = 5+(int) Math.round(Math.random()*20);
//                pointskazys += kazys;
//
//                if(petras > kazys){
//                    System.out.println("laimejo "+ winner1);
//                }
//                else {
//                    System.out.println("laimejo "+ winner2);
//                }
//                if(pointspetras>=222 || pointskazys >=222){
//                    break;
//                }
//            }
//        System.out.println(pointspetras);
//        System.out.println(pointskazys);
//        if(pointspetras > pointskazys){
//            System.out.println("laimejo Petras su "+ pointspetras + " tasku.");
//        }
//        else{
//            System.out.println("laimejo Kazys su "+ pointskazys + " tasku.");
//        }









































    }
}