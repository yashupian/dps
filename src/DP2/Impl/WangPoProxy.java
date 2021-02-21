package DP2.Impl;

import DP2.KindWomen;

/**
 * 定义经验丰富的王婆
 */
public class WangPoProxy implements KindWomen{
    private KindWomen kindWomen;

    public WangPoProxy(){
        this.kindWomen = new PanJinLian();
    }

    public WangPoProxy(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
    
}
