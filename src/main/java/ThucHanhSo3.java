public class ThucHanhSo3 {
    public  static void main(String[] args){

        //BAI1
        int nam1 = 2021;
        if ((nam1 % 4 == 0 && nam1 % 100 != 0) || (nam1 % 400 == 0)){
            System.out.println("Nam " + nam1 + " la nam nhuan");}
        else {
            System.out.println("Nam " + nam1 + " khong phai la nam nhuan");}


        //BAI2
        int ngay2 = 10, thang2 = 10, nam2 = 2021;
        switch(thang2){
            case 1: case 3: case 5: case 7: case 8: case 10:
                if( ngay2>0 && ngay2<=31 && ((ngay2 + 1) <=31)){
                    System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                    System.out.println("ngày sau đó 1 ngày là: Ngay " + (ngay2 + 1) + " thang " + thang2 + " nam " + nam2 + " hop le");
                    break;}
                else if ( ngay2>0 && ngay2<=31 && ((ngay2 + 1) >31)){
                    System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                    System.out.println("ngày sau đó 1 ngày là: Ngay 1" + " thang " + (thang2 +1) + " nam " + nam2 + " hop le");
                    break;}
                else{
                    System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " khong hop le");
                    break;}
            case 4: case 6: case 9: case 11:
                if( ngay2<=30 && ngay2>0 && ((ngay2 + 1) <=30)){
                    System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                    System.out.println("ngày sau đó 1 ngày là: Ngay " + (ngay2 + 1) + " thang " + thang2 + " nam " + nam2 + " hop le");
                    break;}
                else if ( ngay2<=30 && ngay2>0 && ((ngay2 + 1) >30)){
                    System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                    System.out.println("ngày sau đó 1 ngày là: Ngay 1" + " thang " + (thang2 +1) + " nam " + nam2 + " hop le");
                    break;}
                else {
                    System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " khong hop le");
                    break;}
            case 2:if( ngay2 <=28 && ngay2 > 0 && (ngay2+1 <= 28) ){
                System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                System.out.println("ngày sau đó 1 ngày là: Ngay " + (ngay2 + 1) + " thang " + thang2 + " nam " + nam2 + " hop le");
                break;}
                else if ( ngay2 <=28 && ngay2 > 0 && (ngay2+1 > 28) ){
                System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                System.out.println("ngày sau đó 1 ngày là: Ngay 1" + " thang " + (thang2 +1) + " nam " + nam2 + " hop le");
                break;}
            else {
                System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " khong hop le");
                break;}
            default:
                System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " khong hop le");
                break;
            case 12:if( ngay2>0 && ngay2<=31 && ((ngay2 + 1) <=31)){
                System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                System.out.println("ngày sau đó 1 ngày là: Ngay " + (ngay2 + 1) + " thang " + thang2 + " nam " + nam2 + " hop le");
                break;}
            else if ( ngay2>0 && ngay2<=31 && ((ngay2 + 1) >31)){
                System.out.println("Ngay " + ngay2 + " thang " + thang2 + " nam " + nam2 + " hop le");
                System.out.println("ngày sau đó 1 ngày là: Ngay 1" + " thang 1 nam " +(nam2+1) +" hop le");
                break;}



        }
        }}


