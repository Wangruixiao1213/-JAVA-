
public class Student {  
    public static void main(String[] args){
        int student_num = 100, light_num = 100;
        int[] student = new int[student_num];
        for(int i = 0 ; i < student_num ; i++){
            student[i] = i + 1;
        }

        int[] light = new int[light_num];
        for(int i = 0 ; i < light_num ; i++){
            light[i] = - 1;           //-1代表灯是关着灯
        }
        for(int i = 0 ; i < student_num ; i++){
            for (int j = i ; j < light_num ; j = j + student[i]){
                light[j] = -light[j];   //1代表开灯
            }
        }
        int index = 0;

        for(int i = 0 ; i < light_num ; i++){
            if(light[i] == 1){
                index  = i + 1;
                System.out.print(index);
                System.out.print(" ");
            }
        }
    }
}