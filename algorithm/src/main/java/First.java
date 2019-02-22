/**
 * @Copyright: Zhejiang Drore Technology Co., Ltd  2019 <br/>
 * @Desc: <br/>
 * @ProjectName: hello-world <br/>
 * @Date: 2019/2/21 17:57 <br/>
 * @Author: xiayj
 */

import java.math.BigInteger;

/**
 * 第一课：二进制
 * 1、二进制与、或、亦或计算
 * 2、二进制移位，左移、逻辑右移和算术右移
 * 3、二进制负数的原码、反码和补码。
 */
public class First {

    public static int leftShift(int num,int m){
        return num << m;
    }


    public static int rightShift(int num,int m){
        //逻辑右移 会变符号
        return num >>> m;
        //算术右移
        // return num >> m;
    }


    public static String changeToBinary(int num){
        //todo 十进制转二进制
        //1、
        String result = "";
        while (num>0){
            if((num&1)>0){
                result = "1"+ result;
            }else {
                result = "0" +result;
            }
            num = num >> 1;
        }
        return result;
    }

    //别人的方法。
    public static String decimal2Binary(int decimal) {
        // 负数的话,先换成正数然后取反再加1,再递归调用本函数
        if (decimal < 0) {
            int reverseNumber = ((decimal * -1) ^ Integer.MAX_VALUE) + 1;
            return decimal2Binary (reverseNumber);
        }
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            // 跟0x0001 按位与,求得最低位的值
            String lastNumber = String.valueOf(decimal & 1);
            // 插入到字符串的最前面(这样才是原始的顺序)
            sb.insert(0, lastNumber);
            // 算术右移
            decimal = decimal >> 1;
        }
        return sb.toString();
    }

    public static void main(String [] args){
        System.out.println(decimal2Binary(-42));
        BigInteger num = new BigInteger("42",10);
        BigInteger num1 = new BigInteger("-42",10);
        System.out.println(num1.toString(2));

    }




}
