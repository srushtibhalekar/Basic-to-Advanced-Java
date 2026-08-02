

    import java.util.Scanner;
class Array2{
 
    public static void main(String[]args){

        int marks[] =  new int[100];

        Scanner sc = new Scanner(System.in);

         marks[0]= sc.nextInt();
         marks[1]=sc.nextInt();
          marks[2]=sc.nextInt();
        
        System.out.println("Phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("bio :"+marks[2]);

         //for update 
         marks[2]= marks[2] +1;
         System.out.println(" math :" + marks [2]);
}
}