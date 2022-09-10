package New;

public class DisplayName_Comd {

    public static void main(String args[]) {
        System.out.println("The command line arguments are:\n");
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}

