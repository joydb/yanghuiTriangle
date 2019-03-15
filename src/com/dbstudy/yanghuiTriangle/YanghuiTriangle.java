package com.dbstudy.yanghuiTriangle;

import java.util.Scanner;

public class YanghuiTriangle {
    /*
     *   递归方法
     */
    private  static int Yanghui_Triangle_Recursive(int row, int col)
    {
        if (col == 1 || row == col)
            return 1;
        return Yanghui_Triangle_Recursive(row - 1, col) + Yanghui_Triangle_Recursive(row - 1, col - 1);
    }

    /**
     *
     * @param row
     * @param col
     * 通项式迭代
     */
    private static void Yanghui_Triangle_Iteration(int row,int col)
    {
        int i = 0, j = 0,temp=1;
        for(i = 0; i < row; i++)
        {
            temp = 1;
            for(j = 0; j <= i&&j<col; j++)
            {
                if(j==col-1&&i==row-1)
                {
                    System.out.println(temp);
                }
                temp = temp * (i-j) / (j+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row;
        int col;
        while(scanner.hasNext())
        {
            row=scanner.nextInt();
            col=scanner.nextInt();
            System.out.println(Yanghui_Triangle_Recursive(row,col));
            Yanghui_Triangle_Iteration(row,col);
        }
    }
}
