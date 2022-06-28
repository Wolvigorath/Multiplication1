import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String newLine = System.lineSeparator();

        Scanner input = new Scanner(System.in);
        for(;;)
        {
            System.out.println("Podaj liczbę");
            String number = input.nextLine();
            int count1 =1;
            int ar1=0;
            if (check.isInt(number)==true)
            {
                if (check.isPlus(number)==true)
                {
                    int size;
                    int numberArr[];

                    for(;;)
                    {

                        toArray Size1 = new toArray();

                        numberArr = toArray.toTab(number);
                        size = Size1.Size();
                        ar1 = Multiply.Multip(size, numberArr);

                        if (ar1 > 9)
                        {
                            number = String.valueOf(ar1);
                            count1++;
                            System.out.println("Twoja liczba to: " + ar1);
                        }
                        else
                        {
                            break;
                        }
                    }
                    System.out.println("Twoja liczba to: " + ar1 + " Liczba kroków: " + count1);
                    break;
                }
            }


        }

    }
}