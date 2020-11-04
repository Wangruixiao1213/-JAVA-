import java.util.Scanner;
public class Circle {
    public static void goCirle(int M,int N){
        int[][] people = new int[N][2]; //在圈里的人
        int[] peopleIndex = new int[N]; //出圈的顺序
        int i;
        int countNum = 0;  //已被数到的人
        int tmpCount = 1;  //报数序号
        int pos = 0;        //上一次点到的位置
        //people数组的初始化
        for(i = 0;i < N;i++){
            people[i][0] = i + 1;       //对应每个人的序号
            people[i][1] = 1;           //相当于在圈里
        }
        while(countNum != N){
            while(tmpCount != M){
                if(people[pos][1]==1){                          //pos: 0  tmpCount: 1  pos:2 tmpCount:3  
                    tmpCount += 1;
                }
                if(pos < N - 1) pos += 1;
                else pos = 0;
            }
            while(tmpCount == M){
                if(people[pos][1]==1)  {
                    people[pos][1] = 0;     //出圈
                    break;
                } 
                else{
                    if(pos < N - 1) pos += 1;
                    else pos = 0;
                }
            }
            tmpCount = 1;
            // System.out.println(pos);
            peopleIndex[countNum] = people[pos][0];     //将该位置的序号传到数组中
            countNum += 1;
        }
        for(i = 0;i < countNum ;i++)
            System.out.print(peopleIndex[i] + " ");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();        //总人数
        int M = input.nextInt();        //每逢M出圈
        goCirle(M, N);
    }
}
