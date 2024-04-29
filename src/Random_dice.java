import java.util.Scanner;

public class Random_dice {

    public void work(int a){//시행횟수 입력



        int var =6; //주사위 눈
        int [] dArray= new int[var];  //주사위 눈 결과 저장
        int [] rArray=new int[a]; //시행 결과 저장소

        for(int i=0; i<var; i++){
            dArray[i]=i;    //주사위
            rArray[i]=0;  //주사위 눈 var개 0으로 초기화
        }

        for(int i=0; i<a; i++){//시행 횟수만큼 주사위 돌리기
            double b = Math.random() *6;

            rArray[(int) Math.nextUp(b)]++;

            System.out.println((int)b);

        }
        for(int i=0; i<var; i++){ //주사위 눈만큼 출력
            System.out.printf("%d은(는) %d번 나왔습니다 \n", dArray[i]+1, rArray[i]);
        }
    }

}
