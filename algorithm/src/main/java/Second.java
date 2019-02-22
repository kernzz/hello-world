/**
 * @Copyright: Zhejiang Drore Technology Co., Ltd  2019 <br/>
 * @Desc: <br/>
 * @ProjectName: hello-world <br/>
 * @Date: 2019/2/22 11:23 <br/>
 * @Author: xiayj
 */

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 迭代、归纳及递归。
 */
public class Second {

    /**
     * 计算金额能分成那些组合。
     */

    public static long[] rewards ={1, 2, 5, 10};
    public static void getMoney(long totalReward,ArrayList<Long> result) {
        if(totalReward == 0){
            System.out.println(result);
            return ;
        }else if(totalReward < 0){
            return ;
        }else {
            //注意，这里是循环加递归
            for(int i = 0 ;i<rewards.length;i++){
                ArrayList<Long> newResult = ( ArrayList<Long>)result.clone();
                newResult.add(rewards[i]);
                getMoney(totalReward-rewards[i],newResult);
            }
        }
    }


    public static void resolveNum(long num,ArrayList<Long> result){
        if(num==1){
            if(!result.contains(1L))
                result.add(1L);
            System.out.println(result);
        }else {
            for(long i = 1;i<=num;i++){
                if(i==1&&result.contains(1L)){
                    continue;
                }
                if(num%i!=0){
                    continue;
                }
                ArrayList<Long> newResult = ( ArrayList<Long>)result.clone();
                newResult.add(i);
                resolveNum(num/i,newResult);
            }
        }
    }




    public static void main(String [] args){
        //getMoney(10,new ArrayList<Long>());
        resolveNum(12,new ArrayList<Long>());
    }









}
