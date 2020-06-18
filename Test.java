有10^8个村庄排在一条公路上，依次编号为0~10^8-1，相邻村庄距离为1，其中有n个村庄居住着牛牛，居住着牛牛的村庄从小到大依次为a0~an-1，其中保证a0=0.
现在需要建设车站，有两个要求必须被满足：
1、每个有牛牛居住的村庄必须修建车站。
2、相邻车站的距离必须为1或为某个质数。
现给出n和a数组，求需要建设车站的最小数量。

import java.util.*;


public class Solution {
    /**
     * 
     * @param n int整型 
     * @param a int整型一维数组 
     * @return int整型
     */
    public int work (int n, int[] a) {
        // write code here
        
        int ret=n;
        for(int i=1;i<n;i++){
            int num=a[i]-a[i-1];
            if(num==1||num==2||isPrim(num)){
                
            }else if((num&1)==0||isPrim(num-2)){
                ret++;
            }else{
                ret+=2;
            }
        }
        return ret;
    }
    
    private boolean isPrim(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

