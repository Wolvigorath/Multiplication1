public class toArray
{
    private static int counter;
    public static int [] toTab (String number)
    {
        checkSize Word = new checkSize();
        counter = Word.checkLenght(number);
        char[] theWordArray;
        theWordArray  = number.toCharArray();
        int [] theNUmberArray = new int[counter];

        for (int i=0; i<counter; i++)
        {
            theNUmberArray[i]=Character.getNumericValue(theWordArray[i]);
        }

        return theNUmberArray;
    }

    public int Size ()
    {
        return counter;
    }
}
