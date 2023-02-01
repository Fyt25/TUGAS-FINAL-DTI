/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat.loop;

/**
 *
 * @author MARIA FITRIANI.M
 */
public class LatLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n=6;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            } 
            for(int j=1;j<=n;j++)
            {
                if(i==2 && j==1)
                System.out.print("  ");
                else if (i>=4 && i<=5 &&j==6)
                System.out.print("  ");
                else if (i==1||i==3||i==n||j==n||j==1)
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            for(int j=1;j<=5;j++)
            {
                if(j+i==4&&j==3)
                System.out.print(" ");
                else if(j==1||j==5||j+i==4||j+i==6&& i<4)
                System.out.print("*");
                else
                System.out.print(" ");
            }
        System.out.println();
        }
}
    
}
