//vjezba max niza:

public class Main {
    public static void main(String[] args) {
        int []  mojNiz = {56,67,-20,0,88};
        int max=mojNiz[0];

        for (int i=0;i<mojNiz.length;i++){
            if (mojNiz[i]>max)
            {
                max=mojNiz[i];
            }
            i++;}
        System.out.println(max);
    }
}

 //vjezba min niza:
/*public class Main {
    public static void main(String[] args) {
        int []  mojNiz = {56,67,-20,0,88};
        int min=mojNiz[0];

        for (int i=0;i<mojNiz.length;i++){
            if (mojNiz[i]<min)
            {
                min=mojNiz[i];
            }
            i++;}
        System.out.println(min);
    }
}

*/