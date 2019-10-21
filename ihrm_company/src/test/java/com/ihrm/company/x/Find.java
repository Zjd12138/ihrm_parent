package com.ihrm.company.x;


import java.util.Arrays;

 class X {
 public  static  void doX(){
     System.out.println("doX");
 }
}



public class Find{
     String str=new String("good");
     char [] ch={'a','b','c'};
     String[] d=new String[]{};

    public static void main(String[] args) {
       /* com.ihrm.company.x.X.doX();
        fun1();
        fun2();*/
       //fun3();
        /*Find f=new Find();
        f.fun4(f.str,f.ch);
        System.out.print(f.str+"and");
        System.out.print(f.ch);*/
        fun5();
    }

    public static void fun5() {
        int x,p,i,s=0;
        for (x=1;x<6;x++){
            for (p=i=1;i<=x;i++){
                p*=x;
            }
            s+=p;
        }
        System.out.println(s);
    }

    public  void fun4(String str,char ch[]){
        str="test ok";
        ch[0]='g';
    }
    public static void fun3(){
        System.out.println(""+("12"=="12"&&"12".equals("12")));
        System.out.println(""+("12"==" 12"&&" 12".equals("12")));
        int i=1;
        int j=i++;
        if((j>++j)&&(i++==j)){
            System.out.println("j="+(j+=i));
        }
        System.out.println(j);
    }

    public static void fun1(){
        int[] ary = {3,1,5,6,2,6,8,3};
        for(int i=0; i<ary.length-1; i++){
            for(int j=0; j<ary.length-(1+i); j++){
                if(ary[j] > ary[j+1]){
                    int temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
                }
            }
        }
        String s = Arrays.toString(ary);
        System.out.println(s);
    }

    public static void fun2(){
        long sum = 0,c;
        for (int i = 1; i <= 20; i++) {
            c = 1;
            for (int b = 1; b <= i; b++) {
                c *= b;
            }
            sum += c;
            System.out.println(sum);
        }
        System.out.println("1到20的阶乘和等于" + sum);
    }
}
