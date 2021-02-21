package DP2;

import DP2.Impl.JiaShi;
import DP2.Impl.WangPoProxy;

public class XiMenQing {
    public static void main(String[] args) {
        //这是西门大官人

        //1.先把代理王婆叫出来
        WangPoProxy proxy = new WangPoProxy();

        //2.默认代理潘金莲
        proxy.makeEyesWithMan();
        proxy.happyWithMan();

        //3.也可以指定代理同类型的女人
        proxy = new WangPoProxy(new JiaShi());
        proxy.makeEyesWithMan();
        proxy.happyWithMan();
    }
    
}
