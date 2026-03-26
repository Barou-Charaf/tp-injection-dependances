package net.charaf.metier;

import net.charaf.dao.IDao;

/**
 * @author $ {USER}
 **/
public class MetierImplv2 implements IMetier{
    IDao dao;
    public MetierImplv2(IDao dao){
        this.dao=dao;
    }

    @Override
    public double calcul(){
        System.out.println("MetierImplv2 : calcul().");
        return this.dao.getData()*2.4 +10;
    }
}
