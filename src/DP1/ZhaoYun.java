package DP1;

import DP1.impl.BackDoor;
import DP1.impl.BlockEnemy;
import DP1.impl.GivenGreenLight;

public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("1.使用第一个锦囊");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("2.使用第二个锦囊");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("3.使用第三个锦囊");
        context = new Context(new BlockEnemy());
        context.operate();
    }
    
}
