
public class NestedLoop{
    public static void main(String[] args){

        for(int i=1; i<4; i++){
            for(int j=1; j<3; j++){
                System.out.print("*");
            }
        }

        System.out.println("\n");

        for(int i=1; i<4; i++){
            for(int j=1; j<3; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<4; i++){
            for(int j=1; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();

        for(int i=1; i<6; i++){
            for(int j=1; j<6; j++){
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}
