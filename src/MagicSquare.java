import java.io.*;
import java.util.Arrays;

public class MagicSquare
{

    public static void main(String[] args)
    {
        NumberSquare ns = new NumberSquare("1.txt");
    }
}

/** 用一个数字方块类接受文档中的数据 */
class NumberSquare
{
    private int theSum;
    private int rowsCount;
    private int columnsCount;
    private int[][] MagicNumbers;

    /**
     *
     * @param fileName 文件名 "xxx.txt"
     */
    NumberSquare(String fileName)
    {
        File squareTxt = new File("./src/P1/txt/"+fileName);
        try
        {
            BufferedReader numsReader = new BufferedReader(new FileReader(squareTxt));
            String numsLine;
            int rowSum = 0;
            while((numsLine = numsReader.readLine()) != null)
            {
                String[] numsString = numsLine.split("\t");
                columnsCount = numsString.length;
                if(MagicNumbers == null)
                {
                    MagicNumbers = new int[columnsCount][columnsCount];
                }
                rowSum = 0;
                int i = 0;
                for (String str : numsString)
                {
                    MagicNumbers[rowsCount][i]= Integer.parseInt(str);
                    rowSum += Integer.parseInt(str);
                    i++;
                }
                theSum = rowSum;
                rowsCount++;
            }
            System.out.println("cc:"+columnsCount);
            System.out.println("rc:"+rowsCount);
            System.out.println("theSum:"+theSum);
            for(int[] num : MagicNumbers)
            {
                System.out.println(num[0]);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
//    public static boolean isLegalMagicSquare(String fileName)
//    {
//        return;
//    }



}