import java.util.Scanner;

class Human {
    Scanner sc = new Scanner(System.in);

    public void runner(Horse titan) {
        System.out.println("""
                [1] Move on Horse
                [2] Attack on Horse
                [3] Dodge Right on Horse
                [4] Dodge Left on Horse""");
        int action = sc.nextInt();
        switch (action) {
            case 1 -> titan.moveOnHorse();
            case 2 -> titan.attackOnHorse();
            case 3 -> titan.dodgeRightOnHorse();
            case 4 -> titan.dodgeLeftOnHorse();
        }
    }
}