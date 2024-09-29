public class StarPatternProgram{

    static int pattern(int rows)
    {   
        int i = 0;
        while (i < rows){
            System.out.println("*"+" ");
            i++;
        }
        return pattern(rows - 1);

    }
    public static void main(String [] args)
    {   
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        pattern(rows);
        sc.close();
    }

}